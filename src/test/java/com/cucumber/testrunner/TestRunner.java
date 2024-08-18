package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = { "steps" }, plugin = { "pretty",
		"html:report1" }, dryRun = false, monochrome = true, strict = true
		//, tags = { "@tag1" }
)
public class TestRunner {

	/**
	 * features = features files path
	 * 
	 * steps = steps files path
	 * 
	 * dryRun = true -> Use to check feature file which does not have steps
	 * 
	 * strict = true -> Used to set strict on file which does not have steps
	 * 
	 * monochrome = true -> it will provide the readable format
	 * 
	 * tags = {"tag1"} -> Used to run individual or specific tests
	 * 
	 * name = {"Logo"} -> it will run only those scenario which contains logo
	 * text from widly
	 * 
	 * 
	 */

}
