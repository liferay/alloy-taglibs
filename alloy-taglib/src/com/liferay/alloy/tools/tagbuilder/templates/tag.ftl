<#include "copyright.ftl">

<#if component.isComponentTaglibOSGIModule() == true>
package ${packagePath}.taglib;

import ${packagePath}.taglib.base.Base${component.getClassName()};

<#else>
package ${packagePath}.${component.getPackage()};

import ${packagePath}.${component.getPackage()}.base.Base${component.getClassName()};

</#if>
/**
<#list component.getAuthors() as author>
 * @author ${author}
</#list>
 */
public class ${component.getClassName()} extends Base${component.getClassName()} {
}