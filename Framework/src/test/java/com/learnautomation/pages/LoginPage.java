package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[1]/div/input") WebElement userName;
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[2]/div/input") WebElement password;
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/") WebElement loginBtn;
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]") WebElement login;
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver ) {
		this.driver = ldriver;
		
	}

	public void loginToCRM(String userNameAppl, String passwordAppl ) {
		
		
		
		loginBtn.click();
		userName.sendKeys(userNameAppl);
		password.sendKeys(passwordAppl);
		login.click();
		
		
		
	}
	

	
}
