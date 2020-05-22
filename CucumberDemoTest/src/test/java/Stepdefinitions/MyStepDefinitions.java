package Stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepDefinitions {

    @Given("^browser with chromes Navigate to the FB url$")
    public void browser_with_chromes_navigate_to_the_fb_url() throws Throwable {
        System.out.println("jjjj");
    }

    @When("^User enter the credentials$")
    public void user_enter_the_credentials() throws Throwable {
        System.out.println("jjjj");
    }

    @Then("^Home page should be Displayed$")
    public void home_page_should_be_displayed() throws Throwable {
        System.out.println("jjjj");
    }

}