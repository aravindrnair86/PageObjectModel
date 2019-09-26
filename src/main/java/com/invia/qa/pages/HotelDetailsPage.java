package com.invia.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.invia.qa.base.TestBase;

public class HotelDetailsPage extends TestBase {

	@FindBy(css = "#hotelList > div.skeleton-wrapper > article.hotel-offer-evaluation.hotelOffer.tip > div.content > div.priceBox > a > div")
	WebElement aboutOffersbtn;

	// Initializing the Page Objects:
	public HotelDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void viewOffers() {

		aboutOffersbtn.click();
	}

}
