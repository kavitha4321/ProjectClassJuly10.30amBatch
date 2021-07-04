package org.Frameworkday1;
import org.testng.annotations.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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
	
	@Test
	public void test10() {
	System.out.println("test3");
	}

	@Test
	public void test11() {
	System.out.println("test2");
	}
	@Test
	public void test8() {
	System.out.println("test2");
	
	}

	@Test
	public void test5() {
	System.out.println("test3");
	}

	@Test
	public void test6() {
	System.out.println("test2");
	
	}

	@Test
	public void tes7() {
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
