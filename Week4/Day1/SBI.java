package week4.day1;

public class SBI implements RBI {

	public static void main(String[] args) {
		SBI sbiRules=new SBI();
		sbiRules.mandatoryKYC();
		RBI.depositAmount();
		sbiRules.enableLoans();
		
	}

	@Override
	public void mandatoryKYC() {
		System.out.println("Pan is mandatory");
		
	}
	
	
	

}
