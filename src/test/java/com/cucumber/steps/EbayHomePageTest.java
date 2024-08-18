package com.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class EbayHomePageTest {
	WebDriver driver;

	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_Ebay_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("I am on the Ebay Home Page");
	}

	@When("I click on advance link")
	public void i_click_on_advance_link() {
		driver.findElement(By.xpath("//a[text()='Advanced']")).click();
		System.out.println("I click on advance link");
	}

	@Then("I navigate to advance page")
	public void i_navigate_to_advance_page() {
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);
		System.out.println("I navigate to advance page");
		driver.quit();
	}

}
