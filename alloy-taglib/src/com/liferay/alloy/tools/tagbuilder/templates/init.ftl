<#assign BLANK = "">
<#assign LIFERAY_BLANK = "com.liferay.portal.kernel.util.StringPool.BLANK">
<#assign SPACE = " ">
<#assign COMMA = ",">
<#assign QUOTE = "\"">

<#function getCleanUpValue simpleClassName defaultValue>
	<#if simpleClassName == "boolean">
		<#assign defaultValueOutput = "false">
	<#elseif isNumericPrimitiveType(simpleClassName)>
		<#assign defaultValueOutput = "0">
	<#else>
		<#assign defaultValueOutput = "null">
	</#if>

	<#if (defaultValue?? && (defaultValue != BLANK) && useDefaultValue(simpleClassName))>
		<#if isQuoted(simpleClassName)>
			<#if ((simpleClassName == "String") && (defaultValue == LIFERAY_BLANK))>
				<#assign defaultValueOutput = defaultValue>
			<#else>
				<#assign defaultValueOutput = QUOTE + defaultValue + QUOTE>
			</#if>
		<#else>
			<#assign defaultValueOutput = defaultValue>
		</#if>
	</#if>

	<#return defaultValueOutput />
</#function>

<#function getDefaultValueSuffix outputSimpleClassName defaultValue>
	<#assign defaultValueSuffix = BLANK>

	<#if (defaultValue?? && (defaultValue != BLANK))>
		<#if ((outputSimpleClassName != "boolean") || (defaultValue != "false"))>
			<#if isQuoted(outputSimpleClassName)>
				<#if ((outputSimpleClassName == "String") && (defaultValue == LIFERAY_BLANK))>
					<#assign value = defaultValue>
				<#else>
					<#assign value = QUOTE + defaultValue + QUOTE>
				</#if>
			<#else>
				<#assign value = defaultValue>
			</#if>

			<#assign defaultValueSuffix = COMMA + SPACE + value>
		</#if>
	</#if>

	<#return defaultValueSuffix />
</#function>

<#function getGetterSuffix type>
	<#assign outputType = type>

	<#if (type == "int")>
		<#assign outputType = "Integer">
	</#if>
	
	<#return outputType?cap_first />
</#function>

<#function hasGetter simpleClassName>
	<#return (isPrimitiveType(simpleClassName) || (simpleClassName == "String") || (simpleClassName == "Integer") || (simpleClassName == "Boolean") || (simpleClassName == "Date") || (simpleClassName == "Double") || (simpleClassName == "Float") || (simpleClassName == "Long") || (simpleClassName == "Short") || (simpleClassName == "Number")) />
</#function>

<#function isNumericAttribute simpleClassName>
	<#return (isNumericPrimitiveType(simpleClassName) || (simpleClassName == "Number") || (simpleClassName == "Integer") || (simpleClassName == "Float") || (simpleClassName == "Double") || (simpleClassName == "Long") || (simpleClassName == "Short")) />
</#function>

<#function isNumericPrimitiveType simpleClassName>
	<#return ((simpleClassName == "double") || (simpleClassName == "float") || (simpleClassName == "int") || (simpleClassName == "long") || (simpleClassName == "double")) />
</#function>

<#function isPrimitiveType simpleClassName>
	<#return ((simpleClassName == "boolean") || isNumericPrimitiveType(simpleClassName)) />
</#function>

<#function isQuoted simpleClassName>
	<#return ((simpleClassName == "String") || (simpleClassName == "ArrayList") || (simpleClassName == "HashMap")) />
</#function>

<#function useDefaultValue simpleClassName>
	<#return (isPrimitiveType(simpleClassName) || (simpleClassName == "String") || (simpleClassName == "Integer") || (simpleClassName == "Boolean") || (simpleClassName == "Double") || (simpleClassName == "Float") || (simpleClassName == "Long") || (simpleClassName == "Short") || (simpleClassName == "Number") || (simpleClassName == "List") || (simpleClassName == "Map")) />
</#function>