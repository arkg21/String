package String;

public class InAGivenStringForEachWordGetVowelCountWithoutDup {

	public static void main(String[] args) {

		String s="iam feeling sleepy";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			String s2="";
			String string=s1[i];

			for(int j=0;j<string.length();j++)
			{
				char ch = string.charAt(j);
				if(s2.indexOf(ch)==-1)
				{
					s2=s2+ch;
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						count++;

					}

				}  		
			}
      System.out.println(string +" = "+count);

		}



	}

}
