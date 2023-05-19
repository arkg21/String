package ExtraStrings;

public class PrintSenWordsInRevOrderInSamePosition {

	public static void main(String[] args) 
	{
     String s="My name is Rakshith";
     String[] s1 = s.split(" ");
     
     
		for(int i=0;i<s1.length;i++)
		{
			String string = s1[i];
			String rev="";
			for(int j=string.length()-1;j>=0;j--)
			{
				rev=rev+string.charAt(j);
				
			}
			System.out.print(rev+" ");
		}
		
		
		
	}

}
