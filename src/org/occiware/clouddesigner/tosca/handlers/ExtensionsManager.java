package org.occiware.clouddesigner.tosca.handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ExtensionsManager {
	
	/** 
	 * Contains all extension indexed by their name
	 */
	private static Map<String, Extension> extensionsPerName;
	
	private static Resource resource;
	
	static {
		extensionsPerName = new HashMap<>();
		extensionsPerName.put("core", OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		extensionsPerName.put("infrastructure", OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		extensionsPerName.put("platform", OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		extensionsPerName.put("sla", OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));
		
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI
				.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/tosca_model/TOSCA.occie");
		resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme("http://occi/tosca#");
		extension.setName("TOSCA");
		resource.getContents().add(extension);
		
		extensionsPerName.put("tosca", extension);
		
	}
	
	public static Extension getExtension(String extension) {
		return extensionsPerName.get(extension);
	}
	
	public static Mixin getMixinFromItsTerm(String extension, String termOfTheMixin) {
		List<Mixin> mixins = extensionsPerName.get(extension).getMixins();
		for (Mixin mixin : mixins ) {
			if (mixin.getTerm().equals(termOfTheMixin)) {
				return mixin;
			}
		}
		throw new RuntimeException("Mixin with term: " + termOfTheMixin + " not found in the extension:" + extension);
	}
	
	public static Kind getKindFromItsTerm(String extension, String termOfTheKind) {
		List<Kind> kinds = extensionsPerName.get(extension).getKinds();
		for (Kind kind : kinds) {
			if (kind.getTerm().equals(termOfTheKind)) {
				return kind;
			}
		}
		throw new RuntimeException("Kind with term: " + termOfTheKind + " not found in the extension:" + extension);
	}
	
	public static void save() {
		System.out.println("Saving...");
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
