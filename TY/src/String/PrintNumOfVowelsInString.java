package String;

public class PrintNumOfVowelsInString {

	public static void main(String[] args) 
	{
        int count=0;
		String s="India";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++ )
		{
			char ch = s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.print(ch);
			}
			
		}
		
		System.out.println("  number of vowels is ==>"+count);
		
		
	}

}
