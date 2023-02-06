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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.commands.ElementTypeEx;
import org.eclipse.stp.bpmn.commands.IElementTypeEx;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;

/**
 * @generated
 */
public class BpmnPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createbpmn1Group());
		paletteRoot.add(createEventShapes2Group());
		paletteRoot.add(createGatewayShapes3Group());
	}

	/**
	 * @generated
	 */
	private PaletteContainer createbpmn1Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("bpmn");
		paletteContainer.setDescription("");
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createEdgeConnection2CreationTool());
		paletteContainer.add(createPool3CreationTool());
		paletteContainer.add(createSubProcess4CreationTool());
		paletteContainer.add(createMessageConnection5CreationTool());
		paletteContainer.add(createLane6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createEventShapes2Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Event Shapes");
		paletteContainer.setDescription("Event Shapes");
		paletteContainer.add(createStartEmpty1CreationTool());
		paletteContainer.add(createStartMessage2CreationTool());
		paletteContainer.add(createStartRule3CreationTool());
		paletteContainer.add(createIntermediateEmpty4CreationTool());
		paletteContainer.add(createIntermediateMessage5CreationTool());
		paletteContainer.add(createIntermediateTimer6CreationTool());
		paletteContainer.add(createIntermediateError7CreationTool());
		paletteContainer.add(createIntermediateCompensation8CreationTool());
		paletteContainer.add(createIntermediateRule9CreationTool());
		paletteContainer.add(createEndEmpty10CreationTool());
		paletteContainer.add(createEndMessage11CreationTool());
		paletteContainer.add(createEndError12CreationTool());
		paletteContainer.add(createEndCompensation13CreationTool());
		paletteContainer.add(createEndTerminate14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createGatewayShapes3Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Gateway Shapes");
		paletteContainer.setDescription("Gateway Shapes");
		paletteContainer.add(createDatabasedexcusive1CreationTool());
		paletteContainer.add(createEventbasedexclusive2CreationTool());
		paletteContainer.add(createDatabasedinclusive3CreationTool());
		paletteContainer.add(createParallel4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.Activity_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(BpmnElementTypes.Activity_2001);
		elementTypes.add(BpmnElementTypes.Activity_2003);
		ToolEntry result = new NodeToolEntry("Activity", "Create new Activity",
				smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdgeConnection2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.Edge_3001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(BpmnElementTypes.Edge_3001);
		ToolEntry result = new LinkToolEntry("Edge Connection",
				"Create new Edge Connection", smallImage, largeImage,
				relationshipTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPool3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.Pool_1001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(BpmnElementTypes.Pool_1001);
		ToolEntry result = new NodeToolEntry("Pool", "Create new Pool",
				smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubProcess4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.SubProcess_2002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(BpmnElementTypes.SubProcess_2002);
		ToolEntry result = new NodeToolEntry("SubProcess",
				"Create new SubProcess", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageConnection5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.Message_3002);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(BpmnElementTypes.Message_3002);
		ToolEntry result = new LinkToolEntry("Message Connection",
				"Create new Message Connection", smallImage, largeImage,
				relationshipTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLane6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnElementTypes
				.getImageDescriptor(BpmnElementTypes.Lane_2004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(BpmnElementTypes.Lane_2004);
		ToolEntry result = new NodeToolEntry("Lane", "Create new Lane",
				smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createStartEmpty1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventStartEmpty.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventStartEmpty_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Start Empty", //$NON-NLS-1$
				"Create new Start Empty event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createStartMessage2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventStartMessage.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventStartMessage_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Start Message", //$NON-NLS-1$
				"Create new Start Message event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createStartRule3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventStartRule.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventStartRule_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Start Rule", //$NON-NLS-1$
				"Create new Start Rule event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateEmpty4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateEmpty.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateEmpty_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Empty", //$NON-NLS-1$
				"Create new Intermediate Empty event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateMessage5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateMessage.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateMessage_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Message", //$NON-NLS-1$
				"Create new Intermediate Message event", smallImage, //$NON-NLS-1$
				largeImage, elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateTimer6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateTimer.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateTimer_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Timer", //$NON-NLS-1$
				"Create new Intermediate Timer event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateError7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateError.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateError_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Error", //$NON-NLS-1$
				"Create new Intermediate Error event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateCompensation8CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateCompensation.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateCompensation_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Compensation", //$NON-NLS-1$
				"Create new Intermediate Compensation event", smallImage, //$NON-NLS-1$
				largeImage, elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createIntermediateRule9CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventIntermediateRule.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventIntermediateRule_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Intermediate Rule", //$NON-NLS-1$
				"Create new Intermediate Rule event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEndEmpty10CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventEndEmpty.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventEndEmpty_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("End Empty", //$NON-NLS-1$
				"Create new End Empty event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEndMessage11CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventEndMessage.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventEndMessage_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("End Message", //$NON-NLS-1$
				"Create new End Message event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEndError12CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventEndError.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventEndError_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("End Error", //$NON-NLS-1$
				"Create new End Error event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEndCompensation13CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventEndCompensation.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventEndCompensation_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("End Compensation", //$NON-NLS-1$
				"Create new End Compensation event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEndTerminate14CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/EventEndTerminate.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_EventEndTerminate_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("End Terminate", //$NON-NLS-1$
				"Create new End Terminate event", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createDatabasedexcusive1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/GatewayDataBasedExclusive.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_GatewayDataBasedExclusive_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Data-based excusive", //$NON-NLS-1$
				"Create new Data-based excusive", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createEventbasedexclusive2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/GatewayEventBasedExclusive.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_GatewayEventBasedExclusive_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Event-based exclusive", //$NON-NLS-1$
				"Create new Event-based exclusive", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createDatabasedinclusive3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/GatewayDataBasedInclusive.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_GatewayDataBasedInclusive_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Data-based inclusive", //$NON-NLS-1$
				"Create new Data-based inclusive", smallImage, largeImage, //$NON-NLS-1$
				elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createParallel4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = BpmnDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.stp.bpmn.edit/icons/full/obj16/activities/GatewayParallel.png"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		IElementTypeEx activity = ElementTypeEx
				.wrap(
						BpmnElementTypes.Activity_2001,
						Messages
								.getString("BpmnPaletteFactory._UI_ActivityType_GatewayParallel_literal")); //$NON-NLS-1$

		elementTypes.add(activity);

		ToolEntry result = new NodeToolEntry("Parallel", "Create new Parallel", //$NON-NLS-1$ //$NON-NLS-2$
				smallImage, largeImage, elementTypes) {
		};

		return result;
	}

	/**
	 * @notgenerated
	 */
	private ToolEntry createCreateEmptyStartEvent7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(ElementTypeEx.wrap(
				(IHintedType) BpmnElementTypes.Activity_2001,
				ActivityType.EVENT_START_EMPTY_LITERAL.getLiteral()));
		elementTypes.add(ElementTypeEx.wrap(
				(IHintedType) BpmnElementTypes.Activity_2003,
				ActivityType.EVENT_START_EMPTY_LITERAL.getLiteral()));
		final List aTypes = new ArrayList();
		//		
		// aTypes.add(ActivityType.EVENT_START_EMPTY);
		// aTypes.add(ActivityType.EVENT_START_EMPTY);

		ToolEntry result = new NodeToolEntry("Create Empty Start Event", //$NON-NLS-1$
				"CreateEventStartEmpty", smallImage, largeImage, elementTypes); //$NON-NLS-1$

		return result;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List elementTypes) {
			super(title, description, smallIcon, largeIcon);
			this.elementTypes = elementTypes;
		}

		/**
		 * @notgenerated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationToolEx(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}

		/**
		 * @notgenerated
		 */
		private static class UnspecifiedTypeCreationToolEx extends
				UnspecifiedTypeCreationTool {
			private boolean isActivity;

			public UnspecifiedTypeCreationToolEx(List elementTypes) {
				super(elementTypes);
				for (Object object : elementTypes) {
					if (object instanceof IElementTypeEx) {
						isActivity = true;
						break;
					}
				}
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.gef.tools.CreationTool#updateTargetRequest()
			 */
			@Override
			protected void updateTargetRequest() {
				if (!isActivity) {
					super.updateTargetRequest();
				} else {
					CreateRequest req = getCreateRequest();
					if (isInState(STATE_DRAG_IN_PROGRESS)) {
						Point loq = getStartLocation();
						Rectangle bounds = new Rectangle(loq, loq);
						Dimension delta = getDragMoveDelta();
						int size = Math.max(Math.abs(delta.width), Math
								.abs(delta.height));
						bounds.union(loq.getTranslated(sgn(delta.width) * size,
								sgn(delta.height) * size));
						req.setSize(bounds.getSize());
						req.setLocation(bounds.getLocation());
						req.getExtendedData().clear();
					} else {
						req.setSize(null);
						req.setLocation(getLocation());
					}
				}
			}

			private static int sgn(int i) {
				return i < 0 ? -1 : 1;
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
