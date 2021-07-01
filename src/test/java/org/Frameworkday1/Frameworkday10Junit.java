package org.Frameworkday1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Frameworkday10Junit {

	
//@BeforeClass
//	public static void beforeClass() {
//	System.out.println("Before Class");
//
//	}
//	
//	@AfterClass
//public static void afterClass() {
//		System.out.println("AfterClass");
//	}
//	
//	@After
//	public void after() {
//		System.out.println("after method");
//	}
//	
//	@Before
//	public void before() {
//	System.out.println("Before Method");
//
//	}
	
	@Test
	public void test1() {
	System.out.println("test1");

	}
	
	@Ignore
	@Test
	public void test4() {
		System.out.println("Test4");

	}
	
	@Test
	public void test2() {
	System.out.println("test2");
	
	}

	@Test
	public void test3() {
	System.out.println("test3");
	}
	
	
	
	
	

}
