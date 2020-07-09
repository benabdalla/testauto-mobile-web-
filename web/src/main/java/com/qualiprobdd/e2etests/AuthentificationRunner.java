package com.qualiprobdd.e2etests;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(format = ("pretty"), features = { "src/specs/features/Authentification/Authenti.feature" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},

		//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		tags= {"@tag4"}
)


@Test
public class AuthentificationRunner extends AbstractTestNGCucumberTests{
	@Parameters({"language"}) 
	@BeforeClass
    public void setup(String language) throws Exception { 
		com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
    } 
	/*@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));
	}*/
	

}



