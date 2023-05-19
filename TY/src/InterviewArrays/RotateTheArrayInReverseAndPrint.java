package InterviewArrays;

import java.util.Scanner;

public class RotateTheArrayInReverseAndPrint 
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

		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			if (start<end) 
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
}
