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
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;


/**
 * This class is geenrated because there is a specialization of the 
 * activity type: the activity either is inside a Graph (pool or sub-process)
 * or is an event handler.
 * 
 * The code has been changed to read the secondary semantic hint set on the 
 * IElementTypeEx
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class EdgeEditHelperAdvice extends AbstractEditHelperAdvice {

    public static final EdgeEditHelperAdvice THE_INSTANCE = new EdgeEditHelperAdvice();
	
//    private boolean previouslySame = false;

	/**
	 * Looks at a a request and see if the target and source are suitabel:
     * Both must be activities, distinct and the must be enclosed in the 
     * same sub-process or pool.
	 */
	public boolean activitiesBelongToSameGraph(IEditCommandRequest request) {
        
        CreateRelationshipRequest crr = getCreateRelationshipRequest(request);
        if (crr == null || crr.getElementType() != BpmnElementTypes.Edge_3001) {
            return true;//we don't handle these here
        }
		if (crr.getTarget() == null || crr.getTarget() == null) {
            return true;//this happens at the beggining of the creation of the edge
        }
	    if (crr.getSource() != null && crr.getTarget() != null &&
                crr.getSource() != crr.getTarget() &&
                crr.getSource() instanceof Activity &&
                crr.getTarget() instanceof Activity) {
            Activity one = (Activity) crr.getSource();
            Activity two = (Activity) crr.getTarget();
            boolean res = (one.getGraph() == two.getGraph());
//                System.err.println(res + "   1g=" + one.getGraph() + " 2g" + two.getGraph());
//            if (previouslySame != res) {//debug
//                previouslySame = res;
//                System.err.println("Got one and two. same graphs? " + previouslySame);
//            }//--end debug
            return res;
        } else {
            return false;
        }
		
	}
    
    
    @Override
    public boolean approveRequest(IEditCommandRequest request) {
        return activitiesBelongToSameGraph(request);
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
	
}