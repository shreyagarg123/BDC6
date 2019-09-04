Feature: Guest user actions in Demo WebShop
@Sanitary
Scenario: Users choice to opt for an account
Given user access the signup page
And gets the credentials
@Regression
Scenario: User accesss to login page of the Demo Webshop
Given user has valid account creds for Demowebshop
And provide valid creds as input for the login process
Then verifies the state for the login status