package com.invia.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.invia.qa.pages.HotelDetailsPage;
import com.invia.qa.pages.HotelSelectPage;
import com.invia.qa.base.TestBase;
import com.invia.qa.util.TestUtil;

public class HotelSelectPageTest extends TestBase {

	HotelSelectPage hotelSelectPage;
	HotelDetailsPage hotelDetailsPage;
	TestUtil testUtil;

	public HotelSelectPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		hotelSelectPage = new HotelSelectPage();
	}

	public void searchOffersTest() {

		hotelSelectPage.clickHotelOffers();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
