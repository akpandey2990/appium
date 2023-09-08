package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import utilities.BaseClass;

public class HomePage extends BaseClass {

	By medicine = By.xpath("//android.widget.ImageView[@bounds='[33,507][259,686]']");
	
	public void clickOnMedicineButtonOnHomePage() {
		waitForUntilVisible(driver, 25, medicine);
		driver.findElement(medicine).click();

	}

	
}

