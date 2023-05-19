package ExtraStrings;

public class WhetherStringIsPalindromOrNot {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		if(s.equals(rev))
		{
			System.out.println(s+" is palindrom");
		}
		else {
			
			System.out.println(s+" is not palindrom");
		}
		

	}

}
