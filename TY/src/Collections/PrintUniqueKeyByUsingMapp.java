package Collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintUniqueKeyByUsingMapp 
{
	public static void main(String[] args) 
	{
		String s="testyantra";
		LinkedHashMap<Character, Integer>  a=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(a.containsKey(s.charAt(i))==false)
			{
				a.put(s.charAt(i), 1);
			}
			else
			{
				int oldValue=a.get(s.charAt(i));
				int newValue=oldValue+1;
				a.put(s.charAt(i), newValue);
			}
		}
		
		Set<Character> ks = a.keySet();
		for (Character keys : ks) 
		{
			System.out.println(keys);
		}
		
		System.out.println("*****************************************************");
		
		Set<Entry<Character, Integer>> es = a.entrySet();
		for (Entry<Character, Integer> entry : es) 
		{
			System.out.println(entry);
		}
	}
}
