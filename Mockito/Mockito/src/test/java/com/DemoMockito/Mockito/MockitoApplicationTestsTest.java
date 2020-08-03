package com.DemoMockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;

import com.JustInterface.JustInter;

class MockitoApplicationTestsTest {

	@Test
	void test() {
		
		
		JustInter j=mock(JustInter.class);
		
		when(j.demointer()).thenReturn("hi");
		assertEquals(j.demointer(), "hi");
	}

}
