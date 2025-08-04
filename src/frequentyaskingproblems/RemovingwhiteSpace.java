package frequentyaskingproblems;

import java.util.Scanner;

public class RemovingwhiteSpace
{

	public static void main(String[] args)
	{
		System.out.println("Enter your String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Before :"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After :"+str);

	}

}
