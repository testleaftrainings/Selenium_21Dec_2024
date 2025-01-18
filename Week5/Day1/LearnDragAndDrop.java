package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		//Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://jqueryui.com/droppable/");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Maximize the browser
		driver.manage().window().maximize();
		//MouseHover- moveToElement
		
		driver.switchTo().frame(0);
		
		//Step1: Instantiate the Actions Class
		Actions dd=new Actions(driver);
		
		//Find source
          WebElement source = driver.findElement(By.id("draggable"));
          //Find Target
          WebElement target = driver.findElement(By.id("droppable"));
          dd.dragAndDrop(source, target).perform();
     }

}
