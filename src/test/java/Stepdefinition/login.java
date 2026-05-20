package Stepdefinition;

import Pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver=new ChromeDriver();
    @Given("User is on the website")
    public void user_is_on_the_website() {
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @When("user enter username and password")
    public void user_enter_username_and_password(){

        Login login=new Login(driver);
        Login.username("shivam");
        Login.password();
   // driver.findElement(By.id("username")).sendKeys("tomsmith");
    //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login(){
   // driver.findElement(By.xpath("//button[@type='submit']")).click();
        Login.login();
    }
    @Then("login button should be visible")
    public void login_button_should_be_visible(){

    }
}
