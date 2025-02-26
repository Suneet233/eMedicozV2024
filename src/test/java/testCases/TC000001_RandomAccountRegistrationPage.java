package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC000001_RandomAccountRegistrationPage extends BaseClass {



@Test

public void verify_login() throws InterruptedException
{
	
	
	HomePage hp =new HomePage(driver);
	
	hp.ClickSignINButton();
	
	

	  LoginPage lp =new LoginPage (driver);
	  
	  lp.MobileNumber(randomeNumber());
	  
		
		lp.ContinueButton();
		
	//	lp.LogoutAndContinueButton();
		
		lp.PasswordInputBox1("2");
		lp.PasswordInputBox2("0");
		lp.PasswordInputBox3("0");
		lp.PasswordInputBox4("0");
		
		lp.VerifyButton();
		
		
		AccountRegistrationPage ap = new AccountRegistrationPage (driver);	
		
		ap.NameInputBox(randomeString().toUpperCase());
		
		ap.EmailInputBox(randomeString()+"@gmail.com");
		
		ap.SubmitButton();
		
		ap.CongratulationNextButton();
		
	//	ap.ChooseStream();
		
		
		// String password = randomAlphaNumeric();  // ye lihnege uper iske niche likhenege password ke liye code;
		
		// example hai code nahi hai real  ap.setPassword(password);
		
		
	//	random user name or email or password ka cose bas eclass mai likha hai
		
		
	//	ap.AfterChooseStreamNextButton();
		
}
	
		
		
		
}
		

