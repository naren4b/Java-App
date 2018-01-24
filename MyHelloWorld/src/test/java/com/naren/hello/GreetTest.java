package com.naren.hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetTest {

	Greet greet;

	@Before
	public void setUp() throws Exception {
		greet = new Greet();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Hello Junit !", greet.sayHello("Junit"));
	}

}
