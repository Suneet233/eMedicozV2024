package testCases;

// logger run karwaya hai hai or try catch lagwaya hai

import org.testng.Assert;

// ye sirf logger lagane ka data hai loger line type karo or try catch mai daaldo

import org.testng.annotations.Test;

import TestBase.BaseClass;
import TestBase.BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups2ExtendReportManager2andGrid;
import pageObjects.HomePage;

public class TC015_QuesrSubmit extends BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups2ExtendReportManager2andGrid {
	
	
	@Test
	public void QuerySubmit() {
		logger.info("**** Starting TC015_QuesrSubmit ****");
		try
		{
		
		logger.info("**** TC015_QuesrSubmit ****");
		
		HomePage hp = new HomePage (driver);
		
		hp.NameInputBox("Jatin");
		
		logger.info("**** Enter name input box ****");
		
		hp.EmailInputBox("Jatin223@gmail.com");
		
		logger.info("**** Enter email input box ****");
		
		hp.MobileNumber("658965256");
		
		logger.info("**** Enter mobile number input box ****");
		
		hp.testDDButton();
		
		logger.info("**** Clic on the Drop down button ****");
		
		hp.YoursQuery("I am happy to purchase this course");
		
		logger.info("**** Enter name quesry in input box ****");
		
		}
		
		catch(Exception e)
		{
			logger.error("Test Failed..");
			logger.debug("Debug Logs..");
			
			Assert.fail();
		}
		logger.info("**** End TC015_QuesrSubmit ****");
		
	}

}
