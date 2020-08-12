package selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import static selenium.SeleniumHelper.*;
import static selenium.LocatorMethods.*;


public class MyStepdefs {

    @Given("user navigates {string}")
    public void userNavigatesTo(String url) {
        userNavigatesHelper(url);

    }

    @When("user enters {string} to {string}")
    public void userEntersTo(String input, String element) {
        userEntersHelper(input,element);
    }


    @And("user clicks {string}")
    public void userClicks(String element) throws InterruptedException {
        userClicksHelper(element);
    }

    @Then("user views {string}")
    public void userViews(String element) throws InterruptedException {
        userViewsHelper(element);
    }

//    @Then("user views errorMessage {string}")
//    public void userViewsErrorMessage(String expectedErrorMessage) {
//        viewsErrorMessage(wait, expectedErrorMessage);

//    }
    @Then("user views errorMessage {string}")
    public void userViewsErrorMessage(String element) throws InterruptedException {
        userViewsErrorMessageHelper(element);


    }
}
