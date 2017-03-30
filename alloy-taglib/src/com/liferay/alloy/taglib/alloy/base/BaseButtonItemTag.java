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
public abstract class BaseButtonItemTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public boolean getActiveState() {
		return _activeState;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.Object getClassNames() {
		return _classNames;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public boolean getDefaultState() {
		return _defaultState;
	}

	public java.lang.Object getDepth() {
		return _depth;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public boolean getFocused() {
		return _focused;
	}

	public java.lang.Object getHandler() {
		return _handler;
	}

	public java.lang.Object getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public boolean getHoverState() {
		return _hoverState;
	}

	public java.lang.String getIcon() {
		return _icon;
	}

	public java.lang.String getIconNode() {
		return _iconNode;
	}

	public java.lang.String getButtonitemId() {
		return _buttonitemId;
	}

	public java.lang.Object getIndex() {
		return _index;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getLabel() {
		return _label;
	}

	public java.lang.String getLabelNode() {
		return _labelNode;
	}

	public java.lang.Object getButtonitemParent() {
		return _buttonitemParent;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public boolean getRendered() {
		return _rendered;
	}

	public java.lang.Object getRoot() {
		return _root;
	}

	public java.lang.Object getSelected() {
		return _selected;
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

	public java.lang.String getTitle() {
		return _title;
	}

	public java.lang.String getType() {
		return _type;
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

	public java.lang.Object getAfterActiveStateChange() {
		return _afterActiveStateChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterClassNamesChange() {
		return _afterClassNamesChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.Object getAfterDefaultStateChange() {
		return _afterDefaultStateChange;
	}

	public java.lang.Object getAfterDepthChange() {
		return _afterDepthChange;
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

	public java.lang.Object getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.Object getAfterHandlerChange() {
		return _afterHandlerChange;
	}

	public java.lang.Object getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.Object getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.Object getAfterHoverStateChange() {
		return _afterHoverStateChange;
	}

	public java.lang.Object getAfterIconChange() {
		return _afterIconChange;
	}

	public java.lang.Object getAfterIconNodeChange() {
		return _afterIconNodeChange;
	}

	public java.lang.Object getAfterIdChange() {
		return _afterIdChange;
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

	public java.lang.Object getAfterLabelChange() {
		return _afterLabelChange;
	}

	public java.lang.Object getAfterLabelNodeChange() {
		return _afterLabelNodeChange;
	}

	public java.lang.Object getAfterParentChange() {
		return _afterParentChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterRootChange() {
		return _afterRootChange;
	}

	public java.lang.Object getAfterSelectedChange() {
		return _afterSelectedChange;
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

	public java.lang.Object getAfterTypeChange() {
		return _afterTypeChange;
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

	public java.lang.Object getOnActiveStateChange() {
		return _onActiveStateChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnClassNamesChange() {
		return _onClassNamesChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.Object getOnDefaultStateChange() {
		return _onDefaultStateChange;
	}

	public java.lang.Object getOnDepthChange() {
		return _onDepthChange;
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

	public java.lang.Object getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.Object getOnHandlerChange() {
		return _onHandlerChange;
	}

	public java.lang.Object getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.Object getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.Object getOnHoverStateChange() {
		return _onHoverStateChange;
	}

	public java.lang.Object getOnIconChange() {
		return _onIconChange;
	}

	public java.lang.Object getOnIconNodeChange() {
		return _onIconNodeChange;
	}

	public java.lang.Object getOnIdChange() {
		return _onIdChange;
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

	public java.lang.Object getOnLabelChange() {
		return _onLabelChange;
	}

	public java.lang.Object getOnLabelNodeChange() {
		return _onLabelNodeChange;
	}

	public java.lang.Object getOnParentChange() {
		return _onParentChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnRootChange() {
		return _onRootChange;
	}

	public java.lang.Object getOnSelectedChange() {
		return _onSelectedChange;
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

	public java.lang.Object getOnTypeChange() {
		return _onTypeChange;
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

	public void setActiveState(boolean activeState) {
		_activeState = activeState;

		setScopedAttribute("activeState", activeState);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setClassNames(java.lang.Object classNames) {
		_classNames = classNames;

		setScopedAttribute("classNames", classNames);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setDefaultState(boolean defaultState) {
		_defaultState = defaultState;

		setScopedAttribute("defaultState", defaultState);
	}

	public void setDepth(java.lang.Object depth) {
		_depth = depth;

		setScopedAttribute("depth", depth);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFocused(boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setHandler(java.lang.Object handler) {
		_handler = handler;

		setScopedAttribute("handler", handler);
	}

	public void setHeight(java.lang.Object height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setHoverState(boolean hoverState) {
		_hoverState = hoverState;

		setScopedAttribute("hoverState", hoverState);
	}

	public void setIcon(java.lang.String icon) {
		_icon = icon;

		setScopedAttribute("icon", icon);
	}

	public void setIconNode(java.lang.String iconNode) {
		_iconNode = iconNode;

		setScopedAttribute("iconNode", iconNode);
	}

	public void setButtonitemId(java.lang.String buttonitemId) {
		_buttonitemId = buttonitemId;

		setScopedAttribute("buttonitemId", buttonitemId);
	}

	public void setIndex(java.lang.Object index) {
		_index = index;

		setScopedAttribute("index", index);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setLabel(java.lang.String label) {
		_label = label;

		setScopedAttribute("label", label);
	}

	public void setLabelNode(java.lang.String labelNode) {
		_labelNode = labelNode;

		setScopedAttribute("labelNode", labelNode);
	}

	public void setButtonitemParent(java.lang.Object buttonitemParent) {
		_buttonitemParent = buttonitemParent;

		setScopedAttribute("buttonitemParent", buttonitemParent);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setRoot(java.lang.Object root) {
		_root = root;

		setScopedAttribute("root", root);
	}

	public void setSelected(java.lang.Object selected) {
		_selected = selected;

		setScopedAttribute("selected", selected);
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

	public void setTitle(java.lang.String title) {
		_title = title;

		setScopedAttribute("title", title);
	}

	public void setType(java.lang.String type) {
		_type = type;

		setScopedAttribute("type", type);
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

	public void setAfterActiveStateChange(java.lang.Object afterActiveStateChange) {
		_afterActiveStateChange = afterActiveStateChange;

		setScopedAttribute("afterActiveStateChange", afterActiveStateChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterClassNamesChange(java.lang.Object afterClassNamesChange) {
		_afterClassNamesChange = afterClassNamesChange;

		setScopedAttribute("afterClassNamesChange", afterClassNamesChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.Object afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterDefaultStateChange(java.lang.Object afterDefaultStateChange) {
		_afterDefaultStateChange = afterDefaultStateChange;

		setScopedAttribute("afterDefaultStateChange", afterDefaultStateChange);
	}

	public void setAfterDepthChange(java.lang.Object afterDepthChange) {
		_afterDepthChange = afterDepthChange;

		setScopedAttribute("afterDepthChange", afterDepthChange);
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

	public void setAfterFocusedChange(java.lang.Object afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterHandlerChange(java.lang.Object afterHandlerChange) {
		_afterHandlerChange = afterHandlerChange;

		setScopedAttribute("afterHandlerChange", afterHandlerChange);
	}

	public void setAfterHeightChange(java.lang.Object afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.Object afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterHoverStateChange(java.lang.Object afterHoverStateChange) {
		_afterHoverStateChange = afterHoverStateChange;

		setScopedAttribute("afterHoverStateChange", afterHoverStateChange);
	}

	public void setAfterIconChange(java.lang.Object afterIconChange) {
		_afterIconChange = afterIconChange;

		setScopedAttribute("afterIconChange", afterIconChange);
	}

	public void setAfterIconNodeChange(java.lang.Object afterIconNodeChange) {
		_afterIconNodeChange = afterIconNodeChange;

		setScopedAttribute("afterIconNodeChange", afterIconNodeChange);
	}

	public void setAfterIdChange(java.lang.Object afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
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

	public void setAfterLabelChange(java.lang.Object afterLabelChange) {
		_afterLabelChange = afterLabelChange;

		setScopedAttribute("afterLabelChange", afterLabelChange);
	}

	public void setAfterLabelNodeChange(java.lang.Object afterLabelNodeChange) {
		_afterLabelNodeChange = afterLabelNodeChange;

		setScopedAttribute("afterLabelNodeChange", afterLabelNodeChange);
	}

	public void setAfterParentChange(java.lang.Object afterParentChange) {
		_afterParentChange = afterParentChange;

		setScopedAttribute("afterParentChange", afterParentChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterRootChange(java.lang.Object afterRootChange) {
		_afterRootChange = afterRootChange;

		setScopedAttribute("afterRootChange", afterRootChange);
	}

	public void setAfterSelectedChange(java.lang.Object afterSelectedChange) {
		_afterSelectedChange = afterSelectedChange;

		setScopedAttribute("afterSelectedChange", afterSelectedChange);
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

	public void setAfterTypeChange(java.lang.Object afterTypeChange) {
		_afterTypeChange = afterTypeChange;

		setScopedAttribute("afterTypeChange", afterTypeChange);
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

	public void setOnActiveStateChange(java.lang.Object onActiveStateChange) {
		_onActiveStateChange = onActiveStateChange;

		setScopedAttribute("onActiveStateChange", onActiveStateChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnClassNamesChange(java.lang.Object onClassNamesChange) {
		_onClassNamesChange = onClassNamesChange;

		setScopedAttribute("onClassNamesChange", onClassNamesChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.Object onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnDefaultStateChange(java.lang.Object onDefaultStateChange) {
		_onDefaultStateChange = onDefaultStateChange;

		setScopedAttribute("onDefaultStateChange", onDefaultStateChange);
	}

	public void setOnDepthChange(java.lang.Object onDepthChange) {
		_onDepthChange = onDepthChange;

		setScopedAttribute("onDepthChange", onDepthChange);
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

	public void setOnFocusedChange(java.lang.Object onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnHandlerChange(java.lang.Object onHandlerChange) {
		_onHandlerChange = onHandlerChange;

		setScopedAttribute("onHandlerChange", onHandlerChange);
	}

	public void setOnHeightChange(java.lang.Object onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.Object onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnHoverStateChange(java.lang.Object onHoverStateChange) {
		_onHoverStateChange = onHoverStateChange;

		setScopedAttribute("onHoverStateChange", onHoverStateChange);
	}

	public void setOnIconChange(java.lang.Object onIconChange) {
		_onIconChange = onIconChange;

		setScopedAttribute("onIconChange", onIconChange);
	}

	public void setOnIconNodeChange(java.lang.Object onIconNodeChange) {
		_onIconNodeChange = onIconNodeChange;

		setScopedAttribute("onIconNodeChange", onIconNodeChange);
	}

	public void setOnIdChange(java.lang.Object onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
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

	public void setOnLabelChange(java.lang.Object onLabelChange) {
		_onLabelChange = onLabelChange;

		setScopedAttribute("onLabelChange", onLabelChange);
	}

	public void setOnLabelNodeChange(java.lang.Object onLabelNodeChange) {
		_onLabelNodeChange = onLabelNodeChange;

		setScopedAttribute("onLabelNodeChange", onLabelNodeChange);
	}

	public void setOnParentChange(java.lang.Object onParentChange) {
		_onParentChange = onParentChange;

		setScopedAttribute("onParentChange", onParentChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnRootChange(java.lang.Object onRootChange) {
		_onRootChange = onRootChange;

		setScopedAttribute("onRootChange", onRootChange);
	}

	public void setOnSelectedChange(java.lang.Object onSelectedChange) {
		_onSelectedChange = onSelectedChange;

		setScopedAttribute("onSelectedChange", onSelectedChange);
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

	public void setOnTypeChange(java.lang.Object onTypeChange) {
		_onTypeChange = onTypeChange;

		setScopedAttribute("onTypeChange", onTypeChange);
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

		_activeState = false;
		_boundingBox = null;
		_classNames = null;
		_contentBox = null;
		_cssClass = null;
		_defaultState = true;
		_depth = -1;
		_destroyed = false;
		_disabled = false;
		_focused = false;
		_handler = null;
		_height = null;
		_hideClass = "aui-helper-hidden";
		_hoverState = true;
		_icon = null;
		_iconNode = null;
		_buttonitemId = null;
		_index = 0;
		_initialized = false;
		_label = null;
		_labelNode = null;
		_buttonitemParent = null;
		_render = null;
		_rendered = false;
		_root = null;
		_selected = 0;
		_srcNode = null;
		_strings = null;
		_tabIndex = 0;
		_title = null;
		_type = "button";
		_useARIA = true;
		_visible = true;
		_width = null;
		_afterActiveStateChange = null;
		_afterBoundingBoxChange = null;
		_afterClassNamesChange = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterDefaultStateChange = null;
		_afterDepthChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterFocusedChange = null;
		_afterHandlerChange = null;
		_afterHeightChange = null;
		_afterHideClassChange = null;
		_afterHoverStateChange = null;
		_afterIconChange = null;
		_afterIconNodeChange = null;
		_afterIdChange = null;
		_afterIndexChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterLabelChange = null;
		_afterLabelNodeChange = null;
		_afterParentChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterRootChange = null;
		_afterSelectedChange = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTitleChange = null;
		_afterTypeChange = null;
		_afterUseARIAChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_onActiveStateChange = null;
		_onBoundingBoxChange = null;
		_onClassNamesChange = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onDefaultStateChange = null;
		_onDepthChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onFocusedChange = null;
		_onHandlerChange = null;
		_onHeightChange = null;
		_onHideClassChange = null;
		_onHoverStateChange = null;
		_onIconChange = null;
		_onIconNodeChange = null;
		_onIdChange = null;
		_onIndexChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onLabelChange = null;
		_onLabelNodeChange = null;
		_onParentChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onRootChange = null;
		_onSelectedChange = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTitleChange = null;
		_onTypeChange = null;
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
		request.setAttribute("alloy:button-item:activeState", String.valueOf(_activeState));
		request.setAttribute("alloy:button-item:boundingBox", _boundingBox);
		request.setAttribute("alloy:button-item:classNames", _classNames);
		request.setAttribute("alloy:button-item:contentBox", _contentBox);
		request.setAttribute("alloy:button-item:cssClass", _cssClass);
		request.setAttribute("alloy:button-item:defaultState", String.valueOf(_defaultState));
		request.setAttribute("alloy:button-item:depth", _depth);
		request.setAttribute("alloy:button-item:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:button-item:disabled", String.valueOf(_disabled));
		request.setAttribute("alloy:button-item:focused", String.valueOf(_focused));
		request.setAttribute("alloy:button-item:handler", _handler);
		request.setAttribute("alloy:button-item:height", _height);
		request.setAttribute("alloy:button-item:hideClass", _hideClass);
		request.setAttribute("alloy:button-item:hoverState", String.valueOf(_hoverState));
		request.setAttribute("alloy:button-item:icon", _icon);
		request.setAttribute("alloy:button-item:iconNode", _iconNode);
		request.setAttribute("alloy:button-item:id", _buttonitemId);
		request.setAttribute("alloy:button-item:index", _index);
		request.setAttribute("alloy:button-item:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:button-item:label", _label);
		request.setAttribute("alloy:button-item:labelNode", _labelNode);
		request.setAttribute("alloy:button-item:parent", _buttonitemParent);
		request.setAttribute("alloy:button-item:render", _render);
		request.setAttribute("alloy:button-item:rendered", String.valueOf(_rendered));
		request.setAttribute("alloy:button-item:root", _root);
		request.setAttribute("alloy:button-item:selected", _selected);
		request.setAttribute("alloy:button-item:srcNode", _srcNode);
		request.setAttribute("alloy:button-item:strings", _strings);
		request.setAttribute("alloy:button-item:tabIndex", _tabIndex);
		request.setAttribute("alloy:button-item:title", _title);
		request.setAttribute("alloy:button-item:type", _type);
		request.setAttribute("alloy:button-item:useARIA", String.valueOf(_useARIA));
		request.setAttribute("alloy:button-item:visible", String.valueOf(_visible));
		request.setAttribute("alloy:button-item:width", _width);
		request.setAttribute("alloy:button-item:afterActiveStateChange", _afterActiveStateChange);
		request.setAttribute("alloy:button-item:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("alloy:button-item:afterClassNamesChange", _afterClassNamesChange);
		request.setAttribute("alloy:button-item:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("alloy:button-item:afterCssClassChange", _afterCssClassChange);
		request.setAttribute("alloy:button-item:afterDefaultStateChange", _afterDefaultStateChange);
		request.setAttribute("alloy:button-item:afterDepthChange", _afterDepthChange);
		request.setAttribute("alloy:button-item:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:button-item:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:button-item:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("alloy:button-item:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("alloy:button-item:afterHandlerChange", _afterHandlerChange);
		request.setAttribute("alloy:button-item:afterHeightChange", _afterHeightChange);
		request.setAttribute("alloy:button-item:afterHideClassChange", _afterHideClassChange);
		request.setAttribute("alloy:button-item:afterHoverStateChange", _afterHoverStateChange);
		request.setAttribute("alloy:button-item:afterIconChange", _afterIconChange);
		request.setAttribute("alloy:button-item:afterIconNodeChange", _afterIconNodeChange);
		request.setAttribute("alloy:button-item:afterIdChange", _afterIdChange);
		request.setAttribute("alloy:button-item:afterIndexChange", _afterIndexChange);
		request.setAttribute("alloy:button-item:afterInit", _afterInit);
		request.setAttribute("alloy:button-item:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:button-item:afterLabelChange", _afterLabelChange);
		request.setAttribute("alloy:button-item:afterLabelNodeChange", _afterLabelNodeChange);
		request.setAttribute("alloy:button-item:afterParentChange", _afterParentChange);
		request.setAttribute("alloy:button-item:afterRenderChange", _afterRenderChange);
		request.setAttribute("alloy:button-item:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("alloy:button-item:afterRootChange", _afterRootChange);
		request.setAttribute("alloy:button-item:afterSelectedChange", _afterSelectedChange);
		request.setAttribute("alloy:button-item:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("alloy:button-item:afterStringsChange", _afterStringsChange);
		request.setAttribute("alloy:button-item:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("alloy:button-item:afterTitleChange", _afterTitleChange);
		request.setAttribute("alloy:button-item:afterTypeChange", _afterTypeChange);
		request.setAttribute("alloy:button-item:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("alloy:button-item:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("alloy:button-item:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("alloy:button-item:afterRender", _afterRender);
		request.setAttribute("alloy:button-item:afterWidthChange", _afterWidthChange);
		request.setAttribute("alloy:button-item:onActiveStateChange", _onActiveStateChange);
		request.setAttribute("alloy:button-item:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("alloy:button-item:onClassNamesChange", _onClassNamesChange);
		request.setAttribute("alloy:button-item:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("alloy:button-item:onCssClassChange", _onCssClassChange);
		request.setAttribute("alloy:button-item:onDefaultStateChange", _onDefaultStateChange);
		request.setAttribute("alloy:button-item:onDepthChange", _onDepthChange);
		request.setAttribute("alloy:button-item:onDestroy", _onDestroy);
		request.setAttribute("alloy:button-item:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:button-item:onDisabledChange", _onDisabledChange);
		request.setAttribute("alloy:button-item:onFocusedChange", _onFocusedChange);
		request.setAttribute("alloy:button-item:onHandlerChange", _onHandlerChange);
		request.setAttribute("alloy:button-item:onHeightChange", _onHeightChange);
		request.setAttribute("alloy:button-item:onHideClassChange", _onHideClassChange);
		request.setAttribute("alloy:button-item:onHoverStateChange", _onHoverStateChange);
		request.setAttribute("alloy:button-item:onIconChange", _onIconChange);
		request.setAttribute("alloy:button-item:onIconNodeChange", _onIconNodeChange);
		request.setAttribute("alloy:button-item:onIdChange", _onIdChange);
		request.setAttribute("alloy:button-item:onIndexChange", _onIndexChange);
		request.setAttribute("alloy:button-item:onInit", _onInit);
		request.setAttribute("alloy:button-item:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:button-item:onLabelChange", _onLabelChange);
		request.setAttribute("alloy:button-item:onLabelNodeChange", _onLabelNodeChange);
		request.setAttribute("alloy:button-item:onParentChange", _onParentChange);
		request.setAttribute("alloy:button-item:onRenderChange", _onRenderChange);
		request.setAttribute("alloy:button-item:onRenderedChange", _onRenderedChange);
		request.setAttribute("alloy:button-item:onRootChange", _onRootChange);
		request.setAttribute("alloy:button-item:onSelectedChange", _onSelectedChange);
		request.setAttribute("alloy:button-item:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("alloy:button-item:onStringsChange", _onStringsChange);
		request.setAttribute("alloy:button-item:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("alloy:button-item:onTitleChange", _onTitleChange);
		request.setAttribute("alloy:button-item:onTypeChange", _onTypeChange);
		request.setAttribute("alloy:button-item:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("alloy:button-item:onVisibleChange", _onVisibleChange);
		request.setAttribute("alloy:button-item:onContentUpdate", _onContentUpdate);
		request.setAttribute("alloy:button-item:onRender", _onRender);
		request.setAttribute("alloy:button-item:onWidthChange", _onWidthChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:button-item:";

	private static final String _PAGE =
		"/html/taglib/alloy/button_item/page.jsp";

	private boolean _activeState = false;
	private java.lang.String _boundingBox = null;
	private java.lang.Object _classNames = null;
	private java.lang.String _contentBox = null;
	private java.lang.String _cssClass = null;
	private boolean _defaultState = true;
	private java.lang.Object _depth = -1;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private boolean _focused = false;
	private java.lang.Object _handler = null;
	private java.lang.Object _height = null;
	private java.lang.String _hideClass = "aui-helper-hidden";
	private boolean _hoverState = true;
	private java.lang.String _icon = null;
	private java.lang.String _iconNode = null;
	private java.lang.String _buttonitemId = null;
	private java.lang.Object _index = 0;
	private boolean _initialized = false;
	private java.lang.String _label = null;
	private java.lang.String _labelNode = null;
	private java.lang.Object _buttonitemParent = null;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private java.lang.Object _root = null;
	private java.lang.Object _selected = 0;
	private java.lang.String _srcNode = null;
	private java.lang.Object _strings = null;
	private java.lang.Object _tabIndex = 0;
	private java.lang.String _title = null;
	private java.lang.String _type = "button";
	private boolean _useARIA = true;
	private boolean _visible = true;
	private java.lang.Object _width = null;
	private java.lang.Object _afterActiveStateChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterClassNamesChange = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterCssClassChange = null;
	private java.lang.Object _afterDefaultStateChange = null;
	private java.lang.Object _afterDepthChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterDisabledChange = null;
	private java.lang.Object _afterFocusedChange = null;
	private java.lang.Object _afterHandlerChange = null;
	private java.lang.Object _afterHeightChange = null;
	private java.lang.Object _afterHideClassChange = null;
	private java.lang.Object _afterHoverStateChange = null;
	private java.lang.Object _afterIconChange = null;
	private java.lang.Object _afterIconNodeChange = null;
	private java.lang.Object _afterIdChange = null;
	private java.lang.Object _afterIndexChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterLabelChange = null;
	private java.lang.Object _afterLabelNodeChange = null;
	private java.lang.Object _afterParentChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterRootChange = null;
	private java.lang.Object _afterSelectedChange = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterTitleChange = null;
	private java.lang.Object _afterTypeChange = null;
	private java.lang.Object _afterUseARIAChange = null;
	private java.lang.Object _afterVisibleChange = null;
	private java.lang.Object _afterContentUpdate = null;
	private java.lang.Object _afterRender = null;
	private java.lang.Object _afterWidthChange = null;
	private java.lang.Object _onActiveStateChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onClassNamesChange = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onCssClassChange = null;
	private java.lang.Object _onDefaultStateChange = null;
	private java.lang.Object _onDepthChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onDisabledChange = null;
	private java.lang.Object _onFocusedChange = null;
	private java.lang.Object _onHandlerChange = null;
	private java.lang.Object _onHeightChange = null;
	private java.lang.Object _onHideClassChange = null;
	private java.lang.Object _onHoverStateChange = null;
	private java.lang.Object _onIconChange = null;
	private java.lang.Object _onIconNodeChange = null;
	private java.lang.Object _onIdChange = null;
	private java.lang.Object _onIndexChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onLabelChange = null;
	private java.lang.Object _onLabelNodeChange = null;
	private java.lang.Object _onParentChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onRootChange = null;
	private java.lang.Object _onSelectedChange = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onTitleChange = null;
	private java.lang.Object _onTypeChange = null;
	private java.lang.Object _onUseARIAChange = null;
	private java.lang.Object _onVisibleChange = null;
	private java.lang.Object _onContentUpdate = null;
	private java.lang.Object _onRender = null;
	private java.lang.Object _onWidthChange = null;

}