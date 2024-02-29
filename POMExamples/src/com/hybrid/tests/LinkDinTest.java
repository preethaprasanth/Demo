package com.hybrid.tests;

import org.testng.annotations.Test;

import com.hybrid.main.Base;
import com.hybrid.pages.LinkDinPage;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LinkDinTest  extends Base{
	public static WebDriver driver = Base.getWebdriver();
	  @Test
	  public void LinkDinValidation() {
		  

		  String expectedtitle="Welcome: LinkDin";
		  String actualtitle=LinkDinPage.LinkDinGettile();
		  System.out.println("Linkdin title is : "+actualtitle);
		  Assert.assertEquals(actualtitle, expectedtitle);
		  
	  }
	  @BeforeClass
	  public void GotoURL() {
			// get URL from properties file
			String URL = Base.GetDataFromPropertiesFile("url3");
			// set implicit wt at page level
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			driver.get(URL);
			

		  
	  }

	  @AfterClass
	  public void afterClass() {
		  //close URL
		  System.out.println("CLOSING Browser in LinkDin");
		  driver.close();
	  }


}
