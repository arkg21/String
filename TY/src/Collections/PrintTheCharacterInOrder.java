package Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PrintTheCharacterInOrder 
{
	public static void main(String[] args) 
	{
		String s="acabacbcbcdcdddadaccbbdd";
		
		//LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		TreeSet<Character> set=new TreeSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
		for (Character b : set) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if(b.equals(s.charAt(i)))
				{
					System.out.print(b);
				}
			}
			System.out.println();
		}
	}
}
