/**
 */
package xPDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Pool#getLanes <em>Lanes</em>}</li>
 *   <li>{@link xPDL.Pool#getId <em>Id</em>}</li>
 *   <li>{@link xPDL.Pool#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends AssociationValid, MessageFlowValid {
	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getPool_Lanes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lane> getLanes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xPDL.XPDLPackage#getPool_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xPDL.Pool#getId <em>Id</em>}' attribute.
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
	 * @see xPDL.XPDLPackage#getPool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xPDL.Pool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Pool
