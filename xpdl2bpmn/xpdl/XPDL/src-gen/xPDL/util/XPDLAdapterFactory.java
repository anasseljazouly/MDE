/**
 */
package xPDL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xPDL.XPDLPackage
 * @generated
 */
public class XPDLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPDLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPDLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPDLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPDLSwitch<Adapter> modelSwitch = new XPDLSwitch<Adapter>() {
		@Override
		public Adapter caseXpdlRoot(XpdlRoot object) {
			return createXpdlRootAdapter();
		}

		@Override
		public Adapter casePool(Pool object) {
			return createPoolAdapter();
		}

		@Override
		public Adapter caseLane(Lane object) {
			return createLaneAdapter();
		}

		@Override
		public Adapter caseActivitySet(ActivitySet object) {
			return createActivitySetAdapter();
		}

		@Override
		public Adapter caseProcess(xPDL.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseBlockActivity(BlockActivity object) {
			return createBlockActivityAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseGateway(Gateway object) {
			return createGatewayAdapter();
		}

		@Override
		public Adapter caseSubFlow(SubFlow object) {
			return createSubFlowAdapter();
		}

		@Override
		public Adapter caseArtifact(Artifact object) {
			return createArtifactAdapter();
		}

		@Override
		public Adapter caseDataObject(DataObject object) {
			return createDataObjectAdapter();
		}

		@Override
		public Adapter caseAssociationValid(AssociationValid object) {
			return createAssociationValidAdapter();
		}

		@Override
		public Adapter caseTransitionValid(TransitionValid object) {
			return createTransitionValidAdapter();
		}

		@Override
		public Adapter caseMessageFlowValid(MessageFlowValid object) {
			return createMessageFlowValidAdapter();
		}

		@Override
		public Adapter caseMessageFlow(MessageFlow object) {
			return createMessageFlowAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.XpdlRoot <em>Xpdl Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.XpdlRoot
	 * @generated
	 */
	public Adapter createXpdlRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Pool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.ActivitySet <em>Activity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.ActivitySet
	 * @generated
	 */
	public Adapter createActivitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.BlockActivity <em>Block Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.BlockActivity
	 * @generated
	 */
	public Adapter createBlockActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.SubFlow <em>Sub Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.SubFlow
	 * @generated
	 */
	public Adapter createSubFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.AssociationValid <em>Association Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.AssociationValid
	 * @generated
	 */
	public Adapter createAssociationValidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.TransitionValid <em>Transition Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.TransitionValid
	 * @generated
	 */
	public Adapter createTransitionValidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.MessageFlowValid <em>Message Flow Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.MessageFlowValid
	 * @generated
	 */
	public Adapter createMessageFlowValidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPDL.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPDL.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XPDLAdapterFactory
