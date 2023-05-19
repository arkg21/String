package Strings;

import java.util.Scanner;

public class CountNumberOfUpperAndLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int uppercase=0;
		int lowercase=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='A' &&  s.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
		}
		System.out.println("No of Uppercase = "+uppercase);
		System.out.println("No of lowercase = "+lowercase);
	}
}
