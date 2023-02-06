/**
 */
package xPDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.MessageFlow#getSource <em>Source</em>}</li>
 *   <li>{@link xPDL.MessageFlow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getMessageFlow()
 * @model
 * @generated
 */
public interface MessageFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MessageFlowValid)
	 * @see xPDL.XPDLPackage#getMessageFlow_Source()
	 * @model
	 * @generated
	 */
	MessageFlowValid getSource();

	/**
	 * Sets the value of the '{@link xPDL.MessageFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MessageFlowValid value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MessageFlowValid)
	 * @see xPDL.XPDLPackage#getMessageFlow_Target()
	 * @model
	 * @generated
	 */
	MessageFlowValid getTarget();

	/**
	 * Sets the value of the '{@link xPDL.MessageFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MessageFlowValid value);

} // MessageFlow
