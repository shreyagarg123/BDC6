package bdcstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestMe {
	WebDriver driver;
	@Given("Launch website")
	public void launch_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver = Driver.configureDriver("chrome");
		 driver.manage().window().maximize();
		 driver.get("http:'//http://demowebshop.tricentis.com/");
	}

	@Given("user enter login with valid creds")
	public void user_enter_login_with_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email'")).sendKeys("shreyagarg2809@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password'")).sendKeys("Skama@123garg");
	}

	@Then("user click on login")
	public void user_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    driver.findElement(By.xpath("//input[@value='Log in'")).click();	
	}

	@Given("user search for an item")
	public void user_search_for_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//a[@href='/fiction']")).click();
	}

	@Given("user adds item into cart by clicking Add to Cart")
	public void user_adds_item_into_cart_by_clicking_Add_to_Cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("User logout")
	public void user_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

	@Given("user search another item")
	public void user_search_another_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();
		driver.findElement(By.xpath("//a[@href='/50s-rockability-polka-dot-top-jr-plus-size']")).click();
	}

	@Given("user adds by clicking Add to Cart")
	public void user_adds_by_clicking_Add_to_Cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("User logout through logout button")
	public void user_logout_through_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}
}
