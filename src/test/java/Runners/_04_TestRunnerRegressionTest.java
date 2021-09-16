package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        tags ={"@Regression"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"})
public class _04_TestRunnerRegressionTest extends AbstractTestNGCucumberTests {
}
