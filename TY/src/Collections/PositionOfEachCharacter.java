package Collections;

import java.util.LinkedHashSet;

public class PositionOfEachCharacter 
{
	public static void main(String[] args) 
	{
		String s="testing";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

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
					System.out.println(i+" "+j);
					break;
				}
				
			}
			
		}
		
		
	}
}
