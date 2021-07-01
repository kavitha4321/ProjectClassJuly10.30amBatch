package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Frameworkday16TestngThread1  {
                    
@Test(groups ="@smoke")
	private void tc0() {
	Assert.assertTrue(false);
System.out.println("Method0");
System.out.println(Thread.currentThread().getId());

	}

@Test(groups ="@smoke")
private void tc1() {
	System.out.println("Method1");
	System.out.println(Thread.currentThread().getId());
}


	@Test(groups ="@reg", dependsOnGroups ="@smoke", alwaysRun = true)
	private void tc2() {
		System.out.println("Method2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke", alwaysRun = true)
	private void tc3() {
		System.out.println("Method3");
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups ="@smoke")
	private void tc4() {
		System.out.println("Method4");
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups ="@reg", dependsOnGroups = "@smoke", alwaysRun = true)
	private void tc5() {
		System.out.println("Method5");
		System.out.println(Thread.currentThread().getId());
	}


}