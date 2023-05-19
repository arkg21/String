package String;

import java.util.LinkedHashSet;

public class OccuranceOfDuplicateInGivenCharecter {

	public static void main(String[] args) {
		String s="TestYantra";
		String l = s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<l.length();i++)
		{
			set.add(l.charAt(i));
		}
		for(Character ch:set)
		{
			int count = 0;
			
			for(int i=0;i<l.length();i++)
			{
			   
				if(ch==l.charAt(i))
				{
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println(ch+" = "+count);
			}
		}


	}

}
