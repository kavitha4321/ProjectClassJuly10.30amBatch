package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;//If there is no access specifier given it takes as defeault access specifer which cannot be accessed outside the package, so it needs to be declared as public static
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
       
	}
	public void launchUrl(String data) {
		 driver.get(data);

	}
	public void enterData(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public void buttonClick (WebElement elementref) {
		elementref.click();
	}
	
	public void mouseHoverAction(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).perform();
	}
	
	public static void selectByVisibleText(WebElement element, String data) {
		Select se = new Select(element);
		se.selectByVisibleText(data);

	}
	
	public void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" +data+"')", element);
				
	}
	
	public void getTitle(String title) {
		title = driver.getTitle();
		System.out.println(title);

	}
	
	public void currentUrl(String url) {
     url = driver.getCurrentUrl();
     System.out.println(url);

	}
	
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();

	}
	
	public void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();

	}
	
	public static String getDataFromExcel(String pathname, String name, int rowNo, int cellNo) throws IOException {
		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(name);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
			
		}else if (DateUtil.isCellDateFormatted(cell)) {
			Date dataCellValue = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
			value = format.format(dataCellValue);
			
} else {
	double numericCellValue = cell.getNumericCellValue();
	long l = (long) numericCellValue;
	value = String.valueOf(1);
}
		return value;
	}
	
	public void selectByValue(WebElement element, String data) {
		Select s= new Select(element);
		s.selectByValue(data);

	}
	public void type(WebElement element, String data) {
	element.sendKeys(data);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
