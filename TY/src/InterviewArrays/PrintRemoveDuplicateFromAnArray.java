package InterviewArrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintRemoveDuplicateFromAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];

		System.out.println("Enter the values for a");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for (Integer i : set) 
		{
		System.out.println(i);	
		}
		
	}
}
