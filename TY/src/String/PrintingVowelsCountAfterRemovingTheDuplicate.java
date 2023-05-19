package String;

public class PrintingVowelsCountAfterRemovingTheDuplicate {

	public static void main(String[] args) 
	{
		String s="rakshithioaai";
		String s2="";
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(s2.indexOf(ch[i])==-1) {
				
				s2=s2+ch[i];
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					count++;

				}
			}
		}		
        System.out.println(s+" string contains "+count+ " vowels");
	}



}
