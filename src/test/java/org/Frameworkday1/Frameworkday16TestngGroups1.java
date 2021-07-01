package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday16TestngGroups1  {
                    
@Test(groups ="@Retest")
	private void tc0() {
	
	
System.out.println("Method1");
	}
	@Test(groups ="@reg")
	private void tc1() {
		System.out.println("Method2");
	}

//Soft Assert - non-static method- object reference

	@Test(groups ="@smoke")
	private void tc2() {
		
		System.out.println("Method3");
	}
	
	@Test(groups ="@sanity")
	private void tc3() {
		System.out.println("Method4");
	}

	@Test(groups ="@E2E")
	private void tc4() {
		System.out.println("Method5");
	}

	@Test(groups ="@smoke")
	private void tc5() {
		System.out.println("Method6");
	}


}