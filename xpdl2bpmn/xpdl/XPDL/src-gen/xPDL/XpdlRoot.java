/**
 */
package xPDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xpdl Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPDL.XpdlRoot#getPools <em>Pools</em>}</li>
 *   <li>{@link xPDL.XpdlRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link xPDL.XpdlRoot#getMessageflows <em>Messageflows</em>}</li>
 *   <li>{@link xPDL.XpdlRoot#getDiagramName <em>Diagram Name</em>}</li>
 *   <li>{@link xPDL.XpdlRoot#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see xPDL.XPDLPackage#getXpdlRoot()
 * @model
 * @generated
 */
public interface XpdlRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Pools</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getXpdlRoot_Pools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pool> getPools();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getXpdlRoot_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<xPDL.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Messageflows</b></em>' containment reference list.
	 * The list contents are of type {@link xPDL.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messageflows</em>' containment reference list.
	 * @see xPDL.XPDLPackage#getXpdlRoot_Messageflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageFlow> getMessageflows();

	/**
	 * Returns the value of the '<em><b>Diagram Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Name</em>' attribute.
	 * @see #setDiagramName(String)
	 * @see xPDL.XPDLPackage#getXpdlRoot_DiagramName()
	 * @model default=""
	 * @generated
	 */
	String getDiagramName();

	/**
	 * Sets the value of the '{@link xPDL.XpdlRoot#getDiagramName <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Name</em>' attribute.
	 * @see #getDiagramName()
	 * @generated
	 */
	void setDiagramName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xPDL.XPDLPackage#getXpdlRoot_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xPDL.XpdlRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // XpdlRoot
