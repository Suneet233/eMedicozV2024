package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups;
import pageObjects.AfterLoginMyAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.DataProviders;

public class TC000011_LoginDDT2andGroups extends BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups {
	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class,groups="Master") // yaha add kiya groups ke liye 
	public void verify_loginDDT(String MobileNumber, String PWD, String exp) throws InterruptedException 
	{
		
		logger.info("**** Starting Tc0000_Login Test ****");  // Log file generate karne ke liye likha hai
		
		try
		{
		
		HomePage hp =new HomePage(driver);
		
		hp.ClickSignINButton();
		
		logger.info("**** Click On Sign In Button ****");

		  LoginPage lp =new LoginPage (driver);
		  
		  

		  
		  lp.MobileNumber(MobileNumber);
		  
		  logger.info("**** Providing Student Details ****");
			
			lp.ContinueButton();
			
			logger.info("**** Click On the continue Button ****");
			
			
			
			lp.LogoutAndContinueButton();
			
			lp.PasswordInputBox1(PWD);
			lp.PasswordInputBox2(PWD);
			lp.PasswordInputBox3(PWD);
			lp.PasswordInputBox4(PWD);
			
			logger.info("**** Enter the Password ****");
			
			lp.VerifyButton();
			
			logger.info("**** Click On the verify Button ****");
			
			// AfterLoginMyAccountPage
			
			AfterLoginMyAccountPage almap = new AfterLoginMyAccountPage (driver);
			
			
			boolean targetpage = almap.IsMyAccountPageExist();
			
			/*
			 Data is valid   - login success - test pass -logout
			                   login failed- test failed
			                   
			                   Data is Invalid   - login success - test fail -logout
			                   login failed- test pass
			 */
			
			if(exp.equalsIgnoreCase("Valid"))
					{
				if(targetpage==true)
				{
					almap.ClickOnTheLogoutButton();
					Assert.assertTrue(true);
					
				}
				else
				{
					Assert.assertTrue(false);
				}
					}
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetpage==true)
				{
					almap.ClickOnTheLogoutButton();
					Assert.assertTrue(false);
			}
				else
				{
					Assert.assertTrue(true);
				}
			}
					
		}
			  catch (Exception e)
			  {
				  Assert.fail();
			  }
				  
		Thread.sleep(3000);
			  
				logger.info("**** Finished Tc0000_Login Test ****");
		
	}	
	}						
		

	