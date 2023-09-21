package com.tarim.cukesrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

        "json:target/cucumber.json",
        "pretty",
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/tarim/step_definitions",
        dryRun = false,
        tags="@wip02",
        publish = true //generating a report with public link
)



public class CukesRunner {



}
