package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//HashSet - Random Order
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet - ASCII
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		//To add an element
		
		mentors.add("Kathir");
		mentors.add("Udhaya");
		mentors.add("Saranya");
		mentors.add("Harrish");
		
		//Add duplicate element
		mentors.add("udhaya");
		System.out.println("Current set is :"+mentors);
		
		//Remove an element
		mentors.remove("udhaya");
		System.out.println("Current set is: "+mentors);
		
		//To find the size
		int sizeOfSet = mentors.size();
		System.out.println("Set size is :"+sizeOfSet);
		
		//To retrieve a particular element in Set
		
		//Step1: Create  an empty list
		//Step2: Move elements from Set to list
		List<String> trainers=new ArrayList<String>(mentors);
		System.out.println("Current list is :"+trainers);
		
		//Step3: Retrieve element from list
		String nameAtIndex0 = trainers.get(0);
		System.out.println("The element at index 0 is: "+nameAtIndex0);

	}

}
