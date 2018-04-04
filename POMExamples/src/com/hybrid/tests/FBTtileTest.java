package com.hybrid.tests;

import org.testng.annotations.Test;

import com.hybrid.main.Base;
import com.hybrid.pages.FBpage;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FBTtileTest extends Base {
	
	public static WebDriver driver = Base.getWebdriver();
  @Test
  public void FBTileValidation() {
	  
	  String actualtite=FBpage.FBGettile();
	  System.out.println("FB SITE TITLE IS: "+actualtite);
	  String expectedtitle="Log into Facebook";
	  Assert.assertEquals(actualtite, expectedtitle);
	  
  }
  @BeforeClass
  public void GotoURL() {
		// get URL from properties file
		String URL = Base.GetDataFromPropertiesFile("url1");
		// set implicit wt at page level
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get(URL);
		

	  
  }

  @AfterClass
  public void afterClass() {
	  //close URL
	  System.out.println("CLOSING BROWSER IN FB title validation Test");
	  driver.close();
  }

}
