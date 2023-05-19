package Collections;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWithCount 
{
	public static void main(String[] args) 
	{
		String s="itachi";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
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
			if(count>1)
			{
				System.out.println(i+" "+count);
			}
		}
		
	}
}
