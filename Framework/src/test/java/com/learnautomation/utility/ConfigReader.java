package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties pro;
	
	public ConfigReader() {
		File src = new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is ="+e.getMessage());
		} 

	}
	
	public String  getChromePath() {
		return pro.getProperty("ChromeDriver");  
		
	}
	
	public String  getGeckoPath() {
		return pro.getProperty("GeckoDriver");
		
	}
	
	public String  getApplicationUrl() {
		return pro.getProperty("URL");
		
	}
	public String  getBrowser() {
		return pro.getProperty("Browser");
		
		
	}


}
