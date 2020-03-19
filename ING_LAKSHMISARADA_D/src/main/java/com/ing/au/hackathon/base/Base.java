package com.ing.au.hackathon.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ing.au.hackathon.utilities.*;

public class Base {

	public static WebDriver driver;
	
    public void lauchBrowser() throws IOException {

		System.setProperty(AppProperties.readProperty("DriverKey"), AppProperties.readProperty("DriverPath"));
		String browserName = AppProperties.readProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(AppProperties.readProperty("URL"));

	}

	/*public static void main (String args[]) throws IOException {
		Base b=new Base();
		b.lauchBrowser();
	}*/
}
