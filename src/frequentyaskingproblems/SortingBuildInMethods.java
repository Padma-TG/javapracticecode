package frequentyaskingproblems;

import java.util.Arrays;
import java.util.Collections;

public class SortingBuildInMethods 
{
	public static void main(String[] args) 
	{
		//Approach1--parallel sort
		int[] a= {9,7,6,5,4,3,2};
		System.out.println("Before sorting: "+Arrays.toString(a));		
		Arrays.parallelSort(a);
		System.out.println("Parallel "+Arrays.toString(a));
		
		//Approach2
		int[] b= {9,7,6,5,4,3,2};
		System.out.println("Before sorting: "+Arrays.toString(b));
		Arrays.sort(a);
		System.out.println("sort "+Arrays.toString(a));
		
		//Approach 3-reverse using collection 
		Integer[] c= {9,7,6,5,4,3,2};
		System.out.println("Before sorting: "+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("reverse "+Arrays.toString(a));

	}

}
