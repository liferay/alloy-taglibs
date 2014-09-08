/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.alloy.util.json;

import java.util.Collections;
import java.util.List;

import com.liferay.portal.json.JoddJSONContext;
import com.liferay.portal.kernel.json.JSONContext;
import com.liferay.portal.kernel.json.JSONTransformer;

import jodd.json.JsonContext;
import jodd.json.JsonValueContext;
import jodd.json.Path;

/**
 * <a href="StringTransformer.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 */
public class StringTransformer implements JSONTransformer {

	public List<String> getJavaScriptAttributes() {
		return _javaScriptAttributes;
	}

	public boolean isEventPath(Path path) {
		String parentPath = path.toString();

		if (path.length() > 1) {
			parentPath = path.get(path.length() - 2);
		}

		if (parentPath.equals(_ON) || parentPath.equals(_AFTER)) {
			return true;
		}

		return false;
	}

	public boolean isJavaScriptAttribute(String key) {
		return _javaScriptAttributes.contains(key);
	}

	public void setJavaScriptAttributes(List<String> javaScriptAttributes) {
		_javaScriptAttributes = javaScriptAttributes;
	}

	@Override
	public void transform(JSONContext jsonContext, Object object) {
		JsonContext joddJsonContext = ((JoddJSONContext)jsonContext).getImplementation();

		Path path = joddJsonContext.getPath();

		JsonValueContext typeContext = joddJsonContext.peekValueContext();

		if (typeContext != null) {
			String propertyName = typeContext.getPropertyName();

			if (isEventPath(path) || isJavaScriptAttribute(propertyName)) {

				joddJsonContext.write((String) object);

				return;
			}
		}

		joddJsonContext.writeString((String) object);
	}

	private static final String _AFTER = "after";

	private static final String _ON = "on";

	private List<String> _javaScriptAttributes = Collections.EMPTY_LIST;

}