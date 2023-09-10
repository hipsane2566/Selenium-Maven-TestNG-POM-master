package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.google.common.base.Verify;

public class FlightTestCases extends TestBase {

	HomePage homepage;

	public FlightTestCases() {
		super();
	}

	/*
	 * @BeforeTest public void setExtentReport() { setExtend(); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		initializaton();
		homepage = new HomePage(driver);
	}

	@Test(groups = { "Sanity" })
	public void TC001_CheckifLogoisPresent() {
		homepage = new HomePage(driver);
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(groups = { "Sanity" })
	public void TC002_SelectFlightOption() {
		// homepage = new HomePage(driver);
		homepage.selectFlightOption();
	}

	@Test(groups = { "Sanity" })
	public void TC003_CheckifLogoisPresent() {
		// homepage = new HomePage(driver);
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(groups = { "Sanity" })
	public void TC004_SelectFlightOption() {
		// homepage = new HomePage(driver);
		homepage.selectFlightOption();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		// FormatResult();
		tearDownMain();
	}

}
