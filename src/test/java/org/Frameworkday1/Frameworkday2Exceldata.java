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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday2Exceldata {
public static void main(String[] args) throws IOException {
	File file = new File ("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx");
	//step 2
	FileInputStream fileInputStream = new FileInputStream(file);

	//step 3 - Getting the workbook from the location 
	
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	
	//From the sheet we are getting the particular row
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	//From the row we are getting the particular cell
	
	Row row = sheet.getRow(4);
	
	//From the cell we are getting the particular value
	Cell cell = row.getCell(0);
	
	//From the cell we are printing the particular valuex
	
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	
	//To get all the values from the excel we need to use for loop condition
	
	for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
		Row row1 = sheet.getRow(i);
	for (int j=0; j<row1.getPhysicalNumberOfCells();j++) {
		Cell cell1 = row1.getCell(j);
		String stringCellValue1 = cell1.getStringCellValue();
	System.out.println(stringCellValue1);	
	}
	
	
	}
	
}
}
//9677432188	