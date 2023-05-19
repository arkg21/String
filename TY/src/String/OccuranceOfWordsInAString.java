package String;

import java.util.LinkedHashSet;

public class OccuranceOfWordsInAString {

	public static void main(String[] args) 
	
	{
        String s="i am from from am banglore banglore am";
        String[] s1 = s.split(" ");
         
        LinkedHashSet< String>set=new LinkedHashSet<>();
        
        for(int i=0;i<s1.length;i++)
        {
        	set.add(s1[i]); 	
        }
        for(String l:set)
        {
        	int count = 0;
        	for(int i=0;i<s1.length;i++)
        	{
        		if(l.equals(s1[i]))
        		{
        			count++;
        		}
            }
        	System.out.println(l+"="+count);
        	
        	
        }
		
		
	}

}
