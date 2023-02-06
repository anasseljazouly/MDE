/******************************************************************************
* Copyright (c) 2006, Intalio Inc.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
*     Intalio Inc. - initial API and implementation
*******************************************************************************/

package org.eclipse.stp.bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stp.bpmn.BpmnPackage#getActivityType()
 * @model extendedMetaData="name='ActivityType'"
 * @generated
 */
public final class ActivityType extends AbstractEnumerator {
	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK_LITERAL
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK = 0;

	/**
	 * The '<em><b>Sub Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sub Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUB_PROCESS_LITERAL
	 * @model name="SubProcess"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_PROCESS = 1;

	/**
	 * The '<em><b>Event Start Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Start Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_EMPTY_LITERAL
	 * @model name="EventStartEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_START_EMPTY = 2;

	/**
	 * The '<em><b>Event Start Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Start Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_MESSAGE_LITERAL
	 * @model name="EventStartMessage"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_START_MESSAGE = 3;

	/**
	 * The '<em><b>Event Start Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Start Rule</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_RULE_LITERAL
	 * @model name="EventStartRule"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_START_RULE = 4;

	/**
	 * The '<em><b>Event Intermediate Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_EMPTY_LITERAL
	 * @model name="EventIntermediateEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_EMPTY = 5;

	/**
	 * The '<em><b>Event Intermediate Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_MESSAGE_LITERAL
	 * @model name="EventIntermediateMessage"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_MESSAGE = 6;

	/**
	 * The '<em><b>Event Intermediate Timer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Timer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_TIMER_LITERAL
	 * @model name="EventIntermediateTimer"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_TIMER = 7;

	/**
	 * The '<em><b>Event Intermediate Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_ERROR_LITERAL
	 * @model name="EventIntermediateError"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_ERROR = 8;

	/**
	 * The '<em><b>Event Intermediate Compensation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Compensation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_COMPENSATION_LITERAL
	 * @model name="EventIntermediateCompensation"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_COMPENSATION = 9;

	/**
	 * The '<em><b>Event Intermediate Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Intermediate Rule</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_RULE_LITERAL
	 * @model name="EventIntermediateRule"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_INTERMEDIATE_RULE = 10;

	/**
	 * The '<em><b>Event End Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event End Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_EMPTY_LITERAL
	 * @model name="EventEndEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_END_EMPTY = 11;

	/**
	 * The '<em><b>Event End Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event End Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_MESSAGE_LITERAL
	 * @model name="EventEndMessage"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_END_MESSAGE = 12;

	/**
	 * The '<em><b>Event End Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event End Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_ERROR_LITERAL
	 * @model name="EventEndError"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_END_ERROR = 13;

	/**
	 * The '<em><b>Event End Compensation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event End Compensation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_COMPENSATION_LITERAL
	 * @model name="EventEndCompensation"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_END_COMPENSATION = 14;

	/**
	 * The '<em><b>Event End Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event End Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_TERMINATE_LITERAL
	 * @model name="EventEndTerminate"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_END_TERMINATE = 15;

	/**
	 * The '<em><b>Gateway Data Based Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gateway Data Based Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL
	 * @model name="GatewayDataBasedExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_DATA_BASED_EXCLUSIVE = 16;

	/**
	 * The '<em><b>Gateway Event Based Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gateway Event Based Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL
	 * @model name="GatewayEventBasedExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_EVENT_BASED_EXCLUSIVE = 17;

	/**
	 * The '<em><b>Gateway Data Based Inclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gateway Data Based Inclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_DATA_BASED_INCLUSIVE_LITERAL
	 * @model name="GatewayDataBasedInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_DATA_BASED_INCLUSIVE = 18;

	/**
	 * The '<em><b>Gateway Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gateway Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_PARALLEL_LITERAL
	 * @model name="GatewayParallel"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_PARALLEL = 19;

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @generated
	 * @ordered
	 */
	public static final ActivityType TASK_LITERAL = new ActivityType(TASK, "Task", "Task");

	/**
	 * The '<em><b>Sub Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_PROCESS
	 * @generated
	 * @ordered
	 */
	public static final ActivityType SUB_PROCESS_LITERAL = new ActivityType(SUB_PROCESS, "SubProcess", "SubProcess");

