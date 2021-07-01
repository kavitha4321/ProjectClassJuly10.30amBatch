package org.Frameworkday1;

import java.util.Date;

import org.baseclass.BaseClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday14TestngDataProvidertest2 	 {
                    
	@DataProvider(name = "Data")
	public static Object[][] getData() {
		return new Object[][] { { "hijava", "javahi" }, {"welcomejava", "javawelcome"}, {"seleniumjava", "javaselenium"}};
		
	}
	
	@DataProvider (name = "Data1")
public static Object[][] getData1() {
	return new Object[][] {{"hijava","javahi"},{"welcomejava","javawelcome"},{"seleniumjava","javaselenium"}};
	}
}
