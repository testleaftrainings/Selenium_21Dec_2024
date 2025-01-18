package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.amazon.in/");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step1:
		Actions scrollElement=new Actions(driver);
		
		//Step2:
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		scrollElement.scrollToElement(scroll).perform();
	}

}
