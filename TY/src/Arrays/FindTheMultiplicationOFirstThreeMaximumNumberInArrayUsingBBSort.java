package Arrays;

public class FindTheMultiplicationOFirstThreeMaximumNumberInArrayUsingBBSort 
{
	public static void main(String[] args) 
	{
		int a[]= {7,2,8,1,5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}	
		}
		int product=1;
		for (int i = 0; i < 3; i++) 
		{
		product=product*a[i];
		}
		System.out.println("Product of first three numbers are = "+product);
	}
}
