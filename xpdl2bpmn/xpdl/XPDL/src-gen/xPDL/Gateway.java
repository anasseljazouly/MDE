/**
 */
package xPDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Gateway#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends Activity {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link xPDL.GateRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see xPDL.GateRule
	 * @see #setRule(GateRule)
	 * @see xPDL.XPDLPackage#getGateway_Rule()
	 * @model
	 * @generated
	 */
	GateRule getRule();

	/**
	 * Sets the value of the '{@link xPDL.Gateway#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see xPDL.GateRule
	 * @see #getRule()
	 * @generated
	 */
	void setRule(GateRule value);

} // Gateway
