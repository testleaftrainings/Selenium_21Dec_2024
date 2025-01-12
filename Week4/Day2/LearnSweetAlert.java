package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) throws InterruptedException {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
