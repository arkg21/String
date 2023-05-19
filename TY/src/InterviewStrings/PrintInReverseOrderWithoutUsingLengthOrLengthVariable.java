package InterviewStrings;

public class PrintInReverseOrderWithoutUsingLengthOrLengthVariable 
{
	public static void main(String[] args) 
	{
		String s="TestYantra";
		String rev="";
		char[] ch = s.toCharArray();
		int count=0;
		for (char i : ch) 
		{
			count++;
		}
		
		for (int i = count-1; i >=0; i--) 
		{
			rev=rev+ch[i];
			System.out.println(ch[i]);
		}
		
		System.out.println(rev);
	}
}
