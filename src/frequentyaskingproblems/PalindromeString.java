package frequentyaskingproblems;

import java.util.Scanner;

public class PalindromeString
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr+=str.charAt(i);
		}
		System.out.println(revStr);
		if(revStr.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		sc.close();
	}

}
