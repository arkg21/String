package InterviewArrays;

import java.util.Scanner;

public class Append0AtFirst 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int [] b= new int[a.length];

		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int m=0;
		int n=a.length-1;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
		System.out.println(b[i]+" ");	
		}
	}
}
