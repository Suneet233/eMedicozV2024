package TestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassLecture {
	
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
	
	// Random name email lagane ke liye use hota hai
			public String randomeString()
			{
		String	generatedstring =RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
			}

			// Random number lagane ke liye
			
			public String randomeNumber()
			{
		String	generatednumber =RandomStringUtils.randomNumeric(10);
		return generatednumber;
			}
			
			// Random password laga ne ke liye
			
			public String randomeAlphaNumeric()
			{
		String	generatedstring =RandomStringUtils.randomAlphabetic(3);
		String	generatednumber =RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
			}
	

}
