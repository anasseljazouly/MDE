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
* Jul 21, 2006     hmalphettes         Created
**/

package org.eclipse.stp.bpmn.diagram.edit.helpers;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.Graph;
import org.eclipse.stp.bpmn.Pool;
import org.eclipse.stp.bpmn.SubProcess;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;


/**
 * This class is not generated. We use it to prevent message being created when 
 * the activities it connects don't belong to distinct pools.
 * 
 * The code has been changed to read the secondary semantic hint set on the 
 * IElementTypeEx
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class MessageEditHelperAdvice extends AbstractEditHelperAdvice {

    public static final MessageEditHelperAdvice THE_INSTANCE = new MessageEditHelperAdvice();
	public static final IEditHelperAdvice[] INSTANCE = { THE_INSTANCE };
	
	/**
	 * Looks at a a request and see if the target and source are suitabel:
     * Both must be activities, distinct and the must be enclosed in the 
     * same sub-process or pool.
	 */
	public boolean activitiesBelongToDistinctPools(IEditCommandRequest request) {
        
        CreateRelationshipRequest crr = getCreateRelationshipRequest(request);
        if (crr == null || crr.getElementType() != BpmnElementTypes.Message_3002) {
            return true;//we don't handle these here
        }
        if (crr.getSource() == null || crr.getTarget() == null) {
            return true;//this happens at the beggining of the creation of the edge
        }
	    if (crr.getSource() != null && crr.getTarget() != null &&
                crr.getSource() != crr.getTarget() &&
                crr.getSource() instanceof Activity &&
                crr.getTarget() instanceof Activity) {
            Activity one = (Activity) crr.getSource();
            Activity two = (Activity) crr.getTarget();
            Pool p1 = getPool(one);
            Pool p2 = getPool(two);
            boolean res = p1 != null && p2 != null && p1 != p2;

            return res;
        } else {
            return false;
        }
	}
    
    
    private Pool getPool(Activity activity) {
        Graph parent = activity.getGraph();
        if (parent == null) {
            return null;
        } else if (parent instanceof Pool) {
            return (Pool) parent;
        } else if (parent instanceof SubProcess) {
            return getPool((SubProcess)parent);
        } else {
            return null;
        }
    }
    

    @Override
    public boolean approveRequest(IEditCommandRequest request) {
        return activitiesBelongToDistinctPools(request);
    }


    protected CreateRelationshipRequest getCreateRelationshipRequest(IEditCommandRequest request) {
        if (request instanceof CreateRelationshipRequest) {
            return (CreateRelationshipRequest) request;
        } else if (request instanceof GetEditContextRequest) {
            GetEditContextRequest gec= (GetEditContextRequest)request;
            if (gec.getEditCommandRequest() instanceof CreateRelationshipRequest) {
                return (CreateRelationshipRequest) gec.getEditCommandRequest();
            } else {
//                System.err.println("GOT unhandled type " + gec.getEditCommandRequest());
                return null;
            }
        } else if (request instanceof ConfigureRequest) {
            ConfigureRequest conf= (ConfigureRequest)request;
//            System.err.println("GOT A CONFIG REQ " + conf);
            return null;
        } else {
            return null;
        }
        
    }



//    @Override
//    public void configureRequest(IEditCommandRequest request) {
//        System.err.println("configureRequest " + request);
//        CreateRelationshipRequest creq = getCreateRelationshipRequest(request);
//        if (creq != null) {
//            if (!activitiesBelongToSameGraph(request)) {
//                System.err.println("Set to unexcutable");
//                creq.setParameter(IEditCommandRequest.REPLACE_DEFAULT_COMMAND, true);
//                creq.setParameter(BpmnBaseEditHelper.EDIT_POLICY_COMMAND, UnexecutableCommand.INSTANCE);
//                return;
//            }
//        }
//        super.configureRequest(request);
//    }
	
	
	
}