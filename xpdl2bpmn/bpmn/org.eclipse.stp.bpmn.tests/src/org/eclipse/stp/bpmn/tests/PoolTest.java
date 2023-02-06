/**
 */
package org.eclipse.stp.bpmn.tests;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.Pool;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoolTest extends GraphTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PoolTest.class);
	}

	/**
	 * Constructs a new Pool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Pool getFixture() {
		return (Pool)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createPool());
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

} //PoolTest
