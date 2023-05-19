package InterviewStrings;

public class PrintTheSentenceInReverseOrder 
{
	public static void main(String[] args) 
	{
		String s="My name is Archit";
		String[] str = s.split(" ");
		for (int i = str.length-1; i>=0; i--) 
		{
			System.out.print(str[i]+" ");
		}
		
		System.out.println("***************************************************");
		
		String a="My name is Archit";
		String[] b = a.split(" ");
		String rev=" ";
		for (int i = b.length-1; i >=0; i--) 
		{
			rev=rev+" "+b[i];
		}
		System.out.print(rev.trim());
	}
}
