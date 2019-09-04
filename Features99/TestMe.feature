Feature: Demowebshop login process

Background: user launched demo webshop app in chrome browser
Given Launch website
And user enter login with valid creds
Then user click on login

Scenario: User adds item to cart
Given user search for an item
And user adds item into cart by clicking Add to Cart
Then User logout 

Scenario: User adds one more item to cart
Given user search another item
And user adds by clicking Add to Cart
Then User logout through logout button 