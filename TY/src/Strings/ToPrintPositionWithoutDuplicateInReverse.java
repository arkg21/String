package Strings;

import java.util.LinkedHashSet;

public class ToPrintPositionWithoutDuplicateInReverse 
{
	public static void main(String[] args) 
	{
		String st="Tester";
		String s=st.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = s.length(); i>=0;i--) 
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for (int i =s.length();i>=0; i--) 
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position ");
					break;
				}
			}	
		}
	}
}
