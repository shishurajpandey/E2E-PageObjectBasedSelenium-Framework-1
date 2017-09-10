package com.automation.uiautomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static final Logger log=Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	String URL="http://automationpractice.com/";
	String browser="chrome";
	
public void init()
{ 
	selectBrowser(browser);
	getUrl(URL);
	String log4jConfPath="log4j.properties";
	PropertyConfigurator.configure(log4jConfPath);
}

public void selectBrowser(String browser)
{log.info("Opening Browser:"+browser);
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", 
				"H:\\Selenium Automation_UDEMY\\ECLIPSE_WORKSPACE\\PageObjectE2EFramework\\Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\Selenium Automation_UDEMY\\ECLIPSE_WORKSPACE\\PageObjectE2EFramework\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	else{
		System.out.println("Please provide correct Browsername");
	}
	
}	
public void getUrl(String URL)
{
log.info("Placing url in Browser:"+URL);	
driver.get(URL);
log.info("Maximising Windows");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
}


}
