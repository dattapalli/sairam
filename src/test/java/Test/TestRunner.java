package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/Features/Cogmento.feature",
	glue="StepDefinitions",
	plugin={"pretty","html:target/cucumber.report.html"})


public class TestRunner {

}
