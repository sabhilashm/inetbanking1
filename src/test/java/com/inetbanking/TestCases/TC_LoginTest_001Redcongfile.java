package com.inetbanking.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbsnking.pageObiect.loginPage;

public class TC_LoginTest_001Redcongfile extends BaseClassRedcongfile {
	
	
	
	@Test	
	public void logintest() throws InterruptedException, IOException 
	{
	driver.get(baseURL);
	logger.info("url is open");

	loginPage lp=new loginPage(driver);
	lp.setUsername(Username);
	logger.info(Username);
	lp.setPassword(Password);
	logger.info("Enter the passsword");
	lp.clicksubmit();
	logger.error("HI");
	
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		Thread.sleep(5000);
		logger.error("HI");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
		
	} else {
		captureScreen(driver,"test1");
		Assert.assertTrue(false);

	}
}

}
