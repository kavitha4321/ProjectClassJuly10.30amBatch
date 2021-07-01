package org.Frameworkday1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday15TestngDataProvidertest3  {
                    
@Test()
	private void tc0() {
	
	String s ="abcdef";
	AssertJUnit.assertEquals(s,"Abcdefe");
	System.out.println(1);
		System.out.println(2);
System.out.println(3);
	}
	@Test
	private void tc1() {
		System.out.println("Test1");
	}

//Soft Assert - non-static method- object reference

	@Test()
	private void tc2() {
		String s ="abcdef";
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(s,"Abcdef");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
	}
	
	@Test
	private void tc3() {
		System.out.println("Test2");
	}


}