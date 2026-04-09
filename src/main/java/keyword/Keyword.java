
package keyword;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.exception.InvalidBrowserName;
import com.exception.InvalidLocatorType;

import jdk.internal.classfile.impl.Options.Key;

/*
 * Keywords driven framework is just a common actions that going to perform on
 * our web Application.
 */
public class Keyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browsername) throws Exception {

		switch (browsername) {

		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:

			throw new InvalidBrowserName(browsername);

		}
	}

	public static String getUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

	public static void lunachUrl1(String url) {
		driver.get(url);

	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static String getTextOfListOfWebElement(By Element) {
		String ListOfProduct=null;
		List<WebElement> list = driver.findElements(Element);
		for (WebElement listofProduct : list) {
		 ListOfProduct = listofProduct.getText();
			System.out.println(ListOfProduct);
		}
		return ListOfProduct;
	}

	public static int getCountAndListOfWebelement(By Element) {
		List<WebElement> list = driver.findElements(Element);
		int count = list.size();
		System.out.println(count);
		for (int i = 1; i <= count; i++) {
			String listOfProduct = list.get(i).getText();
			System.out.println(listOfProduct);
		}
		return count;
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void clickOnElement(String locatortype, String Locator) {
		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("LinkText")) {
			driver.findElement(By.linkText(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("PartialLinkText")) {
			driver.findElement(By.partialLinkText(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(Locator)).click();
		} else if (locatortype.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(Locator)).click();
		} else {
			throw new InvalidLocatorType(locatortype);
		}

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void swichToNewTab() {
		Set<String> tabs = driver.getWindowHandles();
		for (String window : tabs) {
			driver.switchTo().window(window);
			System.out.println("Swich to new tab" + driver.getCurrentUrl());
		}
	}

	public static void EnterText(String locatortype, String Locator, String text) {
		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("LinkText")) {
			driver.findElement(By.linkText(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("PartialLinkText")) {
			driver.findElement(By.partialLinkText(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(Locator)).sendKeys(text);
		} else if (locatortype.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(Locator)).sendKeys(text);
		} else {
			throw new InvalidLocatorType(locatortype);
		}

	}

	public static void EnterText(WebElement element, String Text) {
		element.sendKeys(Text);
	}

	public static void clickEnter(WebElement Enter) {
		Enter.sendKeys(Keys.ENTER);
	}

	public static void getText(String locatortype, String Locator) {
		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("LinkText")) {
			driver.findElement(By.linkText(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("PartialLinkText")) {
			driver.findElement(By.partialLinkText(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(Locator)).getText();
		} else if (locatortype.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(Locator)).getText();
		} else {
			throw new InvalidLocatorType(locatortype);
		}

	}

	public static String getText(WebElement element) {
		String Text = element.getText();
		return Text;
	}

	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public static void pasue(int time) {
		Actions action = new Actions(driver);
		action.pause(time).perform();

	}

	public static void scrollUsingActions() {
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500).perform();

	}

	public static void scrollByWebElement(WebElement Element) {
		Actions action = new Actions(driver);
		action.scrollToElement(Element).perform();
	}
	// swich to window //Swich to frame //verify test //Select dropdown
}
