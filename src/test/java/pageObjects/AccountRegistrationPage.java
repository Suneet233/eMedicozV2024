package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='name']") WebElement nameinputbox;
	
	@FindBy(xpath="//input[@id='mail']") WebElement emailinputbox;
	
	@FindBy(xpath="//button[normalize-space()='Next']") WebElement submitbutton;
	
	@FindBy(xpath="//button[normalize-space()='Next']") WebElement  congratulationnextbutton;
	
	@FindBy(xpath="congratulationnextbutton") WebElement  choosestream;
	
	
	
	
	
	@FindBy(xpath="//button[normalize-space()='Next']") WebElement  afterchoosestreamnextbutton;
	
	@FindBy(xpath="//input[@id='test1']") WebElement  selecttogglebutton;
	
	
  
	
	
	
	
	
	
	  public void EmailInputBox(String name)
	  {
		  nameinputbox.sendKeys(name);
		  
	  }
	
	public void NameInputBox (String email)
	{
		emailinputbox.sendKeys(email);
	}
	
	
	
	
	
	
 
	
	public void SubmitButton() 
	{
	
	 //   WebElement checkBoxElement = driver.findElement(submitbutton);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", submitbutton);
	}
	
	public void CongratulationNextButton()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", congratulationnextbutton);
	}
	
	public void ChooseStream()
	
	{
		choosestream.click();
	}

public void AfterChooseStreamNextButton()
	
	{
	afterchoosestreamnextbutton.click();
	}


public void SelectToggleButton()

{
	selecttogglebutton.click();
}



	/*
	
	
	lp.emailid(randomString()+"@gmail.com"); // Sign up pe jaha randomly email id change karni ho
	
	lp.setfirstname(randomString()); // Noramal small letter mai likhaga randomly
	
	lp.setfirstname(randomString().toUpperCase()); //  Capital leetter mai likhana ho randomly toh
	
	
	
public String randomString()
	
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
		
	}



public String randomnumber()

{
	String generatednumber = RandomStringUtils.randomNumeric(10);  // No change honge is se random
	return generatednumber;
	
}

public String randomAlphaNumeric()

{
	String generatedstring = RandomStringUtils.randomAlphabetic(5);
	String generatednumber = RandomStringUtils.randomNumeric(5);  // No change honge is se random
	return ( generatedstring+generatednumber);
	
}
*/

	
}
