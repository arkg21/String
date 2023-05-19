package String;

public class PrintVowelWithoutDuplicateAndprintCount {

	public static void main(String[] args) 
	{

		String s="rakshithioaai";
		String s1="";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
				if(s1.indexOf(ch[i])==-1)
				{
					s1=s1+ch[i];
				}
				
			}
			
		}	
		System.out.println(s1);
		
		
		
		
	}

}
