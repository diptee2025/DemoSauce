package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/FeatureFiles"},
		glue = {"StepDefinition"},
		dryRun = false,
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
