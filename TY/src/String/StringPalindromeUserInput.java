package String;

import java.util.Scanner;

public class StringPalindromeUserInput {

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();

		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		if(rev.equals(s))
		{
			System.out.println("it is a palindrome");
			
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
		

	}

}
