package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//span[@classname='welcomText']") WebElement msgHeading;
	
	public boolean isLoginPageExists ()
	{
		try
		{
	return	(msgHeading.isDisplayed());
			
		}
		catch (Exception e) 
		{
			return false;
		}
	}


	 
	
	 
	@FindBy(xpath="//input[@value='+91 ']") WebElement textmobilenumber;  
	
	@FindBy(xpath="//input[@value='Continue']") WebElement continuebutton; 
	
	@FindBy(xpath="//button[normalize-space()='Logout & Continue']") WebElement logoutandcontinuebutton;

	
	@FindBy(xpath= "//div[@class='form-group otp_box']//input[1]") WebElement testpasswordinputbox1;
	
	
	@FindBy(xpath= "//div[@class='form-group otp_box']//input[2]") WebElement testpasswordinputbox2;
	
@FindBy(xpath= "//div[@class='form-group otp_box']//input[3]") WebElement testpasswordinputbox3;
	
	 @FindBy(xpath= "//div[@class='form-group otp_box']//input[4]") WebElement testpasswordinputbox4;
	
	

	
	
	@FindBy(xpath="//button[normalize-space()='Verify & Proceed']") WebElement verifybutton;
	
	
	
	


  public void MobileNumber(String mNumber)
  {
	  textmobilenumber.sendKeys(mNumber);
	  
  }
  
  public void ContinueButton()
  {
	  continuebutton.click();
  }
  
  public void LogoutAndContinueButton()
  {
  logoutandcontinuebutton.click();
  }
  
  public void PasswordInputBox1(String password1)
  {
	  testpasswordinputbox1.sendKeys(password1);
  }
  
  public void PasswordInputBox2(String password2)
  {
	  testpasswordinputbox2.sendKeys(password2);
  }
  
  
  public void PasswordInputBox3(String password3)
  {
	  testpasswordinputbox3.sendKeys(password3);
  }
  
  
  public void PasswordInputBox4(String password4)
  {
	  testpasswordinputbox4.sendKeys(password4);
  }
  
  
  public void VerifyButton()
  {
	  verifybutton.click();
  }
  
  
  }