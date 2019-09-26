package com.invia.qa.util;

import java.time.LocalDate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.invia.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	

	public String dayPicker(int days)
	{
		
	LocalDate today = LocalDate.now();
	 LocalDate tday = today.withDayOfMonth(days);
	 String str = tday.toString();
	System.out.println(str);
		String[] a = str.split("-");
		String day = a[2];
		
		return day;
		
	}
	/*
	public String monthPicker(int months)
	{
		
	LocalDate today = LocalDate.now();
	LocalDate mday = today.withDayOfMonth(months);
	 String str = mday.toString();
		System.out.println(str);
		String[] a = str.split("-");
		String month = a[1];
		
		return month;
		
	}*/
	public void waitForElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Integer.parseInt(prop.getProperty("EXPLICIT_WAIT")));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void moveToElement(WebElement element)
	{
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void clickOverlay(WebElement element)
	{
	Actions actions = new Actions(driver);
	actions.moveToElement(element, 100, 100).click().build().perform();
	}
}
