package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager; // jab second no likhenege tab ye ayega import karke

//import org.apache.logging.log4j.core.Logger;  // yaha add hoga no 1 import karke

import org.apache.logging.log4j.Logger;  // number 2 likh ke isko change karnge ye wahi hai jo no 1 import karke aya the uper wala samajhne ke liye likha hua hai



public class BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups {
	
	public WebDriver driver;
	
//	public Logger logger; // First ye likhenge or import karenge no 1
	
	public org.apache.logging.log4j.Logger logger;  // second no2 likh ke import karke ye change hoga. 
	
	public Properties P;  // Logger file ke liye code likha hai 1
	
	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({"os","browser"})  // Cross browser ke liye 1 yaha ye likhenge 
	
	public void setup(String os, String br) throws 
IOException
	{
		FileReader file=new FileReader(".//src//test//resources//config.properties");  // 2 Code yaha likhenge config files ke liye
		
		P=new Properties();  // 3 Code yaha likhenge config files ke liye
		
		P.load(file);      // 4 Code yaha likhenge config files ke liye
		
		
		logger=LogManager.getLogger(this.getClass());  // Second  ye code likhenge no 2 
		
		switch(br.toLowerCase())  // 3rd ye add kareneg switch ko yaha pe niche tak dafault tak cross browser ke liye
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("Invalid Browser Name"); return;
		}
				
				
	//	driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(P.getProperty("appURL"));   // 5 code reading url from properties file  // Conflig files
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		
	}
	
	@AfterClass(groups= {"Sanity","Regression","Master"})
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
