package Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
			
	public ExcelDataConfig(String excelPath)  {
		
		try {
		File src = new File(excelPath);
		
		FileInputStream fis = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(fis);
		
		 wb.getSheet("Sheet1");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber, int rownum, int colnum) {
		
		sheet1 = wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(rownum).getCell(colnum).getStringCellValue();
		return data;
	}
	


}
