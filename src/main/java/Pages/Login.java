package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver)
    {
        this.driver=driver;
    }

    By username=By.id("username");
    By password=By.id("password");
    By login=By.id("login");

    public static void username(String user){
       // driver.findElement(username).sendKeys(user);
    }
    public static void password(String pass){
      //  driver.findElement(password).sendKeys(pass);
    }
    public static void login(){
     //   driver.findElement(login).click();
    }

}
