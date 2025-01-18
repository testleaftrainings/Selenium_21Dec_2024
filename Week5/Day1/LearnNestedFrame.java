package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/frame.xhtml");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//transfer focus to outer frame
		driver.switchTo().frame(2);
		
		//transfer focus to inner frame
		driver.switchTo().frame("frame2");
		
		//Click the element using id
		driver.findElement(By.id("Click")).click();

		//parent frame- to switch back to the immediate parent frame
		driver.switchTo().parentFrame();
		
		//defaultContent - to switch back to the main webpage
		driver.switchTo().defaultContent();
		
	}

}
