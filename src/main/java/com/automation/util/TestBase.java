package com.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver driver;
	
	public WebDriver intlizeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\LatestChrome\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
}
