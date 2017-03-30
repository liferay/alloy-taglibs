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
public abstract class BasePaginatorTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public boolean getAlwaysVisible() {
		return _alwaysVisible;
	}

	public java.lang.String getContainers() {
		return _containers;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.String getFirstPageLink() {
		return _firstPageLink;
	}

	public java.lang.String getFirstPageLinkLabel() {
		return _firstPageLinkLabel;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getLastPageLink() {
		return _lastPageLink;
	}

	public java.lang.String getLastPageLinkLabel() {
		return _lastPageLinkLabel;
	}

	public java.lang.Object getMaxPageLinks() {
		return _maxPageLinks;
	}

	public java.lang.String getNextPageLink() {
		return _nextPageLink;
	}

	public java.lang.String getNextPageLinkLabel() {
		return _nextPageLinkLabel;
	}

	public java.lang.Object getPaginatorPage() {
		return _paginatorPage;
	}

	public java.lang.String getPageContainerTemplate() {
		return _pageContainerTemplate;
	}

	public java.lang.Object getPageLinkContent() {
		return _pageLinkContent;
	}

	public java.lang.String getPageLinkTemplate() {
		return _pageLinkTemplate;
	}

	public java.lang.String getPageReportEl() {
		return _pageReportEl;
	}

	public java.lang.String getPageReportLabelTemplate() {
		return _pageReportLabelTemplate;
	}

	public java.lang.String getPrevPageLink() {
		return _prevPageLink;
	}

	public java.lang.String getPrevPageLinkLabel() {
		return _prevPageLinkLabel;
	}

	public java.lang.Object getRowsPerPage() {
		return _rowsPerPage;
	}

	public java.lang.String getRowsPerPageEl() {
		return _rowsPerPageEl;
	}

	public java.lang.Object getRowsPerPageOptions() {
		return _rowsPerPageOptions;
	}

	public java.lang.Object getState() {
		return _state;
	}

	public java.lang.String getTemplate() {
		return _template;
	}

	public java.lang.Object getTotal() {
		return _total;
	}

	public java.lang.String getTotalEl() {
		return _totalEl;
	}

	public java.lang.String getTotalLabel() {
		return _totalLabel;
	}

	public java.lang.Object getTotalPages() {
		return _totalPages;
	}

	public java.lang.Object getAfterAlwaysVisibleChange() {
		return _afterAlwaysVisibleChange;
	}

	public java.lang.Object getAfterContainersChange() {
		return _afterContainersChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterFirstPageLinkChange() {
		return _afterFirstPageLinkChange;
	}

	public java.lang.Object getAfterFirstPageLinkLabelChange() {
		return _afterFirstPageLinkLabelChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterLastPageLinkChange() {
		return _afterLastPageLinkChange;
	}

	public java.lang.Object getAfterLastPageLinkLabelChange() {
		return _afterLastPageLinkLabelChange;
	}

	public java.lang.Object getAfterMaxPageLinksChange() {
		return _afterMaxPageLinksChange;
	}

	public java.lang.Object getAfterNextPageLinkChange() {
		return _afterNextPageLinkChange;
	}

	public java.lang.Object getAfterNextPageLinkLabelChange() {
		return _afterNextPageLinkLabelChange;
	}

	public java.lang.Object getAfterPageChange() {
		return _afterPageChange;
	}

	public java.lang.Object getAfterPageContainerTemplateChange() {
		return _afterPageContainerTemplateChange;
	}

	public java.lang.Object getAfterPageLinkContentChange() {
		return _afterPageLinkContentChange;
	}

	public java.lang.Object getAfterPageLinkTemplateChange() {
		return _afterPageLinkTemplateChange;
	}

	public java.lang.Object getAfterPageReportElChange() {
		return _afterPageReportElChange;
	}

	public java.lang.Object getAfterPageReportLabelTemplateChange() {
		return _afterPageReportLabelTemplateChange;
	}

	public java.lang.Object getAfterPrevPageLinkChange() {
		return _afterPrevPageLinkChange;
	}

	public java.lang.Object getAfterPrevPageLinkLabelChange() {
		return _afterPrevPageLinkLabelChange;
	}

	public java.lang.Object getAfterRowsPerPageChange() {
		return _afterRowsPerPageChange;
	}

	public java.lang.Object getAfterRowsPerPageElChange() {
		return _afterRowsPerPageElChange;
	}

	public java.lang.Object getAfterRowsPerPageOptionsChange() {
		return _afterRowsPerPageOptionsChange;
	}

	public java.lang.Object getAfterStateChange() {
		return _afterStateChange;
	}

	public java.lang.Object getAfterTemplateChange() {
		return _afterTemplateChange;
	}

	public java.lang.Object getAfterTotalChange() {
		return _afterTotalChange;
	}

	public java.lang.Object getAfterTotalElChange() {
		return _afterTotalElChange;
	}

	public java.lang.Object getAfterTotalLabelChange() {
		return _afterTotalLabelChange;
	}

	public java.lang.Object getAfterTotalPagesChange() {
		return _afterTotalPagesChange;
	}

	public java.lang.Object getOnAlwaysVisibleChange() {
		return _onAlwaysVisibleChange;
	}

	public java.lang.Object getOnContainersChange() {
		return _onContainersChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnFirstPageLinkChange() {
		return _onFirstPageLinkChange;
	}

	public java.lang.Object getOnFirstPageLinkLabelChange() {
		return _onFirstPageLinkLabelChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnLastPageLinkChange() {
		return _onLastPageLinkChange;
	}

	public java.lang.Object getOnLastPageLinkLabelChange() {
		return _onLastPageLinkLabelChange;
	}

	public java.lang.Object getOnMaxPageLinksChange() {
		return _onMaxPageLinksChange;
	}

	public java.lang.Object getOnNextPageLinkChange() {
		return _onNextPageLinkChange;
	}

	public java.lang.Object getOnNextPageLinkLabelChange() {
		return _onNextPageLinkLabelChange;
	}

	public java.lang.Object getOnPageChange() {
		return _onPageChange;
	}

	public java.lang.Object getOnPageContainerTemplateChange() {
		return _onPageContainerTemplateChange;
	}

	public java.lang.Object getOnPageLinkContentChange() {
		return _onPageLinkContentChange;
	}

	public java.lang.Object getOnPageLinkTemplateChange() {
		return _onPageLinkTemplateChange;
	}

	public java.lang.Object getOnPageReportElChange() {
		return _onPageReportElChange;
	}

	public java.lang.Object getOnPageReportLabelTemplateChange() {
		return _onPageReportLabelTemplateChange;
	}

	public java.lang.Object getOnPrevPageLinkChange() {
		return _onPrevPageLinkChange;
	}

	public java.lang.Object getOnPrevPageLinkLabelChange() {
		return _onPrevPageLinkLabelChange;
	}

	public java.lang.Object getOnRowsPerPageChange() {
		return _onRowsPerPageChange;
	}

	public java.lang.Object getOnRowsPerPageElChange() {
		return _onRowsPerPageElChange;
	}

	public java.lang.Object getOnRowsPerPageOptionsChange() {
		return _onRowsPerPageOptionsChange;
	}

	public java.lang.Object getOnStateChange() {
		return _onStateChange;
	}

	public java.lang.Object getOnTemplateChange() {
		return _onTemplateChange;
	}

	public java.lang.Object getOnTotalChange() {
		return _onTotalChange;
	}

	public java.lang.Object getOnTotalElChange() {
		return _onTotalElChange;
	}

	public java.lang.Object getOnTotalLabelChange() {
		return _onTotalLabelChange;
	}

	public java.lang.Object getOnTotalPagesChange() {
		return _onTotalPagesChange;
	}

	public void setAlwaysVisible(boolean alwaysVisible) {
		_alwaysVisible = alwaysVisible;

		setScopedAttribute("alwaysVisible", alwaysVisible);
	}

	public void setContainers(java.lang.String containers) {
		_containers = containers;

		setScopedAttribute("containers", containers);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setFirstPageLink(java.lang.String firstPageLink) {
		_firstPageLink = firstPageLink;

		setScopedAttribute("firstPageLink", firstPageLink);
	}

	public void setFirstPageLinkLabel(java.lang.String firstPageLinkLabel) {
		_firstPageLinkLabel = firstPageLinkLabel;

		setScopedAttribute("firstPageLinkLabel", firstPageLinkLabel);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setLastPageLink(java.lang.String lastPageLink) {
		_lastPageLink = lastPageLink;

		setScopedAttribute("lastPageLink", lastPageLink);
	}

	public void setLastPageLinkLabel(java.lang.String lastPageLinkLabel) {
		_lastPageLinkLabel = lastPageLinkLabel;

		setScopedAttribute("lastPageLinkLabel", lastPageLinkLabel);
	}

	public void setMaxPageLinks(java.lang.Object maxPageLinks) {
		_maxPageLinks = maxPageLinks;

		setScopedAttribute("maxPageLinks", maxPageLinks);
	}

	public void setNextPageLink(java.lang.String nextPageLink) {
		_nextPageLink = nextPageLink;

		setScopedAttribute("nextPageLink", nextPageLink);
	}

	public void setNextPageLinkLabel(java.lang.String nextPageLinkLabel) {
		_nextPageLinkLabel = nextPageLinkLabel;

		setScopedAttribute("nextPageLinkLabel", nextPageLinkLabel);
	}

	public void setPaginatorPage(java.lang.Object paginatorPage) {
		_paginatorPage = paginatorPage;

		setScopedAttribute("paginatorPage", paginatorPage);
	}

	public void setPageContainerTemplate(java.lang.String pageContainerTemplate) {
		_pageContainerTemplate = pageContainerTemplate;

		setScopedAttribute("pageContainerTemplate", pageContainerTemplate);
	}

	public void setPageLinkContent(java.lang.Object pageLinkContent) {
		_pageLinkContent = pageLinkContent;

		setScopedAttribute("pageLinkContent", pageLinkContent);
	}

	public void setPageLinkTemplate(java.lang.String pageLinkTemplate) {
		_pageLinkTemplate = pageLinkTemplate;

		setScopedAttribute("pageLinkTemplate", pageLinkTemplate);
	}

	public void setPageReportEl(java.lang.String pageReportEl) {
		_pageReportEl = pageReportEl;

		setScopedAttribute("pageReportEl", pageReportEl);
	}

	public void setPageReportLabelTemplate(java.lang.String pageReportLabelTemplate) {
		_pageReportLabelTemplate = pageReportLabelTemplate;

		setScopedAttribute("pageReportLabelTemplate", pageReportLabelTemplate);
	}

	public void setPrevPageLink(java.lang.String prevPageLink) {
		_prevPageLink = prevPageLink;

		setScopedAttribute("prevPageLink", prevPageLink);
	}

	public void setPrevPageLinkLabel(java.lang.String prevPageLinkLabel) {
		_prevPageLinkLabel = prevPageLinkLabel;

		setScopedAttribute("prevPageLinkLabel", prevPageLinkLabel);
	}

	public void setRowsPerPage(java.lang.Object rowsPerPage) {
		_rowsPerPage = rowsPerPage;

		setScopedAttribute("rowsPerPage", rowsPerPage);
	}

	public void setRowsPerPageEl(java.lang.String rowsPerPageEl) {
		_rowsPerPageEl = rowsPerPageEl;

		setScopedAttribute("rowsPerPageEl", rowsPerPageEl);
	}

	public void setRowsPerPageOptions(java.lang.Object rowsPerPageOptions) {
		_rowsPerPageOptions = rowsPerPageOptions;

		setScopedAttribute("rowsPerPageOptions", rowsPerPageOptions);
	}

	public void setState(java.lang.Object state) {
		_state = state;

		setScopedAttribute("state", state);
	}

	public void setTemplate(java.lang.String template) {
		_template = template;

		setScopedAttribute("template", template);
	}

	public void setTotal(java.lang.Object total) {
		_total = total;

		setScopedAttribute("total", total);
	}

	public void setTotalEl(java.lang.String totalEl) {
		_totalEl = totalEl;

		setScopedAttribute("totalEl", totalEl);
	}

	public void setTotalLabel(java.lang.String totalLabel) {
		_totalLabel = totalLabel;

		setScopedAttribute("totalLabel", totalLabel);
	}

	public void setTotalPages(java.lang.Object totalPages) {
		_totalPages = totalPages;

		setScopedAttribute("totalPages", totalPages);
	}

	public void setAfterAlwaysVisibleChange(java.lang.Object afterAlwaysVisibleChange) {
		_afterAlwaysVisibleChange = afterAlwaysVisibleChange;

		setScopedAttribute("afterAlwaysVisibleChange", afterAlwaysVisibleChange);
	}

	public void setAfterContainersChange(java.lang.Object afterContainersChange) {
		_afterContainersChange = afterContainersChange;

		setScopedAttribute("afterContainersChange", afterContainersChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterFirstPageLinkChange(java.lang.Object afterFirstPageLinkChange) {
		_afterFirstPageLinkChange = afterFirstPageLinkChange;

		setScopedAttribute("afterFirstPageLinkChange", afterFirstPageLinkChange);
	}

	public void setAfterFirstPageLinkLabelChange(java.lang.Object afterFirstPageLinkLabelChange) {
		_afterFirstPageLinkLabelChange = afterFirstPageLinkLabelChange;

		setScopedAttribute("afterFirstPageLinkLabelChange", afterFirstPageLinkLabelChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterLastPageLinkChange(java.lang.Object afterLastPageLinkChange) {
		_afterLastPageLinkChange = afterLastPageLinkChange;

		setScopedAttribute("afterLastPageLinkChange", afterLastPageLinkChange);
	}

	public void setAfterLastPageLinkLabelChange(java.lang.Object afterLastPageLinkLabelChange) {
		_afterLastPageLinkLabelChange = afterLastPageLinkLabelChange;

		setScopedAttribute("afterLastPageLinkLabelChange", afterLastPageLinkLabelChange);
	}

	public void setAfterMaxPageLinksChange(java.lang.Object afterMaxPageLinksChange) {
		_afterMaxPageLinksChange = afterMaxPageLinksChange;

		setScopedAttribute("afterMaxPageLinksChange", afterMaxPageLinksChange);
	}

	public void setAfterNextPageLinkChange(java.lang.Object afterNextPageLinkChange) {
		_afterNextPageLinkChange = afterNextPageLinkChange;

		setScopedAttribute("afterNextPageLinkChange", afterNextPageLinkChange);
	}

	public void setAfterNextPageLinkLabelChange(java.lang.Object afterNextPageLinkLabelChange) {
		_afterNextPageLinkLabelChange = afterNextPageLinkLabelChange;

		setScopedAttribute("afterNextPageLinkLabelChange", afterNextPageLinkLabelChange);
	}

	public void setAfterPageChange(java.lang.Object afterPageChange) {
		_afterPageChange = afterPageChange;

		setScopedAttribute("afterPageChange", afterPageChange);
	}

	public void setAfterPageContainerTemplateChange(java.lang.Object afterPageContainerTemplateChange) {
		_afterPageContainerTemplateChange = afterPageContainerTemplateChange;

		setScopedAttribute("afterPageContainerTemplateChange", afterPageContainerTemplateChange);
	}

	public void setAfterPageLinkContentChange(java.lang.Object afterPageLinkContentChange) {
		_afterPageLinkContentChange = afterPageLinkContentChange;

		setScopedAttribute("afterPageLinkContentChange", afterPageLinkContentChange);
	}

	public void setAfterPageLinkTemplateChange(java.lang.Object afterPageLinkTemplateChange) {
		_afterPageLinkTemplateChange = afterPageLinkTemplateChange;

		setScopedAttribute("afterPageLinkTemplateChange", afterPageLinkTemplateChange);
	}

	public void setAfterPageReportElChange(java.lang.Object afterPageReportElChange) {
		_afterPageReportElChange = afterPageReportElChange;

		setScopedAttribute("afterPageReportElChange", afterPageReportElChange);
	}

	public void setAfterPageReportLabelTemplateChange(java.lang.Object afterPageReportLabelTemplateChange) {
		_afterPageReportLabelTemplateChange = afterPageReportLabelTemplateChange;

		setScopedAttribute("afterPageReportLabelTemplateChange", afterPageReportLabelTemplateChange);
	}

	public void setAfterPrevPageLinkChange(java.lang.Object afterPrevPageLinkChange) {
		_afterPrevPageLinkChange = afterPrevPageLinkChange;

		setScopedAttribute("afterPrevPageLinkChange", afterPrevPageLinkChange);
	}

	public void setAfterPrevPageLinkLabelChange(java.lang.Object afterPrevPageLinkLabelChange) {
		_afterPrevPageLinkLabelChange = afterPrevPageLinkLabelChange;

		setScopedAttribute("afterPrevPageLinkLabelChange", afterPrevPageLinkLabelChange);
	}

	public void setAfterRowsPerPageChange(java.lang.Object afterRowsPerPageChange) {
		_afterRowsPerPageChange = afterRowsPerPageChange;

		setScopedAttribute("afterRowsPerPageChange", afterRowsPerPageChange);
	}

	public void setAfterRowsPerPageElChange(java.lang.Object afterRowsPerPageElChange) {
		_afterRowsPerPageElChange = afterRowsPerPageElChange;

		setScopedAttribute("afterRowsPerPageElChange", afterRowsPerPageElChange);
	}

	public void setAfterRowsPerPageOptionsChange(java.lang.Object afterRowsPerPageOptionsChange) {
		_afterRowsPerPageOptionsChange = afterRowsPerPageOptionsChange;

		setScopedAttribute("afterRowsPerPageOptionsChange", afterRowsPerPageOptionsChange);
	}

	public void setAfterStateChange(java.lang.Object afterStateChange) {
		_afterStateChange = afterStateChange;

		setScopedAttribute("afterStateChange", afterStateChange);
	}

	public void setAfterTemplateChange(java.lang.Object afterTemplateChange) {
		_afterTemplateChange = afterTemplateChange;

		setScopedAttribute("afterTemplateChange", afterTemplateChange);
	}

	public void setAfterTotalChange(java.lang.Object afterTotalChange) {
		_afterTotalChange = afterTotalChange;

		setScopedAttribute("afterTotalChange", afterTotalChange);
	}

	public void setAfterTotalElChange(java.lang.Object afterTotalElChange) {
		_afterTotalElChange = afterTotalElChange;

		setScopedAttribute("afterTotalElChange", afterTotalElChange);
	}

	public void setAfterTotalLabelChange(java.lang.Object afterTotalLabelChange) {
		_afterTotalLabelChange = afterTotalLabelChange;

		setScopedAttribute("afterTotalLabelChange", afterTotalLabelChange);
	}

	public void setAfterTotalPagesChange(java.lang.Object afterTotalPagesChange) {
		_afterTotalPagesChange = afterTotalPagesChange;

		setScopedAttribute("afterTotalPagesChange", afterTotalPagesChange);
	}

	public void setOnAlwaysVisibleChange(java.lang.Object onAlwaysVisibleChange) {
		_onAlwaysVisibleChange = onAlwaysVisibleChange;

		setScopedAttribute("onAlwaysVisibleChange", onAlwaysVisibleChange);
	}

	public void setOnContainersChange(java.lang.Object onContainersChange) {
		_onContainersChange = onContainersChange;

		setScopedAttribute("onContainersChange", onContainersChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnFirstPageLinkChange(java.lang.Object onFirstPageLinkChange) {
		_onFirstPageLinkChange = onFirstPageLinkChange;

		setScopedAttribute("onFirstPageLinkChange", onFirstPageLinkChange);
	}

	public void setOnFirstPageLinkLabelChange(java.lang.Object onFirstPageLinkLabelChange) {
		_onFirstPageLinkLabelChange = onFirstPageLinkLabelChange;

		setScopedAttribute("onFirstPageLinkLabelChange", onFirstPageLinkLabelChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnLastPageLinkChange(java.lang.Object onLastPageLinkChange) {
		_onLastPageLinkChange = onLastPageLinkChange;

		setScopedAttribute("onLastPageLinkChange", onLastPageLinkChange);
	}

	public void setOnLastPageLinkLabelChange(java.lang.Object onLastPageLinkLabelChange) {
		_onLastPageLinkLabelChange = onLastPageLinkLabelChange;

		setScopedAttribute("onLastPageLinkLabelChange", onLastPageLinkLabelChange);
	}

	public void setOnMaxPageLinksChange(java.lang.Object onMaxPageLinksChange) {
		_onMaxPageLinksChange = onMaxPageLinksChange;

		setScopedAttribute("onMaxPageLinksChange", onMaxPageLinksChange);
	}

	public void setOnNextPageLinkChange(java.lang.Object onNextPageLinkChange) {
		_onNextPageLinkChange = onNextPageLinkChange;

		setScopedAttribute("onNextPageLinkChange", onNextPageLinkChange);
	}

	public void setOnNextPageLinkLabelChange(java.lang.Object onNextPageLinkLabelChange) {
		_onNextPageLinkLabelChange = onNextPageLinkLabelChange;

		setScopedAttribute("onNextPageLinkLabelChange", onNextPageLinkLabelChange);
	}

	public void setOnPageChange(java.lang.Object onPageChange) {
		_onPageChange = onPageChange;

		setScopedAttribute("onPageChange", onPageChange);
	}

	public void setOnPageContainerTemplateChange(java.lang.Object onPageContainerTemplateChange) {
		_onPageContainerTemplateChange = onPageContainerTemplateChange;

		setScopedAttribute("onPageContainerTemplateChange", onPageContainerTemplateChange);
	}

	public void setOnPageLinkContentChange(java.lang.Object onPageLinkContentChange) {
		_onPageLinkContentChange = onPageLinkContentChange;

		setScopedAttribute("onPageLinkContentChange", onPageLinkContentChange);
	}

	public void setOnPageLinkTemplateChange(java.lang.Object onPageLinkTemplateChange) {
		_onPageLinkTemplateChange = onPageLinkTemplateChange;

		setScopedAttribute("onPageLinkTemplateChange", onPageLinkTemplateChange);
	}

	public void setOnPageReportElChange(java.lang.Object onPageReportElChange) {
		_onPageReportElChange = onPageReportElChange;

		setScopedAttribute("onPageReportElChange", onPageReportElChange);
	}

	public void setOnPageReportLabelTemplateChange(java.lang.Object onPageReportLabelTemplateChange) {
		_onPageReportLabelTemplateChange = onPageReportLabelTemplateChange;

		setScopedAttribute("onPageReportLabelTemplateChange", onPageReportLabelTemplateChange);
	}

	public void setOnPrevPageLinkChange(java.lang.Object onPrevPageLinkChange) {
		_onPrevPageLinkChange = onPrevPageLinkChange;

		setScopedAttribute("onPrevPageLinkChange", onPrevPageLinkChange);
	}

	public void setOnPrevPageLinkLabelChange(java.lang.Object onPrevPageLinkLabelChange) {
		_onPrevPageLinkLabelChange = onPrevPageLinkLabelChange;

		setScopedAttribute("onPrevPageLinkLabelChange", onPrevPageLinkLabelChange);
	}

	public void setOnRowsPerPageChange(java.lang.Object onRowsPerPageChange) {
		_onRowsPerPageChange = onRowsPerPageChange;

		setScopedAttribute("onRowsPerPageChange", onRowsPerPageChange);
	}

	public void setOnRowsPerPageElChange(java.lang.Object onRowsPerPageElChange) {
		_onRowsPerPageElChange = onRowsPerPageElChange;

		setScopedAttribute("onRowsPerPageElChange", onRowsPerPageElChange);
	}

	public void setOnRowsPerPageOptionsChange(java.lang.Object onRowsPerPageOptionsChange) {
		_onRowsPerPageOptionsChange = onRowsPerPageOptionsChange;

		setScopedAttribute("onRowsPerPageOptionsChange", onRowsPerPageOptionsChange);
	}

	public void setOnStateChange(java.lang.Object onStateChange) {
		_onStateChange = onStateChange;

		setScopedAttribute("onStateChange", onStateChange);
	}

	public void setOnTemplateChange(java.lang.Object onTemplateChange) {
		_onTemplateChange = onTemplateChange;

		setScopedAttribute("onTemplateChange", onTemplateChange);
	}

	public void setOnTotalChange(java.lang.Object onTotalChange) {
		_onTotalChange = onTotalChange;

		setScopedAttribute("onTotalChange", onTotalChange);
	}

	public void setOnTotalElChange(java.lang.Object onTotalElChange) {
		_onTotalElChange = onTotalElChange;

		setScopedAttribute("onTotalElChange", onTotalElChange);
	}

	public void setOnTotalLabelChange(java.lang.Object onTotalLabelChange) {
		_onTotalLabelChange = onTotalLabelChange;

		setScopedAttribute("onTotalLabelChange", onTotalLabelChange);
	}

	public void setOnTotalPagesChange(java.lang.Object onTotalPagesChange) {
		_onTotalPagesChange = onTotalPagesChange;

		setScopedAttribute("onTotalPagesChange", onTotalPagesChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_alwaysVisible = true;
		_containers = null;
		_destroyed = false;
		_firstPageLink = null;
		_firstPageLinkLabel = "first";
		_initialized = false;
		_lastPageLink = null;
		_lastPageLinkLabel = "last";
		_maxPageLinks = 10;
		_nextPageLink = null;
		_nextPageLinkLabel = "next &gt;";
		_paginatorPage = 1;
		_pageContainerTemplate = null;
		_pageLinkContent = null;
		_pageLinkTemplate = null;
		_pageReportEl = null;
		_pageReportLabelTemplate = "({page} of {totalPages})";
		_prevPageLink = null;
		_prevPageLinkLabel = "&lt; prev";
		_rowsPerPage = 1;
		_rowsPerPageEl = null;
		_rowsPerPageOptions = null;
		_state = null;
		_template = "{FirstPageLink} {PrevPageLink} {PageLinks} {NextPageLink} {LastPageLink} {CurrentPageReport} {Total} {RowsPerPageSelect}";
		_total = 0;
		_totalEl = null;
		_totalLabel = "(Total {total})";
		_totalPages = 0;
		_afterAlwaysVisibleChange = null;
		_afterContainersChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterFirstPageLinkChange = null;
		_afterFirstPageLinkLabelChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterLastPageLinkChange = null;
		_afterLastPageLinkLabelChange = null;
		_afterMaxPageLinksChange = null;
		_afterNextPageLinkChange = null;
		_afterNextPageLinkLabelChange = null;
		_afterPageChange = null;
		_afterPageContainerTemplateChange = null;
		_afterPageLinkContentChange = null;
		_afterPageLinkTemplateChange = null;
		_afterPageReportElChange = null;
		_afterPageReportLabelTemplateChange = null;
		_afterPrevPageLinkChange = null;
		_afterPrevPageLinkLabelChange = null;
		_afterRowsPerPageChange = null;
		_afterRowsPerPageElChange = null;
		_afterRowsPerPageOptionsChange = null;
		_afterStateChange = null;
		_afterTemplateChange = null;
		_afterTotalChange = null;
		_afterTotalElChange = null;
		_afterTotalLabelChange = null;
		_afterTotalPagesChange = null;
		_onAlwaysVisibleChange = null;
		_onContainersChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onFirstPageLinkChange = null;
		_onFirstPageLinkLabelChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onLastPageLinkChange = null;
		_onLastPageLinkLabelChange = null;
		_onMaxPageLinksChange = null;
		_onNextPageLinkChange = null;
		_onNextPageLinkLabelChange = null;
		_onPageChange = null;
		_onPageContainerTemplateChange = null;
		_onPageLinkContentChange = null;
		_onPageLinkTemplateChange = null;
		_onPageReportElChange = null;
		_onPageReportLabelTemplateChange = null;
		_onPrevPageLinkChange = null;
		_onPrevPageLinkLabelChange = null;
		_onRowsPerPageChange = null;
		_onRowsPerPageElChange = null;
		_onRowsPerPageOptionsChange = null;
		_onStateChange = null;
		_onTemplateChange = null;
		_onTotalChange = null;
		_onTotalElChange = null;
		_onTotalLabelChange = null;
		_onTotalPagesChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("alloy:paginator:alwaysVisible", String.valueOf(_alwaysVisible));
		request.setAttribute("alloy:paginator:containers", _containers);
		request.setAttribute("alloy:paginator:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:paginator:firstPageLink", _firstPageLink);
		request.setAttribute("alloy:paginator:firstPageLinkLabel", _firstPageLinkLabel);
		request.setAttribute("alloy:paginator:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:paginator:lastPageLink", _lastPageLink);
		request.setAttribute("alloy:paginator:lastPageLinkLabel", _lastPageLinkLabel);
		request.setAttribute("alloy:paginator:maxPageLinks", _maxPageLinks);
		request.setAttribute("alloy:paginator:nextPageLink", _nextPageLink);
		request.setAttribute("alloy:paginator:nextPageLinkLabel", _nextPageLinkLabel);
		request.setAttribute("alloy:paginator:page", _paginatorPage);
		request.setAttribute("alloy:paginator:pageContainerTemplate", _pageContainerTemplate);
		request.setAttribute("alloy:paginator:pageLinkContent", _pageLinkContent);
		request.setAttribute("alloy:paginator:pageLinkTemplate", _pageLinkTemplate);
		request.setAttribute("alloy:paginator:pageReportEl", _pageReportEl);
		request.setAttribute("alloy:paginator:pageReportLabelTemplate", _pageReportLabelTemplate);
		request.setAttribute("alloy:paginator:prevPageLink", _prevPageLink);
		request.setAttribute("alloy:paginator:prevPageLinkLabel", _prevPageLinkLabel);
		request.setAttribute("alloy:paginator:rowsPerPage", _rowsPerPage);
		request.setAttribute("alloy:paginator:rowsPerPageEl", _rowsPerPageEl);
		request.setAttribute("alloy:paginator:rowsPerPageOptions", _rowsPerPageOptions);
		request.setAttribute("alloy:paginator:state", _state);
		request.setAttribute("alloy:paginator:template", _template);
		request.setAttribute("alloy:paginator:total", _total);
		request.setAttribute("alloy:paginator:totalEl", _totalEl);
		request.setAttribute("alloy:paginator:totalLabel", _totalLabel);
		request.setAttribute("alloy:paginator:totalPages", _totalPages);
		request.setAttribute("alloy:paginator:afterAlwaysVisibleChange", _afterAlwaysVisibleChange);
		request.setAttribute("alloy:paginator:afterContainersChange", _afterContainersChange);
		request.setAttribute("alloy:paginator:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:paginator:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:paginator:afterFirstPageLinkChange", _afterFirstPageLinkChange);
		request.setAttribute("alloy:paginator:afterFirstPageLinkLabelChange", _afterFirstPageLinkLabelChange);
		request.setAttribute("alloy:paginator:afterInit", _afterInit);
		request.setAttribute("alloy:paginator:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:paginator:afterLastPageLinkChange", _afterLastPageLinkChange);
		request.setAttribute("alloy:paginator:afterLastPageLinkLabelChange", _afterLastPageLinkLabelChange);
		request.setAttribute("alloy:paginator:afterMaxPageLinksChange", _afterMaxPageLinksChange);
		request.setAttribute("alloy:paginator:afterNextPageLinkChange", _afterNextPageLinkChange);
		request.setAttribute("alloy:paginator:afterNextPageLinkLabelChange", _afterNextPageLinkLabelChange);
		request.setAttribute("alloy:paginator:afterPageChange", _afterPageChange);
		request.setAttribute("alloy:paginator:afterPageContainerTemplateChange", _afterPageContainerTemplateChange);
		request.setAttribute("alloy:paginator:afterPageLinkContentChange", _afterPageLinkContentChange);
		request.setAttribute("alloy:paginator:afterPageLinkTemplateChange", _afterPageLinkTemplateChange);
		request.setAttribute("alloy:paginator:afterPageReportElChange", _afterPageReportElChange);
		request.setAttribute("alloy:paginator:afterPageReportLabelTemplateChange", _afterPageReportLabelTemplateChange);
		request.setAttribute("alloy:paginator:afterPrevPageLinkChange", _afterPrevPageLinkChange);
		request.setAttribute("alloy:paginator:afterPrevPageLinkLabelChange", _afterPrevPageLinkLabelChange);
		request.setAttribute("alloy:paginator:afterRowsPerPageChange", _afterRowsPerPageChange);
		request.setAttribute("alloy:paginator:afterRowsPerPageElChange", _afterRowsPerPageElChange);
		request.setAttribute("alloy:paginator:afterRowsPerPageOptionsChange", _afterRowsPerPageOptionsChange);
		request.setAttribute("alloy:paginator:afterStateChange", _afterStateChange);
		request.setAttribute("alloy:paginator:afterTemplateChange", _afterTemplateChange);
		request.setAttribute("alloy:paginator:afterTotalChange", _afterTotalChange);
		request.setAttribute("alloy:paginator:afterTotalElChange", _afterTotalElChange);
		request.setAttribute("alloy:paginator:afterTotalLabelChange", _afterTotalLabelChange);
		request.setAttribute("alloy:paginator:afterTotalPagesChange", _afterTotalPagesChange);
		request.setAttribute("alloy:paginator:onAlwaysVisibleChange", _onAlwaysVisibleChange);
		request.setAttribute("alloy:paginator:onContainersChange", _onContainersChange);
		request.setAttribute("alloy:paginator:onDestroy", _onDestroy);
		request.setAttribute("alloy:paginator:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:paginator:onFirstPageLinkChange", _onFirstPageLinkChange);
		request.setAttribute("alloy:paginator:onFirstPageLinkLabelChange", _onFirstPageLinkLabelChange);
		request.setAttribute("alloy:paginator:onInit", _onInit);
		request.setAttribute("alloy:paginator:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:paginator:onLastPageLinkChange", _onLastPageLinkChange);
		request.setAttribute("alloy:paginator:onLastPageLinkLabelChange", _onLastPageLinkLabelChange);
		request.setAttribute("alloy:paginator:onMaxPageLinksChange", _onMaxPageLinksChange);
		request.setAttribute("alloy:paginator:onNextPageLinkChange", _onNextPageLinkChange);
		request.setAttribute("alloy:paginator:onNextPageLinkLabelChange", _onNextPageLinkLabelChange);
		request.setAttribute("alloy:paginator:onPageChange", _onPageChange);
		request.setAttribute("alloy:paginator:onPageContainerTemplateChange", _onPageContainerTemplateChange);
		request.setAttribute("alloy:paginator:onPageLinkContentChange", _onPageLinkContentChange);
		request.setAttribute("alloy:paginator:onPageLinkTemplateChange", _onPageLinkTemplateChange);
		request.setAttribute("alloy:paginator:onPageReportElChange", _onPageReportElChange);
		request.setAttribute("alloy:paginator:onPageReportLabelTemplateChange", _onPageReportLabelTemplateChange);
		request.setAttribute("alloy:paginator:onPrevPageLinkChange", _onPrevPageLinkChange);
		request.setAttribute("alloy:paginator:onPrevPageLinkLabelChange", _onPrevPageLinkLabelChange);
		request.setAttribute("alloy:paginator:onRowsPerPageChange", _onRowsPerPageChange);
		request.setAttribute("alloy:paginator:onRowsPerPageElChange", _onRowsPerPageElChange);
		request.setAttribute("alloy:paginator:onRowsPerPageOptionsChange", _onRowsPerPageOptionsChange);
		request.setAttribute("alloy:paginator:onStateChange", _onStateChange);
		request.setAttribute("alloy:paginator:onTemplateChange", _onTemplateChange);
		request.setAttribute("alloy:paginator:onTotalChange", _onTotalChange);
		request.setAttribute("alloy:paginator:onTotalElChange", _onTotalElChange);
		request.setAttribute("alloy:paginator:onTotalLabelChange", _onTotalLabelChange);
		request.setAttribute("alloy:paginator:onTotalPagesChange", _onTotalPagesChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:paginator:";

	private static final String _PAGE =
		"/html/taglib/alloy/paginator/page.jsp";

	private boolean _alwaysVisible = true;
	private java.lang.String _containers = null;
	private boolean _destroyed = false;
	private java.lang.String _firstPageLink = null;
	private java.lang.String _firstPageLinkLabel = "first";
	private boolean _initialized = false;
	private java.lang.String _lastPageLink = null;
	private java.lang.String _lastPageLinkLabel = "last";
	private java.lang.Object _maxPageLinks = 10;
	private java.lang.String _nextPageLink = null;
	private java.lang.String _nextPageLinkLabel = "next &gt;";
	private java.lang.Object _paginatorPage = 1;
	private java.lang.String _pageContainerTemplate = null;
	private java.lang.Object _pageLinkContent = null;
	private java.lang.String _pageLinkTemplate = null;
	private java.lang.String _pageReportEl = null;
	private java.lang.String _pageReportLabelTemplate = "({page} of {totalPages})";
	private java.lang.String _prevPageLink = null;
	private java.lang.String _prevPageLinkLabel = "&lt; prev";
	private java.lang.Object _rowsPerPage = 1;
	private java.lang.String _rowsPerPageEl = null;
	private java.lang.Object _rowsPerPageOptions = null;
	private java.lang.Object _state = null;
	private java.lang.String _template = "{FirstPageLink} {PrevPageLink} {PageLinks} {NextPageLink} {LastPageLink} {CurrentPageReport} {Total} {RowsPerPageSelect}";
	private java.lang.Object _total = 0;
	private java.lang.String _totalEl = null;
	private java.lang.String _totalLabel = "(Total {total})";
	private java.lang.Object _totalPages = 0;
	private java.lang.Object _afterAlwaysVisibleChange = null;
	private java.lang.Object _afterContainersChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterFirstPageLinkChange = null;
	private java.lang.Object _afterFirstPageLinkLabelChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterLastPageLinkChange = null;
	private java.lang.Object _afterLastPageLinkLabelChange = null;
	private java.lang.Object _afterMaxPageLinksChange = null;
	private java.lang.Object _afterNextPageLinkChange = null;
	private java.lang.Object _afterNextPageLinkLabelChange = null;
	private java.lang.Object _afterPageChange = null;
	private java.lang.Object _afterPageContainerTemplateChange = null;
	private java.lang.Object _afterPageLinkContentChange = null;
	private java.lang.Object _afterPageLinkTemplateChange = null;
	private java.lang.Object _afterPageReportElChange = null;
	private java.lang.Object _afterPageReportLabelTemplateChange = null;
	private java.lang.Object _afterPrevPageLinkChange = null;
	private java.lang.Object _afterPrevPageLinkLabelChange = null;
	private java.lang.Object _afterRowsPerPageChange = null;
	private java.lang.Object _afterRowsPerPageElChange = null;
	private java.lang.Object _afterRowsPerPageOptionsChange = null;
	private java.lang.Object _afterStateChange = null;
	private java.lang.Object _afterTemplateChange = null;
	private java.lang.Object _afterTotalChange = null;
	private java.lang.Object _afterTotalElChange = null;
	private java.lang.Object _afterTotalLabelChange = null;
	private java.lang.Object _afterTotalPagesChange = null;
	private java.lang.Object _onAlwaysVisibleChange = null;
	private java.lang.Object _onContainersChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onFirstPageLinkChange = null;
	private java.lang.Object _onFirstPageLinkLabelChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onLastPageLinkChange = null;
	private java.lang.Object _onLastPageLinkLabelChange = null;
	private java.lang.Object _onMaxPageLinksChange = null;
	private java.lang.Object _onNextPageLinkChange = null;
	private java.lang.Object _onNextPageLinkLabelChange = null;
	private java.lang.Object _onPageChange = null;
	private java.lang.Object _onPageContainerTemplateChange = null;
	private java.lang.Object _onPageLinkContentChange = null;
	private java.lang.Object _onPageLinkTemplateChange = null;
	private java.lang.Object _onPageReportElChange = null;
	private java.lang.Object _onPageReportLabelTemplateChange = null;
	private java.lang.Object _onPrevPageLinkChange = null;
	private java.lang.Object _onPrevPageLinkLabelChange = null;
	private java.lang.Object _onRowsPerPageChange = null;
	private java.lang.Object _onRowsPerPageElChange = null;
	private java.lang.Object _onRowsPerPageOptionsChange = null;
	private java.lang.Object _onStateChange = null;
	private java.lang.Object _onTemplateChange = null;
	private java.lang.Object _onTotalChange = null;
	private java.lang.Object _onTotalElChange = null;
	private java.lang.Object _onTotalLabelChange = null;
	private java.lang.Object _onTotalPagesChange = null;

}