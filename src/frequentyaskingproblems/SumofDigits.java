package frequentyaskingproblems;

import java.util.Scanner;

public class SumofDigits 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int temp=num%10;
			sum+=temp;
			num=num/10;
		}
		System.out.println("Sum of digit is "+sum);
		sc.close();
	}

}
