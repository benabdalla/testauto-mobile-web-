package com.qualiprobdd.e2etests;
import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		strict = true,
		format = ("pretty"),
		features = { "src\\specs\\features\\moduleAction\\Action.feature" },
		monochrome =true,
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
		 },
		tags = {"@RealisationetSuiviAction"},
				
		dryRun= false
		)

@Test
	public class ActionRunner extends AbstractTestNGCucumberTests
	{

	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

	}
		
	
	}

