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

import xPDL.MessageFlow;
import xPDL.Pool;
import xPDL.XPDLPackage;
import xPDL.XpdlRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xpdl Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPDL.impl.XpdlRootImpl#getPools <em>Pools</em>}</li>
 *   <li>{@link xPDL.impl.XpdlRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link xPDL.impl.XpdlRootImpl#getMessageflows <em>Messageflows</em>}</li>
 *   <li>{@link xPDL.impl.XpdlRootImpl#getDiagramName <em>Diagram Name</em>}</li>
 *   <li>{@link xPDL.impl.XpdlRootImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XpdlRootImpl extends MinimalEObjectImpl.Container implements XpdlRoot {
	/**
	 * The cached value of the '{@link #getPools() <em>Pools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPools()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> pools;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<xPDL.Process> process;

	/**
	 * The cached value of the '{@link #getMessageflows() <em>Messageflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageflows()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageFlow> messageflows;

	/**
	 * The default value of the '{@link #getDiagramName() <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDiagramName() <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramName()
	 * @generated
	 * @ordered
	 */
	protected String diagramName = DIAGRAM_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XpdlRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPDLPackage.Literals.XPDL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pool> getPools() {
		if (pools == null) {
			pools = new EObjectContainmentEList<Pool>(Pool.class, this, XPDLPackage.XPDL_ROOT__POOLS);
		}
		return pools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<xPDL.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<xPDL.Process>(xPDL.Process.class, this,
					XPDLPackage.XPDL_ROOT__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageFlow> getMessageflows() {
		if (messageflows == null) {
			messageflows = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this,
					XPDLPackage.XPDL_ROOT__MESSAGEFLOWS);
		}
		return messageflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramName() {
		return diagramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramName(String newDiagramName) {
		String oldDiagramName = diagramName;
		diagramName = newDiagramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPDLPackage.XPDL_ROOT__DIAGRAM_NAME, oldDiagramName,
					diagramName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPDLPackage.XPDL_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XPDLPackage.XPDL_ROOT__POOLS:
			return ((InternalEList<?>) getPools()).basicRemove(otherEnd, msgs);
		case XPDLPackage.XPDL_ROOT__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		case XPDLPackage.XPDL_ROOT__MESSAGEFLOWS:
			return ((InternalEList<?>) getMessageflows()).basicRemove(otherEnd, msgs);
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
		case XPDLPackage.XPDL_ROOT__POOLS:
			return getPools();
		case XPDLPackage.XPDL_ROOT__PROCESS:
			return getProcess();
		case XPDLPackage.XPDL_ROOT__MESSAGEFLOWS:
			return getMessageflows();
		case XPDLPackage.XPDL_ROOT__DIAGRAM_NAME:
			return getDiagramName();
		case XPDLPackage.XPDL_ROOT__ID:
			return getId();
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
		case XPDLPackage.XPDL_ROOT__POOLS:
			getPools().clear();
			getPools().addAll((Collection<? extends Pool>) newValue);
			return;
		case XPDLPackage.XPDL_ROOT__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends xPDL.Process>) newValue);
			return;
		case XPDLPackage.XPDL_ROOT__MESSAGEFLOWS:
			getMessageflows().clear();
			getMessageflows().addAll((Collection<? extends MessageFlow>) newValue);
			return;
		case XPDLPackage.XPDL_ROOT__DIAGRAM_NAME:
			setDiagramName((String) newValue);
			return;
		case XPDLPackage.XPDL_ROOT__ID:
			setId((String) newValue);
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
		case XPDLPackage.XPDL_ROOT__POOLS:
			getPools().clear();
			return;
		case XPDLPackage.XPDL_ROOT__PROCESS:
			getProcess().clear();
			return;
		case XPDLPackage.XPDL_ROOT__MESSAGEFLOWS:
			getMessageflows().clear();
			return;
		case XPDLPackage.XPDL_ROOT__DIAGRAM_NAME:
			setDiagramName(DIAGRAM_NAME_EDEFAULT);
			return;
		case XPDLPackage.XPDL_ROOT__ID:
			setId(ID_EDEFAULT);
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
		case XPDLPackage.XPDL_ROOT__POOLS:
			return pools != null && !pools.isEmpty();
		case XPDLPackage.XPDL_ROOT__PROCESS:
			return process != null && !process.isEmpty();
		case XPDLPackage.XPDL_ROOT__MESSAGEFLOWS:
			return messageflows != null && !messageflows.isEmpty();
		case XPDLPackage.XPDL_ROOT__DIAGRAM_NAME:
			return DIAGRAM_NAME_EDEFAULT == null ? diagramName != null : !DIAGRAM_NAME_EDEFAULT.equals(diagramName);
		case XPDLPackage.XPDL_ROOT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (diagramName: ");
		result.append(diagramName);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //XpdlRootImpl
