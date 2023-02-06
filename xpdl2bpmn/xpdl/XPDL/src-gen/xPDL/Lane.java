/**
 */
package xPDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Lane#getActivityset <em>Activityset</em>}</li>
 *   <li>{@link xPDL.Lane#getId <em>Id</em>}</li>
 *   <li>{@link xPDL.Lane#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends AssociationValid {
	/**
	 * Returns the value of the '<em><b>Activityset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityset</em>' containment reference.
	 * @see #setActivityset(ActivitySet)
	 * @see xPDL.XPDLPackage#getLane_Activityset()
	 * @model containment="true"
	 * @generated
	 */
	ActivitySet getActivityset();

	/**
	 * Sets the value of the '{@link xPDL.Lane#getActivityset <em>Activityset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activityset</em>' containment reference.
	 * @see #getActivityset()
	 * @generated
	 */
	void setActivityset(ActivitySet value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xPDL.XPDLPackage#getLane_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xPDL.Lane#getId <em>Id</em>}' attribute.
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
	 * @see xPDL.XPDLPackage#getLane_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xPDL.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Lane
