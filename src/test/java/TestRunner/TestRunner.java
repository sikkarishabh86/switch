package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/AddNewCustomer.feature",
glue = {"StepDefinitions","baseSetup"},
monochrome = true,
dryRun = false,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//plugin = {"pretty","html:src/test/resources/target/reports"})
public class TestRunner {

}
