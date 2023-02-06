/**
 */
package org.eclipse.stp.bpmn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.Vertex;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VertexTest extends TestCase {

	/**
	 * The fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vertex fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VertexTest.class);
	}

	/**
	 * Constructs a new Vertex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vertex fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Vertex getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createVertex());
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

} //VertexTest
