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
public abstract class BaseDialogTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.Object getAlign() {
		return _align;
	}

	public java.lang.Object getAlignOn() {
		return _alignOn;
	}

	public java.lang.String getDialogBodyContent() {
		return _dialogBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.Object getButtons() {
		return _buttons;
	}

	public java.lang.Object getCentered() {
		return _centered;
	}

	public boolean getClose() {
		return _close;
	}

	public boolean getCollapsed() {
		return _collapsed;
	}

	public boolean getCollapsible() {
		return _collapsible;
	}

	public java.lang.Object getConstrain() {
		return _constrain;
	}

	public java.lang.Object getConstrain2view() {
		return _constrain2view;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public boolean getDestroyOnClose() {
		return _destroyOnClose;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public java.lang.Object getDragConfig() {
		return _dragConfig;
	}

	public java.lang.Object getDragInstance() {
		return _dragInstance;
	}

	public boolean getDraggable() {
		return _draggable;
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

	public java.lang.String getDialogId() {
		return _dialogId;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public boolean getModal() {
		return _modal;
	}

	public boolean getPreventOverlap() {
		return _preventOverlap;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public boolean getRendered() {
		return _rendered;
	}

	public boolean getResizable() {
		return _resizable;
	}

	public java.lang.Object getResizableConfig() {
		return _resizableConfig;
	}

	public java.lang.Object getResizableInstance() {
		return _resizableInstance;
	}

	public boolean getShim() {
		return _shim;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public boolean getStack() {
		return _stack;
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

	public java.lang.Object getX() {
		return _x;
	}

	public java.lang.Object getXy() {
		return _xy;
	}

	public java.lang.Object getY() {
		return _y;
	}

	public java.lang.Object getZIndex() {
		return _zIndex;
	}

	public java.lang.Object getAfterAlignChange() {
		return _afterAlignChange;
	}

	public java.lang.Object getAfterAlignOnChange() {
		return _afterAlignOnChange;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterButtonsChange() {
		return _afterButtonsChange;
	}

	public java.lang.Object getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.Object getAfterCloseChange() {
		return _afterCloseChange;
	}

	public java.lang.Object getAfterCollapsedChange() {
		return _afterCollapsedChange;
	}

	public java.lang.Object getAfterCollapsibleChange() {
		return _afterCollapsibleChange;
	}

	public java.lang.Object getAfterConstrain2viewChange() {
		return _afterConstrain2viewChange;
	}

	public java.lang.Object getAfterConstrainChange() {
		return _afterConstrainChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyOnCloseChange() {
		return _afterDestroyOnCloseChange;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.Object getAfterDragConfigChange() {
		return _afterDragConfigChange;
	}

	public java.lang.Object getAfterDragInstanceChange() {
		return _afterDragInstanceChange;
	}

	public java.lang.Object getAfterDraggableChange() {
		return _afterDraggableChange;
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

	public java.lang.Object getAfterModalChange() {
		return _afterModalChange;
	}

	public java.lang.Object getAfterPreventOverlapChange() {
		return _afterPreventOverlapChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterResizableChange() {
		return _afterResizableChange;
	}

	public java.lang.Object getAfterResizableConfigChange() {
		return _afterResizableConfigChange;
	}

	public java.lang.Object getAfterResizableInstanceChange() {
		return _afterResizableInstanceChange;
	}

	public java.lang.Object getAfterShimChange() {
		return _afterShimChange;
	}

	public java.lang.Object getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.Object getAfterStackChange() {
		return _afterStackChange;
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

	public java.lang.Object getAfterXChange() {
		return _afterXChange;
	}

	public java.lang.Object getAfterXyChange() {
		return _afterXyChange;
	}

	public java.lang.Object getAfterYChange() {
		return _afterYChange;
	}

	public java.lang.Object getAfterZIndexChange() {
		return _afterZIndexChange;
	}

	public java.lang.Object getOnAlignChange() {
		return _onAlignChange;
	}

	public java.lang.Object getOnAlignOnChange() {
		return _onAlignOnChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnButtonsChange() {
		return _onButtonsChange;
	}

	public java.lang.Object getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.Object getOnCloseChange() {
		return _onCloseChange;
	}

	public java.lang.Object getOnCollapsedChange() {
		return _onCollapsedChange;
	}

	public java.lang.Object getOnCollapsibleChange() {
		return _onCollapsibleChange;
	}

	public java.lang.Object getOnConstrain2viewChange() {
		return _onConstrain2viewChange;
	}

	public java.lang.Object getOnConstrainChange() {
		return _onConstrainChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyOnCloseChange() {
		return _onDestroyOnCloseChange;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.Object getOnDragConfigChange() {
		return _onDragConfigChange;
	}

	public java.lang.Object getOnDragInstanceChange() {
		return _onDragInstanceChange;
	}

	public java.lang.Object getOnDraggableChange() {
		return _onDraggableChange;
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

	public java.lang.Object getOnModalChange() {
		return _onModalChange;
	}

	public java.lang.Object getOnPreventOverlapChange() {
		return _onPreventOverlapChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnResizableChange() {
		return _onResizableChange;
	}

	public java.lang.Object getOnResizableConfigChange() {
		return _onResizableConfigChange;
	}

	public java.lang.Object getOnResizableInstanceChange() {
		return _onResizableInstanceChange;
	}

	public java.lang.Object getOnShimChange() {
		return _onShimChange;
	}

	public java.lang.Object getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.Object getOnStackChange() {
		return _onStackChange;
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

	public java.lang.Object getOnXChange() {
		return _onXChange;
	}

	public java.lang.Object getOnXyChange() {
		return _onXyChange;
	}

	public java.lang.Object getOnYChange() {
		return _onYChange;
	}

	public java.lang.Object getOnZIndexChange() {
		return _onZIndexChange;
	}

	public void setAlign(java.lang.Object align) {
		_align = align;

		setScopedAttribute("align", align);
	}

	public void setAlignOn(java.lang.Object alignOn) {
		_alignOn = alignOn;

		setScopedAttribute("alignOn", alignOn);
	}

	public void setDialogBodyContent(java.lang.String dialogBodyContent) {
		_dialogBodyContent = dialogBodyContent;

		setScopedAttribute("dialogBodyContent", dialogBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setButtons(java.lang.Object buttons) {
		_buttons = buttons;

		setScopedAttribute("buttons", buttons);
	}

	public void setCentered(java.lang.Object centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setClose(boolean close) {
		_close = close;

		setScopedAttribute("close", close);
	}

	public void setCollapsed(boolean collapsed) {
		_collapsed = collapsed;

		setScopedAttribute("collapsed", collapsed);
	}

	public void setCollapsible(boolean collapsible) {
		_collapsible = collapsible;

		setScopedAttribute("collapsible", collapsible);
	}

	public void setConstrain(java.lang.Object constrain) {
		_constrain = constrain;

		setScopedAttribute("constrain", constrain);
	}

	public void setConstrain2view(java.lang.Object constrain2view) {
		_constrain2view = constrain2view;

		setScopedAttribute("constrain2view", constrain2view);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setDestroyOnClose(boolean destroyOnClose) {
		_destroyOnClose = destroyOnClose;

		setScopedAttribute("destroyOnClose", destroyOnClose);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setDragConfig(java.lang.Object dragConfig) {
		_dragConfig = dragConfig;

		setScopedAttribute("dragConfig", dragConfig);
	}

	public void setDragInstance(java.lang.Object dragInstance) {
		_dragInstance = dragInstance;

		setScopedAttribute("dragInstance", dragInstance);
	}

	public void setDraggable(boolean draggable) {
		_draggable = draggable;

		setScopedAttribute("draggable", draggable);
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

	public void setDialogId(java.lang.String dialogId) {
		_dialogId = dialogId;

		setScopedAttribute("dialogId", dialogId);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setModal(boolean modal) {
		_modal = modal;

		setScopedAttribute("modal", modal);
	}

	public void setPreventOverlap(boolean preventOverlap) {
		_preventOverlap = preventOverlap;

		setScopedAttribute("preventOverlap", preventOverlap);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setResizable(boolean resizable) {
		_resizable = resizable;

		setScopedAttribute("resizable", resizable);
	}

	public void setResizableConfig(java.lang.Object resizableConfig) {
		_resizableConfig = resizableConfig;

		setScopedAttribute("resizableConfig", resizableConfig);
	}

	public void setResizableInstance(java.lang.Object resizableInstance) {
		_resizableInstance = resizableInstance;

		setScopedAttribute("resizableInstance", resizableInstance);
	}

	public void setShim(boolean shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStack(boolean stack) {
		_stack = stack;

		setScopedAttribute("stack", stack);
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

	public void setX(java.lang.Object x) {
		_x = x;

		setScopedAttribute("x", x);
	}

	public void setXy(java.lang.Object xy) {
		_xy = xy;

		setScopedAttribute("xy", xy);
	}

	public void setY(java.lang.Object y) {
		_y = y;

		setScopedAttribute("y", y);
	}

	public void setZIndex(java.lang.Object zIndex) {
		_zIndex = zIndex;

		setScopedAttribute("zIndex", zIndex);
	}

	public void setAfterAlignChange(java.lang.Object afterAlignChange) {
		_afterAlignChange = afterAlignChange;

		setScopedAttribute("afterAlignChange", afterAlignChange);
	}

	public void setAfterAlignOnChange(java.lang.Object afterAlignOnChange) {
		_afterAlignOnChange = afterAlignOnChange;

		setScopedAttribute("afterAlignOnChange", afterAlignOnChange);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterButtonsChange(java.lang.Object afterButtonsChange) {
		_afterButtonsChange = afterButtonsChange;

		setScopedAttribute("afterButtonsChange", afterButtonsChange);
	}

	public void setAfterCenteredChange(java.lang.Object afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterCloseChange(java.lang.Object afterCloseChange) {
		_afterCloseChange = afterCloseChange;

		setScopedAttribute("afterCloseChange", afterCloseChange);
	}

	public void setAfterCollapsedChange(java.lang.Object afterCollapsedChange) {
		_afterCollapsedChange = afterCollapsedChange;

		setScopedAttribute("afterCollapsedChange", afterCollapsedChange);
	}

	public void setAfterCollapsibleChange(java.lang.Object afterCollapsibleChange) {
		_afterCollapsibleChange = afterCollapsibleChange;

		setScopedAttribute("afterCollapsibleChange", afterCollapsibleChange);
	}

	public void setAfterConstrain2viewChange(java.lang.Object afterConstrain2viewChange) {
		_afterConstrain2viewChange = afterConstrain2viewChange;

		setScopedAttribute("afterConstrain2viewChange", afterConstrain2viewChange);
	}

	public void setAfterConstrainChange(java.lang.Object afterConstrainChange) {
		_afterConstrainChange = afterConstrainChange;

		setScopedAttribute("afterConstrainChange", afterConstrainChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyOnCloseChange(java.lang.Object afterDestroyOnCloseChange) {
		_afterDestroyOnCloseChange = afterDestroyOnCloseChange;

		setScopedAttribute("afterDestroyOnCloseChange", afterDestroyOnCloseChange);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.Object afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterDragConfigChange(java.lang.Object afterDragConfigChange) {
		_afterDragConfigChange = afterDragConfigChange;

		setScopedAttribute("afterDragConfigChange", afterDragConfigChange);
	}

	public void setAfterDragInstanceChange(java.lang.Object afterDragInstanceChange) {
		_afterDragInstanceChange = afterDragInstanceChange;

		setScopedAttribute("afterDragInstanceChange", afterDragInstanceChange);
	}

	public void setAfterDraggableChange(java.lang.Object afterDraggableChange) {
		_afterDraggableChange = afterDraggableChange;

		setScopedAttribute("afterDraggableChange", afterDraggableChange);
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

	public void setAfterModalChange(java.lang.Object afterModalChange) {
		_afterModalChange = afterModalChange;

		setScopedAttribute("afterModalChange", afterModalChange);
	}

	public void setAfterPreventOverlapChange(java.lang.Object afterPreventOverlapChange) {
		_afterPreventOverlapChange = afterPreventOverlapChange;

		setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterResizableChange(java.lang.Object afterResizableChange) {
		_afterResizableChange = afterResizableChange;

		setScopedAttribute("afterResizableChange", afterResizableChange);
	}

	public void setAfterResizableConfigChange(java.lang.Object afterResizableConfigChange) {
		_afterResizableConfigChange = afterResizableConfigChange;

		setScopedAttribute("afterResizableConfigChange", afterResizableConfigChange);
	}

	public void setAfterResizableInstanceChange(java.lang.Object afterResizableInstanceChange) {
		_afterResizableInstanceChange = afterResizableInstanceChange;

		setScopedAttribute("afterResizableInstanceChange", afterResizableInstanceChange);
	}

	public void setAfterShimChange(java.lang.Object afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
	}

	public void setAfterSrcNodeChange(java.lang.Object afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStackChange(java.lang.Object afterStackChange) {
		_afterStackChange = afterStackChange;

		setScopedAttribute("afterStackChange", afterStackChange);
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

	public void setAfterXChange(java.lang.Object afterXChange) {
		_afterXChange = afterXChange;

		setScopedAttribute("afterXChange", afterXChange);
	}

	public void setAfterXyChange(java.lang.Object afterXyChange) {
		_afterXyChange = afterXyChange;

		setScopedAttribute("afterXyChange", afterXyChange);
	}

	public void setAfterYChange(java.lang.Object afterYChange) {
		_afterYChange = afterYChange;

		setScopedAttribute("afterYChange", afterYChange);
	}

	public void setAfterZIndexChange(java.lang.Object afterZIndexChange) {
		_afterZIndexChange = afterZIndexChange;

		setScopedAttribute("afterZIndexChange", afterZIndexChange);
	}

	public void setOnAlignChange(java.lang.Object onAlignChange) {
		_onAlignChange = onAlignChange;

		setScopedAttribute("onAlignChange", onAlignChange);
	}

	public void setOnAlignOnChange(java.lang.Object onAlignOnChange) {
		_onAlignOnChange = onAlignOnChange;

		setScopedAttribute("onAlignOnChange", onAlignOnChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnButtonsChange(java.lang.Object onButtonsChange) {
		_onButtonsChange = onButtonsChange;

		setScopedAttribute("onButtonsChange", onButtonsChange);
	}

	public void setOnCenteredChange(java.lang.Object onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnCloseChange(java.lang.Object onCloseChange) {
		_onCloseChange = onCloseChange;

		setScopedAttribute("onCloseChange", onCloseChange);
	}

	public void setOnCollapsedChange(java.lang.Object onCollapsedChange) {
		_onCollapsedChange = onCollapsedChange;

		setScopedAttribute("onCollapsedChange", onCollapsedChange);
	}

	public void setOnCollapsibleChange(java.lang.Object onCollapsibleChange) {
		_onCollapsibleChange = onCollapsibleChange;

		setScopedAttribute("onCollapsibleChange", onCollapsibleChange);
	}

	public void setOnConstrain2viewChange(java.lang.Object onConstrain2viewChange) {
		_onConstrain2viewChange = onConstrain2viewChange;

		setScopedAttribute("onConstrain2viewChange", onConstrain2viewChange);
	}

	public void setOnConstrainChange(java.lang.Object onConstrainChange) {
		_onConstrainChange = onConstrainChange;

		setScopedAttribute("onConstrainChange", onConstrainChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyOnCloseChange(java.lang.Object onDestroyOnCloseChange) {
		_onDestroyOnCloseChange = onDestroyOnCloseChange;

		setScopedAttribute("onDestroyOnCloseChange", onDestroyOnCloseChange);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.Object onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnDragConfigChange(java.lang.Object onDragConfigChange) {
		_onDragConfigChange = onDragConfigChange;

		setScopedAttribute("onDragConfigChange", onDragConfigChange);
	}

	public void setOnDragInstanceChange(java.lang.Object onDragInstanceChange) {
		_onDragInstanceChange = onDragInstanceChange;

		setScopedAttribute("onDragInstanceChange", onDragInstanceChange);
	}

	public void setOnDraggableChange(java.lang.Object onDraggableChange) {
		_onDraggableChange = onDraggableChange;

		setScopedAttribute("onDraggableChange", onDraggableChange);
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

	public void setOnModalChange(java.lang.Object onModalChange) {
		_onModalChange = onModalChange;

		setScopedAttribute("onModalChange", onModalChange);
	}

	public void setOnPreventOverlapChange(java.lang.Object onPreventOverlapChange) {
		_onPreventOverlapChange = onPreventOverlapChange;

		setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnResizableChange(java.lang.Object onResizableChange) {
		_onResizableChange = onResizableChange;

		setScopedAttribute("onResizableChange", onResizableChange);
	}

	public void setOnResizableConfigChange(java.lang.Object onResizableConfigChange) {
		_onResizableConfigChange = onResizableConfigChange;

		setScopedAttribute("onResizableConfigChange", onResizableConfigChange);
	}

	public void setOnResizableInstanceChange(java.lang.Object onResizableInstanceChange) {
		_onResizableInstanceChange = onResizableInstanceChange;

		setScopedAttribute("onResizableInstanceChange", onResizableInstanceChange);
	}

	public void setOnShimChange(java.lang.Object onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
	}

	public void setOnSrcNodeChange(java.lang.Object onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStackChange(java.lang.Object onStackChange) {
		_onStackChange = onStackChange;

		setScopedAttribute("onStackChange", onStackChange);
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

	public void setOnXChange(java.lang.Object onXChange) {
		_onXChange = onXChange;

		setScopedAttribute("onXChange", onXChange);
	}

	public void setOnXyChange(java.lang.Object onXyChange) {
		_onXyChange = onXyChange;

		setScopedAttribute("onXyChange", onXyChange);
	}

	public void setOnYChange(java.lang.Object onYChange) {
		_onYChange = onYChange;

		setScopedAttribute("onYChange", onYChange);
	}

	public void setOnZIndexChange(java.lang.Object onZIndexChange) {
		_onZIndexChange = onZIndexChange;

		setScopedAttribute("onZIndexChange", onZIndexChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_align = null;
		_alignOn = null;
		_dialogBodyContent = null;
		_boundingBox = null;
		_buttons = null;
		_centered = null;
		_close = true;
		_collapsed = false;
		_collapsible = false;
		_constrain = null;
		_constrain2view = null;
		_contentBox = null;
		_destroyOnClose = false;
		_destroyed = false;
		_disabled = false;
		_dragConfig = null;
		_dragInstance = null;
		_draggable = true;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_icons = null;
		_dialogId = null;
		_initialized = false;
		_modal = false;
		_preventOverlap = false;
		_render = null;
		_rendered = false;
		_resizable = true;
		_resizableConfig = null;
		_resizableInstance = null;
		_shim = false;
		_srcNode = null;
		_stack = true;
		_strings = null;
		_tabIndex = 0;
		_title = null;
		_useARIA = true;
		_visible = true;
		_width = null;
		_x = 0;
		_xy = null;
		_y = 0;
		_zIndex = 0;
		_afterAlignChange = null;
		_afterAlignOnChange = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterButtonsChange = null;
		_afterCenteredChange = null;
		_afterCloseChange = null;
		_afterCollapsedChange = null;
		_afterCollapsibleChange = null;
		_afterConstrain2viewChange = null;
		_afterConstrainChange = null;
		_afterContentBoxChange = null;
		_afterDestroy = null;
		_afterDestroyOnCloseChange = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterDragConfigChange = null;
		_afterDragInstanceChange = null;
		_afterDraggableChange = null;
		_afterFillHeightChange = null;
		_afterFocusedChange = null;
		_afterFooterContentChange = null;
		_afterHeaderContentChange = null;
		_afterHeightChange = null;
		_afterIconsChange = null;
		_afterIdChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterModalChange = null;
		_afterPreventOverlapChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterResizableChange = null;
		_afterResizableConfigChange = null;
		_afterResizableInstanceChange = null;
		_afterShimChange = null;
		_afterSrcNodeChange = null;
		_afterStackChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTitleChange = null;
		_afterUseARIAChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_afterXChange = null;
		_afterXyChange = null;
		_afterYChange = null;
		_afterZIndexChange = null;
		_onAlignChange = null;
		_onAlignOnChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onButtonsChange = null;
		_onCenteredChange = null;
		_onCloseChange = null;
		_onCollapsedChange = null;
		_onCollapsibleChange = null;
		_onConstrain2viewChange = null;
		_onConstrainChange = null;
		_onContentBoxChange = null;
		_onDestroy = null;
		_onDestroyOnCloseChange = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onDragConfigChange = null;
		_onDragInstanceChange = null;
		_onDraggableChange = null;
		_onFillHeightChange = null;
		_onFocusedChange = null;
		_onFooterContentChange = null;
		_onHeaderContentChange = null;
		_onHeightChange = null;
		_onIconsChange = null;
		_onIdChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onModalChange = null;
		_onPreventOverlapChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onResizableChange = null;
		_onResizableConfigChange = null;
		_onResizableInstanceChange = null;
		_onShimChange = null;
		_onSrcNodeChange = null;
		_onStackChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTitleChange = null;
		_onUseARIAChange = null;
		_onVisibleChange = null;
		_onContentUpdate = null;
		_onRender = null;
		_onWidthChange = null;
		_onXChange = null;
		_onXyChange = null;
		_onYChange = null;
		_onZIndexChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("alloy:dialog:align", _align);
		request.setAttribute("alloy:dialog:alignOn", _alignOn);
		request.setAttribute("alloy:dialog:bodyContent", _dialogBodyContent);
		request.setAttribute("alloy:dialog:boundingBox", _boundingBox);
		request.setAttribute("alloy:dialog:buttons", _buttons);
		request.setAttribute("alloy:dialog:centered", _centered);
		request.setAttribute("alloy:dialog:close", String.valueOf(_close));
		request.setAttribute("alloy:dialog:collapsed", String.valueOf(_collapsed));
		request.setAttribute("alloy:dialog:collapsible", String.valueOf(_collapsible));
		request.setAttribute("alloy:dialog:constrain", _constrain);
		request.setAttribute("alloy:dialog:constrain2view", _constrain2view);
		request.setAttribute("alloy:dialog:contentBox", _contentBox);
		request.setAttribute("alloy:dialog:destroyOnClose", String.valueOf(_destroyOnClose));
		request.setAttribute("alloy:dialog:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:dialog:disabled", String.valueOf(_disabled));
		request.setAttribute("alloy:dialog:dragConfig", _dragConfig);
		request.setAttribute("alloy:dialog:dragInstance", _dragInstance);
		request.setAttribute("alloy:dialog:draggable", String.valueOf(_draggable));
		request.setAttribute("alloy:dialog:fillHeight", _fillHeight);
		request.setAttribute("alloy:dialog:focused", String.valueOf(_focused));
		request.setAttribute("alloy:dialog:footerContent", _footerContent);
		request.setAttribute("alloy:dialog:headerContent", _headerContent);
		request.setAttribute("alloy:dialog:height", _height);
		request.setAttribute("alloy:dialog:icons", _icons);
		request.setAttribute("alloy:dialog:id", _dialogId);
		request.setAttribute("alloy:dialog:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:dialog:modal", String.valueOf(_modal));
		request.setAttribute("alloy:dialog:preventOverlap", String.valueOf(_preventOverlap));
		request.setAttribute("alloy:dialog:render", _render);
		request.setAttribute("alloy:dialog:rendered", String.valueOf(_rendered));
		request.setAttribute("alloy:dialog:resizable", String.valueOf(_resizable));
		request.setAttribute("alloy:dialog:resizableConfig", _resizableConfig);
		request.setAttribute("alloy:dialog:resizableInstance", _resizableInstance);
		request.setAttribute("alloy:dialog:shim", String.valueOf(_shim));
		request.setAttribute("alloy:dialog:srcNode", _srcNode);
		request.setAttribute("alloy:dialog:stack", String.valueOf(_stack));
		request.setAttribute("alloy:dialog:strings", _strings);
		request.setAttribute("alloy:dialog:tabIndex", _tabIndex);
		request.setAttribute("alloy:dialog:title", _title);
		request.setAttribute("alloy:dialog:useARIA", String.valueOf(_useARIA));
		request.setAttribute("alloy:dialog:visible", String.valueOf(_visible));
		request.setAttribute("alloy:dialog:width", _width);
		request.setAttribute("alloy:dialog:x", _x);
		request.setAttribute("alloy:dialog:xy", _xy);
		request.setAttribute("alloy:dialog:y", _y);
		request.setAttribute("alloy:dialog:zIndex", _zIndex);
		request.setAttribute("alloy:dialog:afterAlignChange", _afterAlignChange);
		request.setAttribute("alloy:dialog:afterAlignOnChange", _afterAlignOnChange);
		request.setAttribute("alloy:dialog:afterBodyContentChange", _afterBodyContentChange);
		request.setAttribute("alloy:dialog:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("alloy:dialog:afterButtonsChange", _afterButtonsChange);
		request.setAttribute("alloy:dialog:afterCenteredChange", _afterCenteredChange);
		request.setAttribute("alloy:dialog:afterCloseChange", _afterCloseChange);
		request.setAttribute("alloy:dialog:afterCollapsedChange", _afterCollapsedChange);
		request.setAttribute("alloy:dialog:afterCollapsibleChange", _afterCollapsibleChange);
		request.setAttribute("alloy:dialog:afterConstrain2viewChange", _afterConstrain2viewChange);
		request.setAttribute("alloy:dialog:afterConstrainChange", _afterConstrainChange);
		request.setAttribute("alloy:dialog:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("alloy:dialog:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:dialog:afterDestroyOnCloseChange", _afterDestroyOnCloseChange);
		request.setAttribute("alloy:dialog:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:dialog:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("alloy:dialog:afterDragConfigChange", _afterDragConfigChange);
		request.setAttribute("alloy:dialog:afterDragInstanceChange", _afterDragInstanceChange);
		request.setAttribute("alloy:dialog:afterDraggableChange", _afterDraggableChange);
		request.setAttribute("alloy:dialog:afterFillHeightChange", _afterFillHeightChange);
		request.setAttribute("alloy:dialog:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("alloy:dialog:afterFooterContentChange", _afterFooterContentChange);
		request.setAttribute("alloy:dialog:afterHeaderContentChange", _afterHeaderContentChange);
		request.setAttribute("alloy:dialog:afterHeightChange", _afterHeightChange);
		request.setAttribute("alloy:dialog:afterIconsChange", _afterIconsChange);
		request.setAttribute("alloy:dialog:afterIdChange", _afterIdChange);
		request.setAttribute("alloy:dialog:afterInit", _afterInit);
		request.setAttribute("alloy:dialog:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:dialog:afterModalChange", _afterModalChange);
		request.setAttribute("alloy:dialog:afterPreventOverlapChange", _afterPreventOverlapChange);
		request.setAttribute("alloy:dialog:afterRenderChange", _afterRenderChange);
		request.setAttribute("alloy:dialog:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("alloy:dialog:afterResizableChange", _afterResizableChange);
		request.setAttribute("alloy:dialog:afterResizableConfigChange", _afterResizableConfigChange);
		request.setAttribute("alloy:dialog:afterResizableInstanceChange", _afterResizableInstanceChange);
		request.setAttribute("alloy:dialog:afterShimChange", _afterShimChange);
		request.setAttribute("alloy:dialog:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("alloy:dialog:afterStackChange", _afterStackChange);
		request.setAttribute("alloy:dialog:afterStringsChange", _afterStringsChange);
		request.setAttribute("alloy:dialog:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("alloy:dialog:afterTitleChange", _afterTitleChange);
		request.setAttribute("alloy:dialog:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("alloy:dialog:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("alloy:dialog:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("alloy:dialog:afterRender", _afterRender);
		request.setAttribute("alloy:dialog:afterWidthChange", _afterWidthChange);
		request.setAttribute("alloy:dialog:afterXChange", _afterXChange);
		request.setAttribute("alloy:dialog:afterXyChange", _afterXyChange);
		request.setAttribute("alloy:dialog:afterYChange", _afterYChange);
		request.setAttribute("alloy:dialog:afterZIndexChange", _afterZIndexChange);
		request.setAttribute("alloy:dialog:onAlignChange", _onAlignChange);
		request.setAttribute("alloy:dialog:onAlignOnChange", _onAlignOnChange);
		request.setAttribute("alloy:dialog:onBodyContentChange", _onBodyContentChange);
		request.setAttribute("alloy:dialog:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("alloy:dialog:onButtonsChange", _onButtonsChange);
		request.setAttribute("alloy:dialog:onCenteredChange", _onCenteredChange);
		request.setAttribute("alloy:dialog:onCloseChange", _onCloseChange);
		request.setAttribute("alloy:dialog:onCollapsedChange", _onCollapsedChange);
		request.setAttribute("alloy:dialog:onCollapsibleChange", _onCollapsibleChange);
		request.setAttribute("alloy:dialog:onConstrain2viewChange", _onConstrain2viewChange);
		request.setAttribute("alloy:dialog:onConstrainChange", _onConstrainChange);
		request.setAttribute("alloy:dialog:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("alloy:dialog:onDestroy", _onDestroy);
		request.setAttribute("alloy:dialog:onDestroyOnCloseChange", _onDestroyOnCloseChange);
		request.setAttribute("alloy:dialog:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:dialog:onDisabledChange", _onDisabledChange);
		request.setAttribute("alloy:dialog:onDragConfigChange", _onDragConfigChange);
		request.setAttribute("alloy:dialog:onDragInstanceChange", _onDragInstanceChange);
		request.setAttribute("alloy:dialog:onDraggableChange", _onDraggableChange);
		request.setAttribute("alloy:dialog:onFillHeightChange", _onFillHeightChange);
		request.setAttribute("alloy:dialog:onFocusedChange", _onFocusedChange);
		request.setAttribute("alloy:dialog:onFooterContentChange", _onFooterContentChange);
		request.setAttribute("alloy:dialog:onHeaderContentChange", _onHeaderContentChange);
		request.setAttribute("alloy:dialog:onHeightChange", _onHeightChange);
		request.setAttribute("alloy:dialog:onIconsChange", _onIconsChange);
		request.setAttribute("alloy:dialog:onIdChange", _onIdChange);
		request.setAttribute("alloy:dialog:onInit", _onInit);
		request.setAttribute("alloy:dialog:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:dialog:onModalChange", _onModalChange);
		request.setAttribute("alloy:dialog:onPreventOverlapChange", _onPreventOverlapChange);
		request.setAttribute("alloy:dialog:onRenderChange", _onRenderChange);
		request.setAttribute("alloy:dialog:onRenderedChange", _onRenderedChange);
		request.setAttribute("alloy:dialog:onResizableChange", _onResizableChange);
		request.setAttribute("alloy:dialog:onResizableConfigChange", _onResizableConfigChange);
		request.setAttribute("alloy:dialog:onResizableInstanceChange", _onResizableInstanceChange);
		request.setAttribute("alloy:dialog:onShimChange", _onShimChange);
		request.setAttribute("alloy:dialog:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("alloy:dialog:onStackChange", _onStackChange);
		request.setAttribute("alloy:dialog:onStringsChange", _onStringsChange);
		request.setAttribute("alloy:dialog:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("alloy:dialog:onTitleChange", _onTitleChange);
		request.setAttribute("alloy:dialog:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("alloy:dialog:onVisibleChange", _onVisibleChange);
		request.setAttribute("alloy:dialog:onContentUpdate", _onContentUpdate);
		request.setAttribute("alloy:dialog:onRender", _onRender);
		request.setAttribute("alloy:dialog:onWidthChange", _onWidthChange);
		request.setAttribute("alloy:dialog:onXChange", _onXChange);
		request.setAttribute("alloy:dialog:onXyChange", _onXyChange);
		request.setAttribute("alloy:dialog:onYChange", _onYChange);
		request.setAttribute("alloy:dialog:onZIndexChange", _onZIndexChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:dialog:";

	private static final String _PAGE =
		"/html/taglib/alloy/dialog/page.jsp";

	private java.lang.Object _align = null;
	private java.lang.Object _alignOn = null;
	private java.lang.String _dialogBodyContent = null;
	private java.lang.String _boundingBox = null;
	private java.lang.Object _buttons = null;
	private java.lang.Object _centered = null;
	private boolean _close = true;
	private boolean _collapsed = false;
	private boolean _collapsible = false;
	private java.lang.Object _constrain = null;
	private java.lang.Object _constrain2view = null;
	private java.lang.String _contentBox = null;
	private boolean _destroyOnClose = false;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private java.lang.Object _dragConfig = null;
	private java.lang.Object _dragInstance = null;
	private boolean _draggable = true;
	private java.lang.Object _fillHeight = null;
	private boolean _focused = false;
	private java.lang.Object _footerContent = null;
	private java.lang.Object _headerContent = null;
	private java.lang.Object _height = null;
	private java.lang.Object _icons = null;
	private java.lang.String _dialogId = null;
	private boolean _initialized = false;
	private boolean _modal = false;
	private boolean _preventOverlap = false;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private boolean _resizable = true;
	private java.lang.Object _resizableConfig = null;
	private java.lang.Object _resizableInstance = null;
	private boolean _shim = false;
	private java.lang.String _srcNode = null;
	private boolean _stack = true;
	private java.lang.Object _strings = null;
	private java.lang.Object _tabIndex = 0;
	private java.lang.Object _title = null;
	private boolean _useARIA = true;
	private boolean _visible = true;
	private java.lang.Object _width = null;
	private java.lang.Object _x = 0;
	private java.lang.Object _xy = null;
	private java.lang.Object _y = 0;
	private java.lang.Object _zIndex = 0;
	private java.lang.Object _afterAlignChange = null;
	private java.lang.Object _afterAlignOnChange = null;
	private java.lang.Object _afterBodyContentChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterButtonsChange = null;
	private java.lang.Object _afterCenteredChange = null;
	private java.lang.Object _afterCloseChange = null;
	private java.lang.Object _afterCollapsedChange = null;
	private java.lang.Object _afterCollapsibleChange = null;
	private java.lang.Object _afterConstrain2viewChange = null;
	private java.lang.Object _afterConstrainChange = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyOnCloseChange = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterDisabledChange = null;
	private java.lang.Object _afterDragConfigChange = null;
	private java.lang.Object _afterDragInstanceChange = null;
	private java.lang.Object _afterDraggableChange = null;
	private java.lang.Object _afterFillHeightChange = null;
	private java.lang.Object _afterFocusedChange = null;
	private java.lang.Object _afterFooterContentChange = null;
	private java.lang.Object _afterHeaderContentChange = null;
	private java.lang.Object _afterHeightChange = null;
	private java.lang.Object _afterIconsChange = null;
	private java.lang.Object _afterIdChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterModalChange = null;
	private java.lang.Object _afterPreventOverlapChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterResizableChange = null;
	private java.lang.Object _afterResizableConfigChange = null;
	private java.lang.Object _afterResizableInstanceChange = null;
	private java.lang.Object _afterShimChange = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStackChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterTitleChange = null;
	private java.lang.Object _afterUseARIAChange = null;
	private java.lang.Object _afterVisibleChange = null;
	private java.lang.Object _afterContentUpdate = null;
	private java.lang.Object _afterRender = null;
	private java.lang.Object _afterWidthChange = null;
	private java.lang.Object _afterXChange = null;
	private java.lang.Object _afterXyChange = null;
	private java.lang.Object _afterYChange = null;
	private java.lang.Object _afterZIndexChange = null;
	private java.lang.Object _onAlignChange = null;
	private java.lang.Object _onAlignOnChange = null;
	private java.lang.Object _onBodyContentChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onButtonsChange = null;
	private java.lang.Object _onCenteredChange = null;
	private java.lang.Object _onCloseChange = null;
	private java.lang.Object _onCollapsedChange = null;
	private java.lang.Object _onCollapsibleChange = null;
	private java.lang.Object _onConstrain2viewChange = null;
	private java.lang.Object _onConstrainChange = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyOnCloseChange = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onDisabledChange = null;
	private java.lang.Object _onDragConfigChange = null;
	private java.lang.Object _onDragInstanceChange = null;
	private java.lang.Object _onDraggableChange = null;
	private java.lang.Object _onFillHeightChange = null;
	private java.lang.Object _onFocusedChange = null;
	private java.lang.Object _onFooterContentChange = null;
	private java.lang.Object _onHeaderContentChange = null;
	private java.lang.Object _onHeightChange = null;
	private java.lang.Object _onIconsChange = null;
	private java.lang.Object _onIdChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onModalChange = null;
	private java.lang.Object _onPreventOverlapChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onResizableChange = null;
	private java.lang.Object _onResizableConfigChange = null;
	private java.lang.Object _onResizableInstanceChange = null;
	private java.lang.Object _onShimChange = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStackChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onTitleChange = null;
	private java.lang.Object _onUseARIAChange = null;
	private java.lang.Object _onVisibleChange = null;
	private java.lang.Object _onContentUpdate = null;
	private java.lang.Object _onRender = null;
	private java.lang.Object _onWidthChange = null;
	private java.lang.Object _onXChange = null;
	private java.lang.Object _onXyChange = null;
	private java.lang.Object _onYChange = null;
	private java.lang.Object _onZIndexChange = null;

}