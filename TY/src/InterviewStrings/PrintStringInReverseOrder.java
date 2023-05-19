package InterviewStrings;

public class PrintStringInReverseOrder 
{
	public static void main(String[] args) 
	{
		String s="TestYantra";
//		char[] ch = s.toCharArray();
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.println(s.charAt(i));
		}
	}
}
