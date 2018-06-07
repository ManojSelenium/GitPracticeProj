package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.LandingPage;
import com.automation.pages.LoginPage;
import com.automation.util.TestBase;

public class S123_CreateAccount extends TestBase{

	
	WebDriver driver;
	LandingPage landingPage;
	LoginPage loginPage;
	CreateAccountPage createAccountPage;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Branch Commit");
		driver=intlizeBrowser();
		enterURL("http://automationpractice.com/index.php");
		landingPage=new LandingPage(driver);
		 
	}
	
	@Test
	public void tc_1() {
		loginPage=landingPage.clickSignIn();
		loginPage.enterEmailAddress();
		createAccountPage=loginPage.clickCreateAccountButton();
		createAccountPage.enterFirstName();
		createAccountPage.enterLastName();
	}
	
	@Test
	public void tc_2() {
		
	}
}
