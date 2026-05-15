package Stepdefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotmethod {

    public static  void Screenshot(WebDriver driver){

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File desc = new File("C:/Users/HP/OneDrive/Desktop/Screenshots/Shivam.png");

        try{
            FileUtils.copyFile(src , desc);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //catch (IOException e) {
         //   throw new RuntimeException(e);
       // }



    }
}
