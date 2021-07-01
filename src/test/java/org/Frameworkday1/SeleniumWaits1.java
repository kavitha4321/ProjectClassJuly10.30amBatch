package org.Frameworkday1;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Karthik//eclipse-workspace//Selenium//drivers//chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement until = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("name"))));
	until.click();
	
	//Fluent wait
	Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
	
	//wait1.until(Function<driver, T>)
	
	
	
	
	
	}	
	
}
