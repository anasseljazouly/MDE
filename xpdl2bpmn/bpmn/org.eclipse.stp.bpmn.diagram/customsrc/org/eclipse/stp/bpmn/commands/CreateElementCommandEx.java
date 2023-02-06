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

/**
* Date             Author              Changes
* Jul 17, 2006     hmalphettes         Created
**/

package org.eclipse.stp.bpmn.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;


/**
 * Support for the {@link IElementTypeEx} to set the activityType
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class CreateElementCommandEx extends CreateElementCommand {

	public CreateElementCommandEx(CreateElementRequest request) {
		super(request);
	}
	
	/**
	 * 
	 * 
	 * @return the new model element that has been created
	 */
	protected EObject doDefaultElementCreation() {
		EReference containment = getContainmentFeature();
		EClass eClass = getElementType().getEClass();

		if (containment != null) {
			EObject element = getElementToEdit();

			if (element != null) {
				EObject res = EMFCoreUtil.create(element, containment, eClass);
				if (res instanceof Activity) {
					if (getElementType() instanceof ElementTypeEx) {
						String secondarySemanticHint =
							((IElementTypeEx)getElementType())
								.getSecondarySemanticHint();
						ActivityType at = ActivityType.get(secondarySemanticHint);
						System.err.println("Got the secondary semantic hint " + secondarySemanticHint);
						if (at != null) {
							System.err.println("Setting the type to " + at);
							((Activity)res).setActivityType(at);
						}
					}
				}
				return res;
			}
		}

		return null;
	}

}
