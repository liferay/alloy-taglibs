<#include "init.ftl">
<#include "copyright.ftl">

<#if component.isComponentTaglibOSGIModule() == true>
package ${packagePath}.taglib.base;

import ${packagePath?keep_before_last(".servlet")}.internal.servlet.ServletContextUtil;

<#else>
package ${packagePath}.${component.getPackage()}.base;

</#if>
<#if component.getWriteJSP() == true>
import javax.servlet.http.HttpServletRequest;
</#if>
import javax.servlet.jsp.JspException;
<#if component.isComponentTaglibOSGIModule() == true>
import javax.servlet.jsp.PageContext;
</#if>

/**
<#list component.getAuthors() as author>
 * @author ${author}
</#list>
 * @generated
 */
public abstract class Base${component.getClassName()} extends ${component.getParentClass()} {

	<#if typeUtil.hasMethod(component.getParentClass(), "doStartTag", []) == true>
	@Override
	</#if>
	public int doStartTag() throws JspException {
		<#if typeUtil.hasMethod(component.getParentClass(), "setAttributeNamespace", ["java.lang.String"]) == true>
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		</#if>
		return super.doStartTag();
	}

	<#list component.getAttributesAndEvents() as attribute>
	<#if attribute.isGettable()>
	<#if typeUtil.hasMethod(component.getParentClass(), "get" + attribute.getCapitalizedName(), []) == true>
	@Override
	</#if>
	public ${attribute.getRawInputType()} get${attribute.getCapitalizedName()}() {
		return _${attribute.getSafeName()};
	}

	</#if>
	</#list>
	<#list component.getAttributesAndEvents() as attribute>
	<#if attribute.isSettable()>
	<#if typeUtil.hasMethod(component.getParentClass(), "set" + attribute.getCapitalizedName(), [attribute.getRawInputType()]) == true>
	@Override
	</#if>
	public void set${attribute.getCapitalizedName()}(${attribute.getRawInputType()} ${attribute.getSafeName()}) {
		_${attribute.getSafeName()} = ${attribute.getSafeName()};
		<#if component.isAlloyComponent() && typeUtil.hasMethod(component.getParentClass(), "setScopedAttribute", ["java.lang.String", "java.lang.Object"]) == true>

		setScopedAttribute("${attribute.getSafeName()}", ${attribute.getSafeName()});
		</#if>
	}

	</#if>
	</#list>
	<#if component.isComponentTaglibOSGIModule() == true>
	<#if typeUtil.hasMethod(component.getParentClass(), "setPageContext", ["javax.servlet.jsp.PageContext"]) == true>
	@Override
	</#if>
	public void setPageContext(PageContext pageContext) {
	<#if typeUtil.hasMethod(component.getParentClass(), "setPageContext", ["javax.servlet.jsp.PageContext"]) == true>
		super.setPageContext(pageContext);

	</#if>
		setServletContext(ServletContextUtil.getServletContext());
	}

	</#if>
	<#if typeUtil.hasMethod(component.getParentClass(), "cleanUp", []) == true>
	@Override
	</#if>
	protected void cleanUp() {
	<#if typeUtil.hasMethod(component.getParentClass(), "cleanUp", []) == true>
		super.cleanUp();

	</#if>
	<#list component.getAttributesAndEvents() as attribute>
		<#compress>
		<#assign outputSimpleClassName = attribute.getOutputTypeSimpleClassName()>

		<#assign defaultValue = "">

		<#if attribute.getDefaultValue()??>
			<#assign defaultValue = attribute.getDefaultValue()>
		</#if>
		
		<#assign defaultValue = getCleanUpValue(outputSimpleClassName, defaultValue)>
		
		</#compress>
		<#if attribute.isGettable() || attribute.isSettable()>
		_${attribute.getSafeName()} = ${defaultValue};
		</#if>
	</#list>
	}

	<#if component.isBodyContent() == true>
	<#if component.getWriteEndJSP() == true>
	<#if typeUtil.hasMethod(component.getParentClass(), "getEndPage", []) == true>
	@Override
	</#if>
	protected String getEndPage() {
		return _END_PAGE;
	}

	</#if>
	<#if component.getWriteStartJSP() == true>
	<#if typeUtil.hasMethod(component.getParentClass(), "getStartPage", []) == true>
	@Override
	</#if>
	protected String getStartPage() {
		return _START_PAGE;
	}

	</#if>
	<#else>
	<#if typeUtil.hasMethod(component.getParentClass(), "getPage", []) == true>
	@Override
	</#if>
	protected String getPage() {
		return _PAGE;
	}

	</#if>
	<#if component.getWriteJSP() == true>
	<#if typeUtil.hasMethod(component.getParentClass(), "setAttributes", ["javax.servlet.http.HttpServletRequest"]) == true>
	@Override
	</#if>
	protected void setAttributes(HttpServletRequest request) {
		<#list component.getAttributesAndEvents() as attribute>
		<#if typeUtil.hasMethod(component.getParentClass(), "setNamespacedAttribute", ["javax.servlet.http.HttpServletRequest", "java.lang.String", "java.lang.Object"]) == true>
			<#assign outputSimpleClassName = attribute.getOutputTypeSimpleClassName()>
			<#if outputSimpleClassName == "boolean" || isNumericPrimitiveType(outputSimpleClassName)>
		request.setAttribute("${namespace}${attribute.getName()}", String.valueOf(_${attribute.getSafeName()}));
			<#else>
		request.setAttribute("${namespace}${attribute.getName()}", _${attribute.getSafeName()});
			</#if>
		<#else>
		request.setAttribute("${attribute.getName()}", _${attribute.getSafeName()});
		</#if>
		</#list>
	}

	</#if>
	<#if typeUtil.hasMethod(component.getParentClass(), "setNamespacedAttribute", ["javax.servlet.http.HttpServletRequest", "java.lang.String", "java.lang.Object"]) == true>
	protected static final String _ATTRIBUTE_NAMESPACE = "${namespace}";

	</#if>
	<#if component.isBodyContent() == true>
	<#if component.getWriteEndJSP() == true>
	private static final String _END_PAGE =
		"${jspRelativePath}/end.jsp";

	</#if>
	<#if component.getWriteStartJSP() == true>
	private static final String _START_PAGE =
		"${jspRelativePath}/start.jsp";

	</#if>
	<#else>
	private static final String _PAGE =
		"${jspRelativePath}/page.jsp";

	</#if>
	<#list component.getAttributesAndEvents() as attribute>
	<#compress>
	<#assign outputSimpleClassName = attribute.getOutputTypeSimpleClassName()>

	<#assign defaultValue = "">

	<#if attribute.getDefaultValue()??>
		<#assign defaultValue = attribute.getDefaultValue()>
	</#if>
	
	<#assign defaultValue = getCleanUpValue(outputSimpleClassName, defaultValue)>
	
	</#compress>
	<#if attribute.isGettable() || attribute.isSettable()>
	private ${attribute.getRawInputType()} _${attribute.getSafeName()} = ${defaultValue};
	</#if>
	</#list>

}