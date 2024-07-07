Feature: Delete Course Functionality
    As a user
    I want to be able to select a course
    So that I can delete the course details created

    Scenario: Remove course
        Given I am on the dashboard page with the intention to delete a course
        And I delete a course
        Then My course should be deleted successfully