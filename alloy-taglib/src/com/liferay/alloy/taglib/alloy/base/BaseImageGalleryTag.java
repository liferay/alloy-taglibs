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
public abstract class BaseImageGalleryTag extends com.liferay.taglib.util.IncludeTag {

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

	public boolean getAnim() {
		return _anim;
	}

	public java.lang.Object getArrowLeftEl() {
		return _arrowLeftEl;
	}

	public java.lang.Object getArrowRightEl() {
		return _arrowRightEl;
	}

	public boolean getAutoPlay() {
		return _autoPlay;
	}

	public java.lang.Object getImagegalleryBodyContent() {
		return _imagegalleryBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.String getCaption() {
		return _caption;
	}

	public java.lang.Object getCaptionEl() {
		return _captionEl;
	}

	public boolean getCaptionFromTitle() {
		return _captionFromTitle;
	}

	public boolean getCentered() {
		return _centered;
	}

	public java.lang.Object getCloseEl() {
		return _closeEl;
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

	public java.lang.Object getCurrentIndex() {
		return _currentIndex;
	}

	public java.lang.Object getDelay() {
		return _delay;
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

	public java.lang.String getImagegalleryId() {
		return _imagegalleryId;
	}

	public java.lang.Object getImage() {
		return _image;
	}

	public java.lang.Object getImageAnim() {
		return _imageAnim;
	}

	public java.lang.Object getInfoEl() {
		return _infoEl;
	}

	public java.lang.String getInfoTemplate() {
		return _infoTemplate;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Object getLinks() {
		return _links;
	}

	public java.lang.Object getLoader() {
		return _loader;
	}

	public boolean getLoading() {
		return _loading;
	}

	public java.lang.Object getLoadingEl() {
		return _loadingEl;
	}

	public java.lang.Object getMaxHeight() {
		return _maxHeight;
	}

	public java.lang.Object getMaxWidth() {
		return _maxWidth;
	}

	public java.lang.Object getModal() {
		return _modal;
	}

	public java.lang.Object getPaginator() {
		return _paginator;
	}

	public java.lang.Object getPaginatorEl() {
		return _paginatorEl;
	}

	public java.lang.Object getPaginatorInstance() {
		return _paginatorInstance;
	}

	public boolean getPaused() {
		return _paused;
	}

	public java.lang.String getPausedLabel() {
		return _pausedLabel;
	}

	public boolean getPlaying() {
		return _playing;
	}

	public java.lang.String getPlayingLabel() {
		return _playingLabel;
	}

	public boolean getPreloadAllImages() {
		return _preloadAllImages;
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

	public boolean getRepeat() {
		return _repeat;
	}

	public boolean getShim() {
		return _shim;
	}

	public boolean getShowArrows() {
		return _showArrows;
	}

	public boolean getShowClose() {
		return _showClose;
	}

	public boolean getShowPlayer() {
		return _showPlayer;
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

	public java.lang.Object getToolbar() {
		return _toolbar;
	}

	public boolean getTotalLinks() {
		return _totalLinks;
	}

	public boolean getUseARIA() {
		return _useARIA;
	}

	public boolean getUseOriginalImage() {
		return _useOriginalImage;
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

	public java.lang.Object getAfterAnim() {
		return _afterAnim;
	}

	public java.lang.Object getAfterAnimChange() {
		return _afterAnimChange;
	}

	public java.lang.Object getAfterArrowLeftElChange() {
		return _afterArrowLeftElChange;
	}

	public java.lang.Object getAfterArrowRightElChange() {
		return _afterArrowRightElChange;
	}

	public java.lang.Object getAfterAutoPlayChange() {
		return _afterAutoPlayChange;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterCaptionChange() {
		return _afterCaptionChange;
	}

	public java.lang.Object getAfterCaptionElChange() {
		return _afterCaptionElChange;
	}

	public java.lang.Object getAfterCaptionFromTitleChange() {
		return _afterCaptionFromTitleChange;
	}

	public java.lang.Object getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.Object getAfterCloseElChange() {
		return _afterCloseElChange;
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

	public java.lang.Object getAfterCurrentIndexChange() {
		return _afterCurrentIndexChange;
	}

	public java.lang.Object getAfterDelayChange() {
		return _afterDelayChange;
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

	public java.lang.Object getAfterImageAnimChange() {
		return _afterImageAnimChange;
	}

	public java.lang.Object getAfterImageChange() {
		return _afterImageChange;
	}

	public java.lang.Object getAfterInfoElChange() {
		return _afterInfoElChange;
	}

	public java.lang.Object getAfterInfoTemplateChange() {
		return _afterInfoTemplateChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterLinksChange() {
		return _afterLinksChange;
	}

	public java.lang.Object getAfterLoad() {
		return _afterLoad;
	}

	public java.lang.Object getAfterLoaderChange() {
		return _afterLoaderChange;
	}

	public java.lang.Object getAfterLoadingChange() {
		return _afterLoadingChange;
	}

	public java.lang.Object getAfterLoadingElChange() {
		return _afterLoadingElChange;
	}

	public java.lang.Object getAfterMaxHeightChange() {
		return _afterMaxHeightChange;
	}

	public java.lang.Object getAfterMaxWidthChange() {
		return _afterMaxWidthChange;
	}

	public java.lang.Object getAfterModalChange() {
		return _afterModalChange;
	}

	public java.lang.Object getAfterPaginatorChange() {
		return _afterPaginatorChange;
	}

	public java.lang.Object getAfterPaginatorElChange() {
		return _afterPaginatorElChange;
	}

	public java.lang.Object getAfterPaginatorInstanceChange() {
		return _afterPaginatorInstanceChange;
	}

	public java.lang.Object getAfterPausedChange() {
		return _afterPausedChange;
	}

	public java.lang.Object getAfterPausedLabelChange() {
		return _afterPausedLabelChange;
	}

	public java.lang.Object getAfterPlayingChange() {
		return _afterPlayingChange;
	}

	public java.lang.Object getAfterPlayingLabelChange() {
		return _afterPlayingLabelChange;
	}

	public java.lang.Object getAfterPreloadAllImagesChange() {
		return _afterPreloadAllImagesChange;
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

	public java.lang.Object getAfterRepeatChange() {
		return _afterRepeatChange;
	}

	public java.lang.Object getAfterRequest() {
		return _afterRequest;
	}

	public java.lang.Object getAfterShimChange() {
		return _afterShimChange;
	}

	public java.lang.Object getAfterShowArrowsChange() {
		return _afterShowArrowsChange;
	}

	public java.lang.Object getAfterShowCloseChange() {
		return _afterShowCloseChange;
	}

	public java.lang.Object getAfterShowPlayerChange() {
		return _afterShowPlayerChange;
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

	public java.lang.Object getAfterToolbarChange() {
		return _afterToolbarChange;
	}

	public java.lang.Object getAfterTotalLinksChange() {
		return _afterTotalLinksChange;
	}

	public java.lang.Object getAfterUseARIAChange() {
		return _afterUseARIAChange;
	}

	public java.lang.Object getAfterUseOriginalImageChange() {
		return _afterUseOriginalImageChange;
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

	public java.lang.Object getOnAnim() {
		return _onAnim;
	}

	public java.lang.Object getOnAnimChange() {
		return _onAnimChange;
	}

	public java.lang.Object getOnArrowLeftElChange() {
		return _onArrowLeftElChange;
	}

	public java.lang.Object getOnArrowRightElChange() {
		return _onArrowRightElChange;
	}

	public java.lang.Object getOnAutoPlayChange() {
		return _onAutoPlayChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnCaptionChange() {
		return _onCaptionChange;
	}

	public java.lang.Object getOnCaptionElChange() {
		return _onCaptionElChange;
	}

	public java.lang.Object getOnCaptionFromTitleChange() {
		return _onCaptionFromTitleChange;
	}

	public java.lang.Object getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.Object getOnCloseElChange() {
		return _onCloseElChange;
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

	public java.lang.Object getOnCurrentIndexChange() {
		return _onCurrentIndexChange;
	}

	public java.lang.Object getOnDelayChange() {
		return _onDelayChange;
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

	public java.lang.Object getOnImageAnimChange() {
		return _onImageAnimChange;
	}

	public java.lang.Object getOnImageChange() {
		return _onImageChange;
	}

	public java.lang.Object getOnInfoElChange() {
		return _onInfoElChange;
	}

	public java.lang.Object getOnInfoTemplateChange() {
		return _onInfoTemplateChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnLinksChange() {
		return _onLinksChange;
	}

	public java.lang.Object getOnLoad() {
		return _onLoad;
	}

	public java.lang.Object getOnLoaderChange() {
		return _onLoaderChange;
	}

	public java.lang.Object getOnLoadingChange() {
		return _onLoadingChange;
	}

	public java.lang.Object getOnLoadingElChange() {
		return _onLoadingElChange;
	}

	public java.lang.Object getOnMaxHeightChange() {
		return _onMaxHeightChange;
	}

	public java.lang.Object getOnMaxWidthChange() {
		return _onMaxWidthChange;
	}

	public java.lang.Object getOnModalChange() {
		return _onModalChange;
	}

	public java.lang.Object getOnPaginatorChange() {
		return _onPaginatorChange;
	}

	public java.lang.Object getOnPaginatorElChange() {
		return _onPaginatorElChange;
	}

	public java.lang.Object getOnPaginatorInstanceChange() {
		return _onPaginatorInstanceChange;
	}

	public java.lang.Object getOnPausedChange() {
		return _onPausedChange;
	}

	public java.lang.Object getOnPausedLabelChange() {
		return _onPausedLabelChange;
	}

	public java.lang.Object getOnPlayingChange() {
		return _onPlayingChange;
	}

	public java.lang.Object getOnPlayingLabelChange() {
		return _onPlayingLabelChange;
	}

	public java.lang.Object getOnPreloadAllImagesChange() {
		return _onPreloadAllImagesChange;
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

	public java.lang.Object getOnRepeatChange() {
		return _onRepeatChange;
	}

	public java.lang.Object getOnRequest() {
		return _onRequest;
	}

	public java.lang.Object getOnShimChange() {
		return _onShimChange;
	}

	public java.lang.Object getOnShowArrowsChange() {
		return _onShowArrowsChange;
	}

	public java.lang.Object getOnShowCloseChange() {
		return _onShowCloseChange;
	}

	public java.lang.Object getOnShowPlayerChange() {
		return _onShowPlayerChange;
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

	public java.lang.Object getOnToolbarChange() {
		return _onToolbarChange;
	}

	public java.lang.Object getOnTotalLinksChange() {
		return _onTotalLinksChange;
	}

	public java.lang.Object getOnUseARIAChange() {
		return _onUseARIAChange;
	}

	public java.lang.Object getOnUseOriginalImageChange() {
		return _onUseOriginalImageChange;
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

	public void setAnim(boolean anim) {
		_anim = anim;

		setScopedAttribute("anim", anim);
	}

	public void setArrowLeftEl(java.lang.Object arrowLeftEl) {
		_arrowLeftEl = arrowLeftEl;

		setScopedAttribute("arrowLeftEl", arrowLeftEl);
	}

	public void setArrowRightEl(java.lang.Object arrowRightEl) {
		_arrowRightEl = arrowRightEl;

		setScopedAttribute("arrowRightEl", arrowRightEl);
	}

	public void setAutoPlay(boolean autoPlay) {
		_autoPlay = autoPlay;

		setScopedAttribute("autoPlay", autoPlay);
	}

	public void setImagegalleryBodyContent(java.lang.Object imagegalleryBodyContent) {
		_imagegalleryBodyContent = imagegalleryBodyContent;

		setScopedAttribute("imagegalleryBodyContent", imagegalleryBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCaption(java.lang.String caption) {
		_caption = caption;

		setScopedAttribute("caption", caption);
	}

	public void setCaptionEl(java.lang.Object captionEl) {
		_captionEl = captionEl;

		setScopedAttribute("captionEl", captionEl);
	}

	public void setCaptionFromTitle(boolean captionFromTitle) {
		_captionFromTitle = captionFromTitle;

		setScopedAttribute("captionFromTitle", captionFromTitle);
	}

	public void setCentered(boolean centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setCloseEl(java.lang.Object closeEl) {
		_closeEl = closeEl;

		setScopedAttribute("closeEl", closeEl);
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

	public void setCurrentIndex(java.lang.Object currentIndex) {
		_currentIndex = currentIndex;

		setScopedAttribute("currentIndex", currentIndex);
	}

	public void setDelay(java.lang.Object delay) {
		_delay = delay;

		setScopedAttribute("delay", delay);
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

	public void setImagegalleryId(java.lang.String imagegalleryId) {
		_imagegalleryId = imagegalleryId;

		setScopedAttribute("imagegalleryId", imagegalleryId);
	}

	public void setImage(java.lang.Object image) {
		_image = image;

		setScopedAttribute("image", image);
	}

	public void setImageAnim(java.lang.Object imageAnim) {
		_imageAnim = imageAnim;

		setScopedAttribute("imageAnim", imageAnim);
	}

	public void setInfoEl(java.lang.Object infoEl) {
		_infoEl = infoEl;

		setScopedAttribute("infoEl", infoEl);
	}

	public void setInfoTemplate(java.lang.String infoTemplate) {
		_infoTemplate = infoTemplate;

		setScopedAttribute("infoTemplate", infoTemplate);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setLinks(java.lang.Object links) {
		_links = links;

		setScopedAttribute("links", links);
	}

	public void setLoader(java.lang.Object loader) {
		_loader = loader;

		setScopedAttribute("loader", loader);
	}

	public void setLoading(boolean loading) {
		_loading = loading;

		setScopedAttribute("loading", loading);
	}

	public void setLoadingEl(java.lang.Object loadingEl) {
		_loadingEl = loadingEl;

		setScopedAttribute("loadingEl", loadingEl);
	}

	public void setMaxHeight(java.lang.Object maxHeight) {
		_maxHeight = maxHeight;

		setScopedAttribute("maxHeight", maxHeight);
	}

	public void setMaxWidth(java.lang.Object maxWidth) {
		_maxWidth = maxWidth;

		setScopedAttribute("maxWidth", maxWidth);
	}

	public void setModal(java.lang.Object modal) {
		_modal = modal;

		setScopedAttribute("modal", modal);
	}

	public void setPaginator(java.lang.Object paginator) {
		_paginator = paginator;

		setScopedAttribute("paginator", paginator);
	}

	public void setPaginatorEl(java.lang.Object paginatorEl) {
		_paginatorEl = paginatorEl;

		setScopedAttribute("paginatorEl", paginatorEl);
	}

	public void setPaginatorInstance(java.lang.Object paginatorInstance) {
		_paginatorInstance = paginatorInstance;

		setScopedAttribute("paginatorInstance", paginatorInstance);
	}

	public void setPaused(boolean paused) {
		_paused = paused;

		setScopedAttribute("paused", paused);
	}

	public void setPausedLabel(java.lang.String pausedLabel) {
		_pausedLabel = pausedLabel;

		setScopedAttribute("pausedLabel", pausedLabel);
	}

	public void setPlaying(boolean playing) {
		_playing = playing;

		setScopedAttribute("playing", playing);
	}

	public void setPlayingLabel(java.lang.String playingLabel) {
		_playingLabel = playingLabel;

		setScopedAttribute("playingLabel", playingLabel);
	}

	public void setPreloadAllImages(boolean preloadAllImages) {
		_preloadAllImages = preloadAllImages;

		setScopedAttribute("preloadAllImages", preloadAllImages);
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

	public void setRepeat(boolean repeat) {
		_repeat = repeat;

		setScopedAttribute("repeat", repeat);
	}

	public void setShim(boolean shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
	}

	public void setShowArrows(boolean showArrows) {
		_showArrows = showArrows;

		setScopedAttribute("showArrows", showArrows);
	}

	public void setShowClose(boolean showClose) {
		_showClose = showClose;

		setScopedAttribute("showClose", showClose);
	}

	public void setShowPlayer(boolean showPlayer) {
		_showPlayer = showPlayer;

		setScopedAttribute("showPlayer", showPlayer);
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

	public void setToolbar(java.lang.Object toolbar) {
		_toolbar = toolbar;

		setScopedAttribute("toolbar", toolbar);
	}

	public void setTotalLinks(boolean totalLinks) {
		_totalLinks = totalLinks;

		setScopedAttribute("totalLinks", totalLinks);
	}

	public void setUseARIA(boolean useARIA) {
		_useARIA = useARIA;

		setScopedAttribute("useARIA", useARIA);
	}

	public void setUseOriginalImage(boolean useOriginalImage) {
		_useOriginalImage = useOriginalImage;

		setScopedAttribute("useOriginalImage", useOriginalImage);
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

	public void setAfterAnim(java.lang.Object afterAnim) {
		_afterAnim = afterAnim;

		setScopedAttribute("afterAnim", afterAnim);
	}

	public void setAfterAnimChange(java.lang.Object afterAnimChange) {
		_afterAnimChange = afterAnimChange;

		setScopedAttribute("afterAnimChange", afterAnimChange);
	}

	public void setAfterArrowLeftElChange(java.lang.Object afterArrowLeftElChange) {
		_afterArrowLeftElChange = afterArrowLeftElChange;

		setScopedAttribute("afterArrowLeftElChange", afterArrowLeftElChange);
	}

	public void setAfterArrowRightElChange(java.lang.Object afterArrowRightElChange) {
		_afterArrowRightElChange = afterArrowRightElChange;

		setScopedAttribute("afterArrowRightElChange", afterArrowRightElChange);
	}

	public void setAfterAutoPlayChange(java.lang.Object afterAutoPlayChange) {
		_afterAutoPlayChange = afterAutoPlayChange;

		setScopedAttribute("afterAutoPlayChange", afterAutoPlayChange);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCaptionChange(java.lang.Object afterCaptionChange) {
		_afterCaptionChange = afterCaptionChange;

		setScopedAttribute("afterCaptionChange", afterCaptionChange);
	}

	public void setAfterCaptionElChange(java.lang.Object afterCaptionElChange) {
		_afterCaptionElChange = afterCaptionElChange;

		setScopedAttribute("afterCaptionElChange", afterCaptionElChange);
	}

	public void setAfterCaptionFromTitleChange(java.lang.Object afterCaptionFromTitleChange) {
		_afterCaptionFromTitleChange = afterCaptionFromTitleChange;

		setScopedAttribute("afterCaptionFromTitleChange", afterCaptionFromTitleChange);
	}

	public void setAfterCenteredChange(java.lang.Object afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterCloseElChange(java.lang.Object afterCloseElChange) {
		_afterCloseElChange = afterCloseElChange;

		setScopedAttribute("afterCloseElChange", afterCloseElChange);
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

	public void setAfterCurrentIndexChange(java.lang.Object afterCurrentIndexChange) {
		_afterCurrentIndexChange = afterCurrentIndexChange;

		setScopedAttribute("afterCurrentIndexChange", afterCurrentIndexChange);
	}

	public void setAfterDelayChange(java.lang.Object afterDelayChange) {
		_afterDelayChange = afterDelayChange;

		setScopedAttribute("afterDelayChange", afterDelayChange);
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

	public void setAfterImageAnimChange(java.lang.Object afterImageAnimChange) {
		_afterImageAnimChange = afterImageAnimChange;

		setScopedAttribute("afterImageAnimChange", afterImageAnimChange);
	}

	public void setAfterImageChange(java.lang.Object afterImageChange) {
		_afterImageChange = afterImageChange;

		setScopedAttribute("afterImageChange", afterImageChange);
	}

	public void setAfterInfoElChange(java.lang.Object afterInfoElChange) {
		_afterInfoElChange = afterInfoElChange;

		setScopedAttribute("afterInfoElChange", afterInfoElChange);
	}

	public void setAfterInfoTemplateChange(java.lang.Object afterInfoTemplateChange) {
		_afterInfoTemplateChange = afterInfoTemplateChange;

		setScopedAttribute("afterInfoTemplateChange", afterInfoTemplateChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterLinksChange(java.lang.Object afterLinksChange) {
		_afterLinksChange = afterLinksChange;

		setScopedAttribute("afterLinksChange", afterLinksChange);
	}

	public void setAfterLoad(java.lang.Object afterLoad) {
		_afterLoad = afterLoad;

		setScopedAttribute("afterLoad", afterLoad);
	}

	public void setAfterLoaderChange(java.lang.Object afterLoaderChange) {
		_afterLoaderChange = afterLoaderChange;

		setScopedAttribute("afterLoaderChange", afterLoaderChange);
	}

	public void setAfterLoadingChange(java.lang.Object afterLoadingChange) {
		_afterLoadingChange = afterLoadingChange;

		setScopedAttribute("afterLoadingChange", afterLoadingChange);
	}

	public void setAfterLoadingElChange(java.lang.Object afterLoadingElChange) {
		_afterLoadingElChange = afterLoadingElChange;

		setScopedAttribute("afterLoadingElChange", afterLoadingElChange);
	}

	public void setAfterMaxHeightChange(java.lang.Object afterMaxHeightChange) {
		_afterMaxHeightChange = afterMaxHeightChange;

		setScopedAttribute("afterMaxHeightChange", afterMaxHeightChange);
	}

	public void setAfterMaxWidthChange(java.lang.Object afterMaxWidthChange) {
		_afterMaxWidthChange = afterMaxWidthChange;

		setScopedAttribute("afterMaxWidthChange", afterMaxWidthChange);
	}

	public void setAfterModalChange(java.lang.Object afterModalChange) {
		_afterModalChange = afterModalChange;

		setScopedAttribute("afterModalChange", afterModalChange);
	}

	public void setAfterPaginatorChange(java.lang.Object afterPaginatorChange) {
		_afterPaginatorChange = afterPaginatorChange;

		setScopedAttribute("afterPaginatorChange", afterPaginatorChange);
	}

	public void setAfterPaginatorElChange(java.lang.Object afterPaginatorElChange) {
		_afterPaginatorElChange = afterPaginatorElChange;

		setScopedAttribute("afterPaginatorElChange", afterPaginatorElChange);
	}

	public void setAfterPaginatorInstanceChange(java.lang.Object afterPaginatorInstanceChange) {
		_afterPaginatorInstanceChange = afterPaginatorInstanceChange;

		setScopedAttribute("afterPaginatorInstanceChange", afterPaginatorInstanceChange);
	}

	public void setAfterPausedChange(java.lang.Object afterPausedChange) {
		_afterPausedChange = afterPausedChange;

		setScopedAttribute("afterPausedChange", afterPausedChange);
	}

	public void setAfterPausedLabelChange(java.lang.Object afterPausedLabelChange) {
		_afterPausedLabelChange = afterPausedLabelChange;

		setScopedAttribute("afterPausedLabelChange", afterPausedLabelChange);
	}

	public void setAfterPlayingChange(java.lang.Object afterPlayingChange) {
		_afterPlayingChange = afterPlayingChange;

		setScopedAttribute("afterPlayingChange", afterPlayingChange);
	}

	public void setAfterPlayingLabelChange(java.lang.Object afterPlayingLabelChange) {
		_afterPlayingLabelChange = afterPlayingLabelChange;

		setScopedAttribute("afterPlayingLabelChange", afterPlayingLabelChange);
	}

	public void setAfterPreloadAllImagesChange(java.lang.Object afterPreloadAllImagesChange) {
		_afterPreloadAllImagesChange = afterPreloadAllImagesChange;

		setScopedAttribute("afterPreloadAllImagesChange", afterPreloadAllImagesChange);
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

	public void setAfterRepeatChange(java.lang.Object afterRepeatChange) {
		_afterRepeatChange = afterRepeatChange;

		setScopedAttribute("afterRepeatChange", afterRepeatChange);
	}

	public void setAfterRequest(java.lang.Object afterRequest) {
		_afterRequest = afterRequest;

		setScopedAttribute("afterRequest", afterRequest);
	}

	public void setAfterShimChange(java.lang.Object afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
	}

	public void setAfterShowArrowsChange(java.lang.Object afterShowArrowsChange) {
		_afterShowArrowsChange = afterShowArrowsChange;

		setScopedAttribute("afterShowArrowsChange", afterShowArrowsChange);
	}

	public void setAfterShowCloseChange(java.lang.Object afterShowCloseChange) {
		_afterShowCloseChange = afterShowCloseChange;

		setScopedAttribute("afterShowCloseChange", afterShowCloseChange);
	}

	public void setAfterShowPlayerChange(java.lang.Object afterShowPlayerChange) {
		_afterShowPlayerChange = afterShowPlayerChange;

		setScopedAttribute("afterShowPlayerChange", afterShowPlayerChange);
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

	public void setAfterToolbarChange(java.lang.Object afterToolbarChange) {
		_afterToolbarChange = afterToolbarChange;

		setScopedAttribute("afterToolbarChange", afterToolbarChange);
	}

	public void setAfterTotalLinksChange(java.lang.Object afterTotalLinksChange) {
		_afterTotalLinksChange = afterTotalLinksChange;

		setScopedAttribute("afterTotalLinksChange", afterTotalLinksChange);
	}

	public void setAfterUseARIAChange(java.lang.Object afterUseARIAChange) {
		_afterUseARIAChange = afterUseARIAChange;

		setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
	}

	public void setAfterUseOriginalImageChange(java.lang.Object afterUseOriginalImageChange) {
		_afterUseOriginalImageChange = afterUseOriginalImageChange;

		setScopedAttribute("afterUseOriginalImageChange", afterUseOriginalImageChange);
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

	public void setOnAnim(java.lang.Object onAnim) {
		_onAnim = onAnim;

		setScopedAttribute("onAnim", onAnim);
	}

	public void setOnAnimChange(java.lang.Object onAnimChange) {
		_onAnimChange = onAnimChange;

		setScopedAttribute("onAnimChange", onAnimChange);
	}

	public void setOnArrowLeftElChange(java.lang.Object onArrowLeftElChange) {
		_onArrowLeftElChange = onArrowLeftElChange;

		setScopedAttribute("onArrowLeftElChange", onArrowLeftElChange);
	}

	public void setOnArrowRightElChange(java.lang.Object onArrowRightElChange) {
		_onArrowRightElChange = onArrowRightElChange;

		setScopedAttribute("onArrowRightElChange", onArrowRightElChange);
	}

	public void setOnAutoPlayChange(java.lang.Object onAutoPlayChange) {
		_onAutoPlayChange = onAutoPlayChange;

		setScopedAttribute("onAutoPlayChange", onAutoPlayChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCaptionChange(java.lang.Object onCaptionChange) {
		_onCaptionChange = onCaptionChange;

		setScopedAttribute("onCaptionChange", onCaptionChange);
	}

	public void setOnCaptionElChange(java.lang.Object onCaptionElChange) {
		_onCaptionElChange = onCaptionElChange;

		setScopedAttribute("onCaptionElChange", onCaptionElChange);
	}

	public void setOnCaptionFromTitleChange(java.lang.Object onCaptionFromTitleChange) {
		_onCaptionFromTitleChange = onCaptionFromTitleChange;

		setScopedAttribute("onCaptionFromTitleChange", onCaptionFromTitleChange);
	}

	public void setOnCenteredChange(java.lang.Object onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnCloseElChange(java.lang.Object onCloseElChange) {
		_onCloseElChange = onCloseElChange;

		setScopedAttribute("onCloseElChange", onCloseElChange);
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

	public void setOnCurrentIndexChange(java.lang.Object onCurrentIndexChange) {
		_onCurrentIndexChange = onCurrentIndexChange;

		setScopedAttribute("onCurrentIndexChange", onCurrentIndexChange);
	}

	public void setOnDelayChange(java.lang.Object onDelayChange) {
		_onDelayChange = onDelayChange;

		setScopedAttribute("onDelayChange", onDelayChange);
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

	public void setOnImageAnimChange(java.lang.Object onImageAnimChange) {
		_onImageAnimChange = onImageAnimChange;

		setScopedAttribute("onImageAnimChange", onImageAnimChange);
	}

	public void setOnImageChange(java.lang.Object onImageChange) {
		_onImageChange = onImageChange;

		setScopedAttribute("onImageChange", onImageChange);
	}

	public void setOnInfoElChange(java.lang.Object onInfoElChange) {
		_onInfoElChange = onInfoElChange;

		setScopedAttribute("onInfoElChange", onInfoElChange);
	}

	public void setOnInfoTemplateChange(java.lang.Object onInfoTemplateChange) {
		_onInfoTemplateChange = onInfoTemplateChange;

		setScopedAttribute("onInfoTemplateChange", onInfoTemplateChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnLinksChange(java.lang.Object onLinksChange) {
		_onLinksChange = onLinksChange;

		setScopedAttribute("onLinksChange", onLinksChange);
	}

	public void setOnLoad(java.lang.Object onLoad) {
		_onLoad = onLoad;

		setScopedAttribute("onLoad", onLoad);
	}

	public void setOnLoaderChange(java.lang.Object onLoaderChange) {
		_onLoaderChange = onLoaderChange;

		setScopedAttribute("onLoaderChange", onLoaderChange);
	}

	public void setOnLoadingChange(java.lang.Object onLoadingChange) {
		_onLoadingChange = onLoadingChange;

		setScopedAttribute("onLoadingChange", onLoadingChange);
	}

	public void setOnLoadingElChange(java.lang.Object onLoadingElChange) {
		_onLoadingElChange = onLoadingElChange;

		setScopedAttribute("onLoadingElChange", onLoadingElChange);
	}

	public void setOnMaxHeightChange(java.lang.Object onMaxHeightChange) {
		_onMaxHeightChange = onMaxHeightChange;

		setScopedAttribute("onMaxHeightChange", onMaxHeightChange);
	}

	public void setOnMaxWidthChange(java.lang.Object onMaxWidthChange) {
		_onMaxWidthChange = onMaxWidthChange;

		setScopedAttribute("onMaxWidthChange", onMaxWidthChange);
	}

	public void setOnModalChange(java.lang.Object onModalChange) {
		_onModalChange = onModalChange;

		setScopedAttribute("onModalChange", onModalChange);
	}

	public void setOnPaginatorChange(java.lang.Object onPaginatorChange) {
		_onPaginatorChange = onPaginatorChange;

		setScopedAttribute("onPaginatorChange", onPaginatorChange);
	}

	public void setOnPaginatorElChange(java.lang.Object onPaginatorElChange) {
		_onPaginatorElChange = onPaginatorElChange;

		setScopedAttribute("onPaginatorElChange", onPaginatorElChange);
	}

	public void setOnPaginatorInstanceChange(java.lang.Object onPaginatorInstanceChange) {
		_onPaginatorInstanceChange = onPaginatorInstanceChange;

		setScopedAttribute("onPaginatorInstanceChange", onPaginatorInstanceChange);
	}

	public void setOnPausedChange(java.lang.Object onPausedChange) {
		_onPausedChange = onPausedChange;

		setScopedAttribute("onPausedChange", onPausedChange);
	}

	public void setOnPausedLabelChange(java.lang.Object onPausedLabelChange) {
		_onPausedLabelChange = onPausedLabelChange;

		setScopedAttribute("onPausedLabelChange", onPausedLabelChange);
	}

	public void setOnPlayingChange(java.lang.Object onPlayingChange) {
		_onPlayingChange = onPlayingChange;

		setScopedAttribute("onPlayingChange", onPlayingChange);
	}

	public void setOnPlayingLabelChange(java.lang.Object onPlayingLabelChange) {
		_onPlayingLabelChange = onPlayingLabelChange;

		setScopedAttribute("onPlayingLabelChange", onPlayingLabelChange);
	}

	public void setOnPreloadAllImagesChange(java.lang.Object onPreloadAllImagesChange) {
		_onPreloadAllImagesChange = onPreloadAllImagesChange;

		setScopedAttribute("onPreloadAllImagesChange", onPreloadAllImagesChange);
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

	public void setOnRepeatChange(java.lang.Object onRepeatChange) {
		_onRepeatChange = onRepeatChange;

		setScopedAttribute("onRepeatChange", onRepeatChange);
	}

	public void setOnRequest(java.lang.Object onRequest) {
		_onRequest = onRequest;

		setScopedAttribute("onRequest", onRequest);
	}

	public void setOnShimChange(java.lang.Object onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
	}

	public void setOnShowArrowsChange(java.lang.Object onShowArrowsChange) {
		_onShowArrowsChange = onShowArrowsChange;

		setScopedAttribute("onShowArrowsChange", onShowArrowsChange);
	}

	public void setOnShowCloseChange(java.lang.Object onShowCloseChange) {
		_onShowCloseChange = onShowCloseChange;

		setScopedAttribute("onShowCloseChange", onShowCloseChange);
	}

	public void setOnShowPlayerChange(java.lang.Object onShowPlayerChange) {
		_onShowPlayerChange = onShowPlayerChange;

		setScopedAttribute("onShowPlayerChange", onShowPlayerChange);
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

	public void setOnToolbarChange(java.lang.Object onToolbarChange) {
		_onToolbarChange = onToolbarChange;

		setScopedAttribute("onToolbarChange", onToolbarChange);
	}

	public void setOnTotalLinksChange(java.lang.Object onTotalLinksChange) {
		_onTotalLinksChange = onTotalLinksChange;

		setScopedAttribute("onTotalLinksChange", onTotalLinksChange);
	}

	public void setOnUseARIAChange(java.lang.Object onUseARIAChange) {
		_onUseARIAChange = onUseARIAChange;

		setScopedAttribute("onUseARIAChange", onUseARIAChange);
	}

	public void setOnUseOriginalImageChange(java.lang.Object onUseOriginalImageChange) {
		_onUseOriginalImageChange = onUseOriginalImageChange;

		setScopedAttribute("onUseOriginalImageChange", onUseOriginalImageChange);
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
		_anim = true;
		_arrowLeftEl = null;
		_arrowRightEl = null;
		_autoPlay = false;
		_imagegalleryBodyContent = null;
		_boundingBox = null;
		_caption = null;
		_captionEl = null;
		_captionFromTitle = true;
		_centered = true;
		_closeEl = null;
		_constrain = null;
		_contentBox = null;
		_cssClass = null;
		_currentIndex = 0;
		_delay = 7000;
		_destroyed = false;
		_disabled = false;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_hideClass = "aui-helper-hidden";
		_imagegalleryId = null;
		_image = null;
		_imageAnim = null;
		_infoEl = null;
		_infoTemplate = "Image {current} of {total}";
		_initialized = false;
		_links = null;
		_loader = null;
		_loading = false;
		_loadingEl = null;
		_maxHeight = 2147483647;
		_maxWidth = 2147483647;
		_modal = null;
		_paginator = null;
		_paginatorEl = null;
		_paginatorInstance = null;
		_paused = false;
		_pausedLabel = null;
		_playing = false;
		_playingLabel = "(Playing)";
		_preloadAllImages = false;
		_preventOverlap = false;
		_render = null;
		_rendered = false;
		_repeat = true;
		_shim = false;
		_showArrows = true;
		_showClose = true;
		_showPlayer = true;
		_srcNode = null;
		_strings = null;
		_tabIndex = 0;
		_toolbar = null;
		_totalLinks = true;
		_useARIA = true;
		_useOriginalImage = false;
		_visible = true;
		_width = null;
		_x = 0;
		_xy = null;
		_y = 0;
		_zIndex = 0;
		_afterAlignChange = null;
		_afterAlignOnChange = null;
		_afterAnim = null;
		_afterAnimChange = null;
		_afterArrowLeftElChange = null;
		_afterArrowRightElChange = null;
		_afterAutoPlayChange = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterCaptionChange = null;
		_afterCaptionElChange = null;
		_afterCaptionFromTitleChange = null;
		_afterCenteredChange = null;
		_afterCloseElChange = null;
		_afterConstrainChange = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterCurrentIndexChange = null;
		_afterDelayChange = null;
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
		_afterImageAnimChange = null;
		_afterImageChange = null;
		_afterInfoElChange = null;
		_afterInfoTemplateChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterLinksChange = null;
		_afterLoad = null;
		_afterLoaderChange = null;
		_afterLoadingChange = null;
		_afterLoadingElChange = null;
		_afterMaxHeightChange = null;
		_afterMaxWidthChange = null;
		_afterModalChange = null;
		_afterPaginatorChange = null;
		_afterPaginatorElChange = null;
		_afterPaginatorInstanceChange = null;
		_afterPausedChange = null;
		_afterPausedLabelChange = null;
		_afterPlayingChange = null;
		_afterPlayingLabelChange = null;
		_afterPreloadAllImagesChange = null;
		_afterPreventOverlapChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterRepeatChange = null;
		_afterRequest = null;
		_afterShimChange = null;
		_afterShowArrowsChange = null;
		_afterShowCloseChange = null;
		_afterShowPlayerChange = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterToolbarChange = null;
		_afterTotalLinksChange = null;
		_afterUseARIAChange = null;
		_afterUseOriginalImageChange = null;
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
		_onAnim = null;
		_onAnimChange = null;
		_onArrowLeftElChange = null;
		_onArrowRightElChange = null;
		_onAutoPlayChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onCaptionChange = null;
		_onCaptionElChange = null;
		_onCaptionFromTitleChange = null;
		_onCenteredChange = null;
		_onCloseElChange = null;
		_onConstrainChange = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onCurrentIndexChange = null;
		_onDelayChange = null;
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
		_onImageAnimChange = null;
		_onImageChange = null;
		_onInfoElChange = null;
		_onInfoTemplateChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onLinksChange = null;
		_onLoad = null;
		_onLoaderChange = null;
		_onLoadingChange = null;
		_onLoadingElChange = null;
		_onMaxHeightChange = null;
		_onMaxWidthChange = null;
		_onModalChange = null;
		_onPaginatorChange = null;
		_onPaginatorElChange = null;
		_onPaginatorInstanceChange = null;
		_onPausedChange = null;
		_onPausedLabelChange = null;
		_onPlayingChange = null;
		_onPlayingLabelChange = null;
		_onPreloadAllImagesChange = null;
		_onPreventOverlapChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onRepeatChange = null;
		_onRequest = null;
		_onShimChange = null;
		_onShowArrowsChange = null;
		_onShowCloseChange = null;
		_onShowPlayerChange = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onToolbarChange = null;
		_onTotalLinksChange = null;
		_onUseARIAChange = null;
		_onUseOriginalImageChange = null;
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
		request.setAttribute("alloy:image-gallery:align", _align);
		request.setAttribute("alloy:image-gallery:alignOn", _alignOn);
		request.setAttribute("alloy:image-gallery:anim", String.valueOf(_anim));
		request.setAttribute("alloy:image-gallery:arrowLeftEl", _arrowLeftEl);
		request.setAttribute("alloy:image-gallery:arrowRightEl", _arrowRightEl);
		request.setAttribute("alloy:image-gallery:autoPlay", String.valueOf(_autoPlay));
		request.setAttribute("alloy:image-gallery:bodyContent", _imagegalleryBodyContent);
		request.setAttribute("alloy:image-gallery:boundingBox", _boundingBox);
		request.setAttribute("alloy:image-gallery:caption", _caption);
		request.setAttribute("alloy:image-gallery:captionEl", _captionEl);
		request.setAttribute("alloy:image-gallery:captionFromTitle", String.valueOf(_captionFromTitle));
		request.setAttribute("alloy:image-gallery:centered", String.valueOf(_centered));
		request.setAttribute("alloy:image-gallery:closeEl", _closeEl);
		request.setAttribute("alloy:image-gallery:constrain", _constrain);
		request.setAttribute("alloy:image-gallery:contentBox", _contentBox);
		request.setAttribute("alloy:image-gallery:cssClass", _cssClass);
		request.setAttribute("alloy:image-gallery:currentIndex", _currentIndex);
		request.setAttribute("alloy:image-gallery:delay", _delay);
		request.setAttribute("alloy:image-gallery:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:image-gallery:disabled", String.valueOf(_disabled));
		request.setAttribute("alloy:image-gallery:fillHeight", _fillHeight);
		request.setAttribute("alloy:image-gallery:focused", String.valueOf(_focused));
		request.setAttribute("alloy:image-gallery:footerContent", _footerContent);
		request.setAttribute("alloy:image-gallery:headerContent", _headerContent);
		request.setAttribute("alloy:image-gallery:height", _height);
		request.setAttribute("alloy:image-gallery:hideClass", _hideClass);
		request.setAttribute("alloy:image-gallery:id", _imagegalleryId);
		request.setAttribute("alloy:image-gallery:image", _image);
		request.setAttribute("alloy:image-gallery:imageAnim", _imageAnim);
		request.setAttribute("alloy:image-gallery:infoEl", _infoEl);
		request.setAttribute("alloy:image-gallery:infoTemplate", _infoTemplate);
		request.setAttribute("alloy:image-gallery:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:image-gallery:links", _links);
		request.setAttribute("alloy:image-gallery:loader", _loader);
		request.setAttribute("alloy:image-gallery:loading", String.valueOf(_loading));
		request.setAttribute("alloy:image-gallery:loadingEl", _loadingEl);
		request.setAttribute("alloy:image-gallery:maxHeight", _maxHeight);
		request.setAttribute("alloy:image-gallery:maxWidth", _maxWidth);
		request.setAttribute("alloy:image-gallery:modal", _modal);
		request.setAttribute("alloy:image-gallery:paginator", _paginator);
		request.setAttribute("alloy:image-gallery:paginatorEl", _paginatorEl);
		request.setAttribute("alloy:image-gallery:paginatorInstance", _paginatorInstance);
		request.setAttribute("alloy:image-gallery:paused", String.valueOf(_paused));
		request.setAttribute("alloy:image-gallery:pausedLabel", _pausedLabel);
		request.setAttribute("alloy:image-gallery:playing", String.valueOf(_playing));
		request.setAttribute("alloy:image-gallery:playingLabel", _playingLabel);
		request.setAttribute("alloy:image-gallery:preloadAllImages", String.valueOf(_preloadAllImages));
		request.setAttribute("alloy:image-gallery:preventOverlap", String.valueOf(_preventOverlap));
		request.setAttribute("alloy:image-gallery:render", _render);
		request.setAttribute("alloy:image-gallery:rendered", String.valueOf(_rendered));
		request.setAttribute("alloy:image-gallery:repeat", String.valueOf(_repeat));
		request.setAttribute("alloy:image-gallery:shim", String.valueOf(_shim));
		request.setAttribute("alloy:image-gallery:showArrows", String.valueOf(_showArrows));
		request.setAttribute("alloy:image-gallery:showClose", String.valueOf(_showClose));
		request.setAttribute("alloy:image-gallery:showPlayer", String.valueOf(_showPlayer));
		request.setAttribute("alloy:image-gallery:srcNode", _srcNode);
		request.setAttribute("alloy:image-gallery:strings", _strings);
		request.setAttribute("alloy:image-gallery:tabIndex", _tabIndex);
		request.setAttribute("alloy:image-gallery:toolbar", _toolbar);
		request.setAttribute("alloy:image-gallery:totalLinks", String.valueOf(_totalLinks));
		request.setAttribute("alloy:image-gallery:useARIA", String.valueOf(_useARIA));
		request.setAttribute("alloy:image-gallery:useOriginalImage", String.valueOf(_useOriginalImage));
		request.setAttribute("alloy:image-gallery:visible", String.valueOf(_visible));
		request.setAttribute("alloy:image-gallery:width", _width);
		request.setAttribute("alloy:image-gallery:x", _x);
		request.setAttribute("alloy:image-gallery:xy", _xy);
		request.setAttribute("alloy:image-gallery:y", _y);
		request.setAttribute("alloy:image-gallery:zIndex", _zIndex);
		request.setAttribute("alloy:image-gallery:afterAlignChange", _afterAlignChange);
		request.setAttribute("alloy:image-gallery:afterAlignOnChange", _afterAlignOnChange);
		request.setAttribute("alloy:image-gallery:afterAnim", _afterAnim);
		request.setAttribute("alloy:image-gallery:afterAnimChange", _afterAnimChange);
		request.setAttribute("alloy:image-gallery:afterArrowLeftElChange", _afterArrowLeftElChange);
		request.setAttribute("alloy:image-gallery:afterArrowRightElChange", _afterArrowRightElChange);
		request.setAttribute("alloy:image-gallery:afterAutoPlayChange", _afterAutoPlayChange);
		request.setAttribute("alloy:image-gallery:afterBodyContentChange", _afterBodyContentChange);
		request.setAttribute("alloy:image-gallery:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("alloy:image-gallery:afterCaptionChange", _afterCaptionChange);
		request.setAttribute("alloy:image-gallery:afterCaptionElChange", _afterCaptionElChange);
		request.setAttribute("alloy:image-gallery:afterCaptionFromTitleChange", _afterCaptionFromTitleChange);
		request.setAttribute("alloy:image-gallery:afterCenteredChange", _afterCenteredChange);
		request.setAttribute("alloy:image-gallery:afterCloseElChange", _afterCloseElChange);
		request.setAttribute("alloy:image-gallery:afterConstrainChange", _afterConstrainChange);
		request.setAttribute("alloy:image-gallery:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("alloy:image-gallery:afterCssClassChange", _afterCssClassChange);
		request.setAttribute("alloy:image-gallery:afterCurrentIndexChange", _afterCurrentIndexChange);
		request.setAttribute("alloy:image-gallery:afterDelayChange", _afterDelayChange);
		request.setAttribute("alloy:image-gallery:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:image-gallery:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:image-gallery:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("alloy:image-gallery:afterFillHeightChange", _afterFillHeightChange);
		request.setAttribute("alloy:image-gallery:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("alloy:image-gallery:afterFooterContentChange", _afterFooterContentChange);
		request.setAttribute("alloy:image-gallery:afterHeaderContentChange", _afterHeaderContentChange);
		request.setAttribute("alloy:image-gallery:afterHeightChange", _afterHeightChange);
		request.setAttribute("alloy:image-gallery:afterHideClassChange", _afterHideClassChange);
		request.setAttribute("alloy:image-gallery:afterIdChange", _afterIdChange);
		request.setAttribute("alloy:image-gallery:afterImageAnimChange", _afterImageAnimChange);
		request.setAttribute("alloy:image-gallery:afterImageChange", _afterImageChange);
		request.setAttribute("alloy:image-gallery:afterInfoElChange", _afterInfoElChange);
		request.setAttribute("alloy:image-gallery:afterInfoTemplateChange", _afterInfoTemplateChange);
		request.setAttribute("alloy:image-gallery:afterInit", _afterInit);
		request.setAttribute("alloy:image-gallery:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:image-gallery:afterLinksChange", _afterLinksChange);
		request.setAttribute("alloy:image-gallery:afterLoad", _afterLoad);
		request.setAttribute("alloy:image-gallery:afterLoaderChange", _afterLoaderChange);
		request.setAttribute("alloy:image-gallery:afterLoadingChange", _afterLoadingChange);
		request.setAttribute("alloy:image-gallery:afterLoadingElChange", _afterLoadingElChange);
		request.setAttribute("alloy:image-gallery:afterMaxHeightChange", _afterMaxHeightChange);
		request.setAttribute("alloy:image-gallery:afterMaxWidthChange", _afterMaxWidthChange);
		request.setAttribute("alloy:image-gallery:afterModalChange", _afterModalChange);
		request.setAttribute("alloy:image-gallery:afterPaginatorChange", _afterPaginatorChange);
		request.setAttribute("alloy:image-gallery:afterPaginatorElChange", _afterPaginatorElChange);
		request.setAttribute("alloy:image-gallery:afterPaginatorInstanceChange", _afterPaginatorInstanceChange);
		request.setAttribute("alloy:image-gallery:afterPausedChange", _afterPausedChange);
		request.setAttribute("alloy:image-gallery:afterPausedLabelChange", _afterPausedLabelChange);
		request.setAttribute("alloy:image-gallery:afterPlayingChange", _afterPlayingChange);
		request.setAttribute("alloy:image-gallery:afterPlayingLabelChange", _afterPlayingLabelChange);
		request.setAttribute("alloy:image-gallery:afterPreloadAllImagesChange", _afterPreloadAllImagesChange);
		request.setAttribute("alloy:image-gallery:afterPreventOverlapChange", _afterPreventOverlapChange);
		request.setAttribute("alloy:image-gallery:afterRenderChange", _afterRenderChange);
		request.setAttribute("alloy:image-gallery:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("alloy:image-gallery:afterRepeatChange", _afterRepeatChange);
		request.setAttribute("alloy:image-gallery:afterRequest", _afterRequest);
		request.setAttribute("alloy:image-gallery:afterShimChange", _afterShimChange);
		request.setAttribute("alloy:image-gallery:afterShowArrowsChange", _afterShowArrowsChange);
		request.setAttribute("alloy:image-gallery:afterShowCloseChange", _afterShowCloseChange);
		request.setAttribute("alloy:image-gallery:afterShowPlayerChange", _afterShowPlayerChange);
		request.setAttribute("alloy:image-gallery:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("alloy:image-gallery:afterStringsChange", _afterStringsChange);
		request.setAttribute("alloy:image-gallery:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("alloy:image-gallery:afterToolbarChange", _afterToolbarChange);
		request.setAttribute("alloy:image-gallery:afterTotalLinksChange", _afterTotalLinksChange);
		request.setAttribute("alloy:image-gallery:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("alloy:image-gallery:afterUseOriginalImageChange", _afterUseOriginalImageChange);
		request.setAttribute("alloy:image-gallery:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("alloy:image-gallery:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("alloy:image-gallery:afterRender", _afterRender);
		request.setAttribute("alloy:image-gallery:afterWidthChange", _afterWidthChange);
		request.setAttribute("alloy:image-gallery:afterXChange", _afterXChange);
		request.setAttribute("alloy:image-gallery:afterXyChange", _afterXyChange);
		request.setAttribute("alloy:image-gallery:afterYChange", _afterYChange);
		request.setAttribute("alloy:image-gallery:afterZIndexChange", _afterZIndexChange);
		request.setAttribute("alloy:image-gallery:onAlignChange", _onAlignChange);
		request.setAttribute("alloy:image-gallery:onAlignOnChange", _onAlignOnChange);
		request.setAttribute("alloy:image-gallery:onAnim", _onAnim);
		request.setAttribute("alloy:image-gallery:onAnimChange", _onAnimChange);
		request.setAttribute("alloy:image-gallery:onArrowLeftElChange", _onArrowLeftElChange);
		request.setAttribute("alloy:image-gallery:onArrowRightElChange", _onArrowRightElChange);
		request.setAttribute("alloy:image-gallery:onAutoPlayChange", _onAutoPlayChange);
		request.setAttribute("alloy:image-gallery:onBodyContentChange", _onBodyContentChange);
		request.setAttribute("alloy:image-gallery:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("alloy:image-gallery:onCaptionChange", _onCaptionChange);
		request.setAttribute("alloy:image-gallery:onCaptionElChange", _onCaptionElChange);
		request.setAttribute("alloy:image-gallery:onCaptionFromTitleChange", _onCaptionFromTitleChange);
		request.setAttribute("alloy:image-gallery:onCenteredChange", _onCenteredChange);
		request.setAttribute("alloy:image-gallery:onCloseElChange", _onCloseElChange);
		request.setAttribute("alloy:image-gallery:onConstrainChange", _onConstrainChange);
		request.setAttribute("alloy:image-gallery:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("alloy:image-gallery:onCssClassChange", _onCssClassChange);
		request.setAttribute("alloy:image-gallery:onCurrentIndexChange", _onCurrentIndexChange);
		request.setAttribute("alloy:image-gallery:onDelayChange", _onDelayChange);
		request.setAttribute("alloy:image-gallery:onDestroy", _onDestroy);
		request.setAttribute("alloy:image-gallery:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:image-gallery:onDisabledChange", _onDisabledChange);
		request.setAttribute("alloy:image-gallery:onFillHeightChange", _onFillHeightChange);
		request.setAttribute("alloy:image-gallery:onFocusedChange", _onFocusedChange);
		request.setAttribute("alloy:image-gallery:onFooterContentChange", _onFooterContentChange);
		request.setAttribute("alloy:image-gallery:onHeaderContentChange", _onHeaderContentChange);
		request.setAttribute("alloy:image-gallery:onHeightChange", _onHeightChange);
		request.setAttribute("alloy:image-gallery:onHideClassChange", _onHideClassChange);
		request.setAttribute("alloy:image-gallery:onIdChange", _onIdChange);
		request.setAttribute("alloy:image-gallery:onImageAnimChange", _onImageAnimChange);
		request.setAttribute("alloy:image-gallery:onImageChange", _onImageChange);
		request.setAttribute("alloy:image-gallery:onInfoElChange", _onInfoElChange);
		request.setAttribute("alloy:image-gallery:onInfoTemplateChange", _onInfoTemplateChange);
		request.setAttribute("alloy:image-gallery:onInit", _onInit);
		request.setAttribute("alloy:image-gallery:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:image-gallery:onLinksChange", _onLinksChange);
		request.setAttribute("alloy:image-gallery:onLoad", _onLoad);
		request.setAttribute("alloy:image-gallery:onLoaderChange", _onLoaderChange);
		request.setAttribute("alloy:image-gallery:onLoadingChange", _onLoadingChange);
		request.setAttribute("alloy:image-gallery:onLoadingElChange", _onLoadingElChange);
		request.setAttribute("alloy:image-gallery:onMaxHeightChange", _onMaxHeightChange);
		request.setAttribute("alloy:image-gallery:onMaxWidthChange", _onMaxWidthChange);
		request.setAttribute("alloy:image-gallery:onModalChange", _onModalChange);
		request.setAttribute("alloy:image-gallery:onPaginatorChange", _onPaginatorChange);
		request.setAttribute("alloy:image-gallery:onPaginatorElChange", _onPaginatorElChange);
		request.setAttribute("alloy:image-gallery:onPaginatorInstanceChange", _onPaginatorInstanceChange);
		request.setAttribute("alloy:image-gallery:onPausedChange", _onPausedChange);
		request.setAttribute("alloy:image-gallery:onPausedLabelChange", _onPausedLabelChange);
		request.setAttribute("alloy:image-gallery:onPlayingChange", _onPlayingChange);
		request.setAttribute("alloy:image-gallery:onPlayingLabelChange", _onPlayingLabelChange);
		request.setAttribute("alloy:image-gallery:onPreloadAllImagesChange", _onPreloadAllImagesChange);
		request.setAttribute("alloy:image-gallery:onPreventOverlapChange", _onPreventOverlapChange);
		request.setAttribute("alloy:image-gallery:onRenderChange", _onRenderChange);
		request.setAttribute("alloy:image-gallery:onRenderedChange", _onRenderedChange);
		request.setAttribute("alloy:image-gallery:onRepeatChange", _onRepeatChange);
		request.setAttribute("alloy:image-gallery:onRequest", _onRequest);
		request.setAttribute("alloy:image-gallery:onShimChange", _onShimChange);
		request.setAttribute("alloy:image-gallery:onShowArrowsChange", _onShowArrowsChange);
		request.setAttribute("alloy:image-gallery:onShowCloseChange", _onShowCloseChange);
		request.setAttribute("alloy:image-gallery:onShowPlayerChange", _onShowPlayerChange);
		request.setAttribute("alloy:image-gallery:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("alloy:image-gallery:onStringsChange", _onStringsChange);
		request.setAttribute("alloy:image-gallery:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("alloy:image-gallery:onToolbarChange", _onToolbarChange);
		request.setAttribute("alloy:image-gallery:onTotalLinksChange", _onTotalLinksChange);
		request.setAttribute("alloy:image-gallery:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("alloy:image-gallery:onUseOriginalImageChange", _onUseOriginalImageChange);
		request.setAttribute("alloy:image-gallery:onVisibleChange", _onVisibleChange);
		request.setAttribute("alloy:image-gallery:onContentUpdate", _onContentUpdate);
		request.setAttribute("alloy:image-gallery:onRender", _onRender);
		request.setAttribute("alloy:image-gallery:onWidthChange", _onWidthChange);
		request.setAttribute("alloy:image-gallery:onXChange", _onXChange);
		request.setAttribute("alloy:image-gallery:onXyChange", _onXyChange);
		request.setAttribute("alloy:image-gallery:onYChange", _onYChange);
		request.setAttribute("alloy:image-gallery:onZIndexChange", _onZIndexChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:image-gallery:";

	private static final String _PAGE =
		"/html/taglib/alloy/image_gallery/page.jsp";

	private java.lang.Object _align = null;
	private java.lang.Object _alignOn = null;
	private boolean _anim = true;
	private java.lang.Object _arrowLeftEl = null;
	private java.lang.Object _arrowRightEl = null;
	private boolean _autoPlay = false;
	private java.lang.Object _imagegalleryBodyContent = null;
	private java.lang.String _boundingBox = null;
	private java.lang.String _caption = null;
	private java.lang.Object _captionEl = null;
	private boolean _captionFromTitle = true;
	private boolean _centered = true;
	private java.lang.Object _closeEl = null;
	private java.lang.Object _constrain = null;
	private java.lang.String _contentBox = null;
	private java.lang.String _cssClass = null;
	private java.lang.Object _currentIndex = 0;
	private java.lang.Object _delay = 7000;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private java.lang.Object _fillHeight = null;
	private boolean _focused = false;
	private java.lang.Object _footerContent = null;
	private java.lang.Object _headerContent = null;
	private java.lang.Object _height = null;
	private java.lang.String _hideClass = "aui-helper-hidden";
	private java.lang.String _imagegalleryId = null;
	private java.lang.Object _image = null;
	private java.lang.Object _imageAnim = null;
	private java.lang.Object _infoEl = null;
	private java.lang.String _infoTemplate = "Image {current} of {total}";
	private boolean _initialized = false;
	private java.lang.Object _links = null;
	private java.lang.Object _loader = null;
	private boolean _loading = false;
	private java.lang.Object _loadingEl = null;
	private java.lang.Object _maxHeight = 2147483647;
	private java.lang.Object _maxWidth = 2147483647;
	private java.lang.Object _modal = null;
	private java.lang.Object _paginator = null;
	private java.lang.Object _paginatorEl = null;
	private java.lang.Object _paginatorInstance = null;
	private boolean _paused = false;
	private java.lang.String _pausedLabel = null;
	private boolean _playing = false;
	private java.lang.String _playingLabel = "(Playing)";
	private boolean _preloadAllImages = false;
	private boolean _preventOverlap = false;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private boolean _repeat = true;
	private boolean _shim = false;
	private boolean _showArrows = true;
	private boolean _showClose = true;
	private boolean _showPlayer = true;
	private java.lang.String _srcNode = null;
	private java.lang.Object _strings = null;
	private java.lang.Object _tabIndex = 0;
	private java.lang.Object _toolbar = null;
	private boolean _totalLinks = true;
	private boolean _useARIA = true;
	private boolean _useOriginalImage = false;
	private boolean _visible = true;
	private java.lang.Object _width = null;
	private java.lang.Object _x = 0;
	private java.lang.Object _xy = null;
	private java.lang.Object _y = 0;
	private java.lang.Object _zIndex = 0;
	private java.lang.Object _afterAlignChange = null;
	private java.lang.Object _afterAlignOnChange = null;
	private java.lang.Object _afterAnim = null;
	private java.lang.Object _afterAnimChange = null;
	private java.lang.Object _afterArrowLeftElChange = null;
	private java.lang.Object _afterArrowRightElChange = null;
	private java.lang.Object _afterAutoPlayChange = null;
	private java.lang.Object _afterBodyContentChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterCaptionChange = null;
	private java.lang.Object _afterCaptionElChange = null;
	private java.lang.Object _afterCaptionFromTitleChange = null;
	private java.lang.Object _afterCenteredChange = null;
	private java.lang.Object _afterCloseElChange = null;
	private java.lang.Object _afterConstrainChange = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterCssClassChange = null;
	private java.lang.Object _afterCurrentIndexChange = null;
	private java.lang.Object _afterDelayChange = null;
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
	private java.lang.Object _afterImageAnimChange = null;
	private java.lang.Object _afterImageChange = null;
	private java.lang.Object _afterInfoElChange = null;
	private java.lang.Object _afterInfoTemplateChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterLinksChange = null;
	private java.lang.Object _afterLoad = null;
	private java.lang.Object _afterLoaderChange = null;
	private java.lang.Object _afterLoadingChange = null;
	private java.lang.Object _afterLoadingElChange = null;
	private java.lang.Object _afterMaxHeightChange = null;
	private java.lang.Object _afterMaxWidthChange = null;
	private java.lang.Object _afterModalChange = null;
	private java.lang.Object _afterPaginatorChange = null;
	private java.lang.Object _afterPaginatorElChange = null;
	private java.lang.Object _afterPaginatorInstanceChange = null;
	private java.lang.Object _afterPausedChange = null;
	private java.lang.Object _afterPausedLabelChange = null;
	private java.lang.Object _afterPlayingChange = null;
	private java.lang.Object _afterPlayingLabelChange = null;
	private java.lang.Object _afterPreloadAllImagesChange = null;
	private java.lang.Object _afterPreventOverlapChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterRepeatChange = null;
	private java.lang.Object _afterRequest = null;
	private java.lang.Object _afterShimChange = null;
	private java.lang.Object _afterShowArrowsChange = null;
	private java.lang.Object _afterShowCloseChange = null;
	private java.lang.Object _afterShowPlayerChange = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterToolbarChange = null;
	private java.lang.Object _afterTotalLinksChange = null;
	private java.lang.Object _afterUseARIAChange = null;
	private java.lang.Object _afterUseOriginalImageChange = null;
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
	private java.lang.Object _onAnim = null;
	private java.lang.Object _onAnimChange = null;
	private java.lang.Object _onArrowLeftElChange = null;
	private java.lang.Object _onArrowRightElChange = null;
	private java.lang.Object _onAutoPlayChange = null;
	private java.lang.Object _onBodyContentChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onCaptionChange = null;
	private java.lang.Object _onCaptionElChange = null;
	private java.lang.Object _onCaptionFromTitleChange = null;
	private java.lang.Object _onCenteredChange = null;
	private java.lang.Object _onCloseElChange = null;
	private java.lang.Object _onConstrainChange = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onCssClassChange = null;
	private java.lang.Object _onCurrentIndexChange = null;
	private java.lang.Object _onDelayChange = null;
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
	private java.lang.Object _onImageAnimChange = null;
	private java.lang.Object _onImageChange = null;
	private java.lang.Object _onInfoElChange = null;
	private java.lang.Object _onInfoTemplateChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onLinksChange = null;
	private java.lang.Object _onLoad = null;
	private java.lang.Object _onLoaderChange = null;
	private java.lang.Object _onLoadingChange = null;
	private java.lang.Object _onLoadingElChange = null;
	private java.lang.Object _onMaxHeightChange = null;
	private java.lang.Object _onMaxWidthChange = null;
	private java.lang.Object _onModalChange = null;
	private java.lang.Object _onPaginatorChange = null;
	private java.lang.Object _onPaginatorElChange = null;
	private java.lang.Object _onPaginatorInstanceChange = null;
	private java.lang.Object _onPausedChange = null;
	private java.lang.Object _onPausedLabelChange = null;
	private java.lang.Object _onPlayingChange = null;
	private java.lang.Object _onPlayingLabelChange = null;
	private java.lang.Object _onPreloadAllImagesChange = null;
	private java.lang.Object _onPreventOverlapChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onRepeatChange = null;
	private java.lang.Object _onRequest = null;
	private java.lang.Object _onShimChange = null;
	private java.lang.Object _onShowArrowsChange = null;
	private java.lang.Object _onShowCloseChange = null;
	private java.lang.Object _onShowPlayerChange = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onToolbarChange = null;
	private java.lang.Object _onTotalLinksChange = null;
	private java.lang.Object _onUseARIAChange = null;
	private java.lang.Object _onUseOriginalImageChange = null;
	private java.lang.Object _onVisibleChange = null;
	private java.lang.Object _onContentUpdate = null;
	private java.lang.Object _onRender = null;
	private java.lang.Object _onWidthChange = null;
	private java.lang.Object _onXChange = null;
	private java.lang.Object _onXyChange = null;
	private java.lang.Object _onYChange = null;
	private java.lang.Object _onZIndexChange = null;

}