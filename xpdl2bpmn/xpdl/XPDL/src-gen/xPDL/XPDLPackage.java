/**
 */
package xPDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xPDL.XPDLFactory
 * @model kind="package"
 * @generated
 */
public interface XPDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xPDL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/xpdl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xPDL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPDLPackage eINSTANCE = xPDL.impl.XPDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPDL.impl.XpdlRootImpl <em>Xpdl Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.XpdlRootImpl
	 * @see xPDL.impl.XPDLPackageImpl#getXpdlRoot()
	 * @generated
	 */
	int XPDL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Pools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT__POOLS = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT__PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Messageflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT__MESSAGEFLOWS = 2;

	/**
	 * The feature id for the '<em><b>Diagram Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT__DIAGRAM_NAME = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT__ID = 4;

	/**
	 * The number of structural features of the '<em>Xpdl Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Xpdl Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPDL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.AssociationValid <em>Association Valid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.AssociationValid
	 * @see xPDL.impl.XPDLPackageImpl#getAssociationValid()
	 * @generated
	 */
	int ASSOCIATION_VALID = 12;

	/**
	 * The number of structural features of the '<em>Association Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALID_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Association Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.PoolImpl
	 * @see xPDL.impl.XPDLPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 1;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LANES = ASSOCIATION_VALID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ID = ASSOCIATION_VALID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = ASSOCIATION_VALID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = ASSOCIATION_VALID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = ASSOCIATION_VALID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.LaneImpl
	 * @see xPDL.impl.XPDLPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 2;

	/**
	 * The feature id for the '<em><b>Activityset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ACTIVITYSET = ASSOCIATION_VALID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = ASSOCIATION_VALID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = ASSOCIATION_VALID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = ASSOCIATION_VALID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = ASSOCIATION_VALID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.ActivitySetImpl <em>Activity Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.ActivitySetImpl
	 * @see xPDL.impl.XPDLPackageImpl#getActivitySet()
	 * @generated
	 */
	int ACTIVITY_SET = 3;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SET__ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SET__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Activity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.ProcessImpl
	 * @see xPDL.impl.XPDLPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Activityset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITYSET = 1;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__POOL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.ActivityImpl
	 * @see xPDL.impl.XPDLPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = ASSOCIATION_VALID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TITLE = ASSOCIATION_VALID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ASSOCIATION_VALID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = ASSOCIATION_VALID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.BlockActivityImpl <em>Block Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.BlockActivityImpl
	 * @see xPDL.impl.XPDLPackageImpl#getBlockActivity()
	 * @generated
	 */
	int BLOCK_ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ACTIVITY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ACTIVITY__TITLE = ACTIVITY__TITLE;

	/**
	 * The number of structural features of the '<em>Block Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.EventImpl
	 * @see xPDL.impl.XPDLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TITLE = ACTIVITY__TITLE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.GatewayImpl
	 * @see xPDL.impl.XPDLPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TITLE = ACTIVITY__TITLE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__RULE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.SubFlowImpl <em>Sub Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.SubFlowImpl
	 * @see xPDL.impl.XPDLPackageImpl#getSubFlow()
	 * @generated
	 */
	int SUB_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__TITLE = ACTIVITY__TITLE;

	/**
	 * The number of structural features of the '<em>Sub Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.ArtifactImpl
	 * @see xPDL.impl.XPDLPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 10;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ASSOCIATION_VALID_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ASSOCIATION_VALID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.DataObjectImpl
	 * @see xPDL.impl.XPDLPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 11;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.TransitionValid <em>Transition Valid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.TransitionValid
	 * @see xPDL.impl.XPDLPackageImpl#getTransitionValid()
	 * @generated
	 */
	int TRANSITION_VALID = 13;

	/**
	 * The number of structural features of the '<em>Transition Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VALID_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transition Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VALID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.MessageFlowValid <em>Message Flow Valid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.MessageFlowValid
	 * @see xPDL.impl.XPDLPackageImpl#getMessageFlowValid()
	 * @generated
	 */
	int MESSAGE_FLOW_VALID = 14;

	/**
	 * The number of structural features of the '<em>Message Flow Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_VALID_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Message Flow Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_VALID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.MessageFlowImpl <em>Message Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.MessageFlowImpl
	 * @see xPDL.impl.XPDLPackageImpl#getMessageFlow()
	 * @generated
	 */
	int MESSAGE_FLOW = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.AssociationImpl
	 * @see xPDL.impl.XPDLPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xPDL.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.impl.TransitionImpl
	 * @see xPDL.impl.XPDLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = ASSOCIATION_VALID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = ASSOCIATION_VALID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = ASSOCIATION_VALID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ASSOCIATION_VALID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = ASSOCIATION_VALID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPDL.EventTime <em>Event Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.EventTime
	 * @see xPDL.impl.XPDLPackageImpl#getEventTime()
	 * @generated
	 */
	int EVENT_TIME = 18;

	/**
	 * The meta object id for the '{@link xPDL.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.EventType
	 * @see xPDL.impl.XPDLPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 19;

	/**
	 * The meta object id for the '{@link xPDL.GateRule <em>Gate Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPDL.GateRule
	 * @see xPDL.impl.XPDLPackageImpl#getGateRule()
	 * @generated
	 */
	int GATE_RULE = 20;

	/**
	 * Returns the meta object for class '{@link xPDL.XpdlRoot <em>Xpdl Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xpdl Root</em>'.
	 * @see xPDL.XpdlRoot
	 * @generated
	 */
	EClass getXpdlRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.XpdlRoot#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pools</em>'.
	 * @see xPDL.XpdlRoot#getPools()
	 * @see #getXpdlRoot()
	 * @generated
	 */
	EReference getXpdlRoot_Pools();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.XpdlRoot#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see xPDL.XpdlRoot#getProcess()
	 * @see #getXpdlRoot()
	 * @generated
	 */
	EReference getXpdlRoot_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.XpdlRoot#getMessageflows <em>Messageflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messageflows</em>'.
	 * @see xPDL.XpdlRoot#getMessageflows()
	 * @see #getXpdlRoot()
	 * @generated
	 */
	EReference getXpdlRoot_Messageflows();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.XpdlRoot#getDiagramName <em>Diagram Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Name</em>'.
	 * @see xPDL.XpdlRoot#getDiagramName()
	 * @see #getXpdlRoot()
	 * @generated
	 */
	EAttribute getXpdlRoot_DiagramName();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.XpdlRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.XpdlRoot#getId()
	 * @see #getXpdlRoot()
	 * @generated
	 */
	EAttribute getXpdlRoot_Id();

	/**
	 * Returns the meta object for class '{@link xPDL.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see xPDL.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.Pool#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see xPDL.Pool#getLanes()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Lanes();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Pool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.Pool#getId()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_Id();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Pool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xPDL.Pool#getName()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_Name();

	/**
	 * Returns the meta object for class '{@link xPDL.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see xPDL.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the containment reference '{@link xPDL.Lane#getActivityset <em>Activityset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activityset</em>'.
	 * @see xPDL.Lane#getActivityset()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Activityset();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Lane#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.Lane#getId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Id();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Lane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xPDL.Lane#getName()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Name();

	/**
	 * Returns the meta object for class '{@link xPDL.ActivitySet <em>Activity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Set</em>'.
	 * @see xPDL.ActivitySet
	 * @generated
	 */
	EClass getActivitySet();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.ActivitySet#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see xPDL.ActivitySet#getActivities()
	 * @see #getActivitySet()
	 * @generated
	 */
	EReference getActivitySet_Activities();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.ActivitySet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.ActivitySet#getId()
	 * @see #getActivitySet()
	 * @generated
	 */
	EAttribute getActivitySet_Id();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.ActivitySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xPDL.ActivitySet#getName()
	 * @see #getActivitySet()
	 * @generated
	 */
	EAttribute getActivitySet_Name();

	/**
	 * Returns the meta object for class '{@link xPDL.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see xPDL.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.Process#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see xPDL.Process#getTransitions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link xPDL.Process#getActivityset <em>Activityset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityset</em>'.
	 * @see xPDL.Process#getActivityset()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activityset();

	/**
	 * Returns the meta object for the reference '{@link xPDL.Process#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pool</em>'.
	 * @see xPDL.Process#getPool()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Pool();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Process#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.Process#getId()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Id();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xPDL.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for class '{@link xPDL.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see xPDL.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Activity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xPDL.Activity#getId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Id();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Activity#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see xPDL.Activity#getTitle()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Title();

	/**
	 * Returns the meta object for class '{@link xPDL.BlockActivity <em>Block Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Activity</em>'.
	 * @see xPDL.BlockActivity
	 * @generated
	 */
	EClass getBlockActivity();

	/**
	 * Returns the meta object for class '{@link xPDL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see xPDL.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xPDL.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see xPDL.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for class '{@link xPDL.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see xPDL.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Gateway#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see xPDL.Gateway#getRule()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Rule();

	/**
	 * Returns the meta object for class '{@link xPDL.SubFlow <em>Sub Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Flow</em>'.
	 * @see xPDL.SubFlow
	 * @generated
	 */
	EClass getSubFlow();

	/**
	 * Returns the meta object for class '{@link xPDL.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see xPDL.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link xPDL.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see xPDL.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link xPDL.AssociationValid <em>Association Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Valid</em>'.
	 * @see xPDL.AssociationValid
	 * @generated
	 */
	EClass getAssociationValid();

	/**
	 * Returns the meta object for class '{@link xPDL.TransitionValid <em>Transition Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Valid</em>'.
	 * @see xPDL.TransitionValid
	 * @generated
	 */
	EClass getTransitionValid();

	/**
	 * Returns the meta object for class '{@link xPDL.MessageFlowValid <em>Message Flow Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow Valid</em>'.
	 * @see xPDL.MessageFlowValid
	 * @generated
	 */
	EClass getMessageFlowValid();

	/**
	 * Returns the meta object for class '{@link xPDL.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow</em>'.
	 * @see xPDL.MessageFlow
	 * @generated
	 */
	EClass getMessageFlow();

	/**
	 * Returns the meta object for the reference '{@link xPDL.MessageFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xPDL.MessageFlow#getSource()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link xPDL.MessageFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xPDL.MessageFlow#getTarget()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_Target();

	/**
	 * Returns the meta object for class '{@link xPDL.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see xPDL.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link xPDL.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xPDL.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link xPDL.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xPDL.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for class '{@link xPDL.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see xPDL.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link xPDL.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xPDL.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link xPDL.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xPDL.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link xPDL.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see xPDL.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for enum '{@link xPDL.EventTime <em>Event Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Time</em>'.
	 * @see xPDL.EventTime
	 * @generated
	 */
	EEnum getEventTime();

	/**
	 * Returns the meta object for enum '{@link xPDL.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see xPDL.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link xPDL.GateRule <em>Gate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Rule</em>'.
	 * @see xPDL.GateRule
	 * @generated
	 */
	EEnum getGateRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPDLFactory getXPDLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xPDL.impl.XpdlRootImpl <em>Xpdl Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.XpdlRootImpl
		 * @see xPDL.impl.XPDLPackageImpl#getXpdlRoot()
		 * @generated
		 */
		EClass XPDL_ROOT = eINSTANCE.getXpdlRoot();

		/**
		 * The meta object literal for the '<em><b>Pools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPDL_ROOT__POOLS = eINSTANCE.getXpdlRoot_Pools();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPDL_ROOT__PROCESS = eINSTANCE.getXpdlRoot_Process();

		/**
		 * The meta object literal for the '<em><b>Messageflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPDL_ROOT__MESSAGEFLOWS = eINSTANCE.getXpdlRoot_Messageflows();

		/**
		 * The meta object literal for the '<em><b>Diagram Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPDL_ROOT__DIAGRAM_NAME = eINSTANCE.getXpdlRoot_DiagramName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPDL_ROOT__ID = eINSTANCE.getXpdlRoot_Id();

		/**
		 * The meta object literal for the '{@link xPDL.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.PoolImpl
		 * @see xPDL.impl.XPDLPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__LANES = eINSTANCE.getPool_Lanes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__ID = eINSTANCE.getPool_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__NAME = eINSTANCE.getPool_Name();

		/**
		 * The meta object literal for the '{@link xPDL.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.LaneImpl
		 * @see xPDL.impl.XPDLPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Activityset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ACTIVITYSET = eINSTANCE.getLane_Activityset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__ID = eINSTANCE.getLane_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__NAME = eINSTANCE.getLane_Name();

		/**
		 * The meta object literal for the '{@link xPDL.impl.ActivitySetImpl <em>Activity Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.ActivitySetImpl
		 * @see xPDL.impl.XPDLPackageImpl#getActivitySet()
		 * @generated
		 */
		EClass ACTIVITY_SET = eINSTANCE.getActivitySet();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_SET__ACTIVITIES = eINSTANCE.getActivitySet_Activities();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_SET__ID = eINSTANCE.getActivitySet_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_SET__NAME = eINSTANCE.getActivitySet_Name();

		/**
		 * The meta object literal for the '{@link xPDL.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.ProcessImpl
		 * @see xPDL.impl.XPDLPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__TRANSITIONS = eINSTANCE.getProcess_Transitions();

		/**
		 * The meta object literal for the '<em><b>Activityset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVITYSET = eINSTANCE.getProcess_Activityset();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__POOL = eINSTANCE.getProcess_Pool();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ID = eINSTANCE.getProcess_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '{@link xPDL.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.ActivityImpl
		 * @see xPDL.impl.XPDLPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ID = eINSTANCE.getActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TITLE = eINSTANCE.getActivity_Title();

		/**
		 * The meta object literal for the '{@link xPDL.impl.BlockActivityImpl <em>Block Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.BlockActivityImpl
		 * @see xPDL.impl.XPDLPackageImpl#getBlockActivity()
		 * @generated
		 */
		EClass BLOCK_ACTIVITY = eINSTANCE.getBlockActivity();

		/**
		 * The meta object literal for the '{@link xPDL.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.EventImpl
		 * @see xPDL.impl.XPDLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '{@link xPDL.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.GatewayImpl
		 * @see xPDL.impl.XPDLPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__RULE = eINSTANCE.getGateway_Rule();

		/**
		 * The meta object literal for the '{@link xPDL.impl.SubFlowImpl <em>Sub Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.SubFlowImpl
		 * @see xPDL.impl.XPDLPackageImpl#getSubFlow()
		 * @generated
		 */
		EClass SUB_FLOW = eINSTANCE.getSubFlow();

		/**
		 * The meta object literal for the '{@link xPDL.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.ArtifactImpl
		 * @see xPDL.impl.XPDLPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link xPDL.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.DataObjectImpl
		 * @see xPDL.impl.XPDLPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link xPDL.AssociationValid <em>Association Valid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.AssociationValid
		 * @see xPDL.impl.XPDLPackageImpl#getAssociationValid()
		 * @generated
		 */
		EClass ASSOCIATION_VALID = eINSTANCE.getAssociationValid();

		/**
		 * The meta object literal for the '{@link xPDL.TransitionValid <em>Transition Valid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.TransitionValid
		 * @see xPDL.impl.XPDLPackageImpl#getTransitionValid()
		 * @generated
		 */
		EClass TRANSITION_VALID = eINSTANCE.getTransitionValid();

		/**
		 * The meta object literal for the '{@link xPDL.MessageFlowValid <em>Message Flow Valid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.MessageFlowValid
		 * @see xPDL.impl.XPDLPackageImpl#getMessageFlowValid()
		 * @generated
		 */
		EClass MESSAGE_FLOW_VALID = eINSTANCE.getMessageFlowValid();

		/**
		 * The meta object literal for the '{@link xPDL.impl.MessageFlowImpl <em>Message Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.MessageFlowImpl
		 * @see xPDL.impl.XPDLPackageImpl#getMessageFlow()
		 * @generated
		 */
		EClass MESSAGE_FLOW = eINSTANCE.getMessageFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__SOURCE = eINSTANCE.getMessageFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__TARGET = eINSTANCE.getMessageFlow_Target();

		/**
		 * The meta object literal for the '{@link xPDL.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.AssociationImpl
		 * @see xPDL.impl.XPDLPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '{@link xPDL.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.impl.TransitionImpl
		 * @see xPDL.impl.XPDLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link xPDL.EventTime <em>Event Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.EventTime
		 * @see xPDL.impl.XPDLPackageImpl#getEventTime()
		 * @generated
		 */
		EEnum EVENT_TIME = eINSTANCE.getEventTime();

		/**
		 * The meta object literal for the '{@link xPDL.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.EventType
		 * @see xPDL.impl.XPDLPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link xPDL.GateRule <em>Gate Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPDL.GateRule
		 * @see xPDL.impl.XPDLPackageImpl#getGateRule()
		 * @generated
		 */
		EEnum GATE_RULE = eINSTANCE.getGateRule();

	}

} //XPDLPackage
