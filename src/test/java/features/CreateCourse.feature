Feature: Course Creation Functionality
  As a user
  I want to be able to create a course
  So that I can view my courses

  Scenario: Create course
    Given I am present on the dashboard page
    When I select the desktop view port
    And I input my course details
    Then My course should be created successfully
