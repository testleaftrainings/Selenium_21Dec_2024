package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

		 public static void main(String[] args) {
				// Launch browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	}

}
