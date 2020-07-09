package com.qualipro.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/pnc/cucumber"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/pnc/cucumber-html-reports"
                , "json:target/cucumber-reports/CucumberTestReport.json"}
        , features = {"src/test/resources/features/Pnc.feature"}
        //,tags = {"@PNC","@DécisionDeTraitementSansInvestigation","@DécisionDeTraitementAvecInvestigation"," @InvestigationPNC","@ApprobationInvestigationPNC","@TraiterPNC ","@SuiviPNC"}
        , glue = {"com\\qualipro\\stepdef"}
        , dryRun = false
        , monochrome = true
)
public class PncTestNGRunner   extends RunnerBase {

}
