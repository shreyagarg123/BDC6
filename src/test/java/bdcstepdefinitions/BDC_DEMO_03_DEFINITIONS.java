package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_DEMO_03_DEFINITIONS {
	@Given("I am clicking the shortcut for browser cache")
	public void i_am_clicking_the_shortcut_for_browser_cache() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for shortcut for browser cache");
	}

	@Given("ensuring for deletion of all the cookies")
	public void ensuring_for_deletion_of_all_the_cookies() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for deletion of cookies");
	}

	@Given("BDC user having valid creds")
	public void bdc_user_having_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user tries to provide the data for the login process")
	public void user_tries_to_provide_the_data_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for provide the data for login");
	}

	@Given("BDC user is able to see the logout button")
	public void bdc_user_is_able_to_see_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for user see logout button");
	}

	@Then("user clicks on the logout button to close the window")
	public void user_clicks_on_the_logout_button_to_close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for user clicks on logout button");
	}
}
