package InterviewStrings;

public class PrintTheFrequencyCount 
{
	public static void main(String[] args) 
	{
		String s="aaabbbbbbccdddeea";
		int freCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			int count=1;
			for (int j = i+1; j < s.length(); j++) 
			{
				char ch1 = s.charAt(j);
				if(ch==ch1)
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.println(ch+""+count);
		}
	}
}
