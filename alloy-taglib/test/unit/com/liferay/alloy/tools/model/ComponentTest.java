package com.liferay.alloy.tools.model;

import static org.junit.Assert.*;

import org.junit.Test;
public class ComponentTest {

	@Test
	public void testGetUncamelizedName() {
		Component component = new Component();
		component.setName("IORequest");

		assertEquals("io-request", component.getUncamelizedName());
	}

}