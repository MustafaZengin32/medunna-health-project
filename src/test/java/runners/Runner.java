package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target//cucumber-reports.html",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber-report.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@Mustafa007",
        dryRun = false
)
public class Runner {
}