package String;

public class ReverseString {

	public static void main(String[] args) 
	
	{
       /*
		String s="Bangalore";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);   */
		
		
	/*	2n way
         String s="Bangalore";
		char[] ch = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			System.out.print(ch[i]); 
		}
		
		*/
		
		/*  3rd way
		   String s="Bangalore";
			char[] ch = s.toCharArray();
			int count = 0;
			for(char st:ch)
			{
				count++;
				 
			}
		for(int i=count-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
		
		*/
		
		/* 4th way
		 StringBuilder s=new StringBuilder("Bangalore");
		System.out.println(s.reverse());
		
		*/
		
		
		
		
		
	}
	
	
	
	
	

}
