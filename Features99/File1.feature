Feature: BDC validation on demowebshop
@Regression, @Smoke
Scenario: Registered user access to cart in Demowebshop
Given user launched demo webshop app in chrome browser
Then user searches for the item of his choice
And adds that item to the cart
@Sanity
Scenario: Registered user access track the ordered item in Demowebshop
Given user has already palced an order for his favorite item
And user tries to access the order tracking dashboard
Then identifies the state of the order