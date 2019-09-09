package stepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddUserPage;

public class AddUserSteps {

    AddUserPage addUserPage = new AddUserPage();

    @Given("^I am on the landing page of \"([^\"]*)\"$")
    public void i_am_on_the_landing_page_of(String arg1) throws Throwable {
        addUserPage.validateLandingPage();
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        addUserPage.clickAddUserButton();
    }

    @And("^I enter test username and test password$")
    public void i_enter_test_username_and_test_password() throws Throwable {
        addUserPage.enterUserNameAndPassWord();
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        addUserPage.clickSaveButton();
    }

    @Then("^the user is registered and the url is \"([^\"]*)\"$")
    public void the_user_is_registered_and_the_url_is(String arg1) throws Throwable {
        addUserPage.verifyUserIsRegistered();
    }
}
