package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;




public class Frameworkday16TestngAlwaysRun1  {
                    
@Test(groups ="@smoke")
	private void tc0() {
	Assert.assertTrue(false);
System.out.println("Method0");

	}

@Test(groups ="@smoke")
private void tc1() {
	System.out.println("Method1");

}


	@Test(groups ="@reg", dependsOnGroups ="@smoke", alwaysRun = true)
	private void tc2() {
		System.out.println("Method2");
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke", alwaysRun = true)
	private void tc3() {
		System.out.println("Method3");
	}

	@Test(groups ="@smoke")
	private void tc4() {
		System.out.println("Method4");
	}

	@Test(groups ="@reg", dependsOnGroups = "@smoke", alwaysRun = true)
	private void tc5() {
		System.out.println("Method5");
	}


}