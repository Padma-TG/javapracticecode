package frequentyaskingproblems;

import java.util.Scanner;

public class CountEvenOdd 
{

	public static void main(String[] args)
	{
			System.out.println("Enter your number ");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int evenCount=0;
			int oddCount=0;
			while(num>0)
			{
				int rem=num%10;
				if(rem%2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
				num=num/10;
			}
			System.out.println("Even "+evenCount);
			System.out.println("Odd "+oddCount);
			sc.close();

	}

}
