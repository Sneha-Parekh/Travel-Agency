package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/Features",
	    glue="StepDefinitions" ,tags="@Smoke",
	    	    plugin= {"pretty","html:target/reports/report.html"})

public class Runner
{
	
}