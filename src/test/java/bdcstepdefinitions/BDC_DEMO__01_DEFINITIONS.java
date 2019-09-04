package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_DEMO__01_DEFINITIONS {
	@Given("user launched demo webshop appin chrome browser")
	public void user_launched_demo_webshop_appin_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for launch");
	}

	@Then("user searches for the item of his choice")
	public void user_searches_for_the_item_of_his_choice() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for search");
	}

	@Then("adds that item to the cart")
	public void adds_that_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for add item to cart");
	}

	@Given("user has already placed an order for his favorite item")
	public void user_has_already_palced_an_order_for_his_favorite_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for placed an order");
	}

	@Given("user tries to access the order tracking dashboard")
	public void user_tries_to_access_the_order_tracking_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for access the order tracking");
	}

	@Then("identifies the state of the order")
	public void identifies_the_state_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for the state of order");
	}
}
