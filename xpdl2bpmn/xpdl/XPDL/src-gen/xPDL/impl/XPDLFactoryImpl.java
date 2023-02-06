/**
 */
package xPDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xPDL.Activity;
import xPDL.ActivitySet;
import xPDL.Artifact;
import xPDL.Association;
import xPDL.BlockActivity;
import xPDL.DataObject;
import xPDL.Event;
import xPDL.EventTime;
import xPDL.EventType;
import xPDL.GateRule;
import xPDL.Gateway;
import xPDL.Lane;
import xPDL.MessageFlow;
import xPDL.Pool;
import xPDL.SubFlow;
import xPDL.Transition;
import xPDL.XPDLFactory;
import xPDL.XPDLPackage;
import xPDL.XpdlRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPDLFactoryImpl extends EFactoryImpl implements XPDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPDLFactory init() {
		try {
			XPDLFactory theXPDLFactory = (XPDLFactory) EPackage.Registry.INSTANCE.getEFactory(XPDLPackage.eNS_URI);
			if (theXPDLFactory != null) {
				return theXPDLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPDLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case XPDLPackage.XPDL_ROOT:
			return createXpdlRoot();
		case XPDLPackage.POOL:
			return createPool();
		case XPDLPackage.LANE:
			return createLane();
		case XPDLPackage.ACTIVITY_SET:
			return createActivitySet();
		case XPDLPackage.PROCESS:
			return createProcess();
		case XPDLPackage.ACTIVITY:
			return createActivity();
		case XPDLPackage.BLOCK_ACTIVITY:
			return createBlockActivity();
		case XPDLPackage.EVENT:
			return createEvent();
		case XPDLPackage.GATEWAY:
			return createGateway();
		case XPDLPackage.SUB_FLOW:
			return createSubFlow();
		case XPDLPackage.ARTIFACT:
			return createArtifact();
		case XPDLPackage.DATA_OBJECT:
			return createDataObject();
		case XPDLPackage.MESSAGE_FLOW:
			return createMessageFlow();
		case XPDLPackage.ASSOCIATION:
			return createAssociation();
		case XPDLPackage.TRANSITION:
			return createTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case XPDLPackage.EVENT_TIME:
			return createEventTimeFromString(eDataType, initialValue);
		case XPDLPackage.EVENT_TYPE:
			return createEventTypeFromString(eDataType, initialValue);
		case XPDLPackage.GATE_RULE:
			return createGateRuleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case XPDLPackage.EVENT_TIME:
			return convertEventTimeToString(eDataType, instanceValue);
		case XPDLPackage.EVENT_TYPE:
			return convertEventTypeToString(eDataType, instanceValue);
		case XPDLPackage.GATE_RULE:
			return convertGateRuleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpdlRoot createXpdlRoot() {
		XpdlRootImpl xpdlRoot = new XpdlRootImpl();
		return xpdlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySet createActivitySet() {
		ActivitySetImpl activitySet = new ActivitySetImpl();
		return activitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPDL.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockActivity createBlockActivity() {
		BlockActivityImpl blockActivity = new BlockActivityImpl();
		return blockActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubFlow createSubFlow() {
		SubFlowImpl subFlow = new SubFlowImpl();
		return subFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTime createEventTimeFromString(EDataType eDataType, String initialValue) {
		EventTime result = EventTime.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateRule createGateRuleFromString(EDataType eDataType, String initialValue) {
		GateRule result = GateRule.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGateRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPDLPackage getXPDLPackage() {
		return (XPDLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPDLPackage getPackage() {
		return XPDLPackage.eINSTANCE;
	}

} //XPDLFactoryImpl
