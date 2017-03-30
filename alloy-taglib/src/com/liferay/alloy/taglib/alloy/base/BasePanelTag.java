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
public abstract class BasePanelTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.Object getPanelBodyContent() {
		return _panelBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public boolean getCollapsed() {
		return _collapsed;
	}

	public boolean getCollapsible() {
		return _collapsible;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public java.lang.Object getFillHeight() {
		return _fillHeight;
	}

	public boolean getFocused() {
		return _focused;
	}

	public java.lang.Object getFooterContent() {
		return _footerContent;
	}

	public java.lang.Object getHeaderContent() {
		return _headerContent;
	}

	public java.lang.Object getHeight() {
		return _height;
	}

	public java.lang.Object getIcons() {
		return _icons;
	}

	public java.lang.String getPanelId() {
		return _panelId;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public boolean getRendered() {
		return _rendered;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public java.lang.Object getTabIndex() {
		return _tabIndex;
	}

	public java.lang.Object getTitle() {
		return _title;
	}

	public boolean getUseARIA() {
		return _useARIA;
	}

	public boolean getVisible() {
		return _visible;
	}

	public java.lang.Object getWidth() {
		return _width;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterCollapsedChange() {
		return _afterCollapsedChange;
	}

	public java.lang.Object getAfterCollapsibleChange() {
		return _afterCollapsibleChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.Object getAfterFillHeightChange() {
		return _afterFillHeightChange;
	}

	public java.lang.Object getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.Object getAfterFooterContentChange() {
		return _afterFooterContentChange;
	}

	public java.lang.Object getAfterHeaderContentChange() {
		return _afterHeaderContentChange;
	}

	public java.lang.Object getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.Object getAfterIconsChange() {
		return _afterIconsChange;
	}

	public java.lang.Object getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.Object getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.Object getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.Object getAfterTitleChange() {
		return _afterTitleChange;
	}

	public java.lang.Object getAfterUseARIAChange() {
		return _afterUseARIAChange;
	}

	public java.lang.Object getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.Object getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.Object getAfterRender() {
		return _afterRender;
	}

	public java.lang.Object getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnCollapsedChange() {
		return _onCollapsedChange;
	}

	public java.lang.Object getOnCollapsibleChange() {
		return _onCollapsibleChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.Object getOnFillHeightChange() {
		return _onFillHeightChange;
	}

	public java.lang.Object getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.Object getOnFooterContentChange() {
		return _onFooterContentChange;
	}

	public java.lang.Object getOnHeaderContentChange() {
		return _onHeaderContentChange;
	}

	public java.lang.Object getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.Object getOnIconsChange() {
		return _onIconsChange;
	}

	public java.lang.Object getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.Object getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.Object getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.Object getOnTitleChange() {
		return _onTitleChange;
	}

	public java.lang.Object getOnUseARIAChange() {
		return _onUseARIAChange;
	}

	public java.lang.Object getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.Object getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.Object getOnRender() {
		return _onRender;
	}

	public java.lang.Object getOnWidthChange() {
		return _onWidthChange;
	}

	public void setPanelBodyContent(java.lang.Object panelBodyContent) {
		_panelBodyContent = panelBodyContent;

		setScopedAttribute("panelBodyContent", panelBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCollapsed(boolean collapsed) {
		_collapsed = collapsed;

		setScopedAttribute("collapsed", collapsed);
	}

	public void setCollapsible(boolean collapsible) {
		_collapsible = collapsible;

		setScopedAttribute("collapsible", collapsible);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		_fillHeight = fillHeight;

		setScopedAttribute("fillHeight", fillHeight);
	}

	public void setFocused(boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		_footerContent = footerContent;

		setScopedAttribute("footerContent", footerContent);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		_headerContent = headerContent;

		setScopedAttribute("headerContent", headerContent);
	}

	public void setHeight(java.lang.Object height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setIcons(java.lang.Object icons) {
		_icons = icons;

		setScopedAttribute("icons", icons);
	}

	public void setPanelId(java.lang.String panelId) {
		_panelId = panelId;

		setScopedAttribute("panelId", panelId);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTitle(java.lang.Object title) {
		_title = title;

		setScopedAttribute("title", title);
	}

	public void setUseARIA(boolean useARIA) {
		_useARIA = useARIA;

		setScopedAttribute("useARIA", useARIA);
	}

	public void setVisible(boolean visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.Object width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCollapsedChange(java.lang.Object afterCollapsedChange) {
		_afterCollapsedChange = afterCollapsedChange;

		setScopedAttribute("afterCollapsedChange", afterCollapsedChange);
	}

	public void setAfterCollapsibleChange(java.lang.Object afterCollapsibleChange) {
		_afterCollapsibleChange = afterCollapsibleChange;

		setScopedAttribute("afterCollapsibleChange", afterCollapsibleChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.Object afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterFillHeightChange(java.lang.Object afterFillHeightChange) {
		_afterFillHeightChange = afterFillHeightChange;

		setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
	}

	public void setAfterFocusedChange(java.lang.Object afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterFooterContentChange(java.lang.Object afterFooterContentChange) {
		_afterFooterContentChange = afterFooterContentChange;

		setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
	}

	public void setAfterHeaderContentChange(java.lang.Object afterHeaderContentChange) {
		_afterHeaderContentChange = afterHeaderContentChange;

		setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
	}

	public void setAfterHeightChange(java.lang.Object afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterIconsChange(java.lang.Object afterIconsChange) {
		_afterIconsChange = afterIconsChange;

		setScopedAttribute("afterIconsChange", afterIconsChange);
	}

	public void setAfterIdChange(java.lang.Object afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterSrcNodeChange(java.lang.Object afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStringsChange(java.lang.Object afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterTabIndexChange(java.lang.Object afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTitleChange(java.lang.Object afterTitleChange) {
		_afterTitleChange = afterTitleChange;

		setScopedAttribute("afterTitleChange", afterTitleChange);
	}

	public void setAfterUseARIAChange(java.lang.Object afterUseARIAChange) {
		_afterUseARIAChange = afterUseARIAChange;

		setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
	}

	public void setAfterVisibleChange(java.lang.Object afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.Object afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.Object afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.Object afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCollapsedChange(java.lang.Object onCollapsedChange) {
		_onCollapsedChange = onCollapsedChange;

		setScopedAttribute("onCollapsedChange", onCollapsedChange);
	}

	public void setOnCollapsibleChange(java.lang.Object onCollapsibleChange) {
		_onCollapsibleChange = onCollapsibleChange;

		setScopedAttribute("onCollapsibleChange", onCollapsibleChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.Object onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnFillHeightChange(java.lang.Object onFillHeightChange) {
		_onFillHeightChange = onFillHeightChange;

		setScopedAttribute("onFillHeightChange", onFillHeightChange);
	}

	public void setOnFocusedChange(java.lang.Object onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnFooterContentChange(java.lang.Object onFooterContentChange) {
		_onFooterContentChange = onFooterContentChange;

		setScopedAttribute("onFooterContentChange", onFooterContentChange);
	}

	public void setOnHeaderContentChange(java.lang.Object onHeaderContentChange) {
		_onHeaderContentChange = onHeaderContentChange;

		setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
	}

	public void setOnHeightChange(java.lang.Object onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnIconsChange(java.lang.Object onIconsChange) {
		_onIconsChange = onIconsChange;

		setScopedAttribute("onIconsChange", onIconsChange);
	}

	public void setOnIdChange(java.lang.Object onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnSrcNodeChange(java.lang.Object onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStringsChange(java.lang.Object onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnTabIndexChange(java.lang.Object onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTitleChange(java.lang.Object onTitleChange) {
		_onTitleChange = onTitleChange;

		setScopedAttribute("onTitleChange", onTitleChange);
	}

	public void setOnUseARIAChange(java.lang.Object onUseARIAChange) {
		_onUseARIAChange = onUseARIAChange;

		setScopedAttribute("onUseARIAChange", onUseARIAChange);
	}

	public void setOnVisibleChange(java.lang.Object onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.Object onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.Object onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.Object onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_panelBodyContent = null;
		_boundingBox = null;
		_collapsed = false;
		_collapsible = false;
		_contentBox = null;
		_destroyed = false;
		_disabled = false;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_icons = null;
		_panelId = null;
		_initialized = false;
		_render = null;
		_rendered = false;
		_srcNode = null;
		_strings = null;
		_tabIndex = 0;
		_title = null;
		_useARIA = true;
		_visible = true;
		_width = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterCollapsedChange = null;
		_afterCollapsibleChange = null;
		_afterContentBoxChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterFillHeightChange = null;
		_afterFocusedChange = null;
		_afterFooterContentChange = null;
		_afterHeaderContentChange = null;
		_afterHeightChange = null;
		_afterIconsChange = null;
		_afterIdChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTitleChange = null;
		_afterUseARIAChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onCollapsedChange = null;
		_onCollapsibleChange = null;
		_onContentBoxChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onFillHeightChange = null;
		_onFocusedChange = null;
		_onFooterContentChange = null;
		_onHeaderContentChange = null;
		_onHeightChange = null;
		_onIconsChange = null;
		_onIdChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTitleChange = null;
		_onUseARIAChange = null;
		_onVisibleChange = null;
		_onContentUpdate = null;
		_onRender = null;
		_onWidthChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("alloy:panel:bodyContent", _panelBodyContent);
		request.setAttribute("alloy:panel:boundingBox", _boundingBox);
		request.setAttribute("alloy:panel:collapsed", String.valueOf(_collapsed));
		request.setAttribute("alloy:panel:collapsible", String.valueOf(_collapsible));
		request.setAttribute("alloy:panel:contentBox", _contentBox);
		request.setAttribute("alloy:panel:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:panel:disabled", String.valueOf(_disabled));
		request.setAttribute("alloy:panel:fillHeight", _fillHeight);
		request.setAttribute("alloy:panel:focused", String.valueOf(_focused));
		request.setAttribute("alloy:panel:footerContent", _footerContent);
		request.setAttribute("alloy:panel:headerContent", _headerContent);
		request.setAttribute("alloy:panel:height", _height);
		request.setAttribute("alloy:panel:icons", _icons);
		request.setAttribute("alloy:panel:id", _panelId);
		request.setAttribute("alloy:panel:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:panel:render", _render);
		request.setAttribute("alloy:panel:rendered", String.valueOf(_rendered));
		request.setAttribute("alloy:panel:srcNode", _srcNode);
		request.setAttribute("alloy:panel:strings", _strings);
		request.setAttribute("alloy:panel:tabIndex", _tabIndex);
		request.setAttribute("alloy:panel:title", _title);
		request.setAttribute("alloy:panel:useARIA", String.valueOf(_useARIA));
		request.setAttribute("alloy:panel:visible", String.valueOf(_visible));
		request.setAttribute("alloy:panel:width", _width);
		request.setAttribute("alloy:panel:afterBodyContentChange", _afterBodyContentChange);
		request.setAttribute("alloy:panel:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("alloy:panel:afterCollapsedChange", _afterCollapsedChange);
		request.setAttribute("alloy:panel:afterCollapsibleChange", _afterCollapsibleChange);
		request.setAttribute("alloy:panel:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("alloy:panel:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:panel:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:panel:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("alloy:panel:afterFillHeightChange", _afterFillHeightChange);
		request.setAttribute("alloy:panel:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("alloy:panel:afterFooterContentChange", _afterFooterContentChange);
		request.setAttribute("alloy:panel:afterHeaderContentChange", _afterHeaderContentChange);
		request.setAttribute("alloy:panel:afterHeightChange", _afterHeightChange);
		request.setAttribute("alloy:panel:afterIconsChange", _afterIconsChange);
		request.setAttribute("alloy:panel:afterIdChange", _afterIdChange);
		request.setAttribute("alloy:panel:afterInit", _afterInit);
		request.setAttribute("alloy:panel:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:panel:afterRenderChange", _afterRenderChange);
		request.setAttribute("alloy:panel:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("alloy:panel:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("alloy:panel:afterStringsChange", _afterStringsChange);
		request.setAttribute("alloy:panel:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("alloy:panel:afterTitleChange", _afterTitleChange);
		request.setAttribute("alloy:panel:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("alloy:panel:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("alloy:panel:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("alloy:panel:afterRender", _afterRender);
		request.setAttribute("alloy:panel:afterWidthChange", _afterWidthChange);
		request.setAttribute("alloy:panel:onBodyContentChange", _onBodyContentChange);
		request.setAttribute("alloy:panel:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("alloy:panel:onCollapsedChange", _onCollapsedChange);
		request.setAttribute("alloy:panel:onCollapsibleChange", _onCollapsibleChange);
		request.setAttribute("alloy:panel:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("alloy:panel:onDestroy", _onDestroy);
		request.setAttribute("alloy:panel:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:panel:onDisabledChange", _onDisabledChange);
		request.setAttribute("alloy:panel:onFillHeightChange", _onFillHeightChange);
		request.setAttribute("alloy:panel:onFocusedChange", _onFocusedChange);
		request.setAttribute("alloy:panel:onFooterContentChange", _onFooterContentChange);
		request.setAttribute("alloy:panel:onHeaderContentChange", _onHeaderContentChange);
		request.setAttribute("alloy:panel:onHeightChange", _onHeightChange);
		request.setAttribute("alloy:panel:onIconsChange", _onIconsChange);
		request.setAttribute("alloy:panel:onIdChange", _onIdChange);
		request.setAttribute("alloy:panel:onInit", _onInit);
		request.setAttribute("alloy:panel:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:panel:onRenderChange", _onRenderChange);
		request.setAttribute("alloy:panel:onRenderedChange", _onRenderedChange);
		request.setAttribute("alloy:panel:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("alloy:panel:onStringsChange", _onStringsChange);
		request.setAttribute("alloy:panel:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("alloy:panel:onTitleChange", _onTitleChange);
		request.setAttribute("alloy:panel:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("alloy:panel:onVisibleChange", _onVisibleChange);
		request.setAttribute("alloy:panel:onContentUpdate", _onContentUpdate);
		request.setAttribute("alloy:panel:onRender", _onRender);
		request.setAttribute("alloy:panel:onWidthChange", _onWidthChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:panel:";

	private static final String _PAGE =
		"/html/taglib/alloy/panel/page.jsp";

	private java.lang.Object _panelBodyContent = null;
	private java.lang.String _boundingBox = null;
	private boolean _collapsed = false;
	private boolean _collapsible = false;
	private java.lang.String _contentBox = null;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private java.lang.Object _fillHeight = null;
	private boolean _focused = false;
	private java.lang.Object _footerContent = null;
	private java.lang.Object _headerContent = null;
	private java.lang.Object _height = null;
	private java.lang.Object _icons = null;
	private java.lang.String _panelId = null;
	private boolean _initialized = false;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private java.lang.String _srcNode = null;
	private java.lang.Object _strings = null;
	private java.lang.Object _tabIndex = 0;
	private java.lang.Object _title = null;
	private boolean _useARIA = true;
	private boolean _visible = true;
	private java.lang.Object _width = null;
	private java.lang.Object _afterBodyContentChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterCollapsedChange = null;
	private java.lang.Object _afterCollapsibleChange = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterDisabledChange = null;
	private java.lang.Object _afterFillHeightChange = null;
	private java.lang.Object _afterFocusedChange = null;
	private java.lang.Object _afterFooterContentChange = null;
	private java.lang.Object _afterHeaderContentChange = null;
	private java.lang.Object _afterHeightChange = null;
	private java.lang.Object _afterIconsChange = null;
	private java.lang.Object _afterIdChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterTitleChange = null;
	private java.lang.Object _afterUseARIAChange = null;
	private java.lang.Object _afterVisibleChange = null;
	private java.lang.Object _afterContentUpdate = null;
	private java.lang.Object _afterRender = null;
	private java.lang.Object _afterWidthChange = null;
	private java.lang.Object _onBodyContentChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onCollapsedChange = null;
	private java.lang.Object _onCollapsibleChange = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onDisabledChange = null;
	private java.lang.Object _onFillHeightChange = null;
	private java.lang.Object _onFocusedChange = null;
	private java.lang.Object _onFooterContentChange = null;
	private java.lang.Object _onHeaderContentChange = null;
	private java.lang.Object _onHeightChange = null;
	private java.lang.Object _onIconsChange = null;
	private java.lang.Object _onIdChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onTitleChange = null;
	private java.lang.Object _onUseARIAChange = null;
	private java.lang.Object _onVisibleChange = null;
	private java.lang.Object _onContentUpdate = null;
	private java.lang.Object _onRender = null;
	private java.lang.Object _onWidthChange = null;

}