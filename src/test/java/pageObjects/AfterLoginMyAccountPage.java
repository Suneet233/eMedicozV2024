package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginMyAccountPage extends BasePage {
	
	
	
	public AfterLoginMyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='×']") WebElement myaccountpage;
	
	@FindBy(xpath="//button[normalize-space()='Logout']") WebElement clickonlogoutbutton;
	
	public boolean IsMyAccountPageExist()
	
	{
		try 
		{
			return (myaccountpage.isDisplayed());
		}
		
		catch (Exception e)
		{
			return false;
		}
	}

	public void ClickOnTheLogoutButton ()
	
	{
		clickonlogoutbutton.click();
	}
	
}
