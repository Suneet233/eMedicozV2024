package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc001_LoginPage2practise {
	
	public WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.emedicoz.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	
	public void verify_login() throws InterruptedException
	{
		
		
		HomePage hp =new HomePage(driver);
		
		hp.ClickSignINButton();
		
		

  LoginPage lp =new LoginPage (driver);
  
  
  
  lp.MobileNumber("9999664198");
  
//	lp.MobileNumber(p.getProperty("mobile"));
	
	lp.ContinueButton();
	
	lp.LogoutAndContinueButton();
	
	lp.PasswordInputBox1("2");
	lp.PasswordInputBox2("0");
	lp.PasswordInputBox3("0");
	lp.PasswordInputBox4("0");
	
	//lp.PasswordInputBox1(p.getProperty("password"));
	
	lp.VerifyButton();
		
	

}
}

