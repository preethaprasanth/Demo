package com.hybrid.pages;

import org.openqa.selenium.WebDriver;
import com.hybrid.tests.FBTtileTest;

public class FBpage extends FBTtileTest {
	
	
	static WebDriver driver=FBTtileTest.driver;
	//WebElements

	public static String FBGettile() {
		String titlefb=driver.getTitle();
		return titlefb;
		
	}
}
