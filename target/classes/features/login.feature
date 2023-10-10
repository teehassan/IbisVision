Feature: Login Feature

  Background: 
    Given user is on the home page
    And login page is visible

  @successfulLogin
  Scenario: Verify that the user can log in with the correct credentials.
    When user enters a valid username and password 
    And user clicks on login
    Then user should be logged in successfully

  @unSuccessfulLogin
  Scenario: Ensure that meaningful error messages are displayed for incorrect login attempts.
    When user enters an invalid username and password
    And user clicks on login
    Then user should see an error messsage displayed
