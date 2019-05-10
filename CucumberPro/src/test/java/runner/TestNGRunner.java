package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/DatatableUsingMap.feature",
		glue={"stepDefinition"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ExtentReports/report.html"},
		dryRun = false
	//	tags = {"@Chrome","@Firefox"}
		
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
