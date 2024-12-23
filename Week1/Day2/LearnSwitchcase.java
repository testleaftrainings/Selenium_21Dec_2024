package week1.day2;

public class LearnSwitchcase {

	public static void main(String[] args) {
		
		String browser="Chrome";
		
		switch(browser) {
		
		case "Chrome":
		System.out.println("Chrome browser should be executed");
		break;
		
		case "Edge":
			System.out.println("Edge browser should be executed");
		    break;
		
		case "Safari":
			System.out.println("Safari browser should be executed");
		    break;
		    
		    default:
		    	System.out.println("IE browser should be executed");
		}

	}

}
