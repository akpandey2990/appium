package pages;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class LabTests extends BaseClass {

	private By labtest = By.xpath(
			"//android.widget.ImageView[@bounds='[723,1896][789,1962]']");

	public void moveToLabTestPage()

	{
		waitForUntilVisible(driver, 10, labtest);
		driver.findElement(labtest).click();
	}

}
