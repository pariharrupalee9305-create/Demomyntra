package testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static keyword.Keyword.*;

public class Testbase {
String appUrl="https://www.myntra.com";


	@BeforeMethod
	public void setUp() throws Exception {
		openBrowser("Chrome");
		lunachUrl1(appUrl);
		driver.manage().window().maximize();
		System.out.println("Lunch url successfully....!");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		quitBrowser();
		System.out.println("Close all open url.....!");
	}
}
