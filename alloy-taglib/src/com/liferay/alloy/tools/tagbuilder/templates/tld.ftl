<?xml version="1.0" encoding="UTF-8"?>

<taglib
	version="2.0"
	xmlns="http://java.sun.com/xml/ns/j2ee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd"
>
	<#if description?? && description?has_content>
	<description><![CDATA[${description}]]></description>
	</#if>
	<tlib-version>${version}</tlib-version>
	<short-name>${shortName}</short-name>
	<uri>${uri}</uri>
<#list components as component>
	<tag>
		<#if component.getDescription()??>
		<description><![CDATA[${component.getDescription()}]]></description>
		</#if>
		<name>${component.getUncamelizedName()}</name>
		<#if component.isComponentTaglibOSGIModule() == true>
		<tag-class>${packagePath}.taglib.${component.getClassName()}</tag-class>
		<#else>
		<tag-class>${packagePath}.${component.getPackage()}.${component.getClassName()}</tag-class>
		</#if>
		<body-content>JSP</body-content>
		<#list component.getAttributesAndEvents() as attribute>
		<attribute>
			<#if attribute.getDescription()??>
			<description><![CDATA[${attribute.getDescription()}]]></description>
			</#if>
			<name>${attribute.getSafeName()}</name>
			<required>${attribute.isRequired()?string("true", "false")}</required>
			<rtexprvalue>true</rtexprvalue>
			<#if !attribute.isDefaultInputType()>
			<type>${attribute.getInputType()}</type>
			</#if>
		</attribute>
		</#list>
		<#if component.isDynamicAttributes()>
		<dynamic-attributes>true</dynamic-attributes>
		</#if>
	</tag>
</#list>
</taglib>