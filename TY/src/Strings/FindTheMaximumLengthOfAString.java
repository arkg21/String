package Strings;

public class FindTheMaximumLengthOfAString 
{
	public static void main(String[] args) 
	{
		String s[]= {"ab","abc","abcd","dgfh","ed"};
		String max_length=s[2];
		
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()==max_length.length())
			{
				System.out.println(s[i]);
			}
		}
	}
}
