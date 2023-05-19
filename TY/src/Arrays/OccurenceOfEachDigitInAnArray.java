package Arrays;

public class OccurenceOfEachDigitInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,4,6,5,6};
		boolean[] count=new boolean[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			int occ=1;
			if(count[i]==false)
			{
				for (int j = 0; j < count.length; j++) 
				{
					if(a[i]==a[j])
					{
						occ++;
						count[j]=true;
					}
				}
				System.out.println(a[i]+" "+occ);
			}
		}
	}
}
