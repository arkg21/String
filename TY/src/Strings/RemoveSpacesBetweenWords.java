package Strings;

public class RemoveSpacesBetweenWords 
{
	public static void main(String[] args) 
	{
		String st="I am from Bangalore";
		System.out.println(st.replace(" ", ""));
		
		System.out.println("****************************");
		
		String sc="I am from Bangalore";
		String [] s=sc.split(" ");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]);
		}
	}
}
