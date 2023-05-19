package Strings;

public class ReverseTheWords 
{
	public static void main(String[] args) 
	{
		String st=" I am from Bangalore";
		String a[]=st.split(" ");
		for (int i = 0;i<a.length; i++) 
		{
			String str=a[i];
			for (int j = str.length()-1; j>=0;j--) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
