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

package org.eclipse.stp.bpmn.diagram.edit.helpers;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.stp.bpmn.diagram.edit.helpers.EdgeEditHelperAdvice;
import org.eclipse.stp.bpmn.diagram.edit.helpers.MessageEditHelperAdvice;

/**
 * @generated
 */
public class EdgeEditHelper extends BpmnBaseEditHelper {
	/**
	 * @notgenerated
	 */
	public static final IEditHelperAdvice[] INSTANCE = {
			EdgeEditHelperAdvice.THE_INSTANCE,
			MessageEditHelperAdvice.THE_INSTANCE };

	/**
	 * This is a way to hardcode an adviser without having to declare it a
	 * plugin.xml.
	 * 
	 * @param req
	 *            the edit request
	 * @return the edit helper advice, or <code>null</code> if there is none
	 * @notgenerated
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
		Object editHelperContext = req.getEditHelperContext();
		IEditHelperAdvice[] advice = ElementTypeRegistry.getInstance()
				.getEditHelperAdvice(editHelperContext);
		if (advice != null && advice.length > 0) {
			IEditHelperAdvice[] newAdvice = new IEditHelperAdvice[advice.length
					+ INSTANCE.length];
			System.arraycopy(INSTANCE, 0, newAdvice, 0, INSTANCE.length);
			System.arraycopy(advice, 0, newAdvice, INSTANCE.length,
					advice.length);
			return newAdvice;
		}
		return INSTANCE;
	}
}