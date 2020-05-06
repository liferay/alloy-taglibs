package com.liferay.alloy.util;

import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.util.PropsImpl;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
public class TypeUtilTest {

	abstract class ParentClass {

		public void parentMethod(String param) {
		}

	}

	class ChildClass extends ParentClass {
		public void childMethod(String param) {
		}
	}

	@Test
	public void testGetGenericsType() {
		String actualGenericsType = "?";
		String expectedGenericsType = TypeUtil.getGenericsType(
			"java.util.List<?>");

		Assert.assertEquals(actualGenericsType, expectedGenericsType);

		actualGenericsType = "java.lang.String, java.lang.Object";
		expectedGenericsType = TypeUtil.getGenericsType(
			"java.util.Map<java.lang.String, java.lang.Object>");

		Assert.assertEquals(actualGenericsType, expectedGenericsType);

		actualGenericsType =
			"java.util.Map<java.lang.String, java.lang.Object>";
		expectedGenericsType = TypeUtil.getGenericsType(
			"java.util.List<java.util.Map<java.lang.String, " +
				"java.lang.Object>>");

		Assert.assertEquals(actualGenericsType, expectedGenericsType);

		actualGenericsType = null;
		expectedGenericsType = TypeUtil.getGenericsType("long");

		Assert.assertEquals(actualGenericsType, expectedGenericsType);
	}

	@Test
	public void testHasInheritedMethod() {
		boolean actual = TypeUtil.hasMethod(
			ChildClass.class.getName(), "parentMethod",
			new String[] { "java.lang.String" });

		Assert.assertTrue(actual);

		actual = TypeUtil.hasMethod(
			ChildClass.class.getName(), "childMethod",
			new String[] { "java.lang.String" });

		Assert.assertTrue(actual);
	}

	@Test
	public void testHasMethod1() {
		abstract class ArrayListExt extends ArrayList<String> {

			private static final long serialVersionUID = 1L;

			public void add(int index, Class<?>[] classes) {
			}
		}

		boolean actual = TypeUtil.hasMethod(
			ArrayListExt.class.getName(), "add",
			new String[] { "int", "java.lang.Object" });

		Assert.assertTrue(actual);

		actual = TypeUtil.hasMethod(
			ArrayListExt.class.getName(), "add",
			new String[] { "int", "java.lang.Class<?>[]" });

		Assert.assertTrue(actual);

		actual = TypeUtil.hasMethod(
			ArrayListExt.class.getName(), "xyz",
			new String[] { "int", "boolean" });

		Assert.assertFalse(actual);

		actual = TypeUtil.hasMethod(
			ArrayListExt.class.getName(), "add",
			new String[] { "foo", "bar" });

		Assert.assertFalse(actual);
	}
	
	@Test
	public void testHasMethod2() {
		PropsUtil.setProps(new PropsImpl());

		Assert.assertTrue(TypeUtil.hasMethod(
			"com.liferay.taglib.util.IncludeTag",
			"setNamespacedAttribute",
			new String[] {
				"javax.servlet.http.HttpServletRequest",
				"java.lang.String", "java.lang.Object"}
		));
	}

	@Test
	public void testIsJavaClass() {
		Assert.assertTrue(TypeUtil.isJavaClass(String.class.getName()));

		Assert.assertTrue(TypeUtil.isJavaClass("boolean"));

		Assert.assertTrue(TypeUtil.isJavaClass("java.lang.String[]"));

		Assert.assertTrue(TypeUtil.isJavaClass("java.lang.Class<?>[]"));

		Assert.assertTrue(
			TypeUtil.isJavaClass(
				"java.util.Map<java.lang.String, java.lang.Object>"));

		Assert.assertTrue(
			TypeUtil.isJavaClass(
				"java.util.List<java.util.Map<java.lang.String, " +
					"java.lang.Object>>"));

		Assert.assertFalse(TypeUtil.isJavaClass("foobar"));
	}

	@Test
	public void testRemoveArrayNotation() {
		String actualTypeWithoutArrayNotation = "java.lang.String";

		String expectedTypeWithoutArrayNotation = TypeUtil.removeArrayNotation(
			"java.lang.String[]");

		Assert.assertEquals(
			actualTypeWithoutArrayNotation, expectedTypeWithoutArrayNotation);
	}

	@Test
	public void testRemoveGenericsType() {
		String actualTypeWithoutGenerics = "java.util.List";
		String expectedTypeWithoutGenerics = TypeUtil.removeGenericsType(
			"java.util.List<String>");

		Assert.assertEquals(
			actualTypeWithoutGenerics, expectedTypeWithoutGenerics);

		actualTypeWithoutGenerics = "java.util.Map";
		expectedTypeWithoutGenerics = TypeUtil.removeGenericsType(
			"java.util.Map<String, Integer>");

		Assert.assertEquals(
			actualTypeWithoutGenerics, expectedTypeWithoutGenerics);

		actualTypeWithoutGenerics = "java.util.List";
		expectedTypeWithoutGenerics = TypeUtil.removeGenericsType(
			"java.util.List<java.util.Map<java.lang.String, " +
				"java.lang.Object>>");

		Assert.assertEquals(
			actualTypeWithoutGenerics, expectedTypeWithoutGenerics);
	}

}