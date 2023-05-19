package Collections;

import java.util.LinkedHashSet;

public class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		String s="itachi";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
			System.out.println(set);
		}
		System.out.println(set);
		
		for (Character i : set) 
		{
			System.out.println(i);
		}
	}
}
