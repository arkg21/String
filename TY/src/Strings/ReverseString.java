package Strings;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s="Bangalore";
		for (int i =s.length()-1;i>=0; i--) 
		{
			System.out.print(s.charAt(i));
		}
		
		System.out.println("********************************************");
		
		String a="Bangalore";
		char[] st=a.toCharArray();
		for (int i = st.length-1;i>=0; i--) 
		{
			System.out.print(st[i]);
		}
		
		System.out.println("**********************************************");
		
		String b="Bangalore";
		char[] sc=b.toCharArray();
		int count = 0;
		for(Character ch:sc)
		{
			count++;
		}
		for (int i = count-1;i>=0; i--) 
		{
			System.out.println(sc[i]);
		}
		
		System.out.println("***************************************************");
		
	}
}
