package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.amazon.in/");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Maximize the browser
		driver.manage().window().maximize();
		//MouseHover- moveToElement
		//Step1: Instantiate the Actions Class
		Actions actMousehover=new Actions(driver);
		
		//Step2: Find the element
		WebElement mouseHoverElement = driver.findElement(By.xpath("//div[text()='EN']"));
		
	    //Step3:
		actMousehover.moveToElement(mouseHoverElement).perform();
  }

}
