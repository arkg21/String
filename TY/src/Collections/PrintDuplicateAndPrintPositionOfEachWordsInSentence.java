package Collections;

import java.util.LinkedHashSet;

public class PrintDuplicateAndPrintPositionOfEachWordsInSentence 
{
	public static void main(String[] args) 
	{
		String s="Khatam ta ta bye bye";
		String str[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);
		}

		for (String i : set) 
		{
			for (int j = 0; j < str.length; j++) 
			{
				if(i.equals(str[j]))
				{
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}
