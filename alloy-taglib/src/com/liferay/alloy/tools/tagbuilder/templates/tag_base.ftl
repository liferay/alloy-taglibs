<#include "init.ftl">
<#include "copyright.ftl">

package ${packagePath}.${component.getPackage()}.base;

<#if component.getWriteJSP() == true>
import javax.servlet.http.HttpServletRequest;
</#if>
import javax.servlet.jsp.JspException;

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
		<#if typeUtil.hasMethod(component.getParentClass(), "setScopedAttribute", ["java.lang.String", "java.lang.Object"]) == true>

		setScopedAttribute("${attribute.getSafeName()}", ${attribute.getSafeName()});
		</#if>
	}

	</#if>
	</#list>
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
	<#if typeUtil.hasMethod(component.getParentClass(), "getEndPage", []) == true>
	@Override
	</#if>
	protected String getEndPage() {
		return _END_PAGE;
	}

	<#if typeUtil.hasMethod(component.getParentClass(), "getStartPage", []) == true>
	@Override
	</#if>
	protected String getStartPage() {
		return _START_PAGE;
	}
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
		setNamespacedAttribute(request, "${attribute.getSafeName()}", _${attribute.getSafeName()});
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
	private static final String _END_PAGE =
		"${jspRelativePath}/end.jsp";

	private static final String _START_PAGE =
		"${jspRelativePath}/start.jsp";
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