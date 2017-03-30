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
public abstract class BaseOverlayMaskTag extends com.liferay.taglib.util.IncludeTag {

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

	public java.lang.Object getAlignPoints() {
		return _alignPoints;
	}

	public java.lang.String getBackground() {
		return _background;
	}

	public java.lang.Object getOverlaymaskBodyContent() {
		return _overlaymaskBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.Object getCentered() {
		return _centered;
	}

	public java.lang.Object getConstrain() {
		return _constrain;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
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

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.String getOverlaymaskId() {
		return _overlaymaskId;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Object getOpacity() {
		return _opacity;
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

	public boolean getShim() {
		return _shim;
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

	public java.lang.String getTarget() {
		return _target;
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

	public java.lang.Object getAfterAlignPointsChange() {
		return _afterAlignPointsChange;
	}

	public java.lang.Object getAfterBackgroundChange() {
		return _afterBackgroundChange;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.Object getAfterConstrainChange() {
		return _afterConstrainChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterCssClassChange() {
		return _afterCssClassChange;
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

	public java.lang.Object getAfterHideClassChange() {
		return _afterHideClassChange;
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

	public java.lang.Object getAfterOpacityChange() {
		return _afterOpacityChange;
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

	public java.lang.Object getAfterShimChange() {
		return _afterShimChange;
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

	public java.lang.Object getAfterTargetChange() {
		return _afterTargetChange;
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

	public java.lang.Object getOnAlignPointsChange() {
		return _onAlignPointsChange;
	}

	public java.lang.Object getOnBackgroundChange() {
		return _onBackgroundChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.Object getOnConstrainChange() {
		return _onConstrainChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnCssClassChange() {
		return _onCssClassChange;
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

	public java.lang.Object getOnHideClassChange() {
		return _onHideClassChange;
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

	public java.lang.Object getOnOpacityChange() {
		return _onOpacityChange;
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

	public java.lang.Object getOnShimChange() {
		return _onShimChange;
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

	public java.lang.Object getOnTargetChange() {
		return _onTargetChange;
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

	public void setAlignPoints(java.lang.Object alignPoints) {
		_alignPoints = alignPoints;

		setScopedAttribute("alignPoints", alignPoints);
	}

	public void setBackground(java.lang.String background) {
		_background = background;

		setScopedAttribute("background", background);
	}

	public void setOverlaymaskBodyContent(java.lang.Object overlaymaskBodyContent) {
		_overlaymaskBodyContent = overlaymaskBodyContent;

		setScopedAttribute("overlaymaskBodyContent", overlaymaskBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCentered(java.lang.Object centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setConstrain(java.lang.Object constrain) {
		_constrain = constrain;

		setScopedAttribute("constrain", constrain);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
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

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setOverlaymaskId(java.lang.String overlaymaskId) {
		_overlaymaskId = overlaymaskId;

		setScopedAttribute("overlaymaskId", overlaymaskId);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setOpacity(java.lang.Object opacity) {
		_opacity = opacity;

		setScopedAttribute("opacity", opacity);
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

	public void setShim(boolean shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
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

	public void setTarget(java.lang.String target) {
		_target = target;

		setScopedAttribute("target", target);
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

	public void setAfterAlignPointsChange(java.lang.Object afterAlignPointsChange) {
		_afterAlignPointsChange = afterAlignPointsChange;

		setScopedAttribute("afterAlignPointsChange", afterAlignPointsChange);
	}

	public void setAfterBackgroundChange(java.lang.Object afterBackgroundChange) {
		_afterBackgroundChange = afterBackgroundChange;

		setScopedAttribute("afterBackgroundChange", afterBackgroundChange);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCenteredChange(java.lang.Object afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterConstrainChange(java.lang.Object afterConstrainChange) {
		_afterConstrainChange = afterConstrainChange;

		setScopedAttribute("afterConstrainChange", afterConstrainChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.Object afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
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

	public void setAfterHideClassChange(java.lang.Object afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
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

	public void setAfterOpacityChange(java.lang.Object afterOpacityChange) {
		_afterOpacityChange = afterOpacityChange;

		setScopedAttribute("afterOpacityChange", afterOpacityChange);
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

	public void setAfterShimChange(java.lang.Object afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
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

	public void setAfterTargetChange(java.lang.Object afterTargetChange) {
		_afterTargetChange = afterTargetChange;

		setScopedAttribute("afterTargetChange", afterTargetChange);
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

	public void setOnAlignPointsChange(java.lang.Object onAlignPointsChange) {
		_onAlignPointsChange = onAlignPointsChange;

		setScopedAttribute("onAlignPointsChange", onAlignPointsChange);
	}

	public void setOnBackgroundChange(java.lang.Object onBackgroundChange) {
		_onBackgroundChange = onBackgroundChange;

		setScopedAttribute("onBackgroundChange", onBackgroundChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCenteredChange(java.lang.Object onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnConstrainChange(java.lang.Object onConstrainChange) {
		_onConstrainChange = onConstrainChange;

		setScopedAttribute("onConstrainChange", onConstrainChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.Object onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
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

	public void setOnHideClassChange(java.lang.Object onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
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

	public void setOnOpacityChange(java.lang.Object onOpacityChange) {
		_onOpacityChange = onOpacityChange;

		setScopedAttribute("onOpacityChange", onOpacityChange);
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

	public void setOnShimChange(java.lang.Object onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
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

	public void setOnTargetChange(java.lang.Object onTargetChange) {
		_onTargetChange = onTargetChange;

		setScopedAttribute("onTargetChange", onTargetChange);
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
		_alignPoints = null;
		_background = null;
		_overlaymaskBodyContent = null;
		_boundingBox = null;
		_centered = null;
		_constrain = null;
		_contentBox = null;
		_cssClass = null;
		_destroyed = false;
		_disabled = false;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_hideClass = "aui-helper-hidden";
		_overlaymaskId = null;
		_initialized = false;
		_opacity = 0.5;
		_preventOverlap = false;
		_render = null;
		_rendered = false;
		_shim = false;
		_srcNode = null;
		_strings = null;
		_tabIndex = 0;
		_target = "document";
		_useARIA = true;
		_visible = false;
		_width = null;
		_x = 0;
		_xy = null;
		_y = 0;
		_zIndex = 1000;
		_afterAlignChange = null;
		_afterAlignOnChange = null;
		_afterAlignPointsChange = null;
		_afterBackgroundChange = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterCenteredChange = null;
		_afterConstrainChange = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterFillHeightChange = null;
		_afterFocusedChange = null;
		_afterFooterContentChange = null;
		_afterHeaderContentChange = null;
		_afterHeightChange = null;
		_afterHideClassChange = null;
		_afterIdChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterOpacityChange = null;
		_afterPreventOverlapChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterShimChange = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTargetChange = null;
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
		_onAlignPointsChange = null;
		_onBackgroundChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onCenteredChange = null;
		_onConstrainChange = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onFillHeightChange = null;
		_onFocusedChange = null;
		_onFooterContentChange = null;
		_onHeaderContentChange = null;
		_onHeightChange = null;
		_onHideClassChange = null;
		_onIdChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onOpacityChange = null;
		_onPreventOverlapChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onShimChange = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTargetChange = null;
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
		request.setAttribute("alloy:overlay-mask:align", _align);
		request.setAttribute("alloy:overlay-mask:alignOn", _alignOn);
		request.setAttribute("alloy:overlay-mask:alignPoints", _alignPoints);
		request.setAttribute("alloy:overlay-mask:background", _background);
		request.setAttribute("alloy:overlay-mask:bodyContent", _overlaymaskBodyContent);
		request.setAttribute("alloy:overlay-mask:boundingBox", _boundingBox);
		request.setAttribute("alloy:overlay-mask:centered", _centered);
		request.setAttribute("alloy:overlay-mask:constrain", _constrain);
		request.setAttribute("alloy:overlay-mask:contentBox", _contentBox);
		request.setAttribute("alloy:overlay-mask:cssClass", _cssClass);
		request.setAttribute("alloy:overlay-mask:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:overlay-mask:disabled", String.valueOf(_disabled));
		request.setAttribute("alloy:overlay-mask:fillHeight", _fillHeight);
		request.setAttribute("alloy:overlay-mask:focused", String.valueOf(_focused));
		request.setAttribute("alloy:overlay-mask:footerContent", _footerContent);
		request.setAttribute("alloy:overlay-mask:headerContent", _headerContent);
		request.setAttribute("alloy:overlay-mask:height", _height);
		request.setAttribute("alloy:overlay-mask:hideClass", _hideClass);
		request.setAttribute("alloy:overlay-mask:id", _overlaymaskId);
		request.setAttribute("alloy:overlay-mask:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:overlay-mask:opacity", _opacity);
		request.setAttribute("alloy:overlay-mask:preventOverlap", String.valueOf(_preventOverlap));
		request.setAttribute("alloy:overlay-mask:render", _render);
		request.setAttribute("alloy:overlay-mask:rendered", String.valueOf(_rendered));
		request.setAttribute("alloy:overlay-mask:shim", String.valueOf(_shim));
		request.setAttribute("alloy:overlay-mask:srcNode", _srcNode);
		request.setAttribute("alloy:overlay-mask:strings", _strings);
		request.setAttribute("alloy:overlay-mask:tabIndex", _tabIndex);
		request.setAttribute("alloy:overlay-mask:target", _target);
		request.setAttribute("alloy:overlay-mask:useARIA", String.valueOf(_useARIA));
		request.setAttribute("alloy:overlay-mask:visible", String.valueOf(_visible));
		request.setAttribute("alloy:overlay-mask:width", _width);
		request.setAttribute("alloy:overlay-mask:x", _x);
		request.setAttribute("alloy:overlay-mask:xy", _xy);
		request.setAttribute("alloy:overlay-mask:y", _y);
		request.setAttribute("alloy:overlay-mask:zIndex", _zIndex);
		request.setAttribute("alloy:overlay-mask:afterAlignChange", _afterAlignChange);
		request.setAttribute("alloy:overlay-mask:afterAlignOnChange", _afterAlignOnChange);
		request.setAttribute("alloy:overlay-mask:afterAlignPointsChange", _afterAlignPointsChange);
		request.setAttribute("alloy:overlay-mask:afterBackgroundChange", _afterBackgroundChange);
		request.setAttribute("alloy:overlay-mask:afterBodyContentChange", _afterBodyContentChange);
		request.setAttribute("alloy:overlay-mask:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("alloy:overlay-mask:afterCenteredChange", _afterCenteredChange);
		request.setAttribute("alloy:overlay-mask:afterConstrainChange", _afterConstrainChange);
		request.setAttribute("alloy:overlay-mask:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("alloy:overlay-mask:afterCssClassChange", _afterCssClassChange);
		request.setAttribute("alloy:overlay-mask:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:overlay-mask:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:overlay-mask:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("alloy:overlay-mask:afterFillHeightChange", _afterFillHeightChange);
		request.setAttribute("alloy:overlay-mask:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("alloy:overlay-mask:afterFooterContentChange", _afterFooterContentChange);
		request.setAttribute("alloy:overlay-mask:afterHeaderContentChange", _afterHeaderContentChange);
		request.setAttribute("alloy:overlay-mask:afterHeightChange", _afterHeightChange);
		request.setAttribute("alloy:overlay-mask:afterHideClassChange", _afterHideClassChange);
		request.setAttribute("alloy:overlay-mask:afterIdChange", _afterIdChange);
		request.setAttribute("alloy:overlay-mask:afterInit", _afterInit);
		request.setAttribute("alloy:overlay-mask:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:overlay-mask:afterOpacityChange", _afterOpacityChange);
		request.setAttribute("alloy:overlay-mask:afterPreventOverlapChange", _afterPreventOverlapChange);
		request.setAttribute("alloy:overlay-mask:afterRenderChange", _afterRenderChange);
		request.setAttribute("alloy:overlay-mask:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("alloy:overlay-mask:afterShimChange", _afterShimChange);
		request.setAttribute("alloy:overlay-mask:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("alloy:overlay-mask:afterStringsChange", _afterStringsChange);
		request.setAttribute("alloy:overlay-mask:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("alloy:overlay-mask:afterTargetChange", _afterTargetChange);
		request.setAttribute("alloy:overlay-mask:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("alloy:overlay-mask:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("alloy:overlay-mask:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("alloy:overlay-mask:afterRender", _afterRender);
		request.setAttribute("alloy:overlay-mask:afterWidthChange", _afterWidthChange);
		request.setAttribute("alloy:overlay-mask:afterXChange", _afterXChange);
		request.setAttribute("alloy:overlay-mask:afterXyChange", _afterXyChange);
		request.setAttribute("alloy:overlay-mask:afterYChange", _afterYChange);
		request.setAttribute("alloy:overlay-mask:afterZIndexChange", _afterZIndexChange);
		request.setAttribute("alloy:overlay-mask:onAlignChange", _onAlignChange);
		request.setAttribute("alloy:overlay-mask:onAlignOnChange", _onAlignOnChange);
		request.setAttribute("alloy:overlay-mask:onAlignPointsChange", _onAlignPointsChange);
		request.setAttribute("alloy:overlay-mask:onBackgroundChange", _onBackgroundChange);
		request.setAttribute("alloy:overlay-mask:onBodyContentChange", _onBodyContentChange);
		request.setAttribute("alloy:overlay-mask:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("alloy:overlay-mask:onCenteredChange", _onCenteredChange);
		request.setAttribute("alloy:overlay-mask:onConstrainChange", _onConstrainChange);
		request.setAttribute("alloy:overlay-mask:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("alloy:overlay-mask:onCssClassChange", _onCssClassChange);
		request.setAttribute("alloy:overlay-mask:onDestroy", _onDestroy);
		request.setAttribute("alloy:overlay-mask:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:overlay-mask:onDisabledChange", _onDisabledChange);
		request.setAttribute("alloy:overlay-mask:onFillHeightChange", _onFillHeightChange);
		request.setAttribute("alloy:overlay-mask:onFocusedChange", _onFocusedChange);
		request.setAttribute("alloy:overlay-mask:onFooterContentChange", _onFooterContentChange);
		request.setAttribute("alloy:overlay-mask:onHeaderContentChange", _onHeaderContentChange);
		request.setAttribute("alloy:overlay-mask:onHeightChange", _onHeightChange);
		request.setAttribute("alloy:overlay-mask:onHideClassChange", _onHideClassChange);
		request.setAttribute("alloy:overlay-mask:onIdChange", _onIdChange);
		request.setAttribute("alloy:overlay-mask:onInit", _onInit);
		request.setAttribute("alloy:overlay-mask:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:overlay-mask:onOpacityChange", _onOpacityChange);
		request.setAttribute("alloy:overlay-mask:onPreventOverlapChange", _onPreventOverlapChange);
		request.setAttribute("alloy:overlay-mask:onRenderChange", _onRenderChange);
		request.setAttribute("alloy:overlay-mask:onRenderedChange", _onRenderedChange);
		request.setAttribute("alloy:overlay-mask:onShimChange", _onShimChange);
		request.setAttribute("alloy:overlay-mask:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("alloy:overlay-mask:onStringsChange", _onStringsChange);
		request.setAttribute("alloy:overlay-mask:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("alloy:overlay-mask:onTargetChange", _onTargetChange);
		request.setAttribute("alloy:overlay-mask:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("alloy:overlay-mask:onVisibleChange", _onVisibleChange);
		request.setAttribute("alloy:overlay-mask:onContentUpdate", _onContentUpdate);
		request.setAttribute("alloy:overlay-mask:onRender", _onRender);
		request.setAttribute("alloy:overlay-mask:onWidthChange", _onWidthChange);
		request.setAttribute("alloy:overlay-mask:onXChange", _onXChange);
		request.setAttribute("alloy:overlay-mask:onXyChange", _onXyChange);
		request.setAttribute("alloy:overlay-mask:onYChange", _onYChange);
		request.setAttribute("alloy:overlay-mask:onZIndexChange", _onZIndexChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:overlay-mask:";

	private static final String _PAGE =
		"/html/taglib/alloy/overlay_mask/page.jsp";

	private java.lang.Object _align = null;
	private java.lang.Object _alignOn = null;
	private java.lang.Object _alignPoints = null;
	private java.lang.String _background = null;
	private java.lang.Object _overlaymaskBodyContent = null;
	private java.lang.String _boundingBox = null;
	private java.lang.Object _centered = null;
	private java.lang.Object _constrain = null;
	private java.lang.String _contentBox = null;
	private java.lang.String _cssClass = null;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private java.lang.Object _fillHeight = null;
	private boolean _focused = false;
	private java.lang.Object _footerContent = null;
	private java.lang.Object _headerContent = null;
	private java.lang.Object _height = null;
	private java.lang.String _hideClass = "aui-helper-hidden";
	private java.lang.String _overlaymaskId = null;
	private boolean _initialized = false;
	private java.lang.Object _opacity = 0.5;
	private boolean _preventOverlap = false;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private boolean _shim = false;
	private java.lang.String _srcNode = null;
	private java.lang.Object _strings = null;
	private java.lang.Object _tabIndex = 0;
	private java.lang.String _target = "document";
	private boolean _useARIA = true;
	private boolean _visible = false;
	private java.lang.Object _width = null;
	private java.lang.Object _x = 0;
	private java.lang.Object _xy = null;
	private java.lang.Object _y = 0;
	private java.lang.Object _zIndex = 1000;
	private java.lang.Object _afterAlignChange = null;
	private java.lang.Object _afterAlignOnChange = null;
	private java.lang.Object _afterAlignPointsChange = null;
	private java.lang.Object _afterBackgroundChange = null;
	private java.lang.Object _afterBodyContentChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterCenteredChange = null;
	private java.lang.Object _afterConstrainChange = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterCssClassChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterDisabledChange = null;
	private java.lang.Object _afterFillHeightChange = null;
	private java.lang.Object _afterFocusedChange = null;
	private java.lang.Object _afterFooterContentChange = null;
	private java.lang.Object _afterHeaderContentChange = null;
	private java.lang.Object _afterHeightChange = null;
	private java.lang.Object _afterHideClassChange = null;
	private java.lang.Object _afterIdChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterOpacityChange = null;
	private java.lang.Object _afterPreventOverlapChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterShimChange = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterTargetChange = null;
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
	private java.lang.Object _onAlignPointsChange = null;
	private java.lang.Object _onBackgroundChange = null;
	private java.lang.Object _onBodyContentChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onCenteredChange = null;
	private java.lang.Object _onConstrainChange = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onCssClassChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onDisabledChange = null;
	private java.lang.Object _onFillHeightChange = null;
	private java.lang.Object _onFocusedChange = null;
	private java.lang.Object _onFooterContentChange = null;
	private java.lang.Object _onHeaderContentChange = null;
	private java.lang.Object _onHeightChange = null;
	private java.lang.Object _onHideClassChange = null;
	private java.lang.Object _onIdChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onOpacityChange = null;
	private java.lang.Object _onPreventOverlapChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onShimChange = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onTargetChange = null;
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