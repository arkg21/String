package Collections;

import java.util.LinkedHashSet;

public class PrintOccurenceOfEachVowelAfterWithoutDuplicate 
{
	public static void main(String[] args) 
	{
		String s="srilanka";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));;
		}
		
		for (Character i : set) 
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(i.equals(s.charAt(j)))
				{
					count++;
				}
			}
			System.out.println(i+" "+count);
		}
	}
}
