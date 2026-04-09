package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import keyword.Keyword;

public class Homepage {

	@FindBy(xpath = "//a[@class=\"myntraweb-sprite desktop-logo sprites-headerLogo \"]")
	WebElement Logo;

	@FindBy(xpath = "//input[@class=\"desktop-searchBar\"]")
	WebElement Search;

	@FindBy(xpath = "//a[@data-group=\"men\"]")
	WebElement MenModule;

	@FindBy(xpath = "//a[@data-group=\"women\"]")
	WebElement WomenModule;

	@FindBy(xpath = "//a[@data-group=\"kids\"]")
	WebElement kids;

	@FindBy(xpath = "//a[@data-group=\"\"]")
	WebElement Home;

	@FindBy(xpath = "//a[@data-group=\"beauty\"]")
	WebElement Beauty;

	@FindBy(xpath = "//a[@data-group=\"genz\"]")
	WebElement Genz;

	@FindBy(xpath = "//a[@data-group=\"studio\"]")
	WebElement Studio;

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement Profile;

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite desktop-iconWishlist sprites-headerWishlist\"]")
	WebElement WishList;

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite desktop-iconBag sprites-headerBag\"]")
	WebElement Bag;

	public void clickOnSearch() {
		Keyword.clickOnElement(Search);
	}

	public void enterOnTextSearch(String Product) {
		Search.sendKeys(Product);
	}

	public void getTextOnSearch() {
		Search.getText();
	}

	public void VerifyDisplayLogo() {
		Logo.isDisplayed();
	}

	public void verifyLogoClickAble() {
		Keyword.clickOnElement(Logo);

	}

	public void VerifyDisplayWomenModule() {
		WomenModule.isDisplayed();
	}

	public void verifyWomenModuleClickAble() {
		Keyword.clickOnElement(WomenModule);

	}

	public void VerifyDisplayKidsModule() {
		kids.isDisplayed();

	}

	public void verifyKidsModuleClickAble() {
		Keyword.clickOnElement(kids);

	}

	public void VerifyDisplayHomeModule() {
		Home.isDisplayed();
	}

	public void verifyHomeModuleClickAble() {
		Keyword.clickOnElement(Home);

	}

	public void VerifyDisplayBeautyModule() {
		Beauty.isDisplayed();
	}

	public void verifyBeaytyModuleClickAble() {
		Keyword.clickOnElement(Beauty);

	}

	public void VerifyDisplayGenzModule() {
		Genz.isDisplayed();
	}

	public void verifyZengModuleClickAble() {
		Keyword.clickOnElement(Genz);

	}

	public void VerifyDisplayStudioModule() {
		Studio.isDisplayed();
	}

	public void VerifyDisplayMenModule() {
		MenModule.isDisplayed();
	}

	public void verifyMenModuleClickAble() {
		Keyword.clickOnElement(MenModule);
	}

}
