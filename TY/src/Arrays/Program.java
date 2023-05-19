package Arrays;

public class Program 
{
	public static void main(String[] args) 
	{
		String arr= ("Cat, Catalog, Category");
		//String a=("Battery, Batch, Batman");
		String s[]=arr.split(" ");
		boolean flag=true;
		for (int i = 0; i < s[0].length(); i++) 
		{
			String first=s[0].substring(0, i+1);
			for (int j = 1; j < s.length; j++) 
			{
				if(!s[j].startsWith(first))
				{
					System.out.println(s[0].substring(0, i));
					flag=false;
					break;
				}
			}
			if(flag==false)
				break;
		}
	}
}
