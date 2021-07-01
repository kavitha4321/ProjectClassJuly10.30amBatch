package org.Frameworkday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
}
}
//9677432188	