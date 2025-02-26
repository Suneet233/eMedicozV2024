package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	
	// Sign in button 
	
	@FindBy(xpath="//a[normalize-space()='Sign in']") WebElement signinlink;
	
	
	
	// Query code
	
	@FindBy(xpath="//input[@placeholder='Name']") WebElement testnamebox;
			
			
  @FindBy(xpath="//input[@placeholder='Email ID']") WebElement emailidbox;
	
			//input[@placeholder='Email ID']
  
  
  @FindBy(xpath="//div[@class='form-group']//select") WebElement dropdownbutton;
  
  @FindBy(xpath="//input[@placeholder='Mobile Number']") WebElement inputboxnumber;
  
  
  @FindBy(xpath="//textarea[@placeholder='Type your query...']")  WebElement  typeyourqueryinputbox;
  
  
	/*
	public void ClickSignINButton()
	{
		signinlink.click();
	}
	*/
  public void ClickSignINButton()
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", signinlink);
  }
	
	// Query code
	
	public void NameInputBox(String name)
	{
		testnamebox.sendKeys("name");
	}
	
	public void EmailInputBox(String email)
	{
		emailidbox.sendKeys("email");
	}
	
	public void MobileNumber(String number)
	{
		inputboxnumber.sendKeys("number");
	}
	
	
	
	public void testDDButton() {
        Select DRPCategory = new Select(dropdownbutton);
        DRPCategory.selectByVisibleText("FMGE");
	}
        
        public void YoursQuery(String yourquery)
    	{
        	typeyourqueryinputbox.sendKeys("yourquery");
    	}
    	
	}	

