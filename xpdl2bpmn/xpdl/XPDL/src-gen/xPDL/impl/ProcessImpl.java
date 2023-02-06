/**
 */
package xPDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xPDL.ActivitySet;
import xPDL.Pool;
import xPDL.Transition;
import xPDL.XPDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPDL.impl.ProcessImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link xPDL.impl.ProcessImpl#getActivityset <em>Activityset</em>}</li>
 *   <li>{@link xPDL.impl.ProcessImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link xPDL.impl.ProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link xPDL.impl.ProcessImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements xPDL.Process {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getActivityset() <em>Activityset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityset()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivitySet> activityset;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected Pool pool;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPDLPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					XPDLPackage.PROCESS__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivitySet> getActivityset() {
		if (activityset == null) {
			activityset = new EObjectContainmentEList<ActivitySet>(ActivitySet.class, this,
					XPDLPackage.PROCESS__ACTIVITYSET);
		}
		return activityset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool getPool() {
		if (pool != null && pool.eIsProxy()) {
			InternalEObject oldPool = (InternalEObject) pool;
			pool = (Pool) eResolveProxy(oldPool);
			if (pool != oldPool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPDLPackage.PROCESS__POOL, oldPool,
							pool));
			}
		}
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool basicGetPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(Pool newPool) {
		Pool oldPool = pool;
		pool = newPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPDLPackage.PROCESS__POOL, oldPool, pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPDLPackage.PROCESS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPDLPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XPDLPackage.PROCESS__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case XPDLPackage.PROCESS__ACTIVITYSET:
			return ((InternalEList<?>) getActivityset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XPDLPackage.PROCESS__TRANSITIONS:
			return getTransitions();
		case XPDLPackage.PROCESS__ACTIVITYSET:
			return getActivityset();
		case XPDLPackage.PROCESS__POOL:
			if (resolve)
				return getPool();
			return basicGetPool();
		case XPDLPackage.PROCESS__ID:
			return getId();
		case XPDLPackage.PROCESS__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XPDLPackage.PROCESS__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case XPDLPackage.PROCESS__ACTIVITYSET:
			getActivityset().clear();
			getActivityset().addAll((Collection<? extends ActivitySet>) newValue);
			return;
		case XPDLPackage.PROCESS__POOL:
			setPool((Pool) newValue);
			return;
		case XPDLPackage.PROCESS__ID:
			setId((String) newValue);
			return;
		case XPDLPackage.PROCESS__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XPDLPackage.PROCESS__TRANSITIONS:
			getTransitions().clear();
			return;
		case XPDLPackage.PROCESS__ACTIVITYSET:
			getActivityset().clear();
			return;
		case XPDLPackage.PROCESS__POOL:
			setPool((Pool) null);
			return;
		case XPDLPackage.PROCESS__ID:
			setId(ID_EDEFAULT);
			return;
		case XPDLPackage.PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XPDLPackage.PROCESS__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case XPDLPackage.PROCESS__ACTIVITYSET:
			return activityset != null && !activityset.isEmpty();
		case XPDLPackage.PROCESS__POOL:
			return pool != null;
		case XPDLPackage.PROCESS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XPDLPackage.PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
