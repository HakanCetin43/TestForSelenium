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

    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String arg0) {
    }

    @When("the user drags the {string} to {string}")
    public void theUserDragsTheTo(String arg0, String arg1) {
    }

    @Then("the user views {string} message")
    public void theUserViewsMessage(String arg0) {
    }

    @When("the user slides {string}")
    public void theUserSlides(String arg0) {
    }

    @Given("User navigates {string}")
    public void userNavigates(String arg0) {
    }

    @When("User enters {string} to {string} area")
    public void userEntersToArea(String arg0, String arg1) {
    }

    @And("User clicks {string} area")
    public void userClicksArea(String arg0) {
    }
}
