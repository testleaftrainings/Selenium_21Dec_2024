package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/java/features"}, glue= {"stepDefinition"},
					publish = true, monochrome = true, tags ="@login and @positive")
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
