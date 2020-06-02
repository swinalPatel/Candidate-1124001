package com.cucumber.ukvisainfo.pageobject;

import java.util.List;

import org.apache.tools.ant.types.selectors.modifiedselector.EqualComparator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.pages.components.Dropdown;

 
public class Util extends PageObject {
	
	
	// -----------------------------------------------------------------------------------------------------------------
    // SELECTORS

    private static final String STARTNOW_BUTTON = "//*[@id='get-started']/a";
    private static final String SELECT_NATIONALITY_FIELD = "//*[@id='response']";
    private static final String NEXT_STEP_BUTTON = "/html/body/div[6]/main/div/div/form/div/button";
    private static final String SELECT_RADIO_BUTTONS = "//div[@class='gem-c-radio govuk-radios__item']";
   

    // -----------------------------------------------------------------------------------------------------------------
    // ACTIONS
	
	// collecting all the elements and storing into allRadio webelement
	 @FindBy(xpath = SELECT_RADIO_BUTTONS )
	    List<WebElement> allRadios;
	
	 // Method which is used to click on start now button
	public void StartNow() {
		clickOn($(STARTNOW_BUTTON));
    }

	// Method which is used to select the matched country from drop down
	public void select_Country(String countryname) {
		selectFromDropdown($(SELECT_NATIONALITY_FIELD), countryname);	
	}

	
	// Method which is used  to click on next step
	public void nextstep() {
		clickOn($(NEXT_STEP_BUTTON));
		}

	// Method which is selecting options from Radio buttons
	public void select_Option(String reason) {
				for(int i = 0; i < allRadios.size(); i++) {
				// find the match reason from drop down select it
					if(allRadios.get(i).getText().equals(reason.replace("\"", ""))) {
					String s1="//*[@id='response-";
					String s2="']";
					String s3 = s1+i+s2;
					clickOn($(s3));
					break;
					}
			}
		}
	
	   // -----------------------------------------------------------------------------------------------------------------
    // NO GETTERS 
}
			



