package Collections;

import java.util.LinkedHashSet;

public class PrintWithoutDuplicate 
{
	public static void main(String[] args) 
	{
		String s="im indian citizen indian resident";
		String str[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);
		}

		for (String i : set) 
		{
			int count=0;
			for (int j = 0; j < str.length; j++) 
			{
				if(i.equals(str[j]))
				{
					count++;	
				}
			}
			if(count<=1)
			{
				System.out.println(i);
			}
		}
	}
}
