<%--
<#include "copyright.ftl">

@generated
--%>

<#include "init.ftl">
<#compress>
<#function isValidAttribute attribute>
	<#assign attributeName = attribute.getName()>

	<#return (attribute.getWriteInJSP() && (attributeName != "boundingBox") && (attributeName != "contentBox") && (attributeName != "srcNode")) />
</#function>
</#compress>
<%@ include file="${jspCommonInitPath}" %>

<%
<#compress>
<#list component.getAttributesAndEvents() as attribute>
	<#assign defaultValueSuffix = BLANK>
	<#assign outputSimpleClassName = attribute.getOutputTypeSimpleClassName()>

	<#if attribute.getDefaultValue()??>
		<#assign defaultValueSuffix = getDefaultValueSuffix(outputSimpleClassName, attribute.getDefaultValue())>
	</#if>

	<#if isValidAttribute(attribute)>
		<#assign namespacedName = QUOTE + namespace + attribute.getSafeName() + QUOTE>

		<#if (isPrimitiveType(outputSimpleClassName) || isNumericAttribute(outputSimpleClassName))>
			<#assign value = "String.valueOf(request.getAttribute(" + namespacedName + "))">
		<#else>
			<#assign value = "(" + attribute.getRawInputType() + ")request.getAttribute(" + namespacedName + ")">
		</#if>

		<#if outputSimpleClassName == "ArrayList">
			${attribute.getOutputType()} ${attribute.getSafeName()} = _toArrayList(GetterUtil.getObject(${value}${defaultValueSuffix}));
		<#elseif outputSimpleClassName == "HashMap">
			${attribute.getOutputType()} ${attribute.getSafeName()} = _toHashMap(GetterUtil.getObject(${value}${defaultValueSuffix}));
		<#elseif hasGetter(outputSimpleClassName)>
			${attribute.getOutputType()} ${attribute.getSafeName()} = GetterUtil.get${getGetterSuffix(outputSimpleClassName)}(${value}${defaultValueSuffix});
		<#else>
			${attribute.getRawOutputType()} ${attribute.getSafeName()} = (${attribute.getRawOutputType()})request.getAttribute(${namespacedName});
		</#if>
	</#if>
</#list>
</#compress>

Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("${namespace}dynamicAttributes");
%>

<#if component.isAlloyComponent()>
<%
Map<String, Object> scopedAttributes = (Map<String, Object>)request.getAttribute("${namespace}scopedAttributes");

Map<String, Object> _options = new HashMap<String, Object>();

if ((scopedAttributes != null) && !scopedAttributes.isEmpty()) {
	_options.putAll(scopedAttributes);
}

if ((dynamicAttributes != null) && !dynamicAttributes.isEmpty()) {
	_options.putAll(dynamicAttributes);
}
%>

<%@ include file="/html/taglib/aui/init-alloy.jspf" %>

<%
<#list component.getAttributesAndEvents() as attribute>
_updateOptions(_options, "${attribute.getSafeName()}", ${attribute.getSafeName()});
</#list>
%>

<%!
private static void _updateOptions(Map<String, Object> options, String key, Object value) {
	if ((options != null) && options.containsKey(key)) {
		options.put(key, value);
	}
}

private static final String _NAMESPACE = "${namespace}";
%>

</#if>
<%@ include file="${jspRelativePath}/init-ext.jspf" %>