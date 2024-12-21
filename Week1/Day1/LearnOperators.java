package week1.day1;

public class LearnOperators {
	
	//Assignment operator
	//Arithmetic operators
	//comparison operators
	//Logical operator
	//Increment & Decrement Operator
	

	public static void main(String[] args) {
		
		//Assignment operator (=)
          int a=5;
		
		//Arithmetic operators
		
		int b=10;
		int c=3;
		
		//Add
		System.out.println(b+c);
		
		//Sub
		System.out.println(b-c);
		
		//mul
		System.out.println(b*c);
		
		//div - to get quotient
		System.out.println(b/c);
		
		//Mod - to get remainder
		System.out.println(b%c);
		
		
		System.out.println("--------------------");
		
		//comparison operators - return boolean value
		//== equal to
		//!= notEqualTo
		//lessThan
		//greaterThan
		//greaterThanEqualTo
		
		int p=2;
		int q=3;
		System.out.println(p==q);
		System.out.println(p!=q);
		System.out.println(p>q);
		System.out.println(p<=q);
		
		System.out.println("-----------------");
		
		//Logical operator - 2 Conditions
		
		//&& And Operator  - Both the condition should satisfied - true
		// || Or Operator  - Either of the condition satisfies - true
		
		int s=4;
		int t=5;
		System.out.println(s<t&&s<=t);
		
		System.out.println(s>t||s<t);
		
		System.out.println("-----------------");
		
		//Increment Operator & Decrement Operator
		//Increment operator
		//preIncrement and postIncrement (will increase the value 1)
		
		 int v=7;
		//postIncrement
		System.out.println(v++);
		System.out.println(v);
		
		//preIncrement
		System.out.println(++v);
		
		//Decrement operator(decreases the value by 1)
		//postDecrement
		System.out.println(v--);
		System.out.println(v);
		
		//preDecrement
		System.out.println(--v);
		
	}

}
