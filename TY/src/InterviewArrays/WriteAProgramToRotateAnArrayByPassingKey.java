package InterviewArrays;

import java.util.Scanner;

public class WriteAProgramToRotateAnArrayByPassingKey 
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

		int key=4;
		for (int i = 0; i < key; i++) 
		{
			int temp=a[0];
			for (int j = 1; j < a.length; j++) 
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}
}
