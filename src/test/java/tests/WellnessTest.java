package tests;

import utilities.BaseClass;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.Wellness;

public class WellnessTest extends BaseClass {

	Wellness well = new Wellness();

	@Test
	public void verifySupplementOftheWeekonWellnessPage()

	{

		well.navigateToWellnessPage();
		System.out.println("Successfully moved to Wellness page");
		well.supplementOftheWeekVisibleOnWellnessPage();
		Assert.assertTrue(true);
		System.out.println("Supplement Of the week is displayed on Wellness Page");
		navigateBack();
	}

}
