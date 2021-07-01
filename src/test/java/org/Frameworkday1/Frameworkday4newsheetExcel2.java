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

public class Frameworkday4newsheetExcel2 {
public static void main(String[] args) throws IOException {
	File file = new File ("C:\\Users\\Karthik\\eclipse-workspace\\3pmFrameWorkBatch\\ExcelData\\Book1.xlsx");
	//step 2
	FileInputStream fileInputStream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	
	// To create a new sheet and update value in a new cell

	Sheet createsheet = workbook.createSheet("Java");
	
	Row createRow = createsheet.createRow(0);
	
	Cell createCell = createRow.createCell(1);
	
	createCell.setCellValue("16");
	
	FileOutputStream stream =new FileOutputStream(file);
	workbook.write(stream);
	
}
}
//9677432188	