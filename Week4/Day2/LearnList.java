package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//Create an empty List
		List<String> studentsName=new ArrayList<String>();
		System.out.println("The empty list is: "+studentsName);
		
		//add an element
		studentsName.add("Vinoth");
		System.out.println("List after adding 1 name: "+studentsName);
		
		studentsName.add("Saranya");
		System.out.println("List after adding 2 names:"+studentsName);
		
		studentsName.add("Venkatesh");
		System.out.println("List after adding multiple names: "+studentsName);
		
		studentsName.add("Vinoth");
		System.out.println("List after adding duplicate value: "+studentsName);
		
		
   //index  0       1          2        3
		//[Vinoth, Saranya, Venkatesh, Vinoth]
		
		//Add element based on index
		studentsName.add(2, "Kathir");
		System.out.println("Current list is :"+studentsName);
		
		//remove an element
		studentsName.remove(0);
	     System.out.println("List after removal: "+studentsName);
		
		//Size of the list:
	     int sizeOfList = studentsName.size();
		System.out.println("List size is: "+sizeOfList);
		
		//addAll - used to add all the elements from one list to another
		
		//Create a emptyList
		List<String> learners=new ArrayList<String>();
		System.out.println("Learners list is: "+learners);
		
		learners.addAll(studentsName);
		System.out.println("Learners list after adding: "+learners);
		
		//Get method - to retrieve a particular value from a list
		String nameAtIndex2 = learners.get(2);
		System.out.println("Name at index 2 is : "+nameAtIndex2);
		
		//To sort the List in Ascii order
		Collections.sort(learners);
		System.out.println("List after sorting: "+learners);
		
	}

}
