package week3.day2;

public class Android15 extends Android12 {
	
	//SubClass can have its own method
	
	// Redmi extends Mobile
	//Tata extends Car
	
	public void useAI() {
		System.out.println("AI Integration");

	}
	
	

	public static void main(String[] args) {
		Android15 mobileActions=new Android15();
		mobileActions.takeHQPhoto();
		mobileActions.useAI();
	}

}
