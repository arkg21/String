package InterviewStrings;

public class PrintTheFirstCharacterInCapital 
{
	public static void main(String[] args) 
	{
		String s="my name is archit";
		String str[]=s.split(" ");
		String firstLetter=" ";
		String capLetter=" ";
		for (String i : str) 
		{
			firstLetter=i.substring(0, 1).toUpperCase()+i.substring(1);
			capLetter=capLetter+firstLetter+" ";
		}
		System.out.println(capLetter.trim());
		
	}
}
