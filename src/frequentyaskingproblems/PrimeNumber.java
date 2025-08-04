package frequentyaskingproblems;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		if(num<=0)
		{
			System.out.println("Enter greater than 0");
			return;
		}
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime");
		}
		
	}

}
