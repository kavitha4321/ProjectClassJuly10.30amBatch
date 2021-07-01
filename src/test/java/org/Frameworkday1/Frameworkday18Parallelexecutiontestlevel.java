package org.Frameworkday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frameworkday18Parallelexecutiontestlevel {

	public static WebDriver driver;
	
@Test
	public void tc10 () {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
	}
	
@Test
public void tc0 () {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
}
	
@Test
public void tc30 () {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
}

	
	
	

}
