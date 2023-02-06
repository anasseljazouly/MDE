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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.stp.bpmn.diagram.edit.parts.Activity2EditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.BpmnDiagramEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolPoolCompartmentEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessSubProcessBodyCompartmentEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessSubProcessBorderCompartmentEditPart;
import org.eclipse.stp.bpmn.diagram.part.BpmnDiagramEditorPlugin;
import org.eclipse.stp.bpmn.diagram.providers.BPMNElementTypesActivities;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class BpmnModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBarGen(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SubProcessEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Activity_2003);
			return types;
		}
		if (editPart instanceof PoolPoolCompartmentEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Activity_2001);
			types.add(BpmnElementTypes.SubProcess_2002);
			types.add(BpmnElementTypes.Lane_2004);
			return types;
		}
		if (editPart instanceof SubProcessSubProcessBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Activity_2001);
			types.add(BpmnElementTypes.SubProcess_2002);
			return types;
		}
		if (editPart instanceof BpmnDiagramEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Pool_1001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * Make sure we don't do add things to the subprocesseditpart. we only we
	 * want to add to its compartment.
	 * 
	 * @notgenerated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		/*
		 * Hugues: nope. if (editPart instanceof SubProcessEditPart) { List
		 * types = new ArrayList(); types.add(BpmnElementTypes.Activity_2003);
		 * return types; }
		 */
		// added by hugues
		if (editPart instanceof SubProcessSubProcessBorderCompartmentEditPart) {
			List types = new ArrayList();
			types.addAll(BPMNElementTypesActivities
					.getElementTypesForSubProcessBorder());
			return types;
		}
		// -- added by hugues.
		if (editPart instanceof PoolPoolCompartmentEditPart) {
			List types = new ArrayList();
			types.addAll(BPMNElementTypesActivities
					.getElementTypesForPoolAndSubProcessBody());
			types.add(BpmnElementTypes.Lane_2004);
			return types;
		}
		if (editPart instanceof SubProcessSubProcessBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.addAll(BPMNElementTypesActivities
					.getElementTypesForPoolAndSubProcessBody());
			return types;
		}
		if (editPart instanceof BpmnDiagramEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Pool_1001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Message_3002);
			return types;
		}
		if (sourceEditPart instanceof Activity2EditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Message_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Message_3002);
			return types;
		}
		if (targetEditPart instanceof Activity2EditPart) {
			List types = new ArrayList();
			types.add(BpmnElementTypes.Message_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ActivityEditPart) {
				types.add(BpmnElementTypes.Message_3002);
			}
			if (targetEditPart instanceof Activity2EditPart) {
				types.add(BpmnElementTypes.Message_3002);
			}
			return types;
		}
		if (sourceEditPart instanceof Activity2EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ActivityEditPart) {
				types.add(BpmnElementTypes.Message_3002);
			}
			if (targetEditPart instanceof Activity2EditPart) {
				types.add(BpmnElementTypes.Message_3002);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2001);
			}
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2003);
			}
			return types;
		}
		if (targetEditPart instanceof Activity2EditPart) {
			List types = new ArrayList();
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2001);
			}
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2001);
			}
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2003);
			}
			return types;
		}
		if (sourceEditPart instanceof Activity2EditPart) {
			List types = new ArrayList();
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2001);
			}
			if (relationshipType == BpmnElementTypes.Message_3002) {
				types.add(BpmnElementTypes.Activity_2003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				BpmnDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage("Available domain model elements:");
		dialog.setTitle("Select domain model element");
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
