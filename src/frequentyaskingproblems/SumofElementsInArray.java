package frequentyaskingproblems;

import java.util.Scanner;

public class SumofElementsInArray 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("total "+sum);
		int s1=0;
		for(int i:arr)
		{
			s1=s1+i;
		}
		System.out.println("total "+s1);

		sc.close();
	}

}
