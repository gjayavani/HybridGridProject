package AutomationPractice.StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/",
        tags = {"@smoke1"},
        plugin = {"json:target/cucumber.json","html:target/site/Grid-Reports"})
public class TestRunner {
}
