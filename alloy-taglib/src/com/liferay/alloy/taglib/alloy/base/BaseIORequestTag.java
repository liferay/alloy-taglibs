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
public abstract class BaseIORequestTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public boolean getActive() {
		return _active;
	}

	public java.lang.Object getArguments() {
		return _arguments;
	}

	public boolean getAutoLoad() {
		return _autoLoad;
	}

	public boolean getCache() {
		return _cache;
	}

	public java.lang.String getCfg() {
		return _cfg;
	}

	public java.lang.Object getContext() {
		return _context;
	}

	public java.lang.Object getData() {
		return _data;
	}

	public java.lang.String getDataType() {
		return _dataType;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.Object getForm() {
		return _form;
	}

	public java.lang.Object getHeaders() {
		return _headers;
	}

	public java.lang.Object getHost() {
		return _host;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getMethod() {
		return _method;
	}

	public java.lang.Object getResponseData() {
		return _responseData;
	}

	public java.lang.String getSelector() {
		return _selector;
	}

	public boolean getSync() {
		return _sync;
	}

	public java.lang.Object getTimeout() {
		return _timeout;
	}

	public java.lang.Object getTransaction() {
		return _transaction;
	}

	public java.lang.String getUri() {
		return _uri;
	}

	public java.lang.Object getXdr() {
		return _xdr;
	}

	public java.lang.Object getAfterActiveChange() {
		return _afterActiveChange;
	}

	public java.lang.Object getAfterArgumentsChange() {
		return _afterArgumentsChange;
	}

	public java.lang.Object getAfterAutoLoadChange() {
		return _afterAutoLoadChange;
	}

	public java.lang.Object getAfterCacheChange() {
		return _afterCacheChange;
	}

	public java.lang.Object getAfterCfgChange() {
		return _afterCfgChange;
	}

	public java.lang.Object getAfterContextChange() {
		return _afterContextChange;
	}

	public java.lang.Object getAfterDataChange() {
		return _afterDataChange;
	}

	public java.lang.Object getAfterDataTypeChange() {
		return _afterDataTypeChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterFormChange() {
		return _afterFormChange;
	}

	public java.lang.Object getAfterHeadersChange() {
		return _afterHeadersChange;
	}

	public java.lang.Object getAfterHostChange() {
		return _afterHostChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterMethodChange() {
		return _afterMethodChange;
	}

	public java.lang.Object getAfterResponseDataChange() {
		return _afterResponseDataChange;
	}

	public java.lang.Object getAfterSelectorChange() {
		return _afterSelectorChange;
	}

	public java.lang.Object getAfterSyncChange() {
		return _afterSyncChange;
	}

	public java.lang.Object getAfterTimeoutChange() {
		return _afterTimeoutChange;
	}

	public java.lang.Object getAfterTransactionChange() {
		return _afterTransactionChange;
	}

	public java.lang.Object getAfterUriChange() {
		return _afterUriChange;
	}

	public java.lang.Object getAfterXdrChange() {
		return _afterXdrChange;
	}

	public java.lang.Object getOnActiveChange() {
		return _onActiveChange;
	}

	public java.lang.Object getOnArgumentsChange() {
		return _onArgumentsChange;
	}

	public java.lang.Object getOnAutoLoadChange() {
		return _onAutoLoadChange;
	}

	public java.lang.Object getOnCacheChange() {
		return _onCacheChange;
	}

	public java.lang.Object getOnCfgChange() {
		return _onCfgChange;
	}

	public java.lang.Object getOnContextChange() {
		return _onContextChange;
	}

	public java.lang.Object getOnDataChange() {
		return _onDataChange;
	}

	public java.lang.Object getOnDataTypeChange() {
		return _onDataTypeChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnFormChange() {
		return _onFormChange;
	}

	public java.lang.Object getOnHeadersChange() {
		return _onHeadersChange;
	}

	public java.lang.Object getOnHostChange() {
		return _onHostChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnMethodChange() {
		return _onMethodChange;
	}

	public java.lang.Object getOnResponseDataChange() {
		return _onResponseDataChange;
	}

	public java.lang.Object getOnSelectorChange() {
		return _onSelectorChange;
	}

	public java.lang.Object getOnSyncChange() {
		return _onSyncChange;
	}

	public java.lang.Object getOnTimeoutChange() {
		return _onTimeoutChange;
	}

	public java.lang.Object getOnTransactionChange() {
		return _onTransactionChange;
	}

	public java.lang.Object getOnUriChange() {
		return _onUriChange;
	}

	public java.lang.Object getOnXdrChange() {
		return _onXdrChange;
	}

	public void setActive(boolean active) {
		_active = active;

		setScopedAttribute("active", active);
	}

	public void setArguments(java.lang.Object arguments) {
		_arguments = arguments;

		setScopedAttribute("arguments", arguments);
	}

	public void setAutoLoad(boolean autoLoad) {
		_autoLoad = autoLoad;

		setScopedAttribute("autoLoad", autoLoad);
	}

	public void setCache(boolean cache) {
		_cache = cache;

		setScopedAttribute("cache", cache);
	}

	public void setCfg(java.lang.String cfg) {
		_cfg = cfg;

		setScopedAttribute("cfg", cfg);
	}

	public void setContext(java.lang.Object context) {
		_context = context;

		setScopedAttribute("context", context);
	}

	public void setData(java.lang.Object data) {
		_data = data;

		setScopedAttribute("data", data);
	}

	public void setDataType(java.lang.String dataType) {
		_dataType = dataType;

		setScopedAttribute("dataType", dataType);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setForm(java.lang.Object form) {
		_form = form;

		setScopedAttribute("form", form);
	}

	public void setHeaders(java.lang.Object headers) {
		_headers = headers;

		setScopedAttribute("headers", headers);
	}

	public void setHost(java.lang.Object host) {
		_host = host;

		setScopedAttribute("host", host);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setMethod(java.lang.String method) {
		_method = method;

		setScopedAttribute("method", method);
	}

	public void setResponseData(java.lang.Object responseData) {
		_responseData = responseData;

		setScopedAttribute("responseData", responseData);
	}

	public void setSelector(java.lang.String selector) {
		_selector = selector;

		setScopedAttribute("selector", selector);
	}

	public void setSync(boolean sync) {
		_sync = sync;

		setScopedAttribute("sync", sync);
	}

	public void setTimeout(java.lang.Object timeout) {
		_timeout = timeout;

		setScopedAttribute("timeout", timeout);
	}

	public void setTransaction(java.lang.Object transaction) {
		_transaction = transaction;

		setScopedAttribute("transaction", transaction);
	}

	public void setUri(java.lang.String uri) {
		_uri = uri;

		setScopedAttribute("uri", uri);
	}

	public void setXdr(java.lang.Object xdr) {
		_xdr = xdr;

		setScopedAttribute("xdr", xdr);
	}

	public void setAfterActiveChange(java.lang.Object afterActiveChange) {
		_afterActiveChange = afterActiveChange;

		setScopedAttribute("afterActiveChange", afterActiveChange);
	}

	public void setAfterArgumentsChange(java.lang.Object afterArgumentsChange) {
		_afterArgumentsChange = afterArgumentsChange;

		setScopedAttribute("afterArgumentsChange", afterArgumentsChange);
	}

	public void setAfterAutoLoadChange(java.lang.Object afterAutoLoadChange) {
		_afterAutoLoadChange = afterAutoLoadChange;

		setScopedAttribute("afterAutoLoadChange", afterAutoLoadChange);
	}

	public void setAfterCacheChange(java.lang.Object afterCacheChange) {
		_afterCacheChange = afterCacheChange;

		setScopedAttribute("afterCacheChange", afterCacheChange);
	}

	public void setAfterCfgChange(java.lang.Object afterCfgChange) {
		_afterCfgChange = afterCfgChange;

		setScopedAttribute("afterCfgChange", afterCfgChange);
	}

	public void setAfterContextChange(java.lang.Object afterContextChange) {
		_afterContextChange = afterContextChange;

		setScopedAttribute("afterContextChange", afterContextChange);
	}

	public void setAfterDataChange(java.lang.Object afterDataChange) {
		_afterDataChange = afterDataChange;

		setScopedAttribute("afterDataChange", afterDataChange);
	}

	public void setAfterDataTypeChange(java.lang.Object afterDataTypeChange) {
		_afterDataTypeChange = afterDataTypeChange;

		setScopedAttribute("afterDataTypeChange", afterDataTypeChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterFormChange(java.lang.Object afterFormChange) {
		_afterFormChange = afterFormChange;

		setScopedAttribute("afterFormChange", afterFormChange);
	}

	public void setAfterHeadersChange(java.lang.Object afterHeadersChange) {
		_afterHeadersChange = afterHeadersChange;

		setScopedAttribute("afterHeadersChange", afterHeadersChange);
	}

	public void setAfterHostChange(java.lang.Object afterHostChange) {
		_afterHostChange = afterHostChange;

		setScopedAttribute("afterHostChange", afterHostChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterMethodChange(java.lang.Object afterMethodChange) {
		_afterMethodChange = afterMethodChange;

		setScopedAttribute("afterMethodChange", afterMethodChange);
	}

	public void setAfterResponseDataChange(java.lang.Object afterResponseDataChange) {
		_afterResponseDataChange = afterResponseDataChange;

		setScopedAttribute("afterResponseDataChange", afterResponseDataChange);
	}

	public void setAfterSelectorChange(java.lang.Object afterSelectorChange) {
		_afterSelectorChange = afterSelectorChange;

		setScopedAttribute("afterSelectorChange", afterSelectorChange);
	}

	public void setAfterSyncChange(java.lang.Object afterSyncChange) {
		_afterSyncChange = afterSyncChange;

		setScopedAttribute("afterSyncChange", afterSyncChange);
	}

	public void setAfterTimeoutChange(java.lang.Object afterTimeoutChange) {
		_afterTimeoutChange = afterTimeoutChange;

		setScopedAttribute("afterTimeoutChange", afterTimeoutChange);
	}

	public void setAfterTransactionChange(java.lang.Object afterTransactionChange) {
		_afterTransactionChange = afterTransactionChange;

		setScopedAttribute("afterTransactionChange", afterTransactionChange);
	}

	public void setAfterUriChange(java.lang.Object afterUriChange) {
		_afterUriChange = afterUriChange;

		setScopedAttribute("afterUriChange", afterUriChange);
	}

	public void setAfterXdrChange(java.lang.Object afterXdrChange) {
		_afterXdrChange = afterXdrChange;

		setScopedAttribute("afterXdrChange", afterXdrChange);
	}

	public void setOnActiveChange(java.lang.Object onActiveChange) {
		_onActiveChange = onActiveChange;

		setScopedAttribute("onActiveChange", onActiveChange);
	}

	public void setOnArgumentsChange(java.lang.Object onArgumentsChange) {
		_onArgumentsChange = onArgumentsChange;

		setScopedAttribute("onArgumentsChange", onArgumentsChange);
	}

	public void setOnAutoLoadChange(java.lang.Object onAutoLoadChange) {
		_onAutoLoadChange = onAutoLoadChange;

		setScopedAttribute("onAutoLoadChange", onAutoLoadChange);
	}

	public void setOnCacheChange(java.lang.Object onCacheChange) {
		_onCacheChange = onCacheChange;

		setScopedAttribute("onCacheChange", onCacheChange);
	}

	public void setOnCfgChange(java.lang.Object onCfgChange) {
		_onCfgChange = onCfgChange;

		setScopedAttribute("onCfgChange", onCfgChange);
	}

	public void setOnContextChange(java.lang.Object onContextChange) {
		_onContextChange = onContextChange;

		setScopedAttribute("onContextChange", onContextChange);
	}

	public void setOnDataChange(java.lang.Object onDataChange) {
		_onDataChange = onDataChange;

		setScopedAttribute("onDataChange", onDataChange);
	}

	public void setOnDataTypeChange(java.lang.Object onDataTypeChange) {
		_onDataTypeChange = onDataTypeChange;

		setScopedAttribute("onDataTypeChange", onDataTypeChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnFormChange(java.lang.Object onFormChange) {
		_onFormChange = onFormChange;

		setScopedAttribute("onFormChange", onFormChange);
	}

	public void setOnHeadersChange(java.lang.Object onHeadersChange) {
		_onHeadersChange = onHeadersChange;

		setScopedAttribute("onHeadersChange", onHeadersChange);
	}

	public void setOnHostChange(java.lang.Object onHostChange) {
		_onHostChange = onHostChange;

		setScopedAttribute("onHostChange", onHostChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnMethodChange(java.lang.Object onMethodChange) {
		_onMethodChange = onMethodChange;

		setScopedAttribute("onMethodChange", onMethodChange);
	}

	public void setOnResponseDataChange(java.lang.Object onResponseDataChange) {
		_onResponseDataChange = onResponseDataChange;

		setScopedAttribute("onResponseDataChange", onResponseDataChange);
	}

	public void setOnSelectorChange(java.lang.Object onSelectorChange) {
		_onSelectorChange = onSelectorChange;

		setScopedAttribute("onSelectorChange", onSelectorChange);
	}

	public void setOnSyncChange(java.lang.Object onSyncChange) {
		_onSyncChange = onSyncChange;

		setScopedAttribute("onSyncChange", onSyncChange);
	}

	public void setOnTimeoutChange(java.lang.Object onTimeoutChange) {
		_onTimeoutChange = onTimeoutChange;

		setScopedAttribute("onTimeoutChange", onTimeoutChange);
	}

	public void setOnTransactionChange(java.lang.Object onTransactionChange) {
		_onTransactionChange = onTransactionChange;

		setScopedAttribute("onTransactionChange", onTransactionChange);
	}

	public void setOnUriChange(java.lang.Object onUriChange) {
		_onUriChange = onUriChange;

		setScopedAttribute("onUriChange", onUriChange);
	}

	public void setOnXdrChange(java.lang.Object onXdrChange) {
		_onXdrChange = onXdrChange;

		setScopedAttribute("onXdrChange", onXdrChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_active = false;
		_arguments = null;
		_autoLoad = true;
		_cache = true;
		_cfg = null;
		_context = null;
		_data = null;
		_dataType = null;
		_destroyed = false;
		_form = null;
		_headers = null;
		_host = null;
		_initialized = false;
		_method = null;
		_responseData = null;
		_selector = null;
		_sync = false;
		_timeout = 0;
		_transaction = null;
		_uri = null;
		_xdr = null;
		_afterActiveChange = null;
		_afterArgumentsChange = null;
		_afterAutoLoadChange = null;
		_afterCacheChange = null;
		_afterCfgChange = null;
		_afterContextChange = null;
		_afterDataChange = null;
		_afterDataTypeChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterFormChange = null;
		_afterHeadersChange = null;
		_afterHostChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterMethodChange = null;
		_afterResponseDataChange = null;
		_afterSelectorChange = null;
		_afterSyncChange = null;
		_afterTimeoutChange = null;
		_afterTransactionChange = null;
		_afterUriChange = null;
		_afterXdrChange = null;
		_onActiveChange = null;
		_onArgumentsChange = null;
		_onAutoLoadChange = null;
		_onCacheChange = null;
		_onCfgChange = null;
		_onContextChange = null;
		_onDataChange = null;
		_onDataTypeChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onFormChange = null;
		_onHeadersChange = null;
		_onHostChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onMethodChange = null;
		_onResponseDataChange = null;
		_onSelectorChange = null;
		_onSyncChange = null;
		_onTimeoutChange = null;
		_onTransactionChange = null;
		_onUriChange = null;
		_onXdrChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("alloy:io-request:active", String.valueOf(_active));
		request.setAttribute("alloy:io-request:arguments", _arguments);
		request.setAttribute("alloy:io-request:autoLoad", String.valueOf(_autoLoad));
		request.setAttribute("alloy:io-request:cache", String.valueOf(_cache));
		request.setAttribute("alloy:io-request:cfg", _cfg);
		request.setAttribute("alloy:io-request:context", _context);
		request.setAttribute("alloy:io-request:data", _data);
		request.setAttribute("alloy:io-request:dataType", _dataType);
		request.setAttribute("alloy:io-request:destroyed", String.valueOf(_destroyed));
		request.setAttribute("alloy:io-request:form", _form);
		request.setAttribute("alloy:io-request:headers", _headers);
		request.setAttribute("alloy:io-request:host", _host);
		request.setAttribute("alloy:io-request:initialized", String.valueOf(_initialized));
		request.setAttribute("alloy:io-request:method", _method);
		request.setAttribute("alloy:io-request:responseData", _responseData);
		request.setAttribute("alloy:io-request:selector", _selector);
		request.setAttribute("alloy:io-request:sync", String.valueOf(_sync));
		request.setAttribute("alloy:io-request:timeout", _timeout);
		request.setAttribute("alloy:io-request:transaction", _transaction);
		request.setAttribute("alloy:io-request:uri", _uri);
		request.setAttribute("alloy:io-request:xdr", _xdr);
		request.setAttribute("alloy:io-request:afterActiveChange", _afterActiveChange);
		request.setAttribute("alloy:io-request:afterArgumentsChange", _afterArgumentsChange);
		request.setAttribute("alloy:io-request:afterAutoLoadChange", _afterAutoLoadChange);
		request.setAttribute("alloy:io-request:afterCacheChange", _afterCacheChange);
		request.setAttribute("alloy:io-request:afterCfgChange", _afterCfgChange);
		request.setAttribute("alloy:io-request:afterContextChange", _afterContextChange);
		request.setAttribute("alloy:io-request:afterDataChange", _afterDataChange);
		request.setAttribute("alloy:io-request:afterDataTypeChange", _afterDataTypeChange);
		request.setAttribute("alloy:io-request:afterDestroy", _afterDestroy);
		request.setAttribute("alloy:io-request:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("alloy:io-request:afterFormChange", _afterFormChange);
		request.setAttribute("alloy:io-request:afterHeadersChange", _afterHeadersChange);
		request.setAttribute("alloy:io-request:afterHostChange", _afterHostChange);
		request.setAttribute("alloy:io-request:afterInit", _afterInit);
		request.setAttribute("alloy:io-request:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("alloy:io-request:afterMethodChange", _afterMethodChange);
		request.setAttribute("alloy:io-request:afterResponseDataChange", _afterResponseDataChange);
		request.setAttribute("alloy:io-request:afterSelectorChange", _afterSelectorChange);
		request.setAttribute("alloy:io-request:afterSyncChange", _afterSyncChange);
		request.setAttribute("alloy:io-request:afterTimeoutChange", _afterTimeoutChange);
		request.setAttribute("alloy:io-request:afterTransactionChange", _afterTransactionChange);
		request.setAttribute("alloy:io-request:afterUriChange", _afterUriChange);
		request.setAttribute("alloy:io-request:afterXdrChange", _afterXdrChange);
		request.setAttribute("alloy:io-request:onActiveChange", _onActiveChange);
		request.setAttribute("alloy:io-request:onArgumentsChange", _onArgumentsChange);
		request.setAttribute("alloy:io-request:onAutoLoadChange", _onAutoLoadChange);
		request.setAttribute("alloy:io-request:onCacheChange", _onCacheChange);
		request.setAttribute("alloy:io-request:onCfgChange", _onCfgChange);
		request.setAttribute("alloy:io-request:onContextChange", _onContextChange);
		request.setAttribute("alloy:io-request:onDataChange", _onDataChange);
		request.setAttribute("alloy:io-request:onDataTypeChange", _onDataTypeChange);
		request.setAttribute("alloy:io-request:onDestroy", _onDestroy);
		request.setAttribute("alloy:io-request:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("alloy:io-request:onFormChange", _onFormChange);
		request.setAttribute("alloy:io-request:onHeadersChange", _onHeadersChange);
		request.setAttribute("alloy:io-request:onHostChange", _onHostChange);
		request.setAttribute("alloy:io-request:onInit", _onInit);
		request.setAttribute("alloy:io-request:onInitializedChange", _onInitializedChange);
		request.setAttribute("alloy:io-request:onMethodChange", _onMethodChange);
		request.setAttribute("alloy:io-request:onResponseDataChange", _onResponseDataChange);
		request.setAttribute("alloy:io-request:onSelectorChange", _onSelectorChange);
		request.setAttribute("alloy:io-request:onSyncChange", _onSyncChange);
		request.setAttribute("alloy:io-request:onTimeoutChange", _onTimeoutChange);
		request.setAttribute("alloy:io-request:onTransactionChange", _onTransactionChange);
		request.setAttribute("alloy:io-request:onUriChange", _onUriChange);
		request.setAttribute("alloy:io-request:onXdrChange", _onXdrChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:io-request:";

	private static final String _PAGE =
		"/html/taglib/alloy/io_request/page.jsp";

	private boolean _active = false;
	private java.lang.Object _arguments = null;
	private boolean _autoLoad = true;
	private boolean _cache = true;
	private java.lang.String _cfg = null;
	private java.lang.Object _context = null;
	private java.lang.Object _data = null;
	private java.lang.String _dataType = null;
	private boolean _destroyed = false;
	private java.lang.Object _form = null;
	private java.lang.Object _headers = null;
	private java.lang.Object _host = null;
	private boolean _initialized = false;
	private java.lang.String _method = null;
	private java.lang.Object _responseData = null;
	private java.lang.String _selector = null;
	private boolean _sync = false;
	private java.lang.Object _timeout = 0;
	private java.lang.Object _transaction = null;
	private java.lang.String _uri = null;
	private java.lang.Object _xdr = null;
	private java.lang.Object _afterActiveChange = null;
	private java.lang.Object _afterArgumentsChange = null;
	private java.lang.Object _afterAutoLoadChange = null;
	private java.lang.Object _afterCacheChange = null;
	private java.lang.Object _afterCfgChange = null;
	private java.lang.Object _afterContextChange = null;
	private java.lang.Object _afterDataChange = null;
	private java.lang.Object _afterDataTypeChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterFormChange = null;
	private java.lang.Object _afterHeadersChange = null;
	private java.lang.Object _afterHostChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterMethodChange = null;
	private java.lang.Object _afterResponseDataChange = null;
	private java.lang.Object _afterSelectorChange = null;
	private java.lang.Object _afterSyncChange = null;
	private java.lang.Object _afterTimeoutChange = null;
	private java.lang.Object _afterTransactionChange = null;
	private java.lang.Object _afterUriChange = null;
	private java.lang.Object _afterXdrChange = null;
	private java.lang.Object _onActiveChange = null;
	private java.lang.Object _onArgumentsChange = null;
	private java.lang.Object _onAutoLoadChange = null;
	private java.lang.Object _onCacheChange = null;
	private java.lang.Object _onCfgChange = null;
	private java.lang.Object _onContextChange = null;
	private java.lang.Object _onDataChange = null;
	private java.lang.Object _onDataTypeChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onFormChange = null;
	private java.lang.Object _onHeadersChange = null;
	private java.lang.Object _onHostChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onMethodChange = null;
	private java.lang.Object _onResponseDataChange = null;
	private java.lang.Object _onSelectorChange = null;
	private java.lang.Object _onSyncChange = null;
	private java.lang.Object _onTimeoutChange = null;
	private java.lang.Object _onTransactionChange = null;
	private java.lang.Object _onUriChange = null;
	private java.lang.Object _onXdrChange = null;

}