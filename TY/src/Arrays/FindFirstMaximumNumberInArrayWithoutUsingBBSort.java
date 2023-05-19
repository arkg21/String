package Arrays;

public class FindFirstMaximumNumberInArrayWithoutUsingBBSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,2,6,7,9};
		int max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
