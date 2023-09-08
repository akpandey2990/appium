package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass {
	static By ordermedicine = By.xpath("//android.widget.TextView[@text='Order Medicine']");
	HomePage home = new HomePage();

	@Test
	public void verifyMedicineButtonOnHomePage() {
		home.clickOnMedicineButtonOnHomePage();
		System.out.println("Clicked on Medicine button on Home Page");

		waitForUntilVisible(driver, 10, ordermedicine);
		String ActualText = driver.findElement(ordermedicine).getText();
		System.out.println(ActualText);
		String expectedText = "Order Medicine";
		Assert.assertEquals(ActualText, expectedText, "Text doesn't match the expected value");
		navigateBack();
	}

}
