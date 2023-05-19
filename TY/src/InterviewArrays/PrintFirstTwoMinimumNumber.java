package InterviewArrays;

import java.util.Scanner;

public class PrintFirstTwoMinimumNumber 
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
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<fmin) 
			{
				smin=fmin;
				fmin=a[i];
			}
			else if (a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}
}
