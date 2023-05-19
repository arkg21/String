package String;

public class PrintTheWordWhichAreContainsOinGivenString {

	public static void main(String[] args) 
	{

		String s="Hello who are you";

		String[] s1 = s.split(" ");

		for(int i=0;i<s1.length;i++)
		{
			String string = s1[i];
           if(string.contains("o"))
           {
        	   System.out.println(string);
        	   
           }

		}

	}

		
	}


