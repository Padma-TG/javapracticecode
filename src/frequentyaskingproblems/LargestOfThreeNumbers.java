package frequentyaskingproblems;

import java.util.Scanner;

public class LargestOfThreeNumbers
{

	public static void main(String[] args) 
	{
		System.out.println("Enter all three numbers ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//Approach1
		if((a>b) && (a>c))
		{
			System.out.println("A is Largest"+a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("B is Largest"+b);
		}
		else
		{
			System.out.println("C is Largest "+c);
		}
		//Approach2
		//int largest1=(a>b)?a:b;
		//int largest2=(c>largest1)?c:largest1;
		int largest2=c>((a>b)?a:b)?c:((a>b)?a:b);
		System.out.println("Largest 2 "+largest2);
		
		sc.close();
	}

}
