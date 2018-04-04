package com.pom.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pom.pages.FBLoginPage;

public class FBLoginTest extends BaseTest {
	
	static WebDriver driver=BaseTest.driver	;
	
  @Test(dataProvider="logincredentials")
  public void LogintoFB(String usrname,String password) {
		FBLoginPage.FBLogin(usrname, password);
  }
  
  @DataProvider(name="logincredentials")
  public Object [] [] providecredentials()
  {
	  return new Object[][] {{"preethaprasanth@gmail.com","Ammu123$"}};
	  
  }
}
