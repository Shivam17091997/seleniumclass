package Stepdefinition;

import Pages.BaseClass;
import Pages.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.awt.SystemColor.text;

public class GoogleSteps extends BaseClass {

    GooglePage googlePage =new GooglePage(driver);

        @Given("user is on Google page")
    public void user_is_on_Google_page(){
            googlePage.openGoogle();
        }

        @When("user enters {String}")
    public void user_enters_(String Text){
            googlePage.entersearch(Text);
        }

    @When("clicks on search button")
    public void clicks_on_search_button(){
            googlePage.submitSearch();
    }

    @Then("user should see search results")
    public void user_should_see_search_results(){
        System.out.println("Search executed successfully");
    }
}
