package stepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page() throws Throwable {
        loginPage.validateLandingPage();
    }

    @When("^I click on the Login button$")
    public void i_click_on_the_Login_button() throws Throwable {
        loginPage.clickLoginButton();
    }

    @And("^I enter Valid \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_Valid_and_as_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        loginPage.enterUserNameAndPassWord();
    }

    @And("^I click on Test Login button$")
    public void i_click_on_Test_Login_button() throws Throwable {
        loginPage.clickTestLoginButton();
    }

    @Then("^Login is successful and$")
    public void login_is_successful_and() throws Throwable {
        loginPage.validateSuccessfulLogin();
    }

    // Login in with Invalid Credentials

    @Given("^I am on the Login page$")
    public void i_am_on_the_Login_page() throws Throwable {

    }

    @When("^I enter invalid username and password$")
    public void i_enter_invalid_username_and_password() throws Throwable {
        loginPage.EnterInvalidUserName();
        loginPage.EnterInvalidPassword();

    }

    @When("^I click the TestLogin Button$")
    public void i_click_the_TestLogin_Button() throws Throwable {
        loginPage.clickTestLoginButton();

    }

    @Then("^Login is failed and message \"([^\"]*)\" is displayed$")
    public void login_is_failed_and_message_is_displayed(String arg1) throws Throwable {
        loginPage.validateFailedLogin();

    }

}
