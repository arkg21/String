package ExtraStrings;

public class PrintStringInRevOrderWithoutUsingLenthMethodOrVariablebutUseTempVar {

	public static void main(String[] args) 
	{


	       String s="Rakshith";
	       char[] s1 = s.toCharArray();
	       String rev="";
	       int count=0;
	       for(char ch:s1)
	       {
	    	   
	    	   count++;
	       }
			for(int i=count-1;i>=0;i--)
			{
				rev+=s.charAt(i);
			}
			System.out.println(rev);
	}

}
