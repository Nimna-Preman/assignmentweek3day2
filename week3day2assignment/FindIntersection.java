
/*
	 * Pseudo Code
	 *input: int[] a={3,2,11,4,6,7};
	 *        int[] b={1,2,8,4,9,7};
	 *output:2,4,7
	 *
	 * a) Declare An Array for {3,2,11,4,6,7};	 
	 * b) Declare another Array for {1,2,8,4,9,7};
	 * c) create a two empty Lists - list1 & list2
	 * c) Declare for loop iterator from 0 to array a.length and add into list1
	 * d) Declare for loop iterator from 0 to array b.length and add into another list2
	 * e) Compare Both list1 & list2 using a nested for loop
	 *    1)Print the matching number
	 *  
	 */
















package week3day2assignment;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
	ArrayList<Integer> intList1=new ArrayList<Integer>();
	ArrayList<Integer> intList2=new ArrayList<Integer>();
	
	
		for(int i=0;i<=a.length;i++)
		{
			intList1.add(a[i]);
		}
		System.out.println("First List"+ List1);
		for(i=0;i<=b.length;i++)
		{
			intList2.add(a[i]);	
			
			
		}
		System.out.println("Second List"+int List2);
		}
	System.out.println("print the matching number");
			
	 if
	(int i=0;i<intList1.size();i++)
	 {
		 if (int j=0;j<List2.size();j++)
	 
	{
		if(int List1.get(i).equals(intList2.get(j)))

	}
System.out.println(intList1.get(j));
}
