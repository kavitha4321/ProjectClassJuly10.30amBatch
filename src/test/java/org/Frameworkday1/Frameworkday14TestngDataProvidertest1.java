package org.Frameworkday1;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday14TestngDataProvidertest1  {
                    
@Test(dataProvider = "Data", dataProviderClass = Frameworkday14TestngDataProvidertest2.class)
	private void tc0(String s, String s1) {
		System.out.println(s);
System.out.println(s1);
	}
	
	

}
//Return type of dataprovider is object [][]