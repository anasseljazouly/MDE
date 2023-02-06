/**
 */
package xPDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Association#getSource <em>Source</em>}</li>
 *   <li>{@link xPDL.Association#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AssociationValid)
	 * @see xPDL.XPDLPackage#getAssociation_Source()
	 * @model
	 * @generated
	 */
	AssociationValid getSource();

	/**
	 * Sets the value of the '{@link xPDL.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AssociationValid value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AssociationValid)
	 * @see xPDL.XPDLPackage#getAssociation_Target()
	 * @model
	 * @generated
	 */
	AssociationValid getTarget();

	/**
	 * Sets the value of the '{@link xPDL.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AssociationValid value);

} // Association
