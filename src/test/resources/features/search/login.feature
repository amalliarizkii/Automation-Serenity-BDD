Feature: Login Functionality

  Scenario: Login with valid username and password
    Given I am already on login page
    When I input username "standard_user"
    And I input password "secret_sauce"
    And I click login button
    Then I redirected to inventory page

