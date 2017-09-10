package com.automation.uiautomation.HomePage;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.uiautomation.testBase.TestBase;
import com.automation.uiautomation.uiActions.HomePage;

public class TC002_VerifyRegistrationFunctionality extends TestBase {

	HomePage homepage;
	String EmailId="raj009champ@gmail.com";
	String firstName="abc";
	String lastName="def";
	String password="abcdef"; 
	String date="2"; 
	String month="3"; 
	String year="1993"; 
	String Address="A-1601"; 
	String phone="123456"; 
	String company="TechM";
	String city="Pune";
	String state="Colorado"; 
	String PinCode="41105";
	String Country="United States";
	
	@BeforeTest
	public void testSetup()
	{
		init();
	}
	
	@Test
	public void verifyRegistrationFunctionality()
	{
		homepage=new HomePage(driver);
		homepage.creatNewAccount(EmailId, firstName,
				lastName, password, date, month, year,
				Address, phone, company, city, state, PinCode, Country);
		Assert.assertEquals(homepage.RegistrationSuccessMessage(), "Welcome to your account. Here you can manage all of your personal information and orders.");
	}
	
	@AfterTest
	public void closeBrowser()
	{
	driver.quit();
	}
}
