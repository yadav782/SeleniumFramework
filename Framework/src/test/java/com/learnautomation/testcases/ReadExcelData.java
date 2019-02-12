package com.learnautomation.testcases;

import Lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\\\Users\\\\YADAVPRAKASH\\\\Documents\\\\Test Data\\\\TestData2.xlsx");
		
		System.out.println(excel.getData(1,0,1));
	}

}
