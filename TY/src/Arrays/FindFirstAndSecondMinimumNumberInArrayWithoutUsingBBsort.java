package Arrays;

public class FindFirstAndSecondMinimumNumberInArrayWithoutUsingBBsort 
{
	public static void main(String[] args) 
	{
		int a[]= {7,2,1,5};
		int fmin=a[0];//7 2 1
		int smin=a[0];//7 7 2
		for (int i = 0; i < a.length; i++) 
			// i=0 0<4t a[i]=7
			// i=1 1<4t a[i]=2 
			// i=2 2<4t a[i]=1
			// i=3 3<4t a[i]=5
			// i=4 4<4f terminate
		{
			if(a[i]<fmin) //7<7f 2<7t 1<2t 5<1f
			{
				smin=fmin; //7 2
				fmin=a[i]; //2 1
			}
			else if (a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}
}
