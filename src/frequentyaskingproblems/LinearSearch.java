package frequentyaskingproblems;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50};
		int key=30;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at position"+i);
				flag=true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Element not found");
		}
	}

}
