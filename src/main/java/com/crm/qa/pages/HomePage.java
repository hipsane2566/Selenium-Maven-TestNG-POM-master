package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends TestBase {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}

	@FindBy(xpath = "//a[@data-test-attrib='cleartrip-logo']")
	WebElement logo;

	@FindBy(xpath = "//a[@class='c-secondary-500 fs-4 pl-2 fw-300 td-none flex flex-middle']")
	WebElement flightOption;

	@FindBy(xpath  = "//li[@class='mt-4 listItemHover']/a[@href='/hotels']")
	WebElement hotelOption;

	@FindBy(className = "trainsApp")
	@CacheLookup
	WebElement TrainOption;

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public SearchFlightsPage selectFlightOption() {
		if (flightOption.isEnabled()) {
			flightOption.click();
		}
		return new SearchFlightsPage();
	}

	public SearchHotelPage selecthotelOption() {
		hotelOption.click();
		return new SearchHotelPage();
	}

}
