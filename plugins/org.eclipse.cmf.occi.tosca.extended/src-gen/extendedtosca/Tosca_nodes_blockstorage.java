/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package extendedtosca;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes blockstorage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_blockstorage#getSize <em>Size</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_blockstorage#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_blockstorage#getSnapshotId <em>Snapshot Id</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_blockstorage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Tosca_nodes_blockstorage extends Tosca_nodes_root, Tosca_capabilities_attachment, MixinBase {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requested storage size (default unit is MB). Note: - Required when an existing volume (i.e., volume_id) is not available. - If volume_id is provided, size is ignored.  Resize of existing volumes is not considered at this time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_blockstorage_Size()
	 * @model dataType="extendedtosca.scalarSizeMinOneMB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_blockstorage!size'"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_blockstorage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Volume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID of an existing volume (that is in the accessible scope of the requesting application).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Id</em>' attribute.
	 * @see #setVolumeId(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_blockstorage_VolumeId()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_blockstorage!volumeId'"
	 * @generated
	 */
	String getVolumeId();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_blockstorage#getVolumeId <em>Volume Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Id</em>' attribute.
	 * @see #getVolumeId()
	 * @generated
	 */
	void setVolumeId(String value);

	/**
	 * Returns the value of the '<em><b>Snapshot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some identifier that represents an existing snapshot that should be used when creating the block storage (volume).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Id</em>' attribute.
	 * @see #setSnapshotId(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_blockstorage_SnapshotId()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_blockstorage!snapshotId'"
	 * @generated
	 */
	String getSnapshotId();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_blockstorage#getSnapshotId <em>Snapshot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot Id</em>' attribute.
	 * @see #getSnapshotId()
	 * @generated
	 */
	void setSnapshotId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Tosca_nodes_blockstorage::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Storage)\n *       in\n *         \'Tosca_nodes_blockstorage::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_blockstorage_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Storage_0 = idResolver.getClass(&lt;%extendedtosca.ExtendedtoscaTables%&gt;.CLSSid_Storage, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Storage_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_blockstorage_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_blockstorage