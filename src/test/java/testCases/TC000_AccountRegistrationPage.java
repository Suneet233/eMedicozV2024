package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC000_AccountRegistrationPage extends BaseClass {
	
	

	

	
	@Test
	
	public void verify_login() throws InterruptedException
	{
		
		
		HomePage hp =new HomePage(driver);
		
		hp.ClickSignINButton();
		
		

		  LoginPage lp =new LoginPage (driver);
		  
		  lp.MobileNumber("2565256326");
		  
			
			lp.ContinueButton();
			
		//	lp.LogoutAndContinueButton();
			
			lp.PasswordInputBox1("2");
			lp.PasswordInputBox2("0");
			lp.PasswordInputBox3("0");
			lp.PasswordInputBox4("0");
			
			lp.VerifyButton();
			
			
			AccountRegistrationPage ap = new AccountRegistrationPage (driver);	
			
			ap.NameInputBox("ajeet");
			
			ap.EmailInputBox("ajeet65@gmail.com");
			
			ap.SubmitButton();
			
			
	}

	private AccountRegistrationPage AccountRegistrationPage(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
