Feature: My Demo for login for BDC users

Background: Clearing the browser cache
Given I am clicking the shortcut for browser cache
And ensuring for deletion of all the cookies

Scenario: User login into Demowebshop from BDC
Given BDC user having valid creds
Then user tries to provide the data for the login process

Scenario: User logout process for the BDC user
Given BDC user is able to see the logout button
Then user clicks on the logout button to close the window