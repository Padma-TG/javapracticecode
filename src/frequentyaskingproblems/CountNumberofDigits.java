package frequentyaskingproblems;

import java.util.Scanner;

public class CountNumberofDigits
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits is "+count);
		sc.close();
	}

}
