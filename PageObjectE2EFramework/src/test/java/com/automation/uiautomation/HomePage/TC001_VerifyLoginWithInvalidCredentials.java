package com.automation.uiautomation.HomePage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.uiautomation.testBase.TestBase;
import com.automation.uiautomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{

	Logger log=Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	
	HomePage homePage;
	@BeforeTest
	public void testSetup()
	{
		log.info("*********8Starting Test*********");
		init(); 
		
	}
	
	@Test
	public void loginWithInvalidCredentials()
	{
		homePage=new HomePage(driver);
		log.info("Login To Application with");
		homePage.loginToApplication("test123@gmail.com", "test12345");
		Assert.assertEquals(homePage.getLoginFailedText(),"Authentication failed.");
		
	}
	
	@AfterClass
	public void endTest()
	{log.info("*********Closing Browser*********");
		driver.close();
	}
}
