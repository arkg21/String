package Strings;

public class SegregateAlpanumeric 
{
	public static void main(String[] args) 
	{
		String s="a2b&d3e";
		String alphabet=" ";
		String number=" ";
		String special=" ";
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(i);
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alphabet=alphabet+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				number=number+ch;
			}
			else
			{
				special=special+ch;
			}
		}
		System.out.println(alphabet+number+special);
	}
}
