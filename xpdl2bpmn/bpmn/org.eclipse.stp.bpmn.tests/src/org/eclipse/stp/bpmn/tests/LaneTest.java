/**
 */
package org.eclipse.stp.bpmn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.Lane;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneTest extends TestCase {

	/**
	 * The fixture for this Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lane fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LaneTest.class);
	}

	/**
	 * Constructs a new Lane test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Lane fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Lane getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createLane());
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

} //LaneTest
