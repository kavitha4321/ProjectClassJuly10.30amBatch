package org.Frameworkday1;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkday3Excelstringandnumeric {
public static void main(String[] args) throws IOException {
	File file = new File ("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx");
	//step 2
	FileInputStream fileInputStream = new FileInputStream(file);

	//step 3 - Getting the workbook from the location 
	
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	
	//From the sheet we are getting the particular row
	
	Sheet sheet = workbook.getSheet("Sheet1");
		
	//To get all the values from the excel we need to use for loop condition
	
	for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
	for (int j=0; j<row.getPhysicalNumberOfCells();j++) {
	
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		
		if(cellType ==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);	
		}else if (DateUtil.isCellDateFormatted(cell)) { // To print the date in the excel in date format ... If this "else if" is not given then date will be printed wrongly in number format
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-YYYY");
			String Format = dateformat.format(dateCellValue);
			System.out.println(Format);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			System.out.println(l);
		}
	}
	
	
	
	}
	
	
}
}
//9677432188	