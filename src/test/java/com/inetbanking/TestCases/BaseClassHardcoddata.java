package com.inetbanking.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassHardcoddata {
	
	public String baseURL="http://demo.guru99.com/V4/";
	public String Username="mngr292805";
	public String Password="ydehate";
	public static WebDriver driver;
	
	
	public static Logger logger; 
    @BeforeClass
	public void setup() {
    	/*System.setProperty("WebDriver.chrome.driver","D:\\hybrid framework work space\\inetBankingV1\\Drivers\\chromedriver.exe");
    	driver=new ChromeDriver();*/
    
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        
logger =Logger.getLogger("ebanking");
PropertyConfigurator.configure("Log4j.properties");
	}
    
    @AfterClass
    public void tearDown() {
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.quit();
    }
    
    public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
