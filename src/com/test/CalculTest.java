package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculTest {
	
	/**
	 * 
	 */
	private static Calcul addition = null;
	
	
	
	/**
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addition = new Calcul();
	}

	/**
	 * 
	 */
	@Test
	public void test() {
		assertTrue(addition.add(5,5) == 10);
	}
	
	/**
	 * 
	 */
	@Test
	public void testFail() {
		assertTrue(addition.add(5,5) == 30);
		//fail("Not yet implemented");
	}	

}
