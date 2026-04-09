package Modules;


import java.util.List;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.Search;

import keyword.Keyword;
import testbase.Testbase;
import utility.WaitFor;

public class Negative extends Testbase {

	Search search;

	@Test
	public void verifySearchWithInvalidProduct() throws InterruptedException {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		search.enterTextOnSearchBar("76768678787");
		Keyword.clickEnter(search.Search);
		search.getListOfSearch();
		String error_msg=search.getErrorMsgWithInvalidCredentialOnSearch();
		Assert.assertTrue(error_msg.contains("Please check the spelling or try searching something else"));
	}
	@Test
	public void verifySearchBarWithSpecialCharacter() {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		search.enterTextOnSearchBar("$%^&#@*");
		Keyword.clickEnter(search.Search);
		search.getListOfSearch();
		String error_msg=search.getErrorMsgWithInvalidCredentialOnSearch();
		Assert.assertTrue(error_msg.contains("Please check the spelling or try searching something else"));
		}
	
	@Test
	public void verifyCaseSensitivity() {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		search.enterTextOnSearchBar("JEANS");
		Keyword.clickEnter(search.Search);
		search.getListOfSearch();
		String Title=Keyword.getTitle();
		System.out.println(Title);
		Assert.assertTrue(Title.contains("Jeans"));
	
	}
	@Test
	public void verifyPartialKeyword() throws InterruptedException {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		search.enterTextOnSearchBar("shirt");
		WaitFor.ElementToBeVisible(search.listOfProduct);
		List<String> productList=search.getListOfSearch();
		Keyword.clickEnter(search.Search);
		System.out.println(productList.size());
		Assert.assertTrue(productList.size()>0);
	}
	
}
