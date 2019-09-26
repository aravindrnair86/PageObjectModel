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
	public void automatedTestScript() throws InterruptedException {

		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Urlaub: Bis 40% Rabatt beim Marktführer | ab-in-den-urlaub.de");
		homePage.clickHotelCityMenu();
		homePage.selectDestination();
		homePage.fillCheckInCheckOut();
		hotelSelectPage.selectStarAndReview();
		hotelSelectPage.sortResultsByPrice();

	}

	@Test(priority = 2)
	public void selectHotelTest() {
		hotelSelectPage = homePage.selectHotel();
		String hotelSelectPageTitle = hotelSelectPage.verifyHotelPageTitle();
		Assert.assertEquals(hotelSelectPageTitle, "ab-in-den-urlaub.de");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
