package sDETBasics;

import java.util.Scanner;

public class RemovingWhiteSpaceInString 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		System.out.println("Before "+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After "+str);
		
		sc.close();

	}

}
