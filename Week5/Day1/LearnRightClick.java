package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		//Launch browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Maximize the browser
				driver.manage().window().maximize();
				//MouseHover- moveToElement
				
				//Step1: Instantiate the Actions Class
				Actions rightClick=new Actions(driver);
				
			//Step2:
				WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));

				//Step3:
				rightClick.contextClick(rightClickElement).perform();
	}

}
