package com.cucumber.ukvisainfo.pageobject;

import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;

public class UKVisaInformationPage extends PageObject {

public void verification(String expected_Message) {
	
		final String MESSAGE_FIELD = "//*[@id='result-info']/div[2]/h2";
		
	    String actualResult = $(MESSAGE_FIELD).getText();
	    
		String Actual_Result = actualResult.replace("You’ll", "You will");
	    Actual_Result = Actual_Result.replace("won’t", "will not");
		
	    String Expected_Message = expected_Message.replace("\"", "");
	    Assert.assertEquals(Expected_Message, Actual_Result);
		
		}
		
	}


