package com.ing.au.hackathon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ing.au.hackathon.base.Base;

public class AppProperties extends Base{

	public static String readProperty(String valueToRead) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\resouces\\com\\ing\\au\\hackathon\\config\\config.properties");
		prop.load(fis);
		return prop.getProperty(valueToRead);
	}
	
	
}
