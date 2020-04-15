package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtil {
	
		public String Excel_read( int rowno, int colno , String sheetname)
		{
			String filename ="C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Testdata\\Excel_IO.xlsx";
			String data ="null";
			File file = new File(filename);
			
			try {
					FileInputStream fis = new FileInputStream(file);
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sh = wb.getSheet(sheetname);
					XSSFRow row = sh.getRow(rowno-1);
					XSSFCell cell = row.getCell(colno-1);
					data = cell.getStringCellValue();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
			
				
		}
	

}
