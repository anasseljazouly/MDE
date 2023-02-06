/**
 */
package xPDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Process#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link xPDL.Process#getActivityset <em>Activityset</em>}</li>
 *   <li>{@link xPDL.Process#getPool <em>Pool</em>}</li>
 *   <li>{@link xPDL.Process#getId <em>Id</em>}</li>
 *   <li>{@link xPDL.Process#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getProcess_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Activityset</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.ActivitySet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityset</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getProcess_Activityset()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivitySet> getActivityset();

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' reference.
	 * @see #setPool(Pool)
	 * @see xPDL.XPDLPackage#getProcess_Pool()
	 * @model required="true"
	 * @generated
	 */
	Pool getPool();

	/**
	 * Sets the value of the '{@link xPDL.Process#getPool <em>Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' reference.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(Pool value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xPDL.XPDLPackage#getProcess_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xPDL.Process#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xPDL.XPDLPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xPDL.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Process
