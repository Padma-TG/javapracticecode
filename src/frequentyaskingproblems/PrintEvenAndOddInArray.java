package frequentyaskingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenAndOddInArray 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Approach 1 -using two forloop
		
		/*System.out.println("Even numbers are ");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers are");
		for(int i=0;i<size;i++)
		{
			if(!(arr[i]%2 == 0))
			{
				System.out.print(arr[i]+" ");
			}
		}
		*/
		
		//Approach2-using arraylist
		
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		for(int value:arr)
		{
			if(value%2 == 0)
			{
				even.add(value);
			}
			else
			{
				odd.add(value);
			}
		}
		System.out.println("Even "+even);
		System.out.println("odd "+odd);
		System.out.println("org: "+Arrays.toString(arr));

		
		
		sc.close();
	}
}