package testcases;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CreateLead extends BaseClass {
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		 
		//ClassName.methodName
		return ReadExcel.readData();

	}
	
	
@Test(dataProvider="fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






