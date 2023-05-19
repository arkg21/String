package InterviewStrings;

import java.util.ArrayList;

public class New 
{
	    public static void main(String[] args)
	    {
		String a[]= {"Archit","Vishal","Anish"};
		
		ArrayList<String> list=new ArrayList<String>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		
		for (int i = 0; i < a.length/2; i++) {
			String temp = a[i];
			list.set(i, list.get(list.size()-i-1));
			list.set(list.size()-i-1, temp);
		}
		System.out.println(list);
	}
}