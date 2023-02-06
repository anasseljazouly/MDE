/**
 */
package org.eclipse.stp.bpmn.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.BpmnPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesTypeTest extends TestCase {

	/**
	 * The fixture for this Properties Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertiesTypeTest.class);
	}

	/**
	 * Constructs a new Properties Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Properties Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Properties Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Map.Entry getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((Map.Entry)BpmnFactory.eINSTANCE.create(BpmnPackage.Literals.PROPERTIES_TYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PropertiesTypeTest
