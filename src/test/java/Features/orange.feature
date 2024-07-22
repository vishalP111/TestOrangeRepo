Feature: Test The OrangeHRM Application

  Scenario: Validate the login functionality
    Given User is on login page
    When User enter username and password
    Then User click on login button

    Scenario: Validate Home Page url
    Given User is on home page and capture logo
    When User capture the Title
    
    Scenario: Validate Admin page
    When User is on admin page and click 


  