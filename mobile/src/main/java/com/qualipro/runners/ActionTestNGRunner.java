package com.qualipro.runners;

import com.qualipro.runners.RunnerBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/action/cucumber"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/module-action/cucumber-html-reports"
                , "json:target/cucumber-reports/CucumberTestReport.json"}
        , features = {"C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\mobile\\src\\main\\resources\\features\\Action.feature"}
        , glue = {"com\\qualipro\\stepdef"}
        ,tags = {"@ActionRealiserSuivi"}
        , dryRun = false
        , monochrome = true
)
public class ActionTestNGRunner extends RunnerBase {
}