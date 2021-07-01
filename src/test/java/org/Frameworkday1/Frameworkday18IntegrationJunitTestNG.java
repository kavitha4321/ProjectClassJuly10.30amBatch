package org.Frameworkday1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class Frameworkday18IntegrationJunitTestNG {

	public static WebDriver driver;
	
@BeforeClass
	public static void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void tc01() {
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("WelcomeJava");

	String attribute = txtUserName.getAttribute("value");
	Assert.assertEquals("Verify Username",attribute,"WelcomeJava");
	
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Hijavaaaa");
	
	String attribute2 = txtPassword.getAttribute("value");
	Assert.assertEquals("Verify Password",attribute2,"Hijavaaaa");
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	boolean enabled = btnlogin.isEnabled();
	Assert.assertTrue("Login button verification", enabled);
	btnlogin.click();
	}
	
	
	
	
	
	

}
