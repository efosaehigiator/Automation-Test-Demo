Feature: Add User

@Test
  Scenario: Verify that I can register a new user.

    Given I am on the landing page of "http://thedemosite.co.uk/"
    When I click on the "Add a User" button
    And I enter test username and test password
    And I click on "Save" button
    Then the user is registered and the url is "http://thedemosite.co.uk/savedata.php"