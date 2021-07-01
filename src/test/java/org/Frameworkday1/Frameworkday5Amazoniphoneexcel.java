package org.Frameworkday1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday5Amazoniphoneexcel {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
	
	File file = new File ("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.createSheet("Iphone");
	
	WebDriver driver = new ChromeDriver() ; 
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement txtSearchbox  = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearchbox.sendKeys("iphone",Keys.ENTER);
	
	List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
	for(int i=0;i<allProducts.size();i++) {
		String text = allProducts.get(i).getText();
		Row createRow = sheet.createRow(i);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(text);
		
		
	}
	
	
	FileOutputStream stream =new FileOutputStream(file);
	workbook.write(stream);
	
}
}
//9677432188	