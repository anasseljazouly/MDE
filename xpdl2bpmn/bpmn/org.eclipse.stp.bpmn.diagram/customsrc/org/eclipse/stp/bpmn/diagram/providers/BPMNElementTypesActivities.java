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

package org.eclipse.stp.bpmn.diagram.providers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.commands.ElementTypeEx;
import org.eclipse.stp.bpmn.commands.IElementTypeEx;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;


public class BPMNElementTypesActivities {

	private static Collection<IElementTypeEx> TypesForSubProcessBorder;

	private static Collection<IElementTypeEx> TypesForPoolAndSubProcessBody;

	public static Collection<IElementTypeEx> getElementTypesForSubProcessBorder() {

		if (TypesForSubProcessBorder == null) {
			TypesForSubProcessBorder = Collections
					.unmodifiableCollection(Arrays
							.asList(new IElementTypeEx[] {
									ElementTypeEx
											.wrap(
													BpmnElementTypes.Activity_2003,
													ActivityType.EVENT_INTERMEDIATE_COMPENSATION_LITERAL
															.getLiteral()),
									ElementTypeEx
											.wrap(
													BpmnElementTypes.Activity_2003,
													ActivityType.EVENT_INTERMEDIATE_ERROR_LITERAL
															.getLiteral()),
									ElementTypeEx
											.wrap(
													BpmnElementTypes.Activity_2003,
													ActivityType.EVENT_INTERMEDIATE_TIMER_LITERAL
															.getLiteral()) }

							));
		}

		return TypesForSubProcessBorder;
	}

	/**
	 * TODO: put them in the order you want to see them
	 * 
	 * @return
	 */
	public static Collection<IElementTypeEx> getElementTypesForPoolAndSubProcessBody() {
		if (TypesForPoolAndSubProcessBody == null) {
			TypesForPoolAndSubProcessBody = new ArrayList<IElementTypeEx>();
			for (Object at : ActivityType.VALUES) {
				String literal = ((ActivityType) at).getLiteral();
				IElementType elementType;
				if ("SubProcess".equals(literal)) {
					elementType = BpmnElementTypes.SubProcess_2002;
				} else {
					elementType = BpmnElementTypes.Activity_2001;
				}
				TypesForPoolAndSubProcessBody.add(ElementTypeEx.wrap(
						elementType, literal));
			}
		}
		return TypesForPoolAndSubProcessBody;
	}

}
