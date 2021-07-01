package org.Frameworkday1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday4newsheetExcel4 {
public static void main(String[] args) throws IOException {
	File file = new File ("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx");
	//step 2
	FileInputStream fileInputStream = new FileInputStream(file);

	//step 3 - Getting the workbook from the location 
	
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	
	//From the sheet we are getting the particular row
	
	Sheet sheet = workbook.getSheet("Sheet1");
		
	//To get a particular cell value from the excel
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(0);
	String ss = cell.getStringCellValue();
	System.out.println(ss);
	
	//To update the value in a particular cell 
	if(ss.equals("apple")) {
		cell.setCellValue("Framework");
	}
	
	
	FileOutputStream stream =new FileOutputStream(file);
	workbook.write(stream);
	
}
}
//9677432188	