package Strings;

public class ReverseTheGivenSentence 
{
	public static void main(String[] args) 
	{
		String st="I am from Bangalore";
		String a[]=st.split(" ");
		for (int i= a.length-1;i>=0; i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
