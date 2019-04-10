package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import BaseClass.TestBase;
import Pages.contactpage;
public class CRMStepDefinition extends TestBase {
	contactpage c1;

	@Given("^User is in homepage$")
	public void user_is_in_homepage() throws Throwable {
		parameter();
	}
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click on Submit$")
	public void enter_and_and_click_on_Submit(String username, String password) throws Throwable {
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


	
}
