package week4.day1;

public class CalculatorFunctionality {
	
	//Addition Function
	
	public void additionOfNumbers(int a, int b) {
	System.out.println(a+b);
      
	}
	
	public void additionofNumbers(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	
	public void additionOfNumbers(int a, float b) {
		System.out.println(a+b);

	}
	
	
	public static void main(String[] args) {
	CalculatorFunctionality calc=new CalculatorFunctionality();
	calc.additionOfNumbers(5, 3);
	calc.additionofNumbers(1, 2, 3);
	calc.additionOfNumbers(4, 8.5f);
	}

}
