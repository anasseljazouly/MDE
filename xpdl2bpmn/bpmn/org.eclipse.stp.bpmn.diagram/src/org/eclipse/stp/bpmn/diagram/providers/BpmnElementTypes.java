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

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.core.util.IProxyEObject;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.commands.IElementTypeEx;
import org.eclipse.stp.bpmn.diagram.part.BpmnDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class BpmnElementTypes {

	/**
	 * @generated
	 */
	private BpmnElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return BpmnDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @notgenerated
	 */
	private static String getImageRegistryKey(ENamedElement element,
			String activityType) {
		return element.getName() + "." + activityType;
	}

	/**
	 * Pass the acticity type to get the right icon
	 * 
	 * @notgenerated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element, String activityString) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {

				EObject eo = eClass.getEPackage().getEFactoryInstance().create(
						eClass);
				if (eo instanceof Activity) {
					if (activityString != null) {
						ActivityType at = ActivityType.get(activityString);
						if (at != null) {
							((Activity) eo).setActivityType(at);
						}
					}
				}
				return BpmnDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(eo);
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @notgenerated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element,
			String activityType) {
		String key = getImageRegistryKey(element, activityType);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element, activityType);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @notgenerated
	 */
	public static Image getImage(ENamedElement element, String activityString) {
		String key = getImageRegistryKey(element, activityString);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(
					element, activityString);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @notgenerated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		String activityString = hint instanceof IElementTypeEx ? ((IElementTypeEx) hint)
				.getSecondarySemanticHint()
				: null;
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element, activityString);
	}

	/**
	 * make sure we catch the type of the activity
	 * 
	 * @notgenerated
	 */
	public static Image getImage(IAdaptable hint) {
		String activityString = hint instanceof IElementTypeEx ? ((IElementTypeEx) hint)
				.getSecondarySemanticHint()
				: null;
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element, activityString);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @notgenerated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		if (hint instanceof IProxyEObject) {
			Object oo = ((IProxyEObject) hint).resolve();
			if (oo instanceof BpmnDiagram) {
				hint = BpmnDiagram_79;
			} else if (oo instanceof IAdaptable) {
				hint = (IAdaptable) oo;
			}
		}
		IElementType type = hint instanceof IElementType ? (IElementType) hint
				: (IElementType) hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new HashMap();// new IdentityHashMap();
			elements.put(BpmnDiagram_79.getId(), BpmnPackage.eINSTANCE
					.getBpmnDiagram());
			elements.put(Activity_2001.getId(), BpmnPackage.eINSTANCE
					.getActivity());
			elements.put(SubProcess_2002.getId(), BpmnPackage.eINSTANCE
					.getSubProcess());
			elements.put(Activity_2003.getId(), BpmnPackage.eINSTANCE
					.getActivity());
			elements.put(Lane_2004.getId(), BpmnPackage.eINSTANCE.getLane());
			elements.put(Pool_1001.getId(), BpmnPackage.eINSTANCE.getPool());
			elements.put(Edge_3001.getId(), BpmnPackage.eINSTANCE.getEdge());
			elements.put(Message_3002.getId(), BpmnPackage.eINSTANCE
					.getMessage());
		}

		if (type != null) {
			return (ENamedElement) elements.get(type.getId());
		}
		// System.err.println("Looking for " + hint + " returns null");
		return null;
	}

	/**
	 * @generated
	 */
	public static final IElementType BpmnDiagram_79 = getElementType("org.eclipse.stp.bpmn.diagram.BpmnDiagram_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Activity_2001 = getElementType("org.eclipse.stp.bpmn.diagram.Activity_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SubProcess_2002 = getElementType("org.eclipse.stp.bpmn.diagram.SubProcess_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Activity_2003 = getElementType("org.eclipse.stp.bpmn.diagram.Activity_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Lane_2004 = getElementType("org.eclipse.stp.bpmn.diagram.Lane_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pool_1001 = getElementType("org.eclipse.stp.bpmn.diagram.Pool_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Edge_3001 = getElementType("org.eclipse.stp.bpmn.diagram.Edge_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_3002 = getElementType("org.eclipse.stp.bpmn.diagram.Message_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @notgenerated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (elements == null) {
			return getElement(elementType) != null;
		}
		return elements.containsKey(elementType.getId());
		// if (KNOWN_ELEMENT_TYPES == null) {
		// KNOWN_ELEMENT_TYPES = new HashSet();
		// KNOWN_ELEMENT_TYPES.add(BpmnDiagram_79);
		// KNOWN_ELEMENT_TYPES.add(Activity_2001);
		// KNOWN_ELEMENT_TYPES.add(SubProcess_2002);
		// KNOWN_ELEMENT_TYPES.add(Activity_2003);
		// KNOWN_ELEMENT_TYPES.add(Lane_2004);
		// KNOWN_ELEMENT_TYPES.add(Pool_1001);
		// KNOWN_ELEMENT_TYPES.add(Edge_3001);
		// KNOWN_ELEMENT_TYPES.add(Message_3002);
		// }
		// return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
