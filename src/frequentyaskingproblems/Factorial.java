package frequentyaskingproblems;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		int fact1=1;

		for(int i=1;i<=num;i++)
		{
			fact1=fact1*i;
		}
		System.out.println("Factorial1 of number is "+fact);
		System.out.println("Factorial2  of number is "+fact1);

		sc.close();
	}

}
