package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Frameworkday17TestngParallelEcecThread4  {
                    
@Test
	private void tc30() {
	
System.out.println("Test 30");
System.out.println("Frameworkday17TestngParallelEcecThread4 Class Thread:" +Thread.currentThread().getId());

	}

@Test
private void tc31() {
	System.out.println("Test 31");
	System.out.println("Frameworkday17TestngParallelEcecThread4 Class Thread:" +Thread.currentThread().getId());
}


@Test
private void tc32() {
	System.out.println("Test 32");
	System.out.println("Frameworkday17TestngParallelEcecThread4 Class Thread:" +Thread.currentThread().getId());
}

@Test
private void tc33() {
	System.out.println("Test 33");
	System.out.println("Frameworkday17TestngParallelEcecThread4 Class Thread:" +Thread.currentThread().getId());
}


}