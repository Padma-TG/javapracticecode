package frequentyaskingproblems;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		//Approach1
		/*
		int rev=0;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;//to concatenate use this logic instead of rev+rem use rev*10+rem
			num=num/10;
		}
		System.out.println("Reversed number is "+rev);
		*/
		
		//Approach2-using string buffer
		/*
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reversed number is "+rev);
		*/
		
		//Approach3-using string builder
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("Reversed number is "+rev);

		sc.close();
	}

}
