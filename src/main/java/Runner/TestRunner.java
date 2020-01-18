package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"/Users/papia/Desktop/cucumber2020/Cucumberjan17/src/main/java/feature"} ,
        format = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        glue = "steps",
        strict = false,
        monochrome = true,
        //tags = {"@search"}, //@SmokeTest, @FunctionalTest, @DocString
        dryRun =false)

public class TestRunner {

}
