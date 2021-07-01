package org.Frameworkday1;

import java.util.Date;

import org.baseclass.BaseClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frameworkday14TestngBaseclass extends BaseClass {
                    
	static BaseClass baseclass;
	
	
@BeforeClass
	public static void beforeClass() {
	baseclass = new BaseClass();
	baseclass.getDriver();
	baseclass.launchUrl("https://www.facebook.com/");

	}
	
@BeforeMethod
private void beforeMethod() {
	Date date = new Date();
	System.out.println(date);

}
	@Parameters({"username","password"})	
	@Test
	private void tc0(String data, String data1) {
		//page = new Frameworkday7PomLoginpage3();
		WebElement txtUserName = driver.findElement(By.id("email"));
		baseclass.type(txtUserName, data);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		baseclass.type(txtPassword, data1);
	
	}
	
	@Test
	public void tc01() {
		WebElement findElement =driver.findElement(By.name("login"));
		baseclass.buttonClick(findElement);

	}
	

	
	
	
	
	

}
