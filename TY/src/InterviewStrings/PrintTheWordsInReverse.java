package InterviewStrings;

public class PrintTheWordsInReverse 
{
	public static void main(String[] args) 
	{
		String s="My name is Archit";
		String[] a=s.split(" ");
		for (int i = 0; i < a.length; i++) 
		{
			String str=a[i];
			for (int j = str.length()-1; j >=0; j--) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
