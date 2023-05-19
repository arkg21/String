package Collections;

import java.util.LinkedHashSet;

public class PrintCountOfDuplicateWordsInASentence 
{
	public static void main(String[] args) 
	{
		String s="im indian citizen indian resident";
		String[] st=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for (int i = 0; i < st.length; i++) 
		{
			set.add(st[i]);
		}

		for (String i : set) 
		{
			int count=0;
			for (int j = 0; j < st.length; j++) 
			{
				if(i.equals(st[j]))
				{
					count++;
				}
			}
			System.out.println(i+" "+count);
		}
	}
}
