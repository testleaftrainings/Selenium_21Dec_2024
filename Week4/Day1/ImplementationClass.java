package week4.day1;

public class ImplementationClass extends Canara{

	public static void main(String[] args) {
		ImplementationClass imp=new ImplementationClass();
		imp.mandatoryKYC();
		imp.houseLoan();
		imp.carLoan();

	}

	@Override
	public void mandatoryKYC() {
		System.out.println("DL is mandatory");
		
	}

	@Override
	public void houseLoan() {
		System.out.println("House Loan upto 30 L");
		
	}

}
