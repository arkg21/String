package String;

public class RemoveSpaceBtwnAWord {

	public static void main(String[] args) 
	{
	// 1st way
    // String s="I am from banglore";
     //System.out.println(s.replace(" ", ""));
     
		String s="I am from banglore";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			
			System.out.print(s1[i]);
		}
		
     
	}

}
