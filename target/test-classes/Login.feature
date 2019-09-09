Feature: Login

  @Test
  Scenario: As a registered user, I should be able to login

    Given I am on the landing page
    When I click on the Login button
    And I enter Valid "username" and "password" as "Bibliotheca" and "Test"
    And I click on Test Login button
    Then Login is successful and

    @Test
    Scenario: Verify that a user cannot login with an Invalid credentials

      Given I am on the Login page
      When I enter invalid username and password
      And I click the TestLogin Button
      Then Login is failed and message "Failed Login" is displayed

