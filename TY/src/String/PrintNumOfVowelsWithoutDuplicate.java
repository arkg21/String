package String;

import java.util.LinkedHashSet;

public class PrintNumOfVowelsWithoutDuplicate {

	public static void main(String[] args) {
		 int count=0;
			String s="India";
			String s1 = s.toLowerCase();
			
			LinkedHashSet<Character>set=new LinkedHashSet<>();
			
			for(int i=0;i<s1.length();i++ )
			{
				set.add(s1.charAt(i));
				
			}
			
			for(Character c:set)
			{
				
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
					System.out.print(c);
				}
				
			}
			
			System.out.println("--> number of vowels is ==>"+count);
			
			

	}

}
