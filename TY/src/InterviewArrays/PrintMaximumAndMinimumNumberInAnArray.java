package InterviewArrays;

import java.util.Scanner;

public class PrintMaximumAndMinimumNumberInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];


		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if(min<a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
