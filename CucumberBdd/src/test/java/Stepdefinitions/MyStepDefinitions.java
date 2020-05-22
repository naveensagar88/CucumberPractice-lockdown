package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {

    @Given("^browser with chromes Navigate to the FB url$")
    public void browser_with_chromes_navigate_to_the_fb_url() throws Throwable {
        System.out.println("Browzer launched");
    }

    @When("^User enter the credentials$")
    public void user_enter_the_credentials() throws Throwable {
        System.out.println("Credential success");
    }

    @Then("^Home page should be Displayed$")
    public void home_page_should_be_displayed() throws Throwable {
        System.out.println("Home page displayed");
    }

}