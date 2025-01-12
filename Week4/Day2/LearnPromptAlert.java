package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Transfer the driver focus
		Alert promptAlert = driver.switchTo().alert();
		
		String promptAlertText = promptAlert.getText();
		System.out.println(promptAlertText);
		
		promptAlert.accept();
		
		//UnhandledAlertException
		//Try to click another button without handling the alert
		//driver.findElement(By.xpath("//span[text()='Show']")).click();
	}

}
