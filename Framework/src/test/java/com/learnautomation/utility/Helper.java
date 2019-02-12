package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	// screenshot, alerts, Frames, Multiple Windows, Sync Issue, javascript Executor
	
	
	public static void captureScreenShot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(src,new File ("./Screenshots/" + getCurrentDateTime()+ ".png"));
		
		System.out.println("Screenshot Captured");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture Screen Shot" + e.getMessage());
		}
		
	}
	
	public static String getCurrentDateTime() {
		
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		return customFormat.format(date);
	
	}

}
