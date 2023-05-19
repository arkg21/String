package InterviewArrays;

import java.util.Scanner;

public class PrintMissingNumbersInArray 
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
		
		boolean status= true;
		for (int i = 0; i <=10; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(i==a[j])
				{
					status=false;
					break;
				}
			}
			if(status==true)
			{
				System.out.print(i+" ");
			}
			status=true;
		}
		
	}
}
