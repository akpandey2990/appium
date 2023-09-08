package pages;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class Account extends BaseClass {

	private By accountbutton = By.xpath("//android.widget.ImageView[@bounds='[939,1896][1005,1962]']");

	public void navigateToAccountsPage()

	{
		waitForUntilVisible(driver, 10, accountbutton);
		driver.findElement(accountbutton).click();
	}

}
