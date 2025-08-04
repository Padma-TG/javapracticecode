package frequentyaskingproblems;

public class FindingMissingElementInArray 
{

	public static void main(String[] args) 
	{
		//Arrays no need to be in sorted order
		//Arrays should be in range
		//Arrays shouldnt have duplicates
		int arr[]= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1+=arr[i];
		}
		System.out.println("Sum of first array: "+sum1);
		int arr2[]= {1,2,3,4,5};
		for(int i=0;i<arr2.length;i++)
		{
			sum2+=arr2[i];
		}
		int diff=sum2-sum1;
		System.out.println("Missing number is "+diff);

	}

}
