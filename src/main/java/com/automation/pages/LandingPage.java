package com.automation.pages;


import org.openqa.selenium.WebDriver;

import com.automation.objrepo.LandingPageProperties;
import com.automation.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public LoginPage clickSignIn() {
	click(SIGNIN_LOCATOR);
	return new LoginPage(driver);
	}
	
	public void clickContactUs() {
		click(CONTACTUS_LOCATOR);
	}
	
	
}
