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

package org.eclipse.stp.bpmn.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;

/**
 * Nothing different. Currently kept for debugging purpose.
 * 
 * @author hmalphettes
 * 
 */
public class CreationEditPolicyEx extends CreationEditPolicy {

	// /**
	// * @return Command for the REQ_CREATE request. If the request is of type
	// * CreateViewAndElementRequest then a command to create the
	// * semantic, and the view will
	// * @see org.eclipse.gef.EditPolicy#getCommand(org.eclipse.gef.Request)
	// */
	// public Command getCommand(Request request) {
	// if (understandsRequest(request)) {
	// if (request instanceof CreateUnspecifiedTypeRequest) {
	// System.err.println("see request here: " +
	// ((CreateUnspecifiedTypeRequest)request).getElementTypes());
	// }
	// }
	// return super.getCommand(request);
	// }

}
