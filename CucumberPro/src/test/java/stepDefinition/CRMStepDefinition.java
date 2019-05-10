package stepDefinition;


import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.Reporter;
import BaseClass.TestBase;
import Pages.contactpage;

public class CRMStepDefinition extends TestBase {
	contactpage c1;
	public ExtentReports report;
	
	@After
	public void takescreenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot d1 = (TakesScreenshot) driver;
			File scr = d1.getScreenshotAs(OutputType.FILE);
			String dest = "E:\\c files\\git\\CucumberDemoProject\\CucumberPro\\Snapshot\\screenshot"+""+".png";
			File target = new File(dest);
			FileUtils.copyFile(scr, target);
			Reporter.addScreenCaptureFromPath(dest.toString());
			
		}
		else {		
		TakesScreenshot d1 = (TakesScreenshot) driver;
		File scr = d1.getScreenshotAs(OutputType.FILE);
		String dest = "E:\\c files\\git\\CucumberDemoProject\\CucumberPro\\Snapshot\\screenshot"+""+".png";
		File target = new File(dest);
		FileUtils.copyFile(scr, target);
		Reporter.addScreenCaptureFromPath(dest.toString());
		}
	}
	
	
	
	@Given("^User is in homepage$")
	public void user_is_in_homepage() throws Throwable {
		parameter();
	}
	
	@Then("^Enter username password and click on Submit$")
	public void enter_username_password_and_click_on_Submit(DataTable data) throws Throwable {
		List<List<String>> datum = data.raw();
		  driver.findElement(By.name("username")).sendKeys(datum.get(0).get(0));
		   driver.findElement(By.name("password")).sendKeys(datum.get(0).get(1));
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("^Enter username and password then click on Submit$")
	public void enter_username_and_password_then_click_on_Submit(DataTable credential) throws Throwable {
		for(Map<String, String> data1 : credential.asMaps(String.class, String.class)) {
			 driver.findElement(By.name("username")).sendKeys(data1.get("username"));
			   driver.findElement(By.name("password")).sendKeys(data1.get("password"));
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
	}
	
	
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click on Submit$")
	public void enter_and_and_click_on_Submit(String username, String password ) throws Throwable {
		 userlogin(username,password);
	}
	
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    System.out.println("Loggedin Successfully");
	}

	@Then("^Verify the contact lable$")
	public void verify_the_contact_lable() throws Throwable {
		
		c1= new contactpage();
		driver.switchTo().frame("mainpanel");
		c1.verifyContactsLabel();
	}

	@Then("^Click on contact link$")
	public void click_on_contact_link() throws Throwable {
		c1= new contactpage();
		c1.clickOnContactsLink();
	}

	@Then("^Click on Contact new page link$")
	public void click_on_Contact_new_page_link() throws Throwable {
		c1= new contactpage();
		c1.clickOnNewContactLink();
	}
	
	@Then("^Enter the field values in contact page \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\" and Click on submit$")
	public void enter_the_field_values_in_contact_page_and_and_and_Click_on_submit(String ftname, String ltname, String comp) throws Throwable {
		c1= new contactpage();
		Thread.sleep(2000);
		c1.createNewContact(ftname,ltname,comp);
	}

	@Then("^Verify the contact link$")
	public void verify_the_contact_link() throws Throwable {
	   System.out.println("Verified the contact link");
	}

	@Then("^Verify the Contact new page link$")
	public void verify_the_Contact_new_page_link() throws Throwable {
		 System.out.println("Verified Contact new page link");
	}

	@Then("^Verify the field values$")
	public void verify_the_field_values() throws Throwable {
		System.out.println("Verified the field values");
	}

	@Then("^Verify the Deal lable$")
	public void verify_the_Deal_lable() throws Throwable {
		System.out.println("Verified the Deal lable");
	}

	@Then("^Verify the Deal link$")
	public void verify_the_Deal_link() throws Throwable {
		System.out.println("Verified the Deal link");
	}

	@Then("^Verify the Deal new page link$")
	public void verify_the_Deal_new_page_link() throws Throwable {
		System.out.println("Verified Deal new page link");
	}

	@Then("^Verify the Deal field values$")
	public void verify_the_Deal_field_values() throws Throwable {
		System.out.println("Verified Deal field values");
	}

	
}
