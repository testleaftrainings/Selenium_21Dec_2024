package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Handling the alert
		//Transfer driver focus to Alert box
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		String simpleAlertText = simpleAlert.getText();
		System.out.println(simpleAlertText);
		simpleAlert.accept();
		
		
		
		
		

	}

}
