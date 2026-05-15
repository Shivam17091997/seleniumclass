package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basiclogin {

    @Given("user is on login page")
    public void user_is_on_login_page(){
        System.out.println("Login page is on");
    }
    @When("user enter valid user name and valid password")
    public void user_enter_valid_user_name_and_valid_password(){
        System.out.println("Enter valid user name and valid password");
    }

    @When("click on the login button")
    public void click_on_the_login_button(){
        System.out.println("Click on the login button");
    }

    @Then("user is on dashboard screen")
    public void user_is_on_dashboard_screen(){
        System.out.println("Dashboard screen is on");
    }

    @When("user enter invalid username and password")
    public void user_enter_invalid_user_name_and_password(){
        System.out.println("Enter invalid username and password");
    }

    @Then("error message have been displayed")
    public void error_message_has_been_displayed(){
        System.out.println("Error message has been displayed");
    }
}
