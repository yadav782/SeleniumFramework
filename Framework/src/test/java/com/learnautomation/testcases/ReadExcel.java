package com.learnautomation.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\YADAVPRAKASH\\Documents\\Test Data\\TestData1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		
//		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println("The cell value @ Row1 Column1 is : "+data0);
		
		XSSFRow row =wb.getSheetAt(0).getRow(1) ;
		
		
		
		int colCount = row.getPhysicalNumberOfCells();
		
		System.out.println("No fo Columns : " + colCount);
		
		int noOfRows = sheet1.getLastRowNum()+1;
		
		System.out.println("No fo Rows : "+noOfRows);
		
	
		
		for (int i=0; i<=noOfRows;i++) {
			//int count = 0;
			for(int j=0;j<colCount;j++) {
			
			
				String data0 = sheet1.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println("The cell value @ Row["+i+"]"+ "Column"+"["+j+"]"+ "is : "+data0);			
			
			
			}

		}
		
		
		
		
		
		
	}

}
