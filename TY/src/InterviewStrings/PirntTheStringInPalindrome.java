package InterviewStrings;

public class PirntTheStringInPalindrome 
{
	public static void main(String[] args) 
	{
		String s="Malayalam";
		String rev="";
		for (int i = 0; i < s.length(); i++) 
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
