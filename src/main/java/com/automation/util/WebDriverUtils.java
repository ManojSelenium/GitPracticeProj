package com.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop) {
		
	}
	
	public void getText() {
		
	}
}
