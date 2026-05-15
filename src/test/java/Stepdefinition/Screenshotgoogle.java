package Stepdefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotgoogle {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File desc = new File("C:/Users/HP/OneDrive/Desktop/Screenshots/Shiv.png");

        FileUtils.copyFile(src,desc);

        System.out.println("Screenshot taken");
        System.out.println(desc.getAbsolutePath());
        driver.quit();
    }
}
