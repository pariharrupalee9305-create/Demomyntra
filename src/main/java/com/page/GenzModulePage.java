package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import keyword.Keyword;

public class GenzModulePage {

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

	
	public List<String> getListOfAllProductOfgenzSec() {
		List<String> list = new ArrayList<String>();
		
		for (WebElement product : ListOfProductOnGenz) {
			String product_Name=product.getText();
			if (product_Name.equalsIgnoreCase("Women's Western Wear") ) {
				list.add(product_Name);
			}
		}
		return list;
		
	}

	
	@FindBy(xpath = "(//a[text()='Shirts Under ₹499'])[1]")
	public WebElement shirtsOngenzSec;

	
	public void clickOnShirtinGenzSec() {
		shirtsOngenzSec.click();
	}

	
	@FindBy(xpath = "//div[@class=\"search-searchProductsContainer row-base\"]/section/ul/li[1]")
	public WebElement FirstImg;

	
	public void clickOnFirstImgInGenzSec() {
		FirstImg.click();
	}

	
	@FindBy(xpath = "//h1[text()='Vertical Striped Cutaway Collar Regular Shirt']")
	WebElement getnameoffirstPro;

	//somthing wrong
	public String getProductNameBeforeAddToCart() {
		return getnameoffirstPro.getText();
	}

	
	@FindBy(xpath = "//a[text()='Vertical Striped Cutaway Collar Regular Shirt']")
	WebElement getnameofFirstProAfterAddCart;

	
	public String getProductNameAfterAddToCart1() {
		return getnameofFirstProAfterAddCart.getText();
	}

	
	@FindBy(xpath = "(//button[@class=\"size-buttons-size-button size-buttons-size-button-default\"])[1]")
	WebElement size;

	
	public void clickOnSize() {
		size.click();
	}

	
	@FindBy(xpath = "//span[@class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\"]")
	WebElement addToCart;

	
	public void clickOnAddToCart() {
		addToCart.click();
	}

	
	@FindBy(xpath = "//a[@class=\"pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center \"]")
	public WebElement goToBag;

	
	public void clickGoToBag() {
		goToBag.click();
	}

	@FindBy(xpath = "//div[@class=\"search-searchProductsContainer row-base\"]/section/ul/li[5]")
	WebElement fifthImg;

	
	public By ForthImg = By.xpath("//div[@class=\"search-searchProductsContainer row-base\"]/section/ul/li[5]");

	
	public void clickOnFifthImg() {
		fifthImg.click();
	}

	
	@FindBy(xpath = "(//a[text()='Trousers Under ₹699'])[2]")
	public WebElement WomenTrousers;

	
	public void clickOnWomenTrousers() {
		WomenTrousers.click();
	}

	@FindBy(xpath = "//ul[@class=\"brand-list\"]/li[4]")
	WebElement Brand;

	public void clickOnBrandName() {
		Brand.click();

	}

	
	@FindBy(xpath = "(//div[@class=\"product-productMetaInfo\"])[2]/h3")
	List<WebElement> listOrBrandSelectedPro;

	
	public void getBrandName() {
		for (WebElement List : listOrBrandSelectedPro) {
			String ListofProduct = List.getText();
			System.out.println(ListofProduct);
		}
	}

	
	public void getfiveBrandNameOfProduct() {
		int count = listOrBrandSelectedPro.size();
		for (int i = 0; i <= count - 50; i++) {
			Keyword.driver.findElements(By.xpath("(//div[@class=\"product-productMetaInfo\"])[" + i + "]/h3"));
			String list = listOrBrandSelectedPro.get(i).getText();
			System.out.println(list);
		}
	}

	
	@FindBy(xpath = "(//span[@class=\"myntraweb-sprite filter-search-iconSearch sprites-search\"])[1]")
	WebElement BrandSearchBar;

	
	By BrandSrchBar = By
			.xpath("//div[@class=\"filter-search-filterSearchBox\"]/input[@placeholder=\"Search for Brand\"]");

	public void clickOnBrandOfSearchBar() {
		BrandSearchBar.click();
	}

	
	@FindBy(xpath = "//input[@class=\"filter-search-inputBox\"]")
	WebElement BrandSearchText;

	
	public void sendTextOnSearchBar(String Brand_Name) {
		BrandSearchText.sendKeys(Brand_Name);
	}

	
	@FindBy(xpath = "//input[@value=\"SWADESI STUFF\"]")
	WebElement selectBrand;

	
	public void clickonSelectedbrandname() {
		selectBrand.click();
	}

	@FindBy(xpath = "//a[text()='Kurtis Under ₹499']")
	public WebElement WomenKurta;

	public void clickOnWomenKurta() {
		WomenKurta.click();
	}

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite sort-downArrow sprites-downArrow\"]")
	WebElement SortByArrow;

	public void clickOnArrowOfSortBy() {
		SortByArrow.click();
	}

	@FindBy(xpath = "//ul[@class=\"sort-list\"]/li[3]")
	WebElement Popularity;

	public void clickOnPopularity() {
		Popularity.click();
	}

	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[2]")
	WebElement img;

	public void moveToImg() {
		Actions action = new Actions(Keyword.driver);
		action.moveToElement(img).perform();
	}

	@FindBy(xpath = "(//span[@class=\"myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted\"])[2]")
	WebElement WishList;

	public void clickOnWishlist() {
		WishList.click();
	}
}
