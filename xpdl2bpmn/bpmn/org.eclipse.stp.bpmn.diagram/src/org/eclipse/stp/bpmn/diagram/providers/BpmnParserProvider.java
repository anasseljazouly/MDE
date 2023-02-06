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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityName2EditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.LaneNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessNameEditPart;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;

/**
 * @generated
 */
public class BpmnParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityActivityName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getActivityActivityName_4001Parser() {
		if (activityActivityName_4001Parser == null) {
			activityActivityName_4001Parser = createActivityActivityName_4001Parser();
		}
		return activityActivityName_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityActivityName_4001Parser() {
		BpmnStructuralFeatureParser parser = new BpmnStructuralFeatureParser(
				BpmnPackage.eINSTANCE.getActivity().getEStructuralFeature(
						"name")); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser subProcessSubProcessName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getSubProcessSubProcessName_4003Parser() {
		if (subProcessSubProcessName_4003Parser == null) {
			subProcessSubProcessName_4003Parser = createSubProcessSubProcessName_4003Parser();
		}
		return subProcessSubProcessName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSubProcessSubProcessName_4003Parser() {
		BpmnStructuralFeatureParser parser = new BpmnStructuralFeatureParser(
				BpmnPackage.eINSTANCE.getActivity().getEStructuralFeature(
						"name")); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityActivityName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getActivityActivityName_4002Parser() {
		if (activityActivityName_4002Parser == null) {
			activityActivityName_4002Parser = createActivityActivityName_4002Parser();
		}
		return activityActivityName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityActivityName_4002Parser() {
		BpmnStructuralFeatureParser parser = new BpmnStructuralFeatureParser(
				BpmnPackage.eINSTANCE.getActivity().getEStructuralFeature(
						"name")); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser laneLaneName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getLaneLaneName_4004Parser() {
		if (laneLaneName_4004Parser == null) {
			laneLaneName_4004Parser = createLaneLaneName_4004Parser();
		}
		return laneLaneName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLaneLaneName_4004Parser() {
		BpmnStructuralFeatureParser parser = new BpmnStructuralFeatureParser(
				BpmnPackage.eINSTANCE.getLane().getEStructuralFeature("name")); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser poolPoolName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getPoolPoolName_4005Parser() {
		if (poolPoolName_4005Parser == null) {
			poolPoolName_4005Parser = createPoolPoolName_4005Parser();
		}
		return poolPoolName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPoolPoolName_4005Parser() {
		BpmnStructuralFeatureParser parser = new BpmnStructuralFeatureParser(
				BpmnPackage.eINSTANCE.getPool().getEStructuralFeature("name")); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityActivityName_4001Parser();
		case SubProcessNameEditPart.VISUAL_ID:
			return getSubProcessSubProcessName_4003Parser();
		case ActivityName2EditPart.VISUAL_ID:
			return getActivityActivityName_4002Parser();
		case LaneNameEditPart.VISUAL_ID:
			return getLaneLaneName_4004Parser();
		case PoolNameEditPart.VISUAL_ID:
			return getPoolPoolName_4005Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(BpmnVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(BpmnVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (BpmnElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
}
