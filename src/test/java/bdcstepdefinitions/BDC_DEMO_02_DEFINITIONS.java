package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_DEMO_02_DEFINITIONS {
	@Given("user access the signup page")
	public void user_access_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for signup");
	}

	@Given("gets the credentials")
	public void gets_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for get the credentials");
	}

	@Given("user has valid account creds for Demowebshop")
	public void user_has_valid_account_creds_for_Demowebshop() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for valid account creds");
	}

	@Given("provide valid creds as input for the login process")
	public void provide_valid_creds_as_input_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for valid creds as input for login");
	}

	@Then("verifies the state for the login status")
	public void verifies_the_state_for_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for verifies state for login");
	}

}
