/**
 */
package xPDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link xPDL.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link xPDL.Transition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends AssociationValid {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TransitionValid)
	 * @see xPDL.XPDLPackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	TransitionValid getSource();

	/**
	 * Sets the value of the '{@link xPDL.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TransitionValid value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TransitionValid)
	 * @see xPDL.XPDLPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	TransitionValid getTarget();

	/**
	 * Sets the value of the '{@link xPDL.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TransitionValid value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see xPDL.XPDLPackage#getTransition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link xPDL.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Transition
