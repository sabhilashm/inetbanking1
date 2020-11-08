package com.inetbsnking.pageObiect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	

	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement bntlogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	
	
	
	public void setUsername(String uname) 
	{
		txtusername.sendKeys(uname);

	}
	
	public void setPassword(String Pwd) 
	{
		txtpassword.sendKeys(Pwd);

	}
	
	public void clicksubmit() 
	{
		bntlogin.click();

	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

}
