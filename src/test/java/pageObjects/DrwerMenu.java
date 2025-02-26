package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrwerMenu extends BasePage {

	public DrwerMenu(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath = "//button[normalize-space()='Logout']") WebElement lGTButton;
		
		public void Logoutbutton()
		{
			lGTButton.click();
	}

}
