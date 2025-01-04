package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
	
		//Store multiple data in a single variable
		
		//Arrays Declaration
		
		//By Array Literal
		//Store the scores of Batsman in 5 innings
		//int scores[]= {53,61,7,90,102};
                 // index 0  1  2  3  4
		
		
		//By Instantiation
		////Store the scores of Batsman in 5 innings
		
		int[] scores2=new int[5];
		scores2[0]=53;
		scores2[1]=61;
		scores2[2]=7;
		scores2[3]=90;
		scores2[4]=102;
		
		             
		int[] scores=  {53,61,7,90,102};
		
		//Methods of Arrays
		//To find the length of an array
		int lengthOfArray = scores.length;
		System.out.println("The length of an array is :"+lengthOfArray);
		
		//To retrieve a value -Using index
		System.out.println("Value at index2 is: "+scores[3]);
		
		//Sorting - sort the array in ascending order
	      Arrays.sort(scores);
	      //int[] scores=  {7,53,61,90,102};
	      
	      //To retrieve a lowest value in array
	      System.out.println("Lowest value is: "+scores[0]);
	      
	    //To retrieve a lowest value in array
          System.out.println("Highest value is : "+scores[lengthOfArray-1]);
	      
	      //To retrieve the entire values in array
	        for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			
	}
	      
		
}

}
