
package com.cucumberDemoTours;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\resources\\Features\\demo.feature" }, glue = "cucumberDemoTourscom.stepdefinitions", strict = true, monochrome = true, dryRun = false

)
public class JunitRunner {

}