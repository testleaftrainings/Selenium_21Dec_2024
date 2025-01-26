package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	public String filename;
	
	@Parameters({"URL","Username","Password"})
	@BeforeMethod
	public void preCondition(String url,String user, String pass) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		 
		//ClassName.methodName
		return ReadExcel.readData(filename); //fileName - CreteLead or EditLead

	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
}
