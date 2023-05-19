package Strings;

public class FindTheMinimumLengthOfAString 
{
	public static void main(String[] args) 
	{
		String s[]= {"ab","abc","abcd","dgfh","ed"};
		String min_length=s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length() < min_length.length())
			{
				min_length=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()==min_length.length())
			{
				System.out.println(s[i]);
			}
		}
	}
}
