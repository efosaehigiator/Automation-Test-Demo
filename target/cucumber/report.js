$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddUser.feature");
formatter.feature({
  "line": 1,
  "name": "Add User",
  "description": "",
  "id": "add-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that I can register a new user.",
  "description": "",
  "id": "add-user;verify-that-i-can-register-a-new-user.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the landing page of \"http://thedemosite.co.uk/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the \"Add a User\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter test username and test password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Save\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user is registered and the url is \"http://thedemosite.co.uk/savedata.php\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://thedemosite.co.uk/",
      "offset": 29
    }
  ],
  "location": "AddUserSteps.i_am_on_the_landing_page_of(String)"
});
formatter.result({
  "duration": 3199735200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add a User",
      "offset": 16
    }
  ],
  "location": "AddUserSteps.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 325238900,
  "status": "passed"
});
formatter.match({
  "location": "AddUserSteps.i_enter_test_username_and_test_password()"
});
formatter.result({
  "duration": 141386800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save",
      "offset": 12
    }
  ],
  "location": "AddUserSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 295384500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://thedemosite.co.uk/savedata.php",
      "offset": 39
    }
  ],
  "location": "AddUserSteps.the_user_is_registered_and_the_url_is(String)"
});
formatter.result({
  "duration": 12601700,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "As a registered user, I should be able to login",
  "description": "",
  "id": "login;as-a-registered-user,-i-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter Valid \"username\" and \"password\" as \"Bibliotheca\" and \"Test\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Test Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Login is successful and",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_landing_page()"
});
formatter.result({
  "duration": 9767200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_Login_button()"
});
formatter.result({
  "duration": 262065200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    },
    {
      "val": "Bibliotheca",
      "offset": 44
    },
    {
      "val": "Test",
      "offset": 62
    }
  ],
  "location": "LoginSteps.i_enter_Valid_and_as_and(String,String,String,String)"
});
formatter.result({
  "duration": 113065400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_Test_Login_button()"
});
formatter.result({
  "duration": 220053500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_is_successful_and()"
});
formatter.result({
  "duration": 17392800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify that a user cannot login with an Invalid credentials",
  "description": "",
  "id": "login;verify-that-a-user-cannot-login-with-an-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am on the Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click the TestLogin Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Login is failed and message \"Failed Login\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Login_page()"
});
formatter.result({
  "duration": 46300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 106545000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_the_TestLogin_Button()"
});
formatter.result({
  "duration": 239288600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Failed Login",
      "offset": 29
    }
  ],
  "location": "LoginSteps.login_is_failed_and_message_is_displayed(String)"
});
formatter.result({
  "duration": 9870400,
  "status": "passed"
});
});