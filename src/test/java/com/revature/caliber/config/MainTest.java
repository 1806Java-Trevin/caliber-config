package com.revature.caliber.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		assertEquals("This is a passing test", "Test", SpringCloudConfigServerApplication.getTest());
	}
}
