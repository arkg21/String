package String;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharecter {

	public static void main(String[] args) 
	
	{
		
		String s="TestYantra";
		s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count = 0;
			
			for(int i=0;i<s.length();i++)
			{
			   
				if(ch==s.charAt(i))
				{
					count++;
				}
				
			}
			System.out.println(ch+" = "+count);
		}

	}

}
