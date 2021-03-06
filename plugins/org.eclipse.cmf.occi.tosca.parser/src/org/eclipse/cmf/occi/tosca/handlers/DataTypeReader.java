package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;

public class DataTypeReader {

	public static void read(String dataTypeAsString, Map<String, ?> map) {
		RecordType recordType = OCCIFactory.eINSTANCE.createRecordType();
		String [] split = dataTypeAsString.split("\\.");
		recordType.setName(split[split.length - 1]);
		//recordType.setName(dataTypeAsString.replaceAll("\\.", ""));
		Object description = map.get("description");
		if (description != null) {
			recordType.setDocumentation(description.toString());
		}
		// do not support the derived_from
		Map<String, ?> attributes = (Map<String, ?>) map.get("properties");
		if (attributes != null) {
			recordType.getRecordFields().addAll(readRecordField((Map<String, ?>) map.get("properties")));
		}

		ExtensionsManager.currentExtensionToBeBuild.getTypes().add(recordType);
		StringToDataType.map.put(dataTypeAsString, recordType);
	}

	private static Collection<RecordField> readRecordField(Map<String, ?> recordFieldsMap) {
		List<RecordField> recordFields = new ArrayList<>();
		for (String recordFieldName : recordFieldsMap.keySet()) {
			RecordField recordField = OCCIFactory.eINSTANCE.createRecordField();
			Map<String, ?> recordFieldMap = (Map<String, ?>) recordFieldsMap.get(recordFieldName);
			recordFieldName = recordFieldName.replaceAll("_","");
			recordField.setName(recordFieldName);

			String description = (String) recordFieldMap.get("description");
			if (description != null) {
				recordField.setDescription(description);
			}

			String type = (String) recordFieldMap.get("type");
			if (type != null) {
				if (type.equals("list")) {
					type = "array";
				}
				if (type.equals("array")) {
					String typeOfCollection = (String) (((Map<String, ?>) recordFieldMap.get("entry_schema"))
							.get("type"));
					type += typeOfCollection;
				}
				List<Map<String, ?>> constraints = (ArrayList<Map<String, ?>>) recordFieldMap.get("constraints");
				if (!"range".equals(type) && constraints != null) {
					for (Map<String, ?> constraint : constraints) {
						if (constraint.get("valid_values") != null) {
							List<String> literals = (ArrayList) constraint.get("valid_values");
							DataType enumType = OCCIFactory.eINSTANCE.createEnumerationType();
							enumType.setName(recordFieldName + "Enum");
							for (String literal : literals) {
								EnumerationLiteral enumLit = OCCIFactory.eINSTANCE.createEnumerationLiteral();
								enumLit.setName(literal);
								enumLit.setEnumerationType((EnumerationType) enumType);
								((EnumerationType) enumType).getLiterals().add(enumLit);
							}
							StringToDataType.map.put(recordFieldName + "Enum", enumType);
							ExtensionsManager.currentExtensionToBeBuild.getTypes().add(enumType);
							recordField.setType(enumType);
						}
					}
				} else {
					if (StringToDataType.map.get(type) == null) {
						recordField.setType(StringToDataType.defineNewArrayType((String) (((Map<String, ?>) recordFieldMap.get("entry_schema"))
								.get("type"))));
					} else {
						recordField.setType(StringToDataType.map.get(type));
					}
				}
			}

			String required = (String) recordFieldMap.get("required");
			if (required != null) {
				recordField.setRequired(required.equals("true"));
			}

			String defaultValue = (String) recordFieldMap.get("default");
			if (defaultValue != null) {
				recordField.setDefault(description);
			}

			recordFields.add(recordField);
		}
		return recordFields;
	}

}
