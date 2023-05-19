package String;

public class PrintTheWordWhicHIsMaxLenthInGiVENString {

	public static void main(String[] args) 
	{

		String s="Myhj name is rakgkth";
		String[] str = s.split(" ");
		int max = str[0].length();
		
		String maxword="";
		for(int i=0;i<str.length;i++)
		{
			String string=str[i];
			if(string.length()>=max)
			{
				max=string.length();
				maxword=string;
				
			}
			
			
		}
		System.out.println(maxword+" = "+max);
		
		
		
	}

}
