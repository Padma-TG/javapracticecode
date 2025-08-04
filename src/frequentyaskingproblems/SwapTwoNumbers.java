package frequentyaskingproblems;

import java.util.Scanner;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		
		//Approach1 -using temp variable
		/*
		 * int temp=a;
		a=b;
		b=temp;
		System.out.println(" a is :"+a);
		System.out.println(" b is : "+b);
		*/
		
		//Approach2 -using arithmetic
		/*
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		*/
		
		//Approach 3-using mul and div(only if theyarent null)
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		
		sc.close();
	}

}
