package InterviewArrays;

import java.util.Scanner;

public class PrintFirstTwoMaximumArrayWithoutUsingBBSort 
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
		
		int fmax=a[0];
		int smax=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>fmax) 
			{
				smax=fmax;
				fmax=a[i];
			}
			else if (a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}
