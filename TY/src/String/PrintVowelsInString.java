package String;

public class PrintVowelsInString {

	public static void main(String[] args) 
	{

		String s="rakshitho";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
				System.out.print(ch+" ");
			}
			
		}
		
	}

}
