/**
 */
package org.eclipse.stp.bpmn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnDiagramTest extends TestCase {

	/**
	 * The fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpmnDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BpmnDiagramTest.class);
	}

	/**
	 * Constructs a new Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BpmnDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BpmnDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createBpmnDiagram());
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

} //BpmnDiagramTest
