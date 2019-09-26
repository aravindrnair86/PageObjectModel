package com.invia.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.invia.qa.pages.HomePage;
import com.invia.qa.pages.HotelSelectPage;
import com.invia.qa.base.TestBase;
import com.invia.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	HotelSelectPage hotelSelectPage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		hotelSelectPage = new HotelSelectPage();
	}

	@Test(priority = 1)
	public void runTestScript() throws InterruptedException {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Urlaub: Bis 40% Rabatt beim Marktführer | ab-in-den-urlaub.de");
		homePage.automatedtestScript();
	}

	public void selectHotelTest() {
		String hotelSelectPageTitle = hotelSelectPage.verifyHotelPageTitle();
		Assert.assertEquals(hotelSelectPageTitle, "ab-in-den-urlaub.de");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
