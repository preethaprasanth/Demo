package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pom.tests.BaseTest;


public class GmailLoginPage extends BaseTest {
	
	static WebDriver driver=BaseTest.driver;
	 
	//GETTING WEB ELEMENTS IN GMAIL LOG IN PAGE
	
	//Typing mail id/password/submit
	static WebElement LoginName=driver.findElement(By.xpath("//p[@class='wpW1cb']"));
	static WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
	static WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	
	public static void LogInGmail(String username,String passwd) {
		
		LoginName.sendKeys(username);
		Password.sendKeys(passwd);
		submit.click();
	}
	

}
