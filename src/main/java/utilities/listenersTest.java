package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class listenersTest implements ITestListener  {
	
	
	private ExtentReports extentReports;
    private ExtentTest extentTest;

    @Override
    public void onStart(ITestContext context) {
        String reportFileName = "ExtentSparkReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFileName);
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test failed");
        extentTest.log(Status.FAIL, result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

}
