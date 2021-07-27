package citi.StepDef;

import citiLoginPageAction.citiBankSignOnPageActionClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CitiBankSignOnStepDef {
	
	citiBankSignOnPageActionClass citiBank = new citiBankSignOnPageActionClass();
	
	@Given("Customer in citiBank SignOn page")
	public void customer_in_citiBank_SignOn_page() {
    	citiBank.getcitiBankSignOnPage(); 
	}
	
	@When("Customer gives userId input {string}")
	public void customer_gives_userId_input(String UserId) {
	 citiBank.inputUserId(UserId);   
	}

	@When("Customer givers password input {string}")
	public void customer_givers_password_input(String Password) {
	   citiBank.inputPassword(Password); 
	}

	 @When("Customer click Remember UserId  button")
	public void customer_click_Remember_UserId_button() {
	  citiBank.clickRememberUserId();  
	}

	@Then("CustThen should be able to SignOn")
	public void custthen_should_be_able_to_SignOn() {
	  citiBank.clickSumbentBatton(); 
	}


	
	
	
	
	
	

}
