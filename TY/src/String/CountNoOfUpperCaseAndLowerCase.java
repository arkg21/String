package String;

import java.util.Scanner;

public class CountNoOfUpperCaseAndLowerCase {

	public static void main(String[] args) 
	{
	for(;;)
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
				
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
			
		}
		
		System.out.println("Number of uppercase"+uppercase);
		System.out.println("Number of lowercase"+lowercase);
		
	}

	}

}
