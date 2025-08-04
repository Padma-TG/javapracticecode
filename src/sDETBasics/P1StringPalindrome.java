package sDETBasics;

import java.util.Scanner;

public class P1StringPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.next();
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr+=str.charAt(i);
		}
		System.out.println(revStr);
		if(revStr.equalsIgnoreCase(str))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		sc.close();
	}

}
