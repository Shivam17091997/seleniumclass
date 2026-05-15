package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    WebDriver driver=new ChromeDriver();
    @When("user click on dropdown")
    public void user_click_on_dropdown(){
    driver.findElement(By.id("dropdown")).click();
    Select dropdown=new Select(driver.findElement(By.id("dropdown")));
    dropdown.selectByVisibleText("Option 1");
    }
    @Then("user should able to select")

   public void user_should_able_to_select(){
        System.out.println("Selected Option 1");
    }
    @Then("It must have two options")
    public void It_must_have_two_options(){
        System.out.println("Selected Option 2");
    }
}
