package com.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import keyword.Keyword;

public class AddToCartpage {
	
	

	@FindBy(xpath = "class=\"colors-heading\"")
	public WebElement headingOfSelectedImgToAddToBag;

	public String headingOfSelectedPro() {
		String Text=headingOfSelectedImgToAddToBag.getText();
		return Text;
		
	}
	
	@FindBy(xpath="//div[@class=\"size-buttons-size-buttons\"]/div[3]")
	public WebElement SizeOfProduct;
	
	public By sizeOfProduct=By.xpath("//div[@class=\\\"size-buttons-size-buttons\\\"]/div[3]");
	
	public void clickOnSize() {
	Keyword.clickOnElement(SizeOfProduct);
	}
	
	
	@FindBy(xpath="//span[@class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\"]")
	public WebElement AddToCart;
	
	public void clickOnAddToCart() {
		Keyword.clickOnElement(AddToCart);
	}
	
	
	@FindBy(xpath="//input[@placeholder=\"Enter pincode\"]")
	public WebElement EnterPinCode;

	public void enterPIncode(String Text) {
		EnterPinCode.sendKeys(Text);
	}
	
	@FindBy(xpath="//input[@class=\"pincode-check pincode-button\"]")
	public WebElement ckeckPinCode;
	
	
	public void clickOnCheckBoxInPinCode() {
		Keyword.clickOnElement(ckeckPinCode);
	}
	
	
	@FindBy(xpath="//button[@class=\"pincode-check-another-pincode pincode-button\"]")
	public WebElement ChangePinCode;
	
	public void clickOnchangePinCode() {
		Keyword.clickOnElement(ChangePinCode);
		
	}
	
	@FindBy(xpath="//span[text()='WISHLIST']")
	public WebElement AddWishlist;
	
	public void clickOnWishlist() {
		Keyword.clickOnElement(AddWishlist);
	}
	
	
	@FindBy(xpath = "//a[@class=\"pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center \"]")
	public WebElement goToBag;
	
	
	public void clickGoToBag() {
		goToBag.click();
	}
	
	@FindBy(xpath="//span[text()='1/1 Items Selected']")
	public WebElement add;
	
	public String addSuccesFully() {
		return add.getText();
	}
	
	@FindBy(xpath="//button[text()='REMOVE']")
	public WebElement removeOption;
	
	@FindBy(xpath="//button[@class=\"inlinebuttonV2-base-actionButton \"]")
	public WebElement remove;
	
	public void clickOnRemoveProduct() {
		Keyword.clickOnElement(removeOption);
        Keyword.clickOnElement(remove);
	}

	@FindBy(xpath="//div[@class=\"emptyCart-base-emptyDesc\"]")
	public WebElement nothing;
	
	public String RemoveDoneFromCart() {
		return nothing.getText();
	}
}
