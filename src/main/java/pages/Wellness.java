package pages;



import org.openqa.selenium.By;

import utilities.BaseClass;

public class Wellness extends BaseClass {

	private By wellnessbutton = By.xpath(
			"//android.widget.FrameLayout[@content-desc=\"Wellness\"]/android.widget.FrameLayout/android.widget.ImageView");
	private By supplements = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView");
	public void navigateToWellnessPage()

	{
		waitForUntilVisible(driver, 10, wellnessbutton);
		driver.findElement(wellnessbutton).click();
	}

	
	public void supplementOftheWeekVisibleOnWellnessPage()
	
	{
		driver.findElement(supplements).isDisplayed();
	}
}
