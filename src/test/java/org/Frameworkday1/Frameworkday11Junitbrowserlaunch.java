package org.Frameworkday1;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Frameworkday11Junitbrowserlaunch extends BaseClass {
//nbeforeclass ---> Browser launching condition
	//Afterclass --> browser closing condition
	static BaseClass baseclass;
	static Frameworkday7PomLoginpage3 page;
	
@BeforeClass
	public static void beforeClass() {
	baseclass = new BaseClass();
	baseclass.getDriver();
	baseclass.launchUrl("https://adactinhotelapp.com/");

	}
	
		
	@Test
	public void tc0() {
		page = new Frameworkday7PomLoginpage3();
		WebElement txtUserName = page.getTxtUserName();
		baseclass.type(txtUserName, "huhjik");
		WebElement txtPassword = page.getTxtPassword();
		baseclass.type(txtPassword, "jhjkk");
	
	}
	
	@Test
	public void tc01() {
		WebElement btnlogin = page.getBtnlogin();
		baseclass.buttonClick(btnlogin);

	}
	
	@AfterClass
	public static void afterClass() {
	driver.close();
	}
	
	
	
	
	

}
