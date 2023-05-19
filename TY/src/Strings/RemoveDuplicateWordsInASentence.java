package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInASentence 
{
	public static void main(String[] args) 
	{
		String st="I am from from am Bangalore";
		String str=st.toLowerCase();
		String s[]=str.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) 
		{
			set.add(s[i]);
		}
		for (String stri : set) 
		{
			System.out.print(stri+" ");
		}
	}
}
