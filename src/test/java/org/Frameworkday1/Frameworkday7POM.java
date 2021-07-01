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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday7POM extends BaseClass {
public static void main(String[] args) throws IOException {
	
	BaseClass a = new BaseClass();
	a.getDriver();
	a.launchUrl("https://www.facebook.com/");
    WebElement txtUsername = driver.findElement(By.id("email"));
    txtUsername.sendKeys("hijavaaaa");
    driver.navigate().refresh();
    txtUsername.sendKeys("welcomejava");
   // WebElement txtpass = driver.findElement(By.id("pass"));
    //a.enterData(txtpass, getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet1" , 1, 1));
	//WebElement btnClick = driver.findElement(By.name("login"));
	//a.buttonClick(btnClick);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
