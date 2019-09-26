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

	@FindBy(xpath = "//span[@class='select-icon hc-icon-star-50']")
	WebElement fiveStar;

	@FindBy(xpath = "//span[@class='hc-icon-smiley-5 icon']")
	WebElement reviewRating;

	@FindBy(xpath = "//li[contains(text(),'Preis')]")
	WebElement price;

	@FindBy(xpath = "//span[@class='js-baseFrame-sort-icon activeIcon active changeDirection asc']")
	WebElement asc;

	@FindBy(xpath = "//li[@class='js-baseFrame-sortElement js-baseFrame-sort-icon active changeDirection desc']")
	WebElement desc;

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

	public void selectStarAndReview() {

		testUtil.waitForElement(fiveStar);
		testUtil.moveToElement(fiveStar);
		fiveStar.click();
		testUtil.waitForElement(reviewRating);
		testUtil.moveToElement(reviewRating);
		reviewRating.click();

	}

	public void sortResultsByPrice() {

		testUtil.waitForElement(price);
		price.click();
		asc.isEnabled();
		price.click();
		desc.isEnabled();

	}

}
