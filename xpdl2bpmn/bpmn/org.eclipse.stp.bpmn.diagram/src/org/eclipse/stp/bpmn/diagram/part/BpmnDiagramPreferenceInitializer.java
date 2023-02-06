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

package org.eclipse.stp.bpmn.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class BpmnDiagramPreferenceInitializer extends
		DiagramPreferenceInitializer {

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.eclipse.stp.bpmn.diagram.part.BpmnDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
