package StepDefinitions;

import org.junit.Assert;

import Hooks.Hooks;
import Pages.ContactPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	//Hooks hooks;
	HomePage homepage = new HomePage(Hooks.driver);
	LoginPage loginpage = new LoginPage(Hooks.driver);
	ContactPage contactpage = new ContactPage(Hooks.driver);
	
	@Given("Cogmento Home screen is displayed")
	public void cogmento_home_screen_is_displayed() {
		loginpage.launchApplication();
		Assert.assertTrue(homepage.verifyHomePageIsDisplayed());
	    
	}
	@When("I Navigate to Contact Tab")
	public void i_navigate_to_contact_tab() {
		contactpage.navigateToContactPage();
	   
	}
	@When("Click on Create contact button")
	public void click_on_create_contact_button() {
	    contactpage.clickOnCreateButton();
	}
	@When("Enter Contact details")
	public void enter_contact_details() {
		contactpage.enterContactDetails();
	    
	}
	@When("click on save buuton")
	public void click_on_save_buuton() {
	   
	}
	@Then("Verify the newly created contact")
	public void verify_the_newly_created_contact() {
	    
	}

}
