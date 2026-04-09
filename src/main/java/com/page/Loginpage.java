package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import keyword.Keyword;

public class Loginpage {
	@FindBy(xpath="//span[text()='Profile']")
	WebElement Profile;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	WebElement Login;
	
	@FindBy(xpath="//input[@type=\"tel\"]")
	WebElement Phone_Num;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	WebElement Check_box;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	WebElement Continue;
	
	@FindBy(xpath="//span[text()='Get help']")
	WebElement getHelp;
	
	
	
	public void clickOnProfile() {
		Keyword.clickOnElement(Profile);
	}
	
	public void clickOnLogin() {
		Login.click();
	}
	
	public void enterPhoneNum(String enterusername) {
		Phone_Num.sendKeys(enterusername);
	}
	
	public void checkBox() {
		Check_box.click();
	}
	public void clickOnContinue() {
		Continue.click();;
	}
	public void clickOnGetHelp() {
		getHelp.click();
	}
	
}
