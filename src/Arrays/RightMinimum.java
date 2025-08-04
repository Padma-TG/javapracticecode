package Arrays;

import java.util.Scanner;

public class RightMinimum 
{
//Print the next smallest number present in array and -1 if no smallest is present
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arrA=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arrA[i]=sc.nextInt();
		}
		
		int[] arrB=new int[size];
		for(int i=0;i<size;i++)
		{
			boolean found=false;
			for(int j=i+1;j<size;j++)
			{
				if(arrA[j]<arrA[i])
				{
					arrB[i]=arrA[j];
					found=true;
					break;
					
				}
			}
			if(!found)
			{
				arrB[i]=-1;
			}
		}
		for(int i=0;i<size;i++)
		{
			if(i == size-1)
			{
				System.out.print(arrB[i]);
			}
			else
			{
		    System.out.print(arrB[i]+" ");
			}
		}
		//System.out.println(Arrays.toString(arrB));
		
		sc.close();

	}

}
