package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExeccutingofSS extends Screenshotmethod {

    @Test
    public void testgoogle(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(),"Facebook Login");

        Screenshot(driver);
        System.out.println("Test Fail");
        driver.quit();

    }
}
