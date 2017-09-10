package com.automation.uiautomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
Logger log=Logger.getLogger(HomePage.class.getName());
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignInHomePage;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement Email;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement SignInSubmit;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement invalidLoginText;
	
	
	
	public void loginToApplication(String username, String password)
	{   
		log.info("login with given user id and password");
		SignInHomePage.click();
		Email.sendKeys(username);
		Password.sendKeys(password);
		SignInSubmit.click();
		log.info("login successful");
	    
	}
	
	public String getLoginFailedText()
	{log.info("Returned invalid text");
		return invalidLoginText.getText();
	}
	
	@FindBy(xpath=".//*[@id='email_create']")
	WebElement newEmailAddress;
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement submitCreate;
	
	@FindBy(xpath=".//*[@id='id_gender1']")
	WebElement custGender;
	
	@FindBy(xpath=".//*[@id='customer_firstname']")
	WebElement custFirstName;
	
	@FindBy(xpath=".//*[@id='customer_lastname']")
	WebElement custLastName;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement newPassword;
	
	@FindBy(xpath=".//*[@id='days']")
	WebElement dateDOB;
	
	@FindBy(xpath=".//*[@id='months']")
	WebElement monthsDOB;
	
	@FindBy(xpath=".//*[@id='years']")
	WebElement yearsDOB;
	
	@FindBy(xpath=".//*[@id='newsletter']")
	WebElement newsLetter;
	
	
	@FindBy(xpath=".//*[@id='firstname']")
	WebElement addfirstName;
	
	@FindBy(xpath=".//*[@id='lastname']")
	WebElement addLastName;
	
	@FindBy(xpath=".//*[@id='company']")
	WebElement addCompany;
	
	@FindBy(xpath=".//*[@id='address1']")
	WebElement addAddress;
	
	@FindBy(xpath=".//*[@id='address2']")
	WebElement addAddress2;
	
	@FindBy(xpath=".//*[@id='city']")
	WebElement addCity;
	
	@FindBy(xpath=".//*[@id='id_state']")
	WebElement addStateDropdown;
	
	@FindBy(xpath=".//*[@id='postcode']")
	WebElement addPostCode;
	
	@FindBy(xpath=".//*[@id='id_country']")
	WebElement addCountryDropDown;
	
	@FindBy(xpath=".//*[@id='other']")
	WebElement addAdditionlInfo;
	
	@FindBy(xpath=".//*[@id='phone_mobile']")
	WebElement addMobilePhone;
		
	@FindBy(xpath=".//*[@id='alias']")
	WebElement addAddAlias;
	
	@FindBy(xpath=".//*[@id='submitAccount']")
	WebElement addSubmitAccount;
	
	@FindBy(className="info-account")
	WebElement RegistrationSuccessMessage;
	
	
public void creatNewAccount(String EmailId,String firstName,String lastName,String password, String date, String month, 
		String year, String Address, String phone, String company,
		String city, String state, String PinCode,String Country )
{
	SignInHomePage.click();
	newEmailAddress.sendKeys(EmailId);
	submitCreate.click();
	custGender.click();
	custFirstName.sendKeys(firstName);
	custLastName.sendKeys(lastName);
	Password.sendKeys(password);
	Select dobdays=new Select(dateDOB);
	dobdays.selectByValue(date);
	Select dobMonth=new Select(monthsDOB);
	dobMonth.selectByValue(month);
	Select dobYear=new Select(yearsDOB);
	dobYear.selectByValue(year);
	newsLetter.click();
	addfirstName.sendKeys(firstName);
	addLastName.sendKeys(lastName);
	addAddress.sendKeys(Address);
	addCity.sendKeys(city);
	addMobilePhone.sendKeys(phone);
	addCompany.sendKeys(company);
	addPostCode.sendKeys(PinCode);
	Select stateDropdown=new Select(addStateDropdown);
	stateDropdown.selectByVisibleText(state);
	Select countryDropdown=new Select(addCountryDropDown);
	countryDropdown.selectByVisibleText(Country);
	addAddAlias.sendKeys("My add-1");
	addSubmitAccount.click();
}

public String RegistrationSuccessMessage()
{
	return RegistrationSuccessMessage.getText();
}

}

