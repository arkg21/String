package String;

import java.util.LinkedHashSet;

public class PrintPositionWithoutDuplicate {

	public static void main(String[] args)
	{
		String s="Tester";
		
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
			
		}
		for(Character ch:set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s1.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+"position");
					break;
				}
				
				
			}
			
		}
		
		

	}

}