	/**
	 * The '<em><b>Event Start Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_EMPTY
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_START_EMPTY_LITERAL = new ActivityType(EVENT_START_EMPTY, "EventStartEmpty", "EventStartEmpty");

	/**
	 * The '<em><b>Event Start Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_MESSAGE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_START_MESSAGE_LITERAL = new ActivityType(EVENT_START_MESSAGE, "EventStartMessage", "EventStartMessage");

	/**
	 * The '<em><b>Event Start Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_START_RULE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_START_RULE_LITERAL = new ActivityType(EVENT_START_RULE, "EventStartRule", "EventStartRule");

	/**
	 * The '<em><b>Event Intermediate Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_EMPTY
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_EMPTY_LITERAL = new ActivityType(EVENT_INTERMEDIATE_EMPTY, "EventIntermediateEmpty", "EventIntermediateEmpty");

	/**
	 * The '<em><b>Event Intermediate Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_MESSAGE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_MESSAGE_LITERAL = new ActivityType(EVENT_INTERMEDIATE_MESSAGE, "EventIntermediateMessage", "EventIntermediateMessage");

	/**
	 * The '<em><b>Event Intermediate Timer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_TIMER
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_TIMER_LITERAL = new ActivityType(EVENT_INTERMEDIATE_TIMER, "EventIntermediateTimer", "EventIntermediateTimer");

	/**
	 * The '<em><b>Event Intermediate Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_ERROR
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_ERROR_LITERAL = new ActivityType(EVENT_INTERMEDIATE_ERROR, "EventIntermediateError", "EventIntermediateError");

	/**
	 * The '<em><b>Event Intermediate Compensation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_COMPENSATION
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_COMPENSATION_LITERAL = new ActivityType(EVENT_INTERMEDIATE_COMPENSATION, "EventIntermediateCompensation", "EventIntermediateCompensation");

	/**
	 * The '<em><b>Event Intermediate Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_INTERMEDIATE_RULE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_INTERMEDIATE_RULE_LITERAL = new ActivityType(EVENT_INTERMEDIATE_RULE, "EventIntermediateRule", "EventIntermediateRule");

	/**
	 * The '<em><b>Event End Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_EMPTY
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_END_EMPTY_LITERAL = new ActivityType(EVENT_END_EMPTY, "EventEndEmpty", "EventEndEmpty");

	/**
	 * The '<em><b>Event End Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_MESSAGE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_END_MESSAGE_LITERAL = new ActivityType(EVENT_END_MESSAGE, "EventEndMessage", "EventEndMessage");

	/**
	 * The '<em><b>Event End Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_ERROR
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_END_ERROR_LITERAL = new ActivityType(EVENT_END_ERROR, "EventEndError", "EventEndError");

	/**
	 * The '<em><b>Event End Compensation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_COMPENSATION
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_END_COMPENSATION_LITERAL = new ActivityType(EVENT_END_COMPENSATION, "EventEndCompensation", "EventEndCompensation");

	/**
	 * The '<em><b>Event End Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_END_TERMINATE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType EVENT_END_TERMINATE_LITERAL = new ActivityType(EVENT_END_TERMINATE, "EventEndTerminate", "EventEndTerminate");

	/**
	 * The '<em><b>Gateway Data Based Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_DATA_BASED_EXCLUSIVE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL = new ActivityType(GATEWAY_DATA_BASED_EXCLUSIVE, "GatewayDataBasedExclusive", "GatewayDataBasedExclusive");

	/**
	 * The '<em><b>Gateway Event Based Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_EVENT_BASED_EXCLUSIVE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL = new ActivityType(GATEWAY_EVENT_BASED_EXCLUSIVE, "GatewayEventBasedExclusive", "GatewayEventBasedExclusive");

	/**
	 * The '<em><b>Gateway Data Based Inclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_DATA_BASED_INCLUSIVE
	 * @generated
	 * @ordered
	 */
	public static final ActivityType GATEWAY_DATA_BASED_INCLUSIVE_LITERAL = new ActivityType(GATEWAY_DATA_BASED_INCLUSIVE, "GatewayDataBasedInclusive", "GatewayDataBasedInclusive");

