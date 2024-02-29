package com.hybrid.pages;

import org.openqa.selenium.WebDriver;

import com.hybrid.tests.LinkDinTest;
import com.hybrid.tests.NewTOURSTest;

public class LinkDinPage {
	
static WebDriver driver=LinkDinTest.driver;
	
	//WEB ELEMENTS
	
	public static String LinkDinGettile() {
		String titlelinkdin=driver.getTitle();
		return titlelinkdin;
		
	}

}
