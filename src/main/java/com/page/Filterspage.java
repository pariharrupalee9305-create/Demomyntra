package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import keyword.Keyword;

public class Filterspage {
//filters on the base on gender

	@FindBy(xpath = "//ul[@class=\"gender-list\"]/li[1]")
	public WebElement men;

	public void clickOnMenSecation() {
		Keyword.clickOnElement(men);

	}

	@FindBy(xpath = "//ul[@class=\"gender-list\"]/li[2]")
	public WebElement women;

	public void clickOnWomenSecation() {
		Keyword.clickOnElement(women);

	}
	// Filter on the base on Categories

	@FindBy(xpath = "//ul[@class=\"categories-list\"]/li")
	public List<WebElement> listOfCategorise;

	public List<String> getListOfCategorise() {
		List<String> list = new ArrayList();
		for (WebElement string : listOfCategorise) {
			list.add(string.getText());
		}
		return list;
	}

	@FindBy(xpath = "placeholder=\"Search for Categories\"")
	public WebElement enterCategroyName;

	public void enterCategoryName(String Text) {
		Keyword.EnterText(enterCategroyName, Text);
	}

	@FindBy(xpath = "(//div[@class=\"filter-search-filterSearchBox\"])[1]")
	public WebElement searchBarCat;

	public void clickonSrachbarOfCategory() {
		Keyword.clickOnElement(searchBarCat);
	}

	@FindBy(xpath = "//label[@class=\"common-customCheckbox vertical-filters-label\"]")
	public WebElement selectCategory;

	public void selectCategory() {
		Keyword.clickOnElement(selectCategory);
	}

	// filter base on brand
	@FindBy(xpath = "(//div[@class=\"filter-search-filterSearchBox\"])[2]")
	public WebElement SearchBarOfBrand;

	public void clickonSrachbarOfBrand() {
		Keyword.clickOnElement(SearchBarOfBrand);
	}

	@FindBy(xpath = "//input[@placeholder=\"Search for Brand\"]")
	public WebElement enterBrandName;

	public By enter_Brand = By.xpath("//input[@placeholder=\"Search for Brand\"]");

	public String enterBrandname(String Text) {
		enterBrandName.sendKeys(Text);
		return Text;
	}

	@FindBy(xpath = "//label[@class=\"vertical-filters-label common-customCheckbox\"]")
	public WebElement BrandName;

	public By filter_Brand = By.xpath("//label[@class=\"vertical-filters-label common-customCheckbox\"]");

	public void selectBrandName() {
		Keyword.clickOnElement(BrandName);
	}

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite filter-search-iconSearch sprites-search\"]")
	public WebElement SearchBarOfColor;

	public void clickOnSerchBarOfColor() {
		Keyword.clickOnElement(SearchBarOfColor);
	}

	@FindBy(xpath = "//input[@placeholder=\"Search for Color\"]")
	public WebElement enterColorName;

	public void enterColorname(String Text) {
		Keyword.EnterText(enterColorName, Text);
	}

	@FindBy(xpath = "(//label[@class=\"common-customCheckbox\"])[1]")
	public WebElement ColorName;

	public void selectColorName() {
		Keyword.clickOnElement(ColorName);
	}

	@FindBy(xpath = "//ul[@class=\"discount-list\"]/li")
	public List<WebElement> listOfDiscount;

	public String name(int index) {
		WebElement list = listOfCategorise.get(index);
		String discount = list.getText();
		return discount;
	}

	@FindBy(xpath = "//div[@class=\"sort-sortBy\"]")
	public WebElement moveTodropDown;

	@FindBy(xpath = "//ul[@class=\"sort-list\"]/li")
	public List<WebElement> listOfSortBy;

	public void selectOptionInDropDown(int index) {
		Keyword.moveToElement(moveTodropDown);
		WebElement list = listOfSortBy.get(index);
		list.click();
	}

	public String getTextOfDropDown() {
		Keyword.moveToElement(moveTodropDown);
		String s = "";
		for (WebElement list : listOfCategorise) {
			s = list.getText();
		}

		return s;
	}

	// Filter base on Fabrics

	@FindBy(xpath = "//span[@class=\"atsa-upArrow sprites-arrowUpBold myntraweb-sprite\"]")
	public WebElement Fabrics;

	public void clickOnFabrics() {
		Fabrics.click();
	}

	@FindBy(xpath = "//ul[@class=\"atsa-values\"]/li[3]")
	public WebElement cotton;

	public void clickOnCotton() {
		cotton.click();
	}

	@FindBy(xpath = "//ul[@class=\"atsa-values\"]/li")
	public List<WebElement> listOf_Fabric;

	public String name(String Fabric) {
		for (WebElement list : listOfCategorise) {
			String FabricsName = list.getText();
			if (Fabric.equalsIgnoreCase(FabricsName));
				
		}
		return Fabric;
	}

}
