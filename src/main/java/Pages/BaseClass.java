package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
  public static  WebDriver driver;//You are creating a browser controller (driver) that will be shared everywhere
//Base class = one place where browser setup is written
    public void initializedriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
public void quitDriver(){
        driver.quit();
}

}
