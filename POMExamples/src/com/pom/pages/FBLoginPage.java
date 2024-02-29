package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.tests.BaseTest;

public class FBLoginPage extends BaseTest {
	
	static WebDriver driver=BaseTest.driver;
	//WebElements
	static WebElement loginid=driver.findElement(By.id("email"));
	static WebElement passwd=driver.findElement(By.id("pass"));
	//submit : //input[@value='Log In']
	static WebElement submit=driver.findElement(By.xpath("//input[@value='Log In']"));
	
	
	public static void FBLogin(String username,String passwrd)
	{
		loginid.clear();
		loginid.sendKeys(username);
		passwd.sendKeys(passwrd);
		submit.click();
		
	}

}