	/**
	 * The '<em><b>Gateway Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final ActivityType GATEWAY_PARALLEL_LITERAL = new ActivityType(GATEWAY_PARALLEL, "GatewayParallel", "GatewayParallel");

	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityType[] VALUES_ARRAY =
		new ActivityType[] {
			TASK_LITERAL,
			SUB_PROCESS_LITERAL,
			EVENT_START_EMPTY_LITERAL,
			EVENT_START_MESSAGE_LITERAL,
			EVENT_START_RULE_LITERAL,
			EVENT_INTERMEDIATE_EMPTY_LITERAL,
			EVENT_INTERMEDIATE_MESSAGE_LITERAL,
			EVENT_INTERMEDIATE_TIMER_LITERAL,
			EVENT_INTERMEDIATE_ERROR_LITERAL,
			EVENT_INTERMEDIATE_COMPENSATION_LITERAL,
			EVENT_INTERMEDIATE_RULE_LITERAL,
			EVENT_END_EMPTY_LITERAL,
			EVENT_END_MESSAGE_LITERAL,
			EVENT_END_ERROR_LITERAL,
			EVENT_END_COMPENSATION_LITERAL,
			EVENT_END_TERMINATE_LITERAL,
			GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL,
			GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL,
			GATEWAY_DATA_BASED_INCLUSIVE_LITERAL,
			GATEWAY_PARALLEL_LITERAL,
		};
	/**
	 * An array of all the '<em><b>Activity Type</b></em>'
	 * enumerators that are events.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	private static final ActivityType[] VALUES_EVENTS_ARRAY =
		new ActivityType[] {
			EVENT_START_EMPTY_LITERAL,
			EVENT_START_MESSAGE_LITERAL,
			EVENT_START_RULE_LITERAL,
			EVENT_INTERMEDIATE_EMPTY_LITERAL,
			EVENT_INTERMEDIATE_MESSAGE_LITERAL,
			EVENT_INTERMEDIATE_TIMER_LITERAL,
			EVENT_INTERMEDIATE_ERROR_LITERAL,
			EVENT_INTERMEDIATE_COMPENSATION_LITERAL,
			EVENT_INTERMEDIATE_RULE_LITERAL,
			EVENT_END_EMPTY_LITERAL,
			EVENT_END_MESSAGE_LITERAL,
			EVENT_END_ERROR_LITERAL,
			EVENT_END_COMPENSATION_LITERAL,
			EVENT_END_TERMINATE_LITERAL
		};

	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators
	 * that are intermediate events.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	private static final ActivityType[] VALUES_EVENTS_INTERMEDIATE_ARRAY =
		new ActivityType[] {
		GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL,
		GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL,
		GATEWAY_DATA_BASED_INCLUSIVE_LITERAL,
		GATEWAY_PARALLEL_LITERAL
		};
	
	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators
	 * that are gateways.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	private static final ActivityType[] VALUES_GATEWAYS_ARRAY =
		new ActivityType[] {
			EVENT_INTERMEDIATE_EMPTY_LITERAL,
			EVENT_INTERMEDIATE_MESSAGE_LITERAL,
			EVENT_INTERMEDIATE_TIMER_LITERAL,
			EVENT_INTERMEDIATE_ERROR_LITERAL,
			EVENT_INTERMEDIATE_COMPENSATION_LITERAL,
			EVENT_INTERMEDIATE_RULE_LITERAL
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators
	 * that are events.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	public static final List VALUES_EVENTS = Collections.unmodifiableList(Arrays.asList(VALUES_EVENTS_ARRAY));
	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators
	 * that are events.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	public static final List VALUES_EVENTS_INTERMEDIATE =
		Collections.unmodifiableList(Arrays.asList(VALUES_EVENTS_INTERMEDIATE_ARRAY));
	
	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators
	 * that are events.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @notgenerated
	 */
	public static final List VALUES_GATEWAYS =
		Collections.unmodifiableList(Arrays.asList(VALUES_GATEWAYS_ARRAY));

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(int value) {
		switch (value) {
			case TASK: return TASK_LITERAL;
			case SUB_PROCESS: return SUB_PROCESS_LITERAL;
			case EVENT_START_EMPTY: return EVENT_START_EMPTY_LITERAL;
			case EVENT_START_MESSAGE: return EVENT_START_MESSAGE_LITERAL;
			case EVENT_START_RULE: return EVENT_START_RULE_LITERAL;
			case EVENT_INTERMEDIATE_EMPTY: return EVENT_INTERMEDIATE_EMPTY_LITERAL;
			case EVENT_INTERMEDIATE_MESSAGE: return EVENT_INTERMEDIATE_MESSAGE_LITERAL;
			case EVENT_INTERMEDIATE_TIMER: return EVENT_INTERMEDIATE_TIMER_LITERAL;
			case EVENT_INTERMEDIATE_ERROR: return EVENT_INTERMEDIATE_ERROR_LITERAL;
			case EVENT_INTERMEDIATE_COMPENSATION: return EVENT_INTERMEDIATE_COMPENSATION_LITERAL;
			case EVENT_INTERMEDIATE_RULE: return EVENT_INTERMEDIATE_RULE_LITERAL;
			case EVENT_END_EMPTY: return EVENT_END_EMPTY_LITERAL;
			case EVENT_END_MESSAGE: return EVENT_END_MESSAGE_LITERAL;
			case EVENT_END_ERROR: return EVENT_END_ERROR_LITERAL;
			case EVENT_END_COMPENSATION: return EVENT_END_COMPENSATION_LITERAL;
			case EVENT_END_TERMINATE: return EVENT_END_TERMINATE_LITERAL;
			case GATEWAY_DATA_BASED_EXCLUSIVE: return GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL;
			case GATEWAY_EVENT_BASED_EXCLUSIVE: return GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL;
			case GATEWAY_DATA_BASED_INCLUSIVE: return GATEWAY_DATA_BASED_INCLUSIVE_LITERAL;
			case GATEWAY_PARALLEL: return GATEWAY_PARALLEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ActivityType
