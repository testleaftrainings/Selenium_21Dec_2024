package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//By Literal
		String str1="SeleniumDecember";
		
		String str3="SeleniumDecember";
		
		//By Instantiation
		String str2=new String("SeleniumDecember");
		
		String str4=new String("SeleniumDecember");
		
		//String Comparison methods
		//.equals - Compares the content of two Strings
		//==      -Compares the reference address of Strings
		//Comparison -true of false
		
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		
		System.out.println("----------------");
		
		System.out.println(str1.equals(str4));
		System.out.println(str2.equals(str4));
		
		//To find the length
		String str="Dec2024";
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
		
		//Contains- Partial value
		System.out.println(str.contains("Dc"));
		
		//Convert all the characters of a String to Uppercase
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		
		//chatAT - CharacterAt
		char characterAtIndex2 = str.charAt(5);
		System.out.println(characterAtIndex2);
		
		System.out.println("---------------");
		
		//toCharArray - Convert String to CharacterArray
	     String batchName="Dec2024 ";
	     //{'D','e','c','2','0','2','4'}
		char[] batchNameCharacters = batchName.toCharArray();
		System.out.println(batchNameCharacters[4]);
		
		
		//Substring - crop a String based on the input, input -1 String, output-1 String
 
		//Starting index
		String substring = batchName.substring(2);
		System.out.println(substring);
		
		//Starting and ending index
		String substring2 = batchName.substring(2,5);
		System.out.println(substring2);
		
		String batch="Selenium December 2024";
		
		//Split - Split a single to multiple Strings
		               //   0           1
		//String batch[]={"Selenium","2024"};
		String[] batchSplit = batch.split(" ");
		System.out.println(batchSplit[1]);
		
		System.out.println("----------------");
		
		String loanDetails="Loan upto 400000";
		int rateOfInterest=10;
		
		//replace the alphabets,numbers - replaceAll
		String replaceAll = loanDetails.replaceAll("[A-Za-z]","");
		System.out.println(replaceAll);
		
		//add the interest with the amount 40000
		int interest=40000;
		System.out.println(replaceAll+interest);
		
		//Convert a string to int- parseInt
		int loanAmount = Integer.parseInt(replaceAll);
		//System.out.println(loanAmount);
		System.out.println(loanAmount+interest);
		
   }

}
