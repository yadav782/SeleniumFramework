package com.learnautomation.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.externalconfig.model.Config;

public class ConfigTC {
	
	@Test
	public void testConfig() throws Exception {
		
		File src = new File("./Configuration/Config.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		String ChromePath = pro.getProperty("ChromeDriver");
		
		System.out.println(ChromePath);
		
		
		
		
	}

}
