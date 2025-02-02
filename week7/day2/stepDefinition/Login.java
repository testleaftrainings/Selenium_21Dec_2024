package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	

	@Given("setup the test env")
	public void setEnv() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("enter the username as {string}")
	public void enterUsername(String uname) {
//		System.out.println(x);
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@Given("enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("click on the login button")
	public void clickLoginBtn() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("login is successful")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
	}
	
	
}
