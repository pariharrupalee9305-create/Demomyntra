package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import keyword.Keyword;

public class Productpage {

	@FindBy(xpath = "//a[@data-group=\"genz\"]")
	public WebElement genz;

	public void moveToGenzSection() {
		Actions action = new Actions(Keyword.driver);
		action.moveToElement(genz).perform();
	}

	public void clickOnGenzSection() {
		Keyword.clickOnElement(genz);
	}

	@FindBy(xpath = "//div[@data-group=\"genz\"]/li/ul/li/a")
	List<WebElement> ListOfProductOnGenz;

	public By  ListOfProductsOnGenz=By.xpath("//div[@data-group=\\\"genz\\\"]/li/ul/li/a");
	
			public List<String> getListOfAllProductOfgenzSec() {
		List<String> list = new ArrayList<String>();
		for (WebElement product : ListOfProductOnGenz) {
			list.add(product.getText());
		}
		return list;
	}

	@FindBy(xpath = "(//a[text()='Shirts Under ₹499'])[1]")
	public WebElement shirtsOngenzSec;

	public void clickOnShirtinGenzSec() {
		shirtsOngenzSec.click();
	}
	
	@FindBy(xpath = "(//a[text()='Trousers Under ₹699'])[2]")
	public WebElement WomenTrousers;

	
	public void clickOnWomenTrousers() {
		WomenTrousers.click();
	}
	
	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[2]")
	WebElement img;

	public void moveToImg() {
		Actions action = new Actions(Keyword.driver);
		action.moveToElement(img).perform();
	}

	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[1]")
	public WebElement firstproduct;

	public void clickOnFirstProduct() {
		Keyword.clickOnElement(firstproduct);
	}

	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[5]")
	public WebElement Img;

	public void clickOnImg() {
		Keyword.clickOnElement(Img);
	}

	@FindBy(xpath = "(//span[@class=\"product-wishlistFlex product-actionsButton product-wishlist \"])[1]")
	public WebElement wishlist;

	public void clickOnWishlist() {
		Keyword.clickOnElement(wishlist);
	}
//
	@FindBy(xpath="//ul[@class=\"results-base\"]/li/descendant::a/div[2]/h3")
	public List<WebElement> productName;
	
	
public Boolean verfyProductBrandName(String Text) {
	for (WebElement webElement : ListOfProductOnGenz) {
		if(webElement.getText().equalsIgnoreCase(Text)) {
			return false;
		}
	}
	System.out.println("no result found");
	return true;
	
}
}
