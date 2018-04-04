package com.pom.tests;

import com.pom.config.Base;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

//Base Test class for all tests
//Extends Base class
public class BaseTest extends Base {

	// Getting driver instance from base class
	public static WebDriver driver = Base.getWebdriver();

	@BeforeSuite
	public void openURL() {
		// get URL from properties file
		String URL = Base.GetDataFromPropertiesFile("url");
		driver.get(URL);
		// set implicit wt at page level
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void ClosingBrowser() {
		Base.CloseBrowser();
	}

}
