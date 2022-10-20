
// Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */




package week3day2assignment;

import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		TreeSet<Integer>treeSet=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++)
		
			treeSet.add(data[i]);
		{
System.out.println("TreeSet Elements are"+treeSet);}
List<Integer>intList=new ArrayList<Integer>(treeSet);
int size=int List.size();
{
System.out.println("Second largest Element"+int List.get(size-2));
	}
	}
}


