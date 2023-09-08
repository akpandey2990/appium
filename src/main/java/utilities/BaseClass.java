package utilities;

import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.netty.handler.timeout.TimeoutException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public static AppiumDriver driver;
	WebDriverWait wait;

	@BeforeSuite
	public static void setup() {

		try {

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("deviceName", "A97-9.0(898X06H5R)");
			cap.setCapability("udid", "898X06H5R");
			cap.setCapability("app", "D:\\Akash Data\\com.NetmedsMarketplace.Netmeds.apk");
			cap.setCapability("automationName", "UIAutomator2");

			cap.setCapability("appPackage", "com.NetmedsMarketplace.Netmeds");
			cap.setCapability("appActivity", "com.netmedsmarketplace.netmeds.AppUriSchemeHandler");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver(url, cap);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement getStarted = driver.findElement(By.id("lets_start"));
			getStarted.click();

			// WebElement claimOfferClose =
			// driver.findElement(By.className("android.widget.TextView"));
			// claimOfferClose.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement skip = driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
			skip.click();
			System.out.println("User is navigated to Home Page");
		} catch (Exception e) {

			System.out.println(e.getCause());
		}

	}

	public static boolean waitForUntilVisible(WebDriver driver, Integer time, By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (NoSuchElementException e) {
			return false;
		} catch (TimeoutException e) {
			return false;
		}
		return true;
	}

	public static void scrollDown(int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,pixels)", "");
	}

	public static void getText(By locator)

	{
		driver.findElement(locator).getText();
		System.out.println("Navigated back by one page");
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}
}
