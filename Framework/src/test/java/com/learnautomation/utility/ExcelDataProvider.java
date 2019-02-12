package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File src = new File("C:\\Users\\YADAVPRAKASH\\Documents\\Test Data\\TestData1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read the file "+e.getMessage());
		} 
		
	}
	
	public String getStringData(String workSheet, int row, int colmn) {
		
		return wb.getSheet(workSheet).getRow(row).getCell(colmn).getStringCellValue();
		
	}

}
