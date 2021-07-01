package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Frameworkday17TestngParallelEcecThread3  {
                    
	@Test
	private void tc20() {
	
System.out.println("Test 20");
System.out.println("Frameworkday17TestngParallelEcecThread3 Class Thread:" +Thread.currentThread().getId());

	}

@Test
private void tc21() {
	System.out.println("Test 21");
	System.out.println("Frameworkday17TestngParallelEcecThread3 Class Thread:" +Thread.currentThread().getId());
}


@Test
private void tc22() {
	System.out.println("Test 22");
	System.out.println("Frameworkday17TestngParallelEcecThread3 Class Thread:" +Thread.currentThread().getId());
}

@Test
private void tc23() {
	System.out.println("Test 23");
	System.out.println("Frameworkday17TestngParallelEcecThread3 Class Thread:" +Thread.currentThread().getId());
}

}