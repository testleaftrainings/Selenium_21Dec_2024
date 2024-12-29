package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionality {

	public static void main(String[] args) {
		// Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Find the element -findElement
		//Enter the value in a text field-sendKeys
		//Click the button -click
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click the Leads Link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		//To get the return type - press ctrl+2, then select from the suggestion
		//press ctrl+2, then separately press L
		
		//Select a value in a dropdown
		
		//Step1: finding the element  
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create object for Select class
		Select dd1 =new Select(dropDown1);
		
		//Step3: Select the option
		
		//select by index
		//dd1.selectByIndex(4);
		
		//select by value
		//dd1.selectByValue("LEAD_CONFERENCE");
		
		//select by visibleText
		dd1.selectByVisibleText("Partner");
		
		//Click CreateLead button
		driver.findElement(By.name("submitButton")).click();

	}

}
