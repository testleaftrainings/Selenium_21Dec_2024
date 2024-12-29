package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
        public static void main(String[] args) {
		
        //Launch browser
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
		
	}

}
