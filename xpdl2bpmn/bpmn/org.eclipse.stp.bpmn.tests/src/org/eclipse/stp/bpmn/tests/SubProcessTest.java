/**
 */
package org.eclipse.stp.bpmn.tests;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.SubProcess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubProcessTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubProcessTest.class);
	}

	/**
	 * Constructs a new Sub Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sub Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SubProcess getFixture() {
		return (SubProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createSubProcess());
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

} //SubProcessTest
