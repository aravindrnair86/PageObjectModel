package com.invia.qa.pages;

import com.invia.qa.base.TestBase;
import com.invia.qa.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelSelectPage extends TestBase {
	TestUtil testUtil;
	HomePage homePage;

	@FindBy(id = "//h2[@id='hotelname-0']")
	WebElement firstHotel;

	@FindBy(css = "#hotelList > div.skeleton-wrapper > article.hotel-offer-evaluation.hotelOffer.tip > div.content > div.priceBox > a > div")
	WebElement aboutOffersbtn;

	// Initializing the Page Objects:
	public HotelSelectPage() {
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}

	// Methods
	public void clickHotelOffers() {

		testUtil.waitForElement(firstHotel);
		testUtil.waitForElement(aboutOffersbtn);
		aboutOffersbtn.click();
	}

	public String verifyHotelPageTitle() {
		return driver.getTitle();
	}

}
