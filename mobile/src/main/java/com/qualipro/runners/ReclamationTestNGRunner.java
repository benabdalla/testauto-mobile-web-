package com.qualipro.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/pnc/cucumber"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/module-reclamation/cucumber-html-reports"
                , "json:target/cucumber-reports/CucumberTestReport.json"}
        , features = {"src/test/resources/features/Reclamation.feature"}
        , glue = {"com\\qualipro\\stepdef"}
        , dryRun = false
        , monochrome = true
)

public class ReclamationTestNGRunner extends RunnerBase {
}
