package Stepdefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class Screenshot {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        //Take screenshot of failed case
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        //Destination
       File dest= new File("C:/Users/HP/OneDrive/Desktop/Screenshots/shivam.png");
        try {
            FileUtils.copyFile(source,dest);
           // FileUtils.copyFile(source,dest);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

}
