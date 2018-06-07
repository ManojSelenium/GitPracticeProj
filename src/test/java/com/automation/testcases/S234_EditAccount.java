package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.util.TestBase;

public class S234_EditAccount extends TestBase{
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		intlizeBrowser();
		enterURL("");
	}
	
	@Test
	public void tc_2() {
		
	}
}
