package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;




public class Frameworkday16TestngGroups2  {
                    
@Test(groups ="@smoke")
	private void tc0() {
System.out.println("Method0");
Assert.assertTrue(false);
	}

@Test(groups ="@smoke")
private void tc1() {
	System.out.println("Method1");

}


	@Test(groups ="@reg", dependsOnGroups ="@smoke")
	private void tc2() {
		System.out.println("Method2");
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke")
	private void tc3() {
		System.out.println("Method3");
	}

	@Test(groups ="@smoke")
	private void tc4() {
		System.out.println("Method4");
	}

	@Test(groups ="@reg", dependsOnGroups = "@smoke")
	private void tc5() {
		System.out.println("Method5");
	}


}