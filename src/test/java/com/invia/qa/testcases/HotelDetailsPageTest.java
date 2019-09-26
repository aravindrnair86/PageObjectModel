package com.invia.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.invia.qa.pages.HotelDetailsPage;
import com.invia.qa.pages.HotelSelectPage;
import com.invia.qa.base.TestBase;
import com.invia.qa.util.TestUtil;

public class HotelDetailsPageTest extends TestBase {

	HotelSelectPage hotelSelectPage;
	HotelDetailsPage hotelDetailsPage;
	TestUtil testUtil;

	public HotelDetailsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
