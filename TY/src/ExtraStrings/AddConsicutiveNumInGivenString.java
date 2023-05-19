package ExtraStrings;

public class AddConsicutiveNumInGivenString {

	public static void main(String[] args) 
	{

		String s="a11bcj22c33jk";
		int sum=0;//11+
		int num=0;//1
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);

			if(ch>='0'&&ch<='9')
			{
				int n = ch-48;
				num=num*10+n;

			}
			else {
				sum+=num;
				num=0;
				
			}

		}

		System.out.println(sum+num);




	}

}
