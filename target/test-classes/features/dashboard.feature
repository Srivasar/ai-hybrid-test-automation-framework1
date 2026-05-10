Feature: Regression Testing for dashboard
    Scenario: VerifY dashbpard is woriking properly
        Given User should be on the login page
        And User should logged in with valid credentials
        When User should click on the dashboard
        Then User should verify the dashboard is working properly