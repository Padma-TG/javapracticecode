package random;

import java.util.Scanner;

public class throwkeyword 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if((name==null)||(name.trim().isEmpty()))
		{
			//throw new ExceptionType("Your message here");
			throw new IllegalArgumentException("Name cannot be empty");
		}
		else if(age<=0)
		{
			throw new ArithmeticException("Age cannot be negative");
		}
		else
		{
			System.out.println("Welcome "+name+",your age is "+age);
		}
		sc.close();
	}

}
