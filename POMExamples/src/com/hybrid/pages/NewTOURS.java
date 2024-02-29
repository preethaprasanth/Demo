package com.hybrid.pages;

import org.openqa.selenium.WebDriver;

import com.hybrid.tests.NewTOURSTest;

public class NewTOURS extends NewTOURSTest {
	static WebDriver driver=NewTOURSTest.driver;
	
	//WEB ELEMENTS
	
	public static String NewTOURSGettile() {
		String titletours=driver.getTitle();
		return titletours;
		
	}

}
