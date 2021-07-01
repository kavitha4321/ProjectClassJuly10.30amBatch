package org.Frameworkday1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday13TestngTest4 {
@Parameters({"Username","password"})
	@Test
	private void tc0(@Optional("Java welcomes")String s, String s1) {
		System.out.println(s);
System.out.println(s1);
	}
	@Test
	private void tc1() {
		System.out.println("test2");

	}
	@Test
	private void tc2() {
		System.out.println("test3");

	}
	

	
	@Test
	private void tc3() {
		System.out.println("test4");

	}
	

	@Test
	private void tc4() {
		System.out.println("test5");

	}
	
	
	
	
	
	
	
}