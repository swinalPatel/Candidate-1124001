package com.postcodeapp.cucumber.steps;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=true,
		features = "src/test/resources/feature/",
		glue = "com.postcodeapp.cucumber.steps",
		tags = "@postcode1"
		
		)
public class PostcodeRunner {
	

}
