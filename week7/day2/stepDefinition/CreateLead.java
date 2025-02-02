package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead  extends BaseClass {

	@When("click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
	    driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click on the leads tab")
	public void click_on_the_leads_tab() {
	   driver.findElement(By.linkText("Leads")).click();
	}
	@When("click on the create lead link")
	public void click_on_the_create_lead_link() {
	   driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("enter the company name as {string}")
	public void enter_the_company_name_as_testleaf(String cname) {
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@Given("enter the first name as {string}")
	public void enter_the_first_name_as_gokul(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("enter the last name as {string}")
	public void enter_the_last_name_as_sekar(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("verify the lead is created successful")
	public void verify_the_lead_is_created_successful() {
	   String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	   String leadID = text.replaceAll("[^0-9]", "");
	   System.out.println(leadID);
	}

	
}
