package com.learnautomation.pages;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.Browserfactory1;
import com.learnautomation.utility.ConfigReader;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass {
	
	public ExcelDataProvider excel;
	public WebDriver driver;
	public ConfigReader config;

	@BeforeSuite
	public void beforeSuite() {
		
		excel = new ExcelDataProvider();
		config = new ConfigReader();
	}
	
	
	@BeforeClass
	public void setUp() {
		driver = Browserfactory1.startBrowser(driver,config.getBrowser(),config.getApplicationUrl());
	}
	
	@AfterClass
	public void tearDown() {
		Browserfactory1.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenShot(driver);
		}
	}
	

}
