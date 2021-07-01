package org.Frameworkday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.junit.Assert;
public class Frameworkday18Parallelexecutionamazon {

	public static WebDriver driver;
	
@Test
	public void tc30() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
	}
	
	
	
	
	

}
