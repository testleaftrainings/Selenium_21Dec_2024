package week4.day1;

public interface RBI {
	

	public void mandatoryKYC();
	
    static void depositAmount() {
		System.out.println("RS 1 lakh");
	}
	
	default void enableLoans() {
		System.out.println("Apply loans");
	}
	

}
