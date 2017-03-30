/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.alloy.taglib.alloy.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class BaseTreeViewTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.Object getChildren() {
		return _children;
	}

	public java.lang.String getContainer() {
		return _container;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.Object getIndex() {
		return _index;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Object getIo() {
		return _io;
	}

	public java.lang.Object getLastSelected() {
		return _lastSelected;
	}

	public java.lang.String getType() {
		return _type;
	}

	public java.lang.Object getAfterChildrenChange() {
		return _afterChildrenChange;
	}

	public java.lang.Object getAfterContainerChange() {
		return _afterContainerChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterIndexChange() {
		return _afterIndexChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterIoChange() {
		return _afterIoChange;
	}

	public java.lang.Object getAfterLastSelectedChange() {
		return _afterLastSelectedChange;
	}

	public java.lang.Object getAfterTypeChange() {
		return _afterTypeChange;
	}

	public java.lang.Object getOnChildrenChange() {
		return _onChildrenChange;
	}

	public java.lang.Object getOnContainerChange() {
		return _onContainerChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnIndexChange() {
		return _onIndexChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnIoChange() {
		return _onIoChange;
	}

	public java.lang.Object getOnLastSelectedChange() {
		return _onLastSelectedChange;
	}

	public java.lang.Object getOnTypeChange() {
		return _onTypeChange;
	}

	public void setChildren(java.lang.Object children) {
		_children = children;

		setScopedAttribute("children", children);
	}

	public void setContainer(java.lang.String container) {
		_container = container;

		setScopedAttribute("container", container);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setIndex(java.lang.Object index) {
		_index = index;

		setScopedAttribute("index", index);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setIo(java.lang.Object io) {
		_io = io;

		setScopedAttribute("io", io);
	}

	public void setLastSelected(java.lang.Object lastSelected) {
		_lastSelected = lastSelected;

		setScopedAttribute("lastSelected", lastSelected);
	}

	public void setType(java.lang.String type) {
		_type = type;

		setScopedAttribute("type", type);
	}

	public void setAfterChildrenChange(java.lang.Object afterChildrenChange) {
		_afterChildrenChange = afterChildrenChange;

		setScopedAttribute("afterChildrenChange", afterChildrenChange);
	}

	public void setAfterContainerChange(java.lang.Object afterContainerChange) {
		_afterContainerChange = afterContainerChange;

		setScopedAttribute("afterContainerChange", afterContainerChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterIndexChange(java.lang.Object afterIndexChange) {
		_afterIndexChange = afterIndexChange;

		setScopedAttribute("afterIndexChange", afterIndexChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterIoChange(java.lang.Object afterIoChange) {
		_afterIoChange = afterIoChange;

		setScopedAttribute("afterIoChange", afterIoChange);
	}

	public void setAfterLastSelectedChange(java.lang.Object afterLastSelectedChange) {
		_afterLastSelectedChange = afterLastSelectedChange;

		setScopedAttribute("afterLastSelectedChange", afterLastSelectedChange);
	}

	public void setAfterTypeChange(java.lang.Object afterTypeChange) {
		_afterTypeChange = afterTypeChange;

		setScopedAttribute("afterTypeChange", afterTypeChange);
	}

	public void setOnChildrenChange(java.lang.Object onChildrenChange) {
		_onChildrenChange = onChildrenChange;

		setScopedAttribute("onChildrenChange", onChildrenChange);
	}

	public void setOnContainerChange(java.lang.Object onContainerChange) {
		_onContainerChange = onContainerChange;

		setScopedAttribute("onContainerChange", onContainerChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnIndexChange(java.lang.Object onIndexChange) {
		_onIndexChange = onIndexChange;

		setScopedAttribute("onIndexChange", onIndexChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnIoChange(java.lang.Object onIoChange) {
		_onIoChange = onIoChange;

		setScopedAttribute("onIoChange", onIoChange);
	}

	public void setOnLastSelectedChange(java.lang.Object onLastSelectedChange) {
		_onLastSelectedChange = onLastSelectedChange;

		setScopedAttribute("onLastSelectedChange", onLastSelectedChange);
	}

	public void setOnTypeChange(java.lang.Object onTypeChange) {
		_onTypeChange = onTypeChange;

		setScopedAttribute("onTypeChange", onTypeChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_children = null;
		_container = null;
		_destroyed = false;
		_index = null;
		_initialized = false;
		_io = null;
		_lastSelected = null;
		_type = "file";
		_afterChildrenChange = null;
		_afterContainerChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterIndexChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterIoChange = null;
		_afterLastSelectedChange = null;
		_afterTypeChange = null;
		_onChildrenChange = null;
		_onContainerChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onIndexChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onIoChange = null;
		_onLastSelectedChange = null;
		_onTypeChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("alloy:tree-view:children", _children);
		request.setAttribute("alloy:tree-view:container", _container);
		request.setAttribute("alloy:tree-view:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:tree-view:index", _index);
		request.setAttribute("alloy:tree-view:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:tree-view:io", _io);
		request.setAttribute("alloy:tree-view:lastSelected", _lastSelected);
		request.setAttribute("alloy:tree-view:type", _type);
		request.setAttribute("alloy:tree-view:afterChildrenChange", _afterChildrenChange);
		request.setAttribute("alloy:tree-view:afterContainerChange", _afterContainerChange);
		request.setAttribute("alloy:tree-view:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:tree-view:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:tree-view:afterIndexChange", _afterIndexChange);
		request.setAttribute("alloy:tree-view:afterInit", _afterInit);
		request.setAttribute("alloy:tree-view:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:tree-view:afterIoChange", _afterIoChange);
		request.setAttribute("alloy:tree-view:afterLastSelectedChange", _afterLastSelectedChange);
		request.setAttribute("alloy:tree-view:afterTypeChange", _afterTypeChange);
		request.setAttribute("alloy:tree-view:onChildrenChange", _onChildrenChange);
		request.setAttribute("alloy:tree-view:onContainerChange", _onContainerChange);
		request.setAttribute("alloy:tree-view:onDestroy", _onDestroy);
		request.setAttribute("alloy:tree-view:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:tree-view:onIndexChange", _onIndexChange);
		request.setAttribute("alloy:tree-view:onInit", _onInit);
		request.setAttribute("alloy:tree-view:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:tree-view:onIoChange", _onIoChange);
		request.setAttribute("alloy:tree-view:onLastSelectedChange", _onLastSelectedChange);
		request.setAttribute("alloy:tree-view:onTypeChange", _onTypeChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:tree-view:";

	private static final String _PAGE =
		"/html/taglib/alloy/tree_view/page.jsp";

	private java.lang.Object _children = null;
	private java.lang.String _container = null;
	private boolean _destroyed = false;
	private java.lang.Object _index = null;
	private boolean _initialized = false;
	private java.lang.Object _io = null;
	private java.lang.Object _lastSelected = null;
	private java.lang.String _type = "file";
	private java.lang.Object _afterChildrenChange = null;
	private java.lang.Object _afterContainerChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterIndexChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterIoChange = null;
	private java.lang.Object _afterLastSelectedChange = null;
	private java.lang.Object _afterTypeChange = null;
	private java.lang.Object _onChildrenChange = null;
	private java.lang.Object _onContainerChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onIndexChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onIoChange = null;
	private java.lang.Object _onLastSelectedChange = null;
	private java.lang.Object _onTypeChange = null;

}