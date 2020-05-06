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

package com.liferay.alloy.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.ClassUtils;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 */
public class TypeUtil {

	public static final String ARRAY_NOTATION = "[]";

	public static final String[] ARRAYS = {"array", "[]"};

	public static final String BOOLEAN = "boolean";

	public static final String[] BOOLEANS = {"boolean", "bool"};

	public static final String DOUBLE = "double";

	public static final String[] DOUBLES = {"double"};

	public static final String FLOAT = "float";

	public static final String[] FLOATS = {"float"};

	public static final String INT = "int";

	public static final String[] INTEGERS = {"integer", "int", "int | string"};

	public static final String LONG = "long";

	public static final String[] LONGS = {"long"};

	public static final String[] NUMBERS = {"num", "number"};

	public static final String[] OBJECTS = {"object", "{}"};

	public static final String SHORT = "short";

	public static final String[] SHORTS = {"short"};

	public static final String[] STRINGS = {
		"node | string", "string", "string | node", "string | int"
	};

	public static String getGenericsType(String type) {
		return _instance._getGenericsType(type);
	}

	public static String getInputJavaType(
		String type, boolean removeGenericsType) {

		return _instance._getInputJavaType(type, removeGenericsType);
	}

	public static TypeUtil getInstance() {
		return _instance;
	}

	public static String getOutputJavaType(
		String type, boolean removeGenericsType) {

		return _instance._getOutputJavaType(type, removeGenericsType);
	}

	public static boolean hasMethod(
		String className, String methodName, String[] paramTypes) {

		return _instance._hasMethod(className, methodName, paramTypes);
	}

	public static boolean isJavaClass(String className) {
		return _instance._isJavaClass(className);
	}

	public static boolean isJavaType(String type) {
		return _instance._isJavaType(type);
	}

	public static boolean isPrimitiveJavaType(String type) {
		return (TypeUtil.BOOLEAN.equals(type) || TypeUtil.DOUBLE.equals(type) ||
				TypeUtil.FLOAT.equals(type) || TypeUtil.INT.equals(type) ||
				TypeUtil.LONG.equals(type) || TypeUtil.SHORT.equals(type));
	}

	public static String removeArrayNotation(String type) {
		return _instance._removeArrayNotation(type);
	}

	public static String removeGenericsType(String type) {
		return _instance._removeGenericsType(type);
	}

	private TypeUtil() {
		_INPUT_TYPES = new HashMap<String, String>();
		_OUTPUT_TYPES = new HashMap<String, String>();

		_registerTypes(_INPUT_TYPES, ARRAYS, Object.class.getName());
		_registerTypes(_INPUT_TYPES, BOOLEANS, boolean.class.getName());
		_registerTypes(_INPUT_TYPES, FLOATS, float.class.getName());
		_registerTypes(_INPUT_TYPES, INTEGERS, int.class.getName());
		_registerTypes(_INPUT_TYPES, DOUBLES, double.class.getName());
		_registerTypes(_INPUT_TYPES, LONGS, long.class.getName());
		_registerTypes(_INPUT_TYPES, SHORTS, short.class.getName());
		_registerTypes(_INPUT_TYPES, NUMBERS, Object.class.getName());
		_registerTypes(_INPUT_TYPES, OBJECTS, Object.class.getName());
		_registerTypes(_INPUT_TYPES, STRINGS, String.class.getName());

		_registerTypes(_OUTPUT_TYPES, ARRAYS, ArrayList.class.getName());
		_registerTypes(_OUTPUT_TYPES, BOOLEANS, boolean.class.getName());
		_registerTypes(_OUTPUT_TYPES, FLOATS, float.class.getName());
		_registerTypes(_OUTPUT_TYPES, INTEGERS, int.class.getName());
		_registerTypes(_OUTPUT_TYPES, DOUBLES, double.class.getName());
		_registerTypes(_OUTPUT_TYPES, LONGS, long.class.getName());
		_registerTypes(_OUTPUT_TYPES, SHORTS, short.class.getName());
		_registerTypes(_OUTPUT_TYPES, NUMBERS, Number.class.getName());
		_registerTypes(_OUTPUT_TYPES, OBJECTS, HashMap.class.getName());
		_registerTypes(_OUTPUT_TYPES, STRINGS, String.class.getName());
	}

	private Class<?> _getClass(String className) {
		Class<?> clazz = null;

		try {
			clazz = ClassUtils.getClass(className);
		}
		catch (ClassNotFoundException cnfe) {
			if (_isJavaClass(className)) {
				String genericsType = _getGenericsType(className);

				if (Validator.isNotNull(genericsType)) {
					className = _removeGenericsType(className);

					return _getClass(className);
				}
			}
			else {
				_log.debug(cnfe);
			}
		}

		return clazz;
	}

