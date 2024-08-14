package com.cucumber.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHomePageTest {

	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_Ebay_Home_Page() {
		System.out.println("I am on the Ebay Home Page");
	}

	@When("I click on advance link")
	public void i_click_on_advance_link() {
		System.out.println("I click on advance link");
	}

	@Then("I navigate to advance page")
	public void i_navigate_to_advance_page() {
		System.out.println("I navigate to advance page");
	}

}
