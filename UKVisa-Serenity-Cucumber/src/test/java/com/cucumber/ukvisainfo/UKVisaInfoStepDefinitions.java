package com.cucumber.ukvisainfo;

import org.openqa.selenium.WebDriver;

import com.cucumber.ukvisainfo.serenity.PersonSteps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class UKVisaInfoStepDefinitions {
	
	@Steps
	PersonSteps person;
	
	@Managed(driver = "chrome")                                                           
	 WebDriver driver;
	
	@Before
	public void openTheApplication() {
		person.open_home_page();
	}
	
	@Given("^I provide a nationality of (.*)$")
	public void personProvideNationality(String countryname) {
		person.provide_nationality_of(countryname);	
		}
	
	@And("^I select the reason (.*)$")
	public void personSelectReasonOfStay(String reason) {
		person.select_reason_of(reason);
		}
	
	@And("^I state I am intending to stay for (.*)$")
	public void personSelectDurationOfStay(String duration) {
		person.select_intend_to_stay_for(duration);
		}
	
	@When("^I submit the form$")
	public void personSubmitForm() {
		person.submit_the_form();
		}
	
	@Then("^I will be informed that (.*)$")
   	public void visaInformationMessage(String message) 	{	
		person.get_message_that(message);
		}
	
	@And("^I state (.*) I am not travelling or visiting a partner or family$")
	public void personSelectYesOrNo(String answer) {
		person.state_not_travelling_or_visiting_partner_or_family(answer);
		}

}
