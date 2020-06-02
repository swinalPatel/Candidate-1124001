package com.cucumber.ukvisainfo.serenity;

import com.cucumber.ukvisainfo.pageobject.DurationToStayPage;
import com.cucumber.ukvisainfo.pageobject.HomePage;
import com.cucumber.ukvisainfo.pageobject.NationalitySelectionPage;
import com.cucumber.ukvisainfo.pageobject.PurposeToStayPage;
import com.cucumber.ukvisainfo.pageobject.UKVisaInformationPage;
import com.cucumber.ukvisainfo.pageobject.VisitFamilyResonsePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class PersonSteps{
	
	String Person;
	HomePage homePage;   
	
	@Steps
	NationalitySelectionPage nationalitySelectionPage;
	
	@Steps
	PurposeToStayPage purposeToStayPage;
    
	@Steps
	DurationToStayPage durationToStayPage;
	
	@Steps
    VisitFamilyResonsePage visitfamilyreasonpage;
	
	@Steps
    UKVisaInformationPage ukvisainformationpage;
	   
   @Step("Person open ukvisa information page")
   public void open_home_page(  ) {
    	homePage.open();
		homePage.StartNow();
		}
    
	@Step("Person provide nationality of {0}")
	public void provide_nationality_of(String countryname) {
		nationalitySelectionPage.select_Country(countryname);
		nationalitySelectionPage.nextstep();
	}

	@Step("Person select purpose of stay {0}")  
	public void select_reason_of(String reason) {
		purposeToStayPage.select_Option(reason);
		purposeToStayPage.nextstep();		
		}

	@Step("Person select duration of stay {0}")  
	public void select_intend_to_stay_for(String duration) {
		durationToStayPage.select_Option(duration);
		durationToStayPage.nextstep();
		}

	@Step("Person submit the form")
	public void submit_the_form() {
		}

	@Step("Person state travelling or visiting partner or family : {0}")  
	public void state_not_travelling_or_visiting_partner_or_family(String answer) {
		visitfamilyreasonpage.select_Option(answer);
		visitfamilyreasonpage.nextstep();
		}
	
	@Step("Person get information that {0}")  
	public void get_message_that(String message) {
		ukvisainformationpage.verification(message);
	}
	
}
