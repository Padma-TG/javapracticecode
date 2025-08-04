package frequentyaskingproblems;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays
{

	public static void main(String[] args) 
	{
		int[] a1= {1,2,3,4,5};
		int[] a2= {1,2,3,4,5};
		
		//Approach 1:- 
		boolean status=Arrays.equals(a1, a2);
		if(status)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		//Appraoch2
		boolean status1=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(!(a1[i]==a2[i]))
				{
					status1=false;
				}
			}
		}
		else
		{
			System.out.println("Count Not Equal");
			return;
		}
		if(status == true)
		{
			System.out.println("2nd APproach equal");
		}
		else
		{
			System.out.println("2nd approach not equal");
		}
	}

}
