package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;


public class LOGIN extends BaseClass {

	
	
	@Test
	@Parameters ()
	public void loginToCRM() {
		
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
	
		
		
	}

}
