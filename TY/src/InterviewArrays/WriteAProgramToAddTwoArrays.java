package InterviewArrays;

import java.util.Scanner;

public class WriteAProgramToAddTwoArrays 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];

		System.out.println("Enter the values for a");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the values for b");
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=sc.nextInt();
		}
		
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		
		for (int i = 0; i < length; i++) 
		{
			try
			{
				System.out.println(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]+" ");
				}
				else
				{
					System.out.println(b[i]+" ");
				}
			}
		}
	}
}
