package com.pom.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Base class 
//Methods to read property file and browser selection and invocation

public class Base {

	public static WebDriver driver;

	// Initialize the browser driver
	public static WebDriver getWebdriver() {

		String curDIR = System.getProperty("user.dir");

		// Getting browser from properties file
		String browser = GetDataFromPropertiesFile("browser");
		if (browser.equalsIgnoreCase("Chrome"))

		{

			System.setProperty("webdriver.chrome.driver", curDIR + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		// Set firefox as default browser
		else {
			System.setProperty("webdriver.gecko.driver", curDIR + "\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return Base.driver;

	}

	// Method to read property file accepts the element and returns its value

	public static String GetDataFromPropertiesFile(String element) {
		String curDIR = System.getProperty("user.dir");
		String FilePath = curDIR + "\\src\\com\\pom\\config\\config.properties";
		FileInputStream locator = null;
		try {
			locator = new FileInputStream(FilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(locator);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = properties.getProperty(element);
		return data;

	}
	
	public static void CloseBrowser()
	{
	
	if (driver != null)
		driver.quit();
	}

}
