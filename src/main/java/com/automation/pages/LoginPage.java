package com.automation.pages;

import org.openqa.selenium.WebDriver;

import com.automation.objrepo.LoginPageProperties;
import com.automation.util.WebDriverUtils;

public class LoginPage extends WebDriverUtils implements LoginPageProperties{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	
	public CreateAccountPage clickCreateAccountButton() {
		click(CREATACCOUNTBUTTON);
		return new CreateAccountPage(driver);
	}
	
	public void enterEmailAddress() {
		enterText(EMAIl_ADDRESS);
	}
}
