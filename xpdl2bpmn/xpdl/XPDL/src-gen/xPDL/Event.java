/**
 */
package xPDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.Event#getTime <em>Time</em>}</li>
 *   <li>{@link xPDL.Event#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Activity {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The literals are from the enumeration {@link xPDL.EventTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see xPDL.EventTime
	 * @see #setTime(EventTime)
	 * @see xPDL.XPDLPackage#getEvent_Time()
	 * @model
	 * @generated
	 */
	EventTime getTime();

	/**
	 * Sets the value of the '{@link xPDL.Event#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see xPDL.EventTime
	 * @see #getTime()
	 * @generated
	 */
	void setTime(EventTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link xPDL.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see xPDL.EventType
	 * @see #setType(EventType)
	 * @see xPDL.XPDLPackage#getEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link xPDL.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see xPDL.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

} // Event