	private String _getGenericsType(String type) {
		int begin = type.indexOf(CharPool.LESS_THAN);
		int end = type.lastIndexOf(CharPool.GREATER_THAN);
		String genericsType = null;

		if ((begin > -1) && (end > -1)) {
			genericsType = type.substring(begin + 1, end);
		}

		return genericsType;
	}

	private List<String> _getGenericsTypes(String genericsType) {
		List<String> genericsTypes = new ArrayList<>();

		int x = -1;
		int y = 0;

		while (true) {
			x = genericsType.indexOf(CharPool.COMMA, x + 1);

			if (x == -1) {
				genericsTypes.add(StringUtil.trim(genericsType.substring(y)));

				return genericsTypes;
			}

			String s = genericsType.substring(y, x);

			if (StringUtil.count(s, CharPool.LESS_THAN) ==
					StringUtil.count(s, CharPool.GREATER_THAN)) {

				genericsTypes.add(StringUtil.trim(s));

				y = x + 1;
			}
		}
	}

	private String _getInputJavaType(String type, boolean removeGenericsType) {
		if (removeGenericsType) {
			type = _removeGenericsType(type);
		}

		if (_isJavaClass(type)) {
			return type;
		}

		String javaType = _INPUT_TYPES.get(StringUtil.toLowerCase(type));

		if (Validator.isNull(javaType)) {
			javaType = Object.class.getName();
		}

		return javaType;
	}

	private String _getOutputJavaType(String type, boolean removeGenericsType) {
		if (removeGenericsType) {
			type = _removeGenericsType(type);
		}

		if (_isJavaClass(type)) {
			return type;
		}

		String javaType = _OUTPUT_TYPES.get(StringUtil.toLowerCase(type));

		if (Validator.isNull(javaType)) {
			javaType = Object.class.getName();
		}

		return javaType;
	}

	private boolean _hasMethod(
		String className, String methodName, String[] paramTypes) {

		Class<?> javaClass = _getClass(className);

		if (javaClass == null) {
			return false;
		}

		Class<?> superClass = javaClass.getSuperclass();

		while (superClass != null) {
			boolean superClassHasMethod = _hasMethod(
				superClass.getName(), methodName, paramTypes);

			if (superClassHasMethod) {
				return true;
			}

			superClass = superClass.getSuperclass();
		}

		Class<?>[] parameterTypes = new Class<?>[paramTypes.length];

		for (int i = 0; i < paramTypes.length; i++) {
			Class<?> paramType = _getClass(paramTypes[i]);

			if (paramType == null) {
				return false;
			}

			parameterTypes[i] = paramType;
		}

		Method method = null;

		try {
			method = javaClass.getDeclaredMethod(methodName, parameterTypes);
		}
		catch (NoSuchMethodException e) {
			//System.out.println(e.getMessage());
		}

		return method != null;
	}

	private boolean _isJavaClass(String className) {
		if (isPrimitiveJavaType(className) || _isJavaType(className)) {
			return true;
		}
		else {
			return false;
		}
	}

	private boolean _isJavaType(String type) {
		try {
			String genericsType = _getGenericsType(type);

			if (Validator.isNotNull(genericsType)) {
				List<String> genericsTypes = _getGenericsTypes(genericsType);

				for (String curType : genericsTypes) {
					if (!curType.equals(StringPool.QUESTION) &&
						!_isJavaType(curType)) {

						return false;
					}
				}

				type = _removeGenericsType(type);
			}

			Class.forName(_removeArrayNotation(type));

			return true;
		}
		catch (ClassNotFoundException e) {
			return false;
		}
	}

	private void _registerTypes(
		HashMap<String, String> map, String[] types, String javaType) {

		for (String type : types) {
			map.put(StringUtil.toLowerCase(type), javaType);
		}
	}

	private String _removeArrayNotation(String type) {
		return type.replace(ARRAY_NOTATION, StringPool.BLANK);
	}

	private String _removeGenericsType(String type) {
		String genericsType = _getGenericsType(type);

		if (Validator.isNotNull(genericsType)) {
			type = type.replace(
				StringPool.LESS_THAN.concat(
					genericsType).concat(StringPool.GREATER_THAN),
					StringPool.BLANK);
		}

		return type;
	}

	private static HashMap<String, String> _INPUT_TYPES = null;

	private static HashMap<String, String> _OUTPUT_TYPES = null;

	private static final Log _log = LogFactoryUtil.getLog(TypeUtil.class);

	private static TypeUtil _instance = new TypeUtil();

}