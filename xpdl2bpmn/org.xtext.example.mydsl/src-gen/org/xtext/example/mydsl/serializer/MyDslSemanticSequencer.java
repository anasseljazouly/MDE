/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import xPDL.Activity;
import xPDL.ActivitySet;
import xPDL.BlockActivity;
import xPDL.Event;
import xPDL.Gateway;
import xPDL.Lane;
import xPDL.MessageFlow;
import xPDL.Pool;
import xPDL.SubFlow;
import xPDL.Transition;
import xPDL.XPDLPackage;
import xPDL.XpdlRoot;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XPDLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XPDLPackage.ACTIVITY:
				sequence_Activity_Impl(context, (Activity) semanticObject); 
				return; 
			case XPDLPackage.ACTIVITY_SET:
				sequence_ActivitySet(context, (ActivitySet) semanticObject); 
				return; 
			case XPDLPackage.BLOCK_ACTIVITY:
				sequence_BlockActivity(context, (BlockActivity) semanticObject); 
				return; 
			case XPDLPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case XPDLPackage.GATEWAY:
				sequence_Gateway(context, (Gateway) semanticObject); 
				return; 
			case XPDLPackage.LANE:
				sequence_Lane(context, (Lane) semanticObject); 
				return; 
			case XPDLPackage.MESSAGE_FLOW:
				sequence_MessageFlow(context, (MessageFlow) semanticObject); 
				return; 
			case XPDLPackage.POOL:
				sequence_Pool(context, (Pool) semanticObject); 
				return; 
			case XPDLPackage.PROCESS:
				sequence_Process(context, (xPDL.Process) semanticObject); 
				return; 
			case XPDLPackage.SUB_FLOW:
				sequence_SubFlow(context, (SubFlow) semanticObject); 
				return; 
			case XPDLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case XPDLPackage.XPDL_ROOT:
				sequence_XpdlRoot(context, (XpdlRoot) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivitySet returns ActivitySet
	 *
	 * Constraint:
	 *     (id=EString name=EString? activities+=Activity activities+=Activity*)
	 */
	protected void sequence_ActivitySet(ISerializationContext context, ActivitySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns Activity
	 *     Activity returns Activity
	 *     TransitionValid returns Activity
	 *     Activity_Impl returns Activity
	 *
	 * Constraint:
	 *     (id=EString title=EString?)
	 */
	protected void sequence_Activity_Impl(ISerializationContext context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns BlockActivity
	 *     Activity returns BlockActivity
	 *     TransitionValid returns BlockActivity
	 *     BlockActivity returns BlockActivity
	 *
	 * Constraint:
	 *     (id=EString title=EString?)
	 */
	protected void sequence_BlockActivity(ISerializationContext context, BlockActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns Event
	 *     Activity returns Event
	 *     TransitionValid returns Event
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (id=EString title=EString? time=EventTime? type=EventType?)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns Gateway
	 *     Activity returns Gateway
	 *     TransitionValid returns Gateway
	 *     Gateway returns Gateway
	 *
	 * Constraint:
	 *     (id=EString title=EString? rule=GateRule?)
	 */
	protected void sequence_Gateway(ISerializationContext context, Gateway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lane returns Lane
	 *
	 * Constraint:
	 *     (id=EString name=EString? activityset=ActivitySet?)
	 */
	protected void sequence_Lane(ISerializationContext context, Lane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlow returns MessageFlow
	 *
	 * Constraint:
	 *     (source=[MessageFlowValid|EString]? target=[MessageFlowValid|EString]?)
	 */
	protected void sequence_MessageFlow(ISerializationContext context, MessageFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns Pool
	 *     Pool returns Pool
	 *
	 * Constraint:
	 *     (id=EString name=EString? lanes+=Lane lanes+=Lane*)
	 */
	protected void sequence_Pool(ISerializationContext context, Pool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (
	 *         id=EString 
	 *         name=EString? 
	 *         pool=[Pool|EString] 
	 *         (transitions+=Transition transitions+=Transition*)? 
	 *         (activityset+=ActivitySet activityset+=ActivitySet*)?
	 *     )
	 */
	protected void sequence_Process(ISerializationContext context, xPDL.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageFlowValid returns SubFlow
	 *     Activity returns SubFlow
	 *     TransitionValid returns SubFlow
	 *     SubFlow returns SubFlow
	 *
	 * Constraint:
	 *     (id=EString title=EString?)
	 */
	protected void sequence_SubFlow(ISerializationContext context, SubFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (condition=EString? source=[TransitionValid|EString] target=[TransitionValid|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XpdlRoot returns XpdlRoot
	 *
	 * Constraint:
	 *     (
	 *         id=EString 
	 *         diagramName=EString? 
	 *         (pools+=Pool pools+=Pool*)? 
	 *         (process+=Process process+=Process*)? 
	 *         (messageflows+=MessageFlow messageflows+=MessageFlow*)?
	 *     )
	 */
	protected void sequence_XpdlRoot(ISerializationContext context, XpdlRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
