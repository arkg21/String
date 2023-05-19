package Strings;

import java.util.LinkedHashSet;

public class ToPrintPosition 
{
	public static void main(String[] args) 
	{
		String s="Tester";
		String st=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) 
		{
			set.add(st.charAt(i));
		}
		for(Character ch:set)
		{
			for (int i = 0; i < st.length(); i++) 
			{
				if(ch==st.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position ");
					break;
				}
			}		
		}
	}
}
