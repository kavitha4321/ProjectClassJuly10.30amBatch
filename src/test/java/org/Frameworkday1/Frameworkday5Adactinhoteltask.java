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
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
public class Frameworkday5Adactinhoteltask extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	
	BaseClass a = new BaseClass();
	Sheet sheet ;
for (int z=1; z<4; z++){

	
	a.getDriver();
	a.launchUrl("https://adactinhotelapp.com/");

    WebElement txtUsername = driver.findElement(By.id("username"));
    a.enterData(txtUsername, getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 0));
    WebElement txtpass = driver.findElement(By.id("password"));
    a.enterData(txtpass, getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 1));
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	WebElement loc = driver.findElement(By.name("location"));
	a.selectByValue(loc,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 2));

	WebElement Hotel = driver.findElement(By.name("hotels"));
	a.selectByValue(Hotel,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 3));

	WebElement room = driver.findElement(By.name("room_type"));
	a.selectByValue(room,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 4));

    WebElement rno = driver.findElement(By.name("room_nos"));
  //  a.selectByValue(rno,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , 1, 5));
rno.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 5));


WebElement inDate = driver.findElement(By.name("datepick_in"));
   // a.selectByValue(inDate,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , 1, 6));
inDate.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 6));

WebElement outDate = driver.findElement(By.name("datepick_out"));
outDate.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 7));

WebElement adult = driver.findElement(By.name("adult_room"));
adult.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 8));

	WebElement child = driver.findElement(By.name("child_room"));
	child.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 9));

	WebElement btnsearch = driver.findElement(By.name("Submit"));
	btnsearch.click();

	WebElement btnselect = driver.findElement(By.name("radiobutton_0"));
	btnselect.click();
	
WebElement btncontinue = driver.findElement(By.name("continue"));
btncontinue.click();

WebElement fname = driver.findElement(By.name("first_name"));
	fname.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 10));
	
	WebElement lname = driver.findElement(By.name("last_name"));
	lname.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 11));
	
	WebElement address = driver.findElement(By.name("address"));
 address.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 12));

	WebElement ccno = driver.findElement(By.name("cc_num"));
	ccno.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 13));

	WebElement cctype = driver.findElement(By.name("cc_type"));
a.selectByValue(cctype, getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 14));

	WebElement mon = driver.findElement(By.name("cc_exp_month"));
a.selectByVisibleText(mon,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 15));

	WebElement year = driver.findElement(By.id("cc_exp_year"));
	selectByVisibleText(year,getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 16));
	//year.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , 1, 16));
//year.sendKeys("2022");

WebElement cccvv = driver.findElement(By.name("cc_cvv"));
	cccvv.sendKeys(getDataFromExcel("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx", "Sheet2" , z, 17));
	
	WebElement btnBook = driver.findElement(By.name("book_now"));
	btnBook.click();
	
	Thread.sleep(5000);
	
	WebElement orderID = driver.findElement(By.name("order_no"));
	String text = orderID.getAttribute("value");
	System.out.println(text);
	
	WebElement btnlogout = driver.findElement(By.name("logout"));
	btnlogout.click();
	
	driver.close();
}	
}
}

