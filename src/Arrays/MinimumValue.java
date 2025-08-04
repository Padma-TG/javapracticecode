package Arrays;

import java.util.Scanner;

public class MinimumValue
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sizeofarr=sc.nextInt();
		int[] myArray=new int[sizeofarr];
		
		for(int i=0;i<sizeofarr;i++)
		{
			myArray[i]=sc.nextInt();
		}
		int min=myArray[0];
		for(int i=1;i<sizeofarr;i++)
		{
			if(myArray[i]<min)
			{
				min=myArray[i];
			}
		}
		System.out.println(min);
		sc.close();
	}

}
