/**
 */
package xPDL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xPDL.Activity;
import xPDL.ActivitySet;
import xPDL.Artifact;
import xPDL.Association;
import xPDL.AssociationValid;
import xPDL.BlockActivity;
import xPDL.DataObject;
import xPDL.Event;
import xPDL.Gateway;
import xPDL.Lane;
import xPDL.MessageFlow;
import xPDL.MessageFlowValid;
import xPDL.Pool;
import xPDL.SubFlow;
import xPDL.Transition;
import xPDL.TransitionValid;
import xPDL.XPDLPackage;
import xPDL.XpdlRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xPDL.XPDLPackage
 * @generated
 */
public class XPDLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPDLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPDLSwitch() {
		if (modelPackage == null) {
			modelPackage = XPDLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case XPDLPackage.XPDL_ROOT: {
			XpdlRoot xpdlRoot = (XpdlRoot) theEObject;
			T result = caseXpdlRoot(xpdlRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.POOL: {
			Pool pool = (Pool) theEObject;
			T result = casePool(pool);
			if (result == null)
				result = caseAssociationValid(pool);
			if (result == null)
				result = caseMessageFlowValid(pool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.LANE: {
			Lane lane = (Lane) theEObject;
			T result = caseLane(lane);
			if (result == null)
				result = caseAssociationValid(lane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.ACTIVITY_SET: {
			ActivitySet activitySet = (ActivitySet) theEObject;
			T result = caseActivitySet(activitySet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.PROCESS: {
			xPDL.Process process = (xPDL.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseAssociationValid(activity);
			if (result == null)
				result = caseMessageFlowValid(activity);
			if (result == null)
				result = caseTransitionValid(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.BLOCK_ACTIVITY: {
			BlockActivity blockActivity = (BlockActivity) theEObject;
			T result = caseBlockActivity(blockActivity);
			if (result == null)
				result = caseActivity(blockActivity);
			if (result == null)
				result = caseAssociationValid(blockActivity);
			if (result == null)
				result = caseMessageFlowValid(blockActivity);
			if (result == null)
				result = caseTransitionValid(blockActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseActivity(event);
			if (result == null)
				result = caseAssociationValid(event);
			if (result == null)
				result = caseMessageFlowValid(event);
			if (result == null)
				result = caseTransitionValid(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseActivity(gateway);
			if (result == null)
				result = caseAssociationValid(gateway);
			if (result == null)
				result = caseMessageFlowValid(gateway);
			if (result == null)
				result = caseTransitionValid(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.SUB_FLOW: {
			SubFlow subFlow = (SubFlow) theEObject;
			T result = caseSubFlow(subFlow);
			if (result == null)
				result = caseActivity(subFlow);
			if (result == null)
				result = caseAssociationValid(subFlow);
			if (result == null)
				result = caseMessageFlowValid(subFlow);
			if (result == null)
				result = caseTransitionValid(subFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.ARTIFACT: {
			Artifact artifact = (Artifact) theEObject;
			T result = caseArtifact(artifact);
			if (result == null)
				result = caseAssociationValid(artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.DATA_OBJECT: {
			DataObject dataObject = (DataObject) theEObject;
			T result = caseDataObject(dataObject);
			if (result == null)
				result = caseArtifact(dataObject);
			if (result == null)
				result = caseAssociationValid(dataObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.ASSOCIATION_VALID: {
			AssociationValid associationValid = (AssociationValid) theEObject;
			T result = caseAssociationValid(associationValid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.TRANSITION_VALID: {
			TransitionValid transitionValid = (TransitionValid) theEObject;
			T result = caseTransitionValid(transitionValid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.MESSAGE_FLOW_VALID: {
			MessageFlowValid messageFlowValid = (MessageFlowValid) theEObject;
			T result = caseMessageFlowValid(messageFlowValid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.MESSAGE_FLOW: {
			MessageFlow messageFlow = (MessageFlow) theEObject;
			T result = caseMessageFlow(messageFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XPDLPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseAssociationValid(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xpdl Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xpdl Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXpdlRoot(XpdlRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitySet(ActivitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(xPDL.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockActivity(BlockActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFlow(SubFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Valid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Valid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationValid(AssociationValid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Valid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Valid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionValid(TransitionValid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Flow Valid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Flow Valid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFlowValid(MessageFlowValid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFlow(MessageFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XPDLSwitch
