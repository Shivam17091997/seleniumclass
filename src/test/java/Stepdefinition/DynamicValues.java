package Stepdefinition;

import io.cucumber.java.en.When;

public class DynamicValues {
    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {
        System.out.println("Enter username and password");
    }
}