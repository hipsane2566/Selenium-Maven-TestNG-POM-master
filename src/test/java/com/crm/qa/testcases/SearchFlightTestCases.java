package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FlightResultPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SearchFlightsPage;

public class SearchFlightTestCases extends TestBase {

	SearchFlightsPage searchFlightsPage;
	HomePage homePage;
	FlightResultPage flightResultPage;

	public SearchFlightTestCases() {
		super();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		initializaton();
		homePage = new HomePage(driver);
		searchFlightsPage = homePage.selectFlightOption();
	}

	@Test(groups = { "Regression" })
	public void TC001_VerifyHeaderContent() {
		Assert.assertEquals(searchFlightsPage.getPageHeader(), "Search flights");
	}

	@Test(groups = { "Regression" })
	public void TC002_SearchFligh() {
		searchFlightsPage.SearchFlight(properties.getProperty("FromCity"), properties.getProperty("ToCity"),
				properties.getProperty("Date"));
		Assert.assertEquals(searchFlightsPage.getPageHeader(), "Search flights", "Mandatory data is missing");
	}

	@Test(groups = { "Regression" })
	public void TC003_VerifyHeaderContent() {
		Assert.assertEquals(searchFlightsPage.getPageHeader(), "Search flights");
	}

	@Test(groups = { "Regression" })
	public void TC005_VerifyHeaderContent() {
		Assert.assertEquals(searchFlightsPage.getPageHeader(), "Search flights");
	}

	/*
	 * @AfterMethod public void tearDown() { // FormatResult(); tearDownMain(); }
	 */
}
