package com.selenium.excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\New Microsoft Office Excel Worksheet.xls");
//to read xls file, HSSF implementation provided by POI library
//to xlsx, Xssf  implementation POI library will be provided
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet s= wb.getSheet("Sheet1");
		Iterator<Row> rowIt=s.iterator();
		while(rowIt.hasNext()) {
			System.out.println(rowIt.next().getCell(0).getStringCellValue()); //0 for 1st row,1 for 2nd row, 2 for 3rd row
			
		}
		
		
		
		
		
	}
}
