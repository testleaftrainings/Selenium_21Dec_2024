package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;
@CucumberOptions(features = {"src/test/java/features"}, glue= {"stepDefinition"},
					publish = true, monochrome = true, tags ="@login")
public class CucumberRunner extends BaseClass{

}
