package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Frameworkday17TestngParallelEcecThread2  {
                    
	@Test
	private void tc10() {
	
System.out.println("Test 10");
System.out.println("Frameworkday17TestngParallelEcecThread2 Class Thread:" +Thread.currentThread().getId());

	}

@Test
private void tc11() {
	System.out.println("Test 11");
	System.out.println("Frameworkday17TestngParallelEcecThread2 Class Thread:" +Thread.currentThread().getId());
}


@Test
private void tc12() {
	System.out.println("Test 12");
	System.out.println("Frameworkday17TestngParallelEcecThread2 Class Thread:" +Thread.currentThread().getId());
}

@Test
private void tc13() {
	System.out.println("Test 13");
	System.out.println("Frameworkday17TestngParallelEcecThread2 Class Thread:" +Thread.currentThread().getId());
}

}