package Arrays;

public class FindTheSumOFirstThreeMaximumNumberInArrayUsingBBSort 
{
	public static void main(String[] args) 
	{
		int a[]= {7,2,8,1,5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j=i+1; j < a.length; j++) 		
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		} 
		int sum=0;
		for (int i = 0; i < 3; i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of first three numbers are = "+ sum);
	}
}
