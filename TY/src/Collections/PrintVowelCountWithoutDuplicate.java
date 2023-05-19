package Collections;

import java.util.LinkedHashSet;

public class PrintVowelCountWithoutDuplicate 
{
	public static void main(String[] args) 
	{
		String s="itachi";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
		int count=0;
		for (Character i : set) 
		{
			if(i=='a' || i=='e' ||  i=='i' || i=='o' || i=='u')
			{
				count++;
			}
		}
		System.out.println(s+" "+count);
	}
}
