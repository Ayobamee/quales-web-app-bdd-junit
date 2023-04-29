Feature: Login Functionality
  As a user
  I want to be able to log in
  So that I can access my account

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And click the login button
    Then I should be redirected to the dashboard page
