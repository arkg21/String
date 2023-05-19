package ExtraStrings;

public class AddAllNumInGivenString {

	public static void main(String[] args)
	{//TYPE 1
		//i/p=a11b22c33 o/p=1+1+2+2+3+3
		String s="a11b22c33g3";
		
		int sum=0;		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='0'&&ch<='9')
			{
				int n = ch-48;
				sum+=n;
				
			}
			
		}
		
		System.out.println(sum);
//TYPE 2
//		String s="a11b22c33g3";
//		
//		int sum=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			if(Character.isDigit(ch))
//			{
//				sum+=ch-48;
//			}
//			
//		}
//		System.out.println(sum);
//		
//		

	}

}
