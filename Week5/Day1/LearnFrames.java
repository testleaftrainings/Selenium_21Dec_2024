package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/frame.xhtml");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//switch to the frame
		driver.switchTo().frame(0);
		
		//Click the button
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
	}

}
