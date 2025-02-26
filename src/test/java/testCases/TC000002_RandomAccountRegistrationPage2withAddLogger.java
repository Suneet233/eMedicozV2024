package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC000002_RandomAccountRegistrationPage2withAddLogger extends BaseClass {



@Test

public void verify_login() throws InterruptedException
{
	
	logger.info("**** Starting Tc0000_RandomAccountRegistration ****");  // Log file generate karne ke liye likha hai
	
	try
	{
	
	HomePage hp =new HomePage(driver);
	
	hp.ClickSignINButton();
	
	logger.info("**** Click On Sign In Button ****");

	  LoginPage lp =new LoginPage (driver);
	  
	  logger.info("**** Providing Student Details ****");

	  
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
		
		logger.info("**** Click on the Submit button ****");
		
		ap.CongratulationNextButton();
		
		ap.ChooseStream();
		
		
		// String password = randomAlphaNumeric();  // ye lihnege uper iske niche likhenege password ke liye code;
		
		// example hai code nahi hai real  ap.setPassword(password);
		
		
	//	random user name or email or password ka cose bas eclass mai likha hai
		
		
		ap.AfterChooseStreamNextButton();
		
		
		logger.info("**** EndingTc0000_RandomAccountRegistration ****");
	}
// Try catch likha hai log file ke liye
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug logs"); // Log debug karne ke liye likha hai
			Assert.fail();
			
		}
		
}
}
		

