<%--
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

@generated
--%>

<%@ include file="/html/taglib/taglib-init.jsp" %>

<%
java.lang.String test = GetterUtil.getString((java.lang.String)request.getAttribute("liferay:test:test"));
boolean attrBooleanPrimitive = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay:test:attrBooleanPrimitive")));
java.lang.Boolean attrBoolean = GetterUtil.getBoolean((java.lang.Boolean)request.getAttribute("liferay:test:attrBoolean"));
int attrIntPrimitive = GetterUtil.getInteger(String.valueOf(request.getAttribute("liferay:test:attrIntPrimitive")));
java.lang.Integer attrInteger = GetterUtil.getInteger(String.valueOf(request.getAttribute("liferay:test:attrInteger")));
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("liferay:test:dynamicAttributes");
%>

<%@ include file="/html/taglib/liferay/test/init-ext.jspf" %>