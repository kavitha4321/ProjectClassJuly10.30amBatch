package org.Frameworkday1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frameworkday12Testng {

	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");

	}
	
	@BeforeMethod
	private void before() {
		System.out.println("Before Methods");

	}
	
	@Test
	private void tcc0() {
		System.out.println("test");

	}
	
	@AfterMethod
	private void after() {
System.out.println("After MEthod");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");

	}
	
	
	
	
	
	
	
}