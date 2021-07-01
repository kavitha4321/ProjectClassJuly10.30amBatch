package org.Frameworkday1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frameworkday12TestngTest {

	@Test(priority= -10)
	private void tc0() {
		System.out.println("test1");

	}
	@Test(priority = -5)
	private void tc1() {
		System.out.println("test2");

	}
	@Test(priority = -10)
	private void tc2() {
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