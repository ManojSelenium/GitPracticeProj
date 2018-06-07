package com.automation.pages;

import org.openqa.selenium.WebDriver;

import com.automation.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils{


	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	public void enterFirstName() {
	//	enterText();
	}
	
	public void enterLastName() {
	//	enterText();
		
	}
}
