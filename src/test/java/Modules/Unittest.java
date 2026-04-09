package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.AddToCartpage;
import com.page.Filterspage;
import com.page.GenzModulePage;
import com.page.Productpage;
import com.page.Search;

import keyword.Keyword;
import testbase.Testbase;
import utility.WaitFor;

public class Unittest extends Testbase {
	GenzModulePage genzpage;
	AddToCartpage Cartpage;
	Productpage product;
	Filterspage filterpage;
	Search search;

	@Test
	public void verifyNavigateToGenzSection() {
		genzpage = PageFactory.initElements(Keyword.driver, GenzModulePage.class);
		genzpage.clickOnGenzSection();
		String child_url = Keyword.getUrl();
		Assert.assertTrue(child_url.contains("fwd-women"));
	}

	@Test
	public void verifyHoverFunctionality() {
		genzpage = PageFactory.initElements(Keyword.driver, GenzModulePage.class);
		Keyword.moveToElement(genzpage.genz);
		product = PageFactory.initElements(Keyword.driver, Productpage.class);

		String list = Keyword.getTextOfListOfWebElement(product.ListOfProductsOnGenz);
		Assert.assertTrue(list.toLowerCase().contains("Women's Western Wear"));
	}

	@Test
	public void verifyProductCategories() throws Exception {
		genzpage = PageFactory.initElements(Keyword.driver, GenzModulePage.class);
		Keyword.moveToElement(genzpage.genz);
		Thread.sleep(1000);
		List<String> products = genzpage.getListOfAllProductOfgenzSec();
		Thread.sleep(1000);
		System.out.println(products);
		Assert.assertTrue(products.contains("Women'S Western Wear"), "Women'S Western Wear not fount in product list");
		Assert.assertEquals(products.get(0), "Women'S Western Wear");

	}

	// genzpage = PageFactory.initElements(Keyword.driver, GenzModulePage.class);
	// Cartpage =PageFactory.initElements(Keyword.driver, AddToCartpage.class);
	// product= PageFactory.initElements(Keyword.driver, Productpage.class);

	@Test
	public void verifyProductAddToCart() throws InterruptedException {
		product = PageFactory.initElements(Keyword.driver, Productpage.class);
		product.moveToGenzSection();
		WaitFor.ElementToBeClickAble(product.shirtsOngenzSec);
		product.clickOnShirtinGenzSec();
		product.clickOnFirstProduct();
		Keyword.swichToNewTab();
		Cartpage = PageFactory.initElements(Keyword.driver, AddToCartpage.class);
		WaitFor.ElementToBeClickAble(Cartpage.SizeOfProduct);
		Cartpage.clickOnSize();
		Cartpage.clickOnAddToCart();
		WaitFor.ElementToBeClickAble(Cartpage.goToBag);
		Cartpage.clickGoToBag();
		String add = Cartpage.addSuccesFully();
		Assert.assertEquals(add, "1/1 ITEMS SELECTED");
		
	}
	

	@Test
	public void verifyRemoveProductFromCart() {
		product = PageFactory.initElements(Keyword.driver, Productpage.class);
		product.moveToGenzSection();
		WaitFor.ElementToBeClickAble(product.shirtsOngenzSec);
		product.clickOnShirtinGenzSec();
		product.clickOnImg();
		Keyword.swichToNewTab();
		Cartpage = PageFactory.initElements(Keyword.driver, AddToCartpage.class);
		Cartpage.clickOnSize();
		Cartpage.clickOnAddToCart();
		WaitFor.ElementToBeClickAble(Cartpage.goToBag);
		Cartpage.clickGoToBag();
		Cartpage.clickOnRemoveProduct();
		String url=Keyword.getUrl();
		Assert.assertEquals(url, "https://www.myntra.com/checkout/cart");
	}

	@Test
	public void verifyBrandFilter() throws InterruptedException {
		product = PageFactory.initElements(Keyword.driver, Productpage.class);
		product.moveToGenzSection();
		WaitFor.ElementToBeClickAble(product.shirtsOngenzSec);
		product.clickOnShirtinGenzSec();
		filterpage = PageFactory.initElements(Keyword.driver, Filterspage.class);
		Keyword.scrollUsingActions();
		filterpage.clickonSrachbarOfBrand();
		WaitFor.presenceToBeElement(filterpage.enter_Brand);
		String Brandname = filterpage.enterBrandname("OOTPTAANG");
		WaitFor.presenceToBeElement(filterpage.filter_Brand);
		filterpage.selectBrandName();
		Thread.sleep(2000);
		product.verfyProductBrandName(Brandname);
	}

	@Test
	public void VerifySearchwithValidProduct() throws InterruptedException {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		String nameOf_serachProduct = search.enterTextOnSearchBar("Shoes");
		Keyword.clickEnter(search.Search);
		Thread.sleep(10000);
		String title = Keyword.driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(nameOf_serachProduct));

	}

	@Test
	public void verifyAuto_SuggestionsOnSearch() {
		search = PageFactory.initElements(Keyword.driver, Search.class);
		search.clickOnSearchBar();
		search.enterTextOnSearchBar("shi");
		WaitFor.ElementToBeVisible(search.listOfProduct);
		List<String> productList=search.getListOfSearch();
		Keyword.clickEnter(search.Search);
		System.out.println(productList.size());
		Assert.assertTrue(productList.size()>0);
	}

	@Test
	public void verifyAddProductToWishlist() throws InterruptedException {
		genzpage = PageFactory.initElements(Keyword.driver, GenzModulePage.class);
		genzpage.moveToGenzSection();
		WaitFor.ElementToBeClickAble(genzpage.WomenKurta);
		genzpage.clickOnWomenKurta();
		Thread.sleep(2000);
		genzpage.clickOnArrowOfSortBy();
		genzpage.clickOnPopularity();
		Thread.sleep(2000);
		genzpage.moveToImg();
		genzpage.clickOnWishlist();
        
	}

}
