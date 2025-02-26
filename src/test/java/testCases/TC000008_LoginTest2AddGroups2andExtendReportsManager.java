package testCases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import TestBase.BaseClassSomeChangesCrossBrowser3;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups2ExtendReportManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.AfterLoginMyAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC000008_LoginTest2AddGroups2andExtendReportsManager extends BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups2ExtendReportManager {



@Test(groups={"Sanity","Master"})

public void verify_login() throws InterruptedException
{
	
	logger.info("**** Starting Tc0000_Login Test ****");  // Log file generate karne ke liye likha hai
	
	try
	{
	
	HomePage hp =new HomePage(driver);
	
	hp.ClickSignINButton();
	
	logger.info("**** Click On Sign In Button ****");

	  LoginPage lp =new LoginPage (driver);
	  
	  

	  
	  lp.MobileNumber(P.getProperty("mobile"));
	  
	  logger.info("**** Providing Student Details ****");
		
		lp.ContinueButton();
		
		logger.info("**** Click On the continue Button ****");
		
		
		
		lp.LogoutAndContinueButton();
		
		lp.PasswordInputBox1("2");
		lp.PasswordInputBox2("0");
		lp.PasswordInputBox3("0");
		lp.PasswordInputBox4("0");
		
		logger.info("**** Enter the Password ****");
		
		lp.VerifyButton();
		
		logger.info("**** Click On the verify Button ****");
		
		// AfterLoginMyAccountPage
		
		AfterLoginMyAccountPage almap = new AfterLoginMyAccountPage (driver);
		
		
		boolean targetpage = almap.IsMyAccountPageExist();
		
		
		
		Assert.assertTrue(targetpage); // Assert.assertEquals(targetpage, true, "login failed");
		
		
		
		
	}
// Try catch likha hai log file ke liye
		catch(Exception e)
		{
		
			Assert.fail();
			
		}
	logger.info("**** EndingTc0001_Login Test ****");
}
}
		

