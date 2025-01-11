package week4.day1;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC hdfcRules=new HDFC();
		hdfcRules.mandatoryKYC();
		hdfcRules.enableLoans();

	}

	@Override
	public void mandatoryKYC() {
		System.out.println("Aadhaar is mandatory");
		
	}
	
	public void enableLoans() {
		System.out.println("loans upto 5 lakhs");
	}

	

}

//In interface - till java 1.7 - 100% abstract methods
//static & default methods

//Abstract Class - 0% implemented method - 100 % Implemented method
//Partial implementation - abstract class







