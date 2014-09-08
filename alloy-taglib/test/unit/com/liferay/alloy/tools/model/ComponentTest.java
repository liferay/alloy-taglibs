package com.liferay.alloy.tools.model;

import org.junit.Assert;
import org.junit.Test;
public class ComponentTest {

	@Test
	public void testGetUncamelizedName() {
		Component component = new Component();
		component.setName("IORequest");

		Assert.assertEquals("io-request", component.getUncamelizedName());
	}

}