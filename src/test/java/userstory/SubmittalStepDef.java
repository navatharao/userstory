package userstory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubmittalStepDef {
	WebDriver driver;
	DriverHelper helper = new DriverHelper();
	AgileTBContactPage atp;

	@Before
	public void setUp() {
		driver = helper.getDriver("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		atp = new AgileTBContactPage(driver);
	}

	@Given("^I am on AgileTrailBlazer's Contact\\.html page$")
	public void i_am_on_AgileTrailBlazer_s_Contact_html_page() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://mock.agiletrailblazers.com/contact.html");
	}

	@Given("^I enter \"([^\"]*)\" in the name field$")
	public void i_enter_in_the_name_field(String name) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		atp.name().sendKeys(name);
	}

	@Given("^I enter \"([^\"]*)\" in the email field$")
	public void i_enter_in_the_email_field(String email) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		atp.email().sendKeys(email);
	}

	@Given("^I enter \"([^\"]*)\" in the phone number field$")
	public void i_enter_in_the_phone_number_field(String phone) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		atp.phone().sendKeys(phone);
	}

	@Given("^I enter \"([^\"]*)\" in the office number field$")
	public void i_enter_in_the_office_number_field(String office) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		atp.office().sendKeys(office);
	}

	@Given("^I pick \"([^\"]*)\" in the subject field$")
	public void i_pick_in_the_subject_field(String subject) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Select subjectdd= new Select(atp.subject());
		subjectdd.selectByValue(subject);
	}

	@Given("^I enter a \"([^\"]*)\" in the message field$")
	public void i_enter_a_in_the_message_field(String message) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		atp.message().sendKeys(message);
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("submit")).click();
	}

	@Then("^I should get success message$")
	public void i_should_get_success_message() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.id("success-message")).isDisplayed());
		
	}
	@Then("^I should get the alert messages for empty required fields and a failure message$")
	public void i_should_get_the_alert_messages_for_empty_required_fields_and_a_failure_message() throws Exception 
	{
	    if(driver.findElement(By.id("nameAlert")).isDisplayed())
	    {
	    	
	    }
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}
}
