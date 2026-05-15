package Stepdefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenshotElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //Take Scrrenshort
        TakesScreenshot ts = (TakesScreenshot) driver;
        WebElement btn= driver.findElement(By.id("Apjfqb"));
        File source = btn.getScreenshotAs(OutputType.FILE);

        File Destination = new File("C:/Users/HP/OneDrive/Desktop/Screenshots/shiv.png");
        try {
            FileUtils.copyFile(source, Destination);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
