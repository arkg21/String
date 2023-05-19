package InterviewArrays;

import java.util.Scanner;

public class SumOfEvenAndOddPositionNumbers 
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

		int evenSum=0;
		int oddSum=0;

		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evenSum=evenSum+a[i];
			}
			else
			{
				oddSum=oddSum+a[i];
			}
		}

		System.out.println(evenSum);
		System.out.println(oddSum);	
	}
}
