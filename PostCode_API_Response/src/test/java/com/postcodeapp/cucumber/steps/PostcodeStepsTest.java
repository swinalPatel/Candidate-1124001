package com.postcodeapp.cucumber.steps;


import org.junit.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;


public class PostcodeStepsTest {
	
	
	@Before
	public static void init() {
		RestAssured.baseURI="http://api.postcodes.io/";
		RestAssured.basePath="/postcodes";
		
	}

	@When("^I send a get request to api.postcodes.io./postcodes/SW1P4JA$")
	public void verify_status_code_200_for_postcode_endpoint()
	{
		RestAssured.baseURI="http://api.postcodes.io/";
		RestAssured.basePath="/postcodes";
		SerenityRest.given().contentType(ContentType.JSON).when().get("/SW1P4JA").then().log().all();
		
		
	}
	
	@Then("^receive (.*) response$")
	public void verifyrequest(int expected) {
		System.out.println("verify request");
		int actual = SerenityRest.given().contentType(ContentType.JSON).when().get("/SW1P4JA").getStatusCode();
		Assert.assertTrue("Test Fail", expected==actual);
	}

}
