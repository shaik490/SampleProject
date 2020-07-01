package com.beta.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beta.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory  -OR:
	@FindBy(xpath="//input[@id='p_lt_WebPartZone8_Zonesection_pageplaceholder_p_lt_ctl00_MarcariaLogonForm_Login1_UserName']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='p_lt_WebPartZone8_Zonesection_pageplaceholder_p_lt_ctl00_MarcariaLogonForm_Login1_Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='p_lt_WebPartZone8_Zonesection_pageplaceholder_p_lt_ctl00_MarcariaLogonForm_Login1_LoginButton']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='personal action-button']")
	WebElement MyaccountBtn;
	
	@FindBy(xpath="//div[@class='col-md-4 col-sm-4 col-xs-4 header-logo']//a//img")
	WebElement NominusLogo;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateNominusLogo() {
		return NominusLogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) {
		MyaccountBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	

}
