Feature: Test The OrangeHRM Application

  Scenario: Validate the login functionality
    Given User is on login page
    When User enter username and password
    Then User click on login button
