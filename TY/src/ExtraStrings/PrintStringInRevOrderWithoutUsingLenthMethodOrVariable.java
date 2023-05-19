package ExtraStrings;

public class PrintStringInRevOrderWithoutUsingLenthMethodOrVariable {

	public static void main(String[] args) 
	{
       String s="Rakshith";
       char[] s1 = s.toCharArray();
       
       int count=0;
       for(char ch:s1)
       {
    	   
    	   count++;
       }
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
