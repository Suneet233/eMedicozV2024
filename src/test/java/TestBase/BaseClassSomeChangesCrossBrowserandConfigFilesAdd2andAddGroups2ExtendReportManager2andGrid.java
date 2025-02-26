package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager; // jab second no likhenege tab ye ayega import karke

//import org.apache.logging.log4j.core.Logger;  // yaha add hoga no 1 import karke

import org.apache.logging.log4j.Logger;  // number 2 likh ke isko change karnge ye wahi hai jo no 1 import karke aya the uper wala samajhne ke liye likha hua hai



public class BaseClassSomeChangesCrossBrowserandConfigFilesAdd2andAddGroups2ExtendReportManager2andGrid {
	
	public static WebDriver driver;  // static websdriver likhenge yaha Extend reprot manager run karwane ke liye kyu ki rxtend utilities file mai b humne driver lukh rakha hai
	
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
		
		
		if(P.getProperty("execution_env").equalsIgnoreCase("remote"))  // Grid ke liye yaha se change karenge
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			else if (os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("NomMatching OS");
				return;
			}
			
			// browser Grid ke liye change kiya hai
			
			switch(br.toLowerCase())
			{
			case "chrome": capabilities.setBrowserName("chrome"); break;
			case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
			default: System.out.println("No Matching Browser"); return;              
			
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		
		
		if(P.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(br.toLowerCase())  // 3rd ye add kareneg switch ko yaha pe niche tak dafault tak cross browser ke liye
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver(); break;
			case "firefox" : driver=new FirefoxDriver(); break;
			default : System.out.println("Invalid Browser Name"); return;   // // yaha tak change kiya hai
			}
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

			public String captureScreen(String tname) throws IOException {

				String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
						
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				
				String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
				File targetFile=new File(targetFilePath);
				
				sourceFile.renameTo(targetFile);
				return targetFilePath;
			}
}


