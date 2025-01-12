package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//To count the number of links
		int linkSize = allLinks.size();
		System.out.println("Total number of links: "+linkSize);
		
		//To Print all the links
		List<String> allString=new ArrayList<String>();
		for (int i = 0; i < linkSize ; i++) {
			String links = allLinks.get(i).getText();
			allString.add(links);
		}
		System.out.println(allString);
	}

}
