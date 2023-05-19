package InterviewStrings;

public class Appium 
{
	public static void main(String[] args) 
	{
		//String value="cat, catlog, catted";
		String text="appleion , application, appiumion";
		//String a="examination, concentration, termination";
		String arr[]=text.split(" ");
		boolean flag=true;

		for (int i = 0; i < arr[0].length(); i++) 
		{
			String ss1=arr[0].substring(0, i+1);
			for (int j = 1; j < arr.length; j++) 
			{
				if(!arr[j].startsWith(ss1))
				{
					//System.out.println(arr[0].substring(1, i));
					System.out.println(arr[0].substring(arr[0].length()-3));
					flag=false;
					break;
				}
			}
			if(flag==false)
				break;
		}
	}
}
