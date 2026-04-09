package com.page;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import keyword.Keyword;

public class Search {
	@FindBy(xpath = "//input[@placeholder=\"Search for products, brands and more\"]")
	public WebElement Search;

	public void clickOnSearchBar() {
		Keyword.clickOnElement(Search);
	}

	public String enterTextOnSearchBar(String Text) {
		Keyword.EnterText(Search, Text);
		return Text;
	}

	public String getTextOnSearch() {
		return Search.getAttribute("//input[@placeholder=\\\"Search for products, brands and more\\\"]");
	}

	@FindBy(xpath = "//ul[@class=\"desktop-group\"]/li")
	public List<WebElement> listOfProductOnSearch;

	public By listOfProduct = By.xpath("//ul[@class=\"desktop-group\"]/li");

	public void getListOfSearchCount() {
		int s = listOfProductOnSearch.size();
	}

	public List<String> getListOfSearch() {
		List<String> list = new ArrayList();
		for (WebElement product : listOfProductOnSearch) {
			boolean s = list.add(product.getText());
		}
		return list;
	}

	public String ListOfProductOnSearch() throws InterruptedException {
		String list = "";
		for (WebElement webElement : listOfProductOnSearch) {
			list = webElement.getText();
			Thread.sleep(7000);
		}
		return list;
	}

	@FindBy(xpath = "//ul[@class=\"breadcrumbs-list\"]")
	public WebElement scrum;

	public boolean isDisplayed(WebElement Text) {
		if (Text.isDisplayed()) {
			return true;
		} else
			System.out.println("product is not displayed");
		return false;

	}

	@FindBy(xpath = "//p[@class=\"index-infoSmall\"]")
	public WebElement errorMagOnSearch;

	public String getErrorMsgWithInvalidCredentialOnSearch() {
		return Keyword.getText(errorMagOnSearch);
	}
}
