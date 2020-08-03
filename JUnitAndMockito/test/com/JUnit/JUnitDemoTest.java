package com.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitDemoTest {

	@Test
	void test() {
		JUnitDemo j=new JUnitDemo();
		assertEquals(j.dude("Hello"), "Hello");
	}

	
	@Test
	void test1() {
		JUnitDemo j=new JUnitDemo();
		
		Exception exception = assertThrows(RuntimeException.class, () -> {
	        j.dude(null);
	    });
	 
	    String actualMessage = exception.getMessage();
	    System.out.println(actualMessage);
	 
//	    assertTrue(actualMessage.contains("RunTime"));
	}
	
}
