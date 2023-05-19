package InterviewStrings;

import java.util.Arrays;

public class WAPToPrintAString 
{
	public static void main(String[] args) 
	{
		String s="TestYantra";
		char[] ch = s.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(ch[i]);
		}
	}
}
