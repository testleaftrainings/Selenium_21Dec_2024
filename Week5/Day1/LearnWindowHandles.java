package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		 //Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/window.xhtml");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandle
		String parentAddress = driver.getWindowHandle();
		System.out.println("Parent address is :"+parentAddress);
		
		//To get the title of the window - getTitle - used for validation
		String parentTitle = driver.getTitle();
        System.out.println("Parent title is : "+parentTitle);
      
        //Step1:
        //To get the address of all opened windows
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All windows are: "+allWindows);
        
        //Step2:Convert set into list
        List<String> allWindowsAddress=new ArrayList<String>(allWindows);
        
        //Step3: switch between the windows
        driver.switchTo().window(allWindowsAddress.get(1));
        
        //Step4: Validation
        String titleOfChild = driver.getTitle();
        System.out.println("Child title is: "+titleOfChild);
        
        
        
        //driver.close
        driver.close();
        
        //Switch to the parent window
        driver.switchTo().window(allWindowsAddress.get(0));
        System.out.println(driver.getTitle());
        
        //driver.quit
       // driver.quit();
        
    }

}
