package ExtraStrings;

public class InSentenceInEachWordFirstLetterShoulBeCapital {

	public static void main(String[] args) 
	{
       //input=welcome to india
		//o/p=Welcome To India
		
		String s="my name is rakshith";
		String[] s1 = s.split(" ");
		String firstletter="";
		String capitalizedString="";
		
		for(String l:s1)
		{
			firstletter=l.substring(0,1).toUpperCase()+l.substring(1);
			capitalizedString+=" "+firstletter;
			
		}
		System.out.println(capitalizedString.trim());
		
		
		
		
	}

}
