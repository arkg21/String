package Strings;

import java.util.LinkedHashSet;

public class PrintNumberOfVowelsWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String s="Australia";
		String str=s.toLowerCase();
		int count=0;
		
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) 
		{
			set.add(str.charAt(i));
		}
		for (Character i : set) 
		{
			if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Number of vowels present in string without duplicate = "+count);
		
	}
}
