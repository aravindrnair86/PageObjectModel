package com.invia.qa.pages;

import com.invia.qa.base.TestBase;
import com.invia.qa.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends TestBase {
	TestUtil testUtil;

	@FindBy(id = "idestflat")
	WebElement selectCountryTxtbox;

	@FindBy(id = "submit")
	WebElement submitBtn;

	@FindBy(xpath = "//label[@class='item-hotel']")
	WebElement hotelCityLnk;

	@FindBy(id = "base[searchTerm]")
	WebElement textBox;

	@FindBy(xpath = "//span[contains(text(),'Städte')]")
	WebElement places;

	@FindBy(xpath = "//form[@id='hotel']//input[@id='submit']")
	WebElement submitButton;

	@FindBy(xpath = "(//div[@class='datepicker-input-wrapper datepicker-input-wrapper-start']/div)[2]")
	WebElement checkInDateTxtBox;

	@FindBy(xpath = "//div[@class='month month-9 year-2019']//td[@data-date='2019-10-25']")
	WebElement checkInDate;

	@FindBy(xpath = "//div[@class='month month-9 year-2019']//td[@data-date='2019-10-29']")
	WebElement checkOutDate;

	@FindBy(id = "header")
	WebElement header;

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

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}

	// Methods/Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public HotelSelectPage selectHotel() {
		selectCountryTxtbox.sendKeys("Mallorca");
		selectCountryTxtbox.sendKeys(Keys.TAB);
		testUtil.moveToElement(submitBtn);
		submitBtn.click();
		return new HotelSelectPage();
	}

	public void automatedtestScript() {

		testUtil.moveToElement(hotelCityLnk);
		hotelCityLnk.click();
		testUtil.clickOverlay(hotelCityLnk);
		textBox.sendKeys(prop.getProperty("destination"));
		testUtil.waitForElement(places);
		textBox.sendKeys(Keys.ENTER);
		checkInDateTxtBox.click();
		testUtil.waitForElement(textBox);
		testUtil.moveToElement(checkInDate);
		checkInDate.click();
		checkOutDate.click();
		testUtil.moveToElement(textBox);
		submitButton.click();
		testUtil.waitForElement(fiveStar);
		testUtil.moveToElement(fiveStar);
		fiveStar.click();
		testUtil.waitForElement(reviewRating);
		testUtil.moveToElement(reviewRating);
		reviewRating.click();
		testUtil.waitForElement(price);
		price.click();
		asc.isEnabled();
		price.click();
		desc.isEnabled();

	}

}
