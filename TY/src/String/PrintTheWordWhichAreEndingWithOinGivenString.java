package String;

public class PrintTheWordWhichAreEndingWithOinGivenString {

	public static void main(String[] args) 
	{

		String s="Hello who are youo";

		String[] s1 = s.split(" ");

		for(int i=0;i<s1.length;i++)
		{
			//String string = s1[i];
           if(s1[i].endsWith("o"))
           {
        	   System.out.print(s1[i]+" ");
        	   
           }

		}

	}

}
