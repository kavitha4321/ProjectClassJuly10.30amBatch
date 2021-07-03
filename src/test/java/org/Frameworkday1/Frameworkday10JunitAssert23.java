package org.Frameworkday1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.Assert;

public class Frameworkday10JunitAssert23 {
	
	@Test
	
	public void test9() {
		
	
System.out.println("test9");
	}
	
	@Ignore
	@Test
	public void test10() {
		System.out.println("Test10");

	}
	
	@Test
	public void test11() {
	System.out.println("test11");
	
	}

	@Test
	public void test12() {
	System.out.println("test12");
	Assert.assertTrue(false);
	}
	
	
	
	
	

}
