package InterviewArrays;

import java.util.Arrays;

public class PrintInDifferentWays 
{
	public static void main(String[] args) 
	{
		int []a= {20, 12, 56, 25, 96};
		int []s=new int[5];
		s[0]=36;
		s[1]=21;
		s[2]=29;
		s[3]=11;
		s[4]=15;
		System.out.println(Arrays.toString(s));
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
	}
}
