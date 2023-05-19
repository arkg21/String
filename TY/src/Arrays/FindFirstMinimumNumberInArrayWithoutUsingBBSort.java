package Arrays;

public class FindFirstMinimumNumberInArrayWithoutUsingBBSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,2,6,7,9};//3
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
