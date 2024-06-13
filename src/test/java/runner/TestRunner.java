package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "",
        dryRun = false,
        plugin = {"pretty",
                "json:target/cucumber.json",
                "utils.formatter.PrettyReports:target/cucumber-pretty-reports"

        }
)

public class TestRunner {

}
