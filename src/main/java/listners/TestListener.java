package listners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.DriverFactory;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = DriverFactory.getDriver();
        String testName = result.getMethod().getMethodName();
        String screenshotPath = ScreenshotUtil.takeScreenshot(driver, testName);
        System.out.println("📸 Screenshot saved: " + screenshotPath);
    }
}