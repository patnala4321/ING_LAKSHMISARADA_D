package RunnersBDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/com/ui/automation/features/FirstCry.feature",
glue = {"com.ing.au.hackathon.stepdefinition"}, strict = true)

public class FirstCryRunner {

}
