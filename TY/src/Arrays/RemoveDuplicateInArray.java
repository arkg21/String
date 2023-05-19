package Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicateInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,4,6,5,6};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			System.out.println(inte);
		}
	}
}
