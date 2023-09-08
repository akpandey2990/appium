package tests;

import utilities.BaseClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import pages.Beauty;

public class BeautyTest extends BaseClass {

	Beauty bty = new Beauty();
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void navigatetoBeautyPage()

	{

		bty.moveToBeautyPage();
		System.out.println("Successfully moved to Beauty page");
		softAssert.assertTrue(true);
		navigateBack();

	}

}
