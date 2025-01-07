Feature: Check home page functionality

  Background: User is logged in
    Given user is on login page
    When user inputs name and password
    Then user should be directed to home page

  Scenario: Verify that the log out button is displayed in the home page
    When user is on home page
    Then log out button is diplayed

  Scenario: Verify the request loan button
    When User clicks on request loan option
    Then Apply for a loan should be visible
