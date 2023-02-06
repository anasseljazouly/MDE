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

package org.eclipse.stp.bpmn.commands;

import java.net.URL;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementType;
import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.IMetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

public class ElementTypeEx extends ElementType implements IElementTypeEx, IAdaptable {

	/**
	 * Factory method makes sure all the interfaces implemented are returned
	 * @param elem
	 * @param secondarySemanticHint
	 * @return
	 */
	public static IElementTypeEx wrap(IElementType elem, String secondarySemanticHint) {
		if (elem instanceof IMetamodelType) {
			return new MetamodelTypeEx((IHintedType)elem, secondarySemanticHint);
		} else if (elem instanceof ISpecializationType) {
			return new SpecializationTypeEx((IHintedType)elem, secondarySemanticHint);
		}
		return new ElementTypeEx((IHintedType)elem, secondarySemanticHint);
	}
	
	static class MetamodelTypeEx extends ElementTypeEx implements IMetamodelType {
		MetamodelTypeEx(IHintedType elementType,
				String secondarySemanticHint) {
			super(elementType, secondarySemanticHint);
		}
		
		
		
	}
	
	static class SpecializationTypeEx extends ElementTypeEx implements ISpecializationType {
		private final ISpecializationType _casted;
		
		SpecializationTypeEx(IHintedType elementType,
				String secondarySemanticHint) {
			super(elementType, secondarySemanticHint);
			_casted = (ISpecializationType)elementType;
		}

		public IContainerDescriptor getEContainerDescriptor() {
			return _casted.getEContainerDescriptor();
		}

		public IEditHelperAdvice getEditHelperAdvice() {
			return _casted.getEditHelperAdvice();
		}

		public IElementMatcher getMatcher() {
			return _casted.getMatcher();
		}

		public IMetamodelType getMetamodelType() {
			return _casted.getMetamodelType();
		}

		public String[] getSpecializedTypeIds() {
			return _casted.getSpecializedTypeIds();
		}

		public IElementType[] getSpecializedTypes() {
			return _casted.getSpecializedTypes();
		}

		public boolean isSpecializationOf(IElementType type) {
			return _casted.isSpecializationOf(type);
		}
	}
	
	final IHintedType _wrapped;
	private String _secondarySemanticHint;
	
	protected ElementTypeEx(IHintedType elementType,
			String secondarySemanticHint) {
		super(elementType.getId(), elementType.getIconURL(),
				elementType.getDisplayName(), elementType.getEClass());
		_wrapped = elementType;
		_secondarySemanticHint = secondarySemanticHint;
	}
	
	public String getSemanticHint() {
		return _wrapped.getSemanticHint();
	}
	public String getSecondarySemanticHint() {
		return _secondarySemanticHint;
	}
	
	@Override
	public String getDisplayName() {
		return super.getDisplayName() + " " + _secondarySemanticHint;
	}

	@Override
	public URL getIconURL() {
		System.err.println(_secondarySemanticHint + "-> " +  super.getIconURL());
		return super.getIconURL();
	}

	//these are overriden anyways otherwise it breaks.
	public IEditHelper getEditHelper() {
		return _wrapped.getEditHelper();
	}

	public IElementType[] getAllSuperTypes() {
		return _wrapped.getAllSuperTypes();
	}

	public ICommand getEditCommand(IEditCommandRequest request) {
		return _wrapped.getEditCommand(request);
	}
	
	
	
	
//	public int hashCode() {
//		return _wrapped.hashCode();
//	}
	
}
