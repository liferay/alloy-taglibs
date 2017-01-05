<#include "copyright.ftl">

import ${packagePath?keep_before_last(".servlet")}.internal.servlet;

import com.liferay.portal.kernel.util.Validator;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
<#list taglibAuthors as taglibAuthor>
 * @author ${taglibAuthor}
</#list>
 * @generated
 */
@Component(immediate = true)
public class ServletContextUtil {

	public static final ServletContext getServletContext() {
		if (Validator.isNotNull(_instance)) {
			return _instance._getServletContext();
		}

		return null;
	}

	@Activate
	protected void activate() {
		_instance = this;
	}

	@Deactivate
	protected void deactivate() {
		_instance = null;
	}

	@Reference(
		target = "(osgi.web.symbolicname=${OSGIModuleSymbolicName})",
		unbind = "-"
	)
	protected void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	private ServletContext _getServletContext() {
		return _servletContext;
	}

	private static ServletContextUtil _instance;

	private ServletContext _servletContext;

}