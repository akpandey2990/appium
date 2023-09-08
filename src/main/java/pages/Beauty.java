package pages;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class Beauty extends BaseClass {

	private By beautybutton = By.xpath(
			"//android.widget.FrameLayout[@content-desc=\"Beauty\"]/android.widget.FrameLayout/android.widget.ImageView");

	public void moveToBeautyPage()

	{
		waitForUntilVisible(driver, 10, beautybutton);
		driver.findElement(beautybutton).click();
	}

}
