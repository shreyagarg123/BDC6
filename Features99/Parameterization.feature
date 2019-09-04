Feature: BDC demo for parameterization

Scenario: I want to cross check the multiple users access for login

Given I am launching the webshop url
Then I will check on login
When I enter username "<uname>" and pasword "<pwd>"
And I click on submit button
Then verifies the user account status
Examples
|uname|pwd|
|abc|Sa@123|
|def|Ca@456|
|ghi|Da@789|