package week4.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge extends LaunchChrome {
	
	public void launchBrowser() {
		super.launchBrowser();
    //EdgeDriver driver=new EdgeDriver();
	}
	
	public static void main(String[] args) {
		LaunchEdge edge=new LaunchEdge();
		edge.launchBrowser();
		
	}
}
