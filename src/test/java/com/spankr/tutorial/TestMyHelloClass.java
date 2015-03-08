package com.spankr.tutorial;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class TestMyHelloClass {
	
	private MyHelloClass testObj;
	
	@Before
	public void setup() {
		System.out.println("setup()");
		testObj = new MyHelloClass();
		testObj.timeService = Mockito.mock(TimeService.class);
		Mockito.when(testObj.timeService.getTime()).thenReturn("The time is now!");
	}
	
	@Test
	public void checkGreetingForBob() {
		System.out.println("checkGreetingForBob");
		Assert.assertEquals("Hello, Bob", testObj.helloWorld("Bob"));
	}

	@Test
	public void checkGreetingForTom() {
		System.out.println("checkGreetingForTom");
		Assert.assertEquals("Hello, Tom", testObj.helloWorld("Tom"));
	}

	@Test
	public void checkMyTime() {
		System.out.println("checkMyTime");
		Assert.assertEquals("The time is now!", testObj.getMyTime());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void checkMyExceptionalMethod() {
		testObj.thisThrowsAnException();
		Assert.fail("Should not get here.");
	}
}
