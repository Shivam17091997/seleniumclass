package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import static Pages.BaseClass.driver;
import static org.openqa.selenium.devtools.v146.page.Page.captureScreenshot;

public class TestFailure extends Screenshotmethod implements ITestListener{

    @Test
    public void testGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Facebook");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Screenshot(driver);
        driver.quit();
    }

}
