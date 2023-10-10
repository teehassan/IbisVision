package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/main/resources/features/login.feature", glue={"stepDefinition"}, monochrome = true, publish = true, plugin = {"pretty", "html:target/cucumber.html"})
public class RunnerTest {

}
