package week4.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		int num[]= {2,3,2,4,5,3}; 
		Set<Integer> uniqueNumber=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			uniqueNumber.add(num[i]);
		}
		System.out.println("Current set is :"+uniqueNumber);
	}

}
