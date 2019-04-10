package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/companypage.feature",
		glue={"stepDefinition"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ExtentReports/report.html"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
