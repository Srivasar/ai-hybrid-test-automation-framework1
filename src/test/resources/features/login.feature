Feature: Login to HRM System
    Scenario: Log should be successful with valid credentials
        Given I am on the HRM login page
        When I enter valid username and password
        And I click the login button
        Then I should be redirected to the dashboard page and apply for leave