package com.pom.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.pom.pages.*;

public class GmailLoginTest extends BaseTest {
	static WebDriver driver=BaseTest.driver;
  @Test
  public void login() {
	  
	  GmailLoginPage.LogInGmail("preethaprasanth@gmail.com", "Ammu123$");
	  System.out.println("AFTERR LOGIN");
	  
  }
}
