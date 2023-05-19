package String;

import java.util.Arrays;

public class CheckTheGivenWordsAreAnagrom {

	public static void main(String[] args) {
		//Anagram means both word length should be same and in both it should contain same character if we sort it should be same
		
		
		String s1="race";
		String s2="care";
		
		if(s1.length()==s2.length())
		{
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean status = Arrays.equals(ch1, ch2);
			if(status==true)
			{
				System.out.println(s1+" "+s2+ " are anagram");
				
			}
			else {
				System.out.println(s1+" "+s2+ " are not an anagram");
			}
				
		}
		else {
			
			System.out.println(s1+" "+s2+ " are not an anagram");
		}
		
	}

}
