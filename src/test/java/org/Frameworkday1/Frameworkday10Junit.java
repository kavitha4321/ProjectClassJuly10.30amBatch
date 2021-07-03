package org.Frameworkday1;

import org.testng.annotations.Test;

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
	
	//@Test(enabled = false)
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
	
	
	@Test(priority = -3)
	private void tc3() {
		System.out.println("test4");

	}
	

	@Test(priority = 3)
	private void tc4() {
		System.out.println("test5");

	}
	
	@Test(enabled = false)
	private void tc5() {
		System.out.println("test34");

	}
	
	@Test(invocationCount =10)
	private void tc6() {
		System.out.println("test45");

	}
	
	
	
	

}
