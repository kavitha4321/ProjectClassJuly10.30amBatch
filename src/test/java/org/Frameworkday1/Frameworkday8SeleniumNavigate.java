package org.Frameworkday1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday8SeleniumNavigate extends BaseClass {
public static void main(String[] args) throws IOException {
	
	BaseClass a = new BaseClass();
	a.getDriver();
driver.navigate().to("https://www.google.com/?gws_rd=ssl");
	
	WebElement txtSearchbox =driver.findElement(By.name("q"));
	txtSearchbox.sendKeys("Greens TEchnology OMR", Keys.ENTER);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}
