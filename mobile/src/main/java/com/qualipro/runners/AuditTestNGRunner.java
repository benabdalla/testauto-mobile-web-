package com.qualipro.runners;

import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            plugin = {"pretty"
                    , "html:target/audit/cucumber"
                    , "summary"
                    , "de.monochromata.cucumber.report.PrettyReports:target/module-audit/cucumber-html-reports"
                    , "json:target/cucumber-reports/CucumberTestReport.json"}
            , features = {"src/test/resources/features/Audit.feature"}
            , glue = {"com\\qualipro\\stepdef"}
            ,tags={"@AuditeEnTantQuAuditeur"}
            , dryRun = false
            , monochrome = true
    )
    public class AuditTestNGRunner  extends RunnerBase {
}
