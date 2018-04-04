package com.hybrid.tests;

import org.testng.annotations.Test;

import com.hybrid.main.Base;
import com.hybrid.pages.FBpage;
import com.hybrid.pages.NewTOURS;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTOURSTest extends Base {

	public static WebDriver driver = Base.getWebdriver();
  @Test
  public void NewTOURSValidation() {
	  

	  String expectedtitle="Welcome: iii";
	  String actualtitle=NewTOURS.NewTOURSGettile();
	  System.out.println("NEW TOURS SITE TITLE IS: "+actualtitle);
	  Assert.assertEquals(actualtitle, expectedtitle);
	  
  }
  @BeforeClass
  public void GotoURL() {
		// get URL from properties file
		String URL = Base.GetDataFromPropertiesFile("url2");
		// set implicit wt at page level
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get(URL);
		

	  
  }

  @AfterClass
  public void afterClass() {
	  //close URL
	  System.out.println("CLOSING Browser in NewTours");
	  driver.close();
  }


}
