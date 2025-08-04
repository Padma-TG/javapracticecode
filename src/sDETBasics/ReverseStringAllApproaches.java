package sDETBasics;

import java.util.Scanner;

public class ReverseStringAllApproaches 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		/*//Approach1
		System.out.println("Enter your String in Approach 1");
		String str1=sc.nextLine();
		
		String revStr1="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			 revStr1=revStr1+str1.charAt(i);
		}
		System.out.println("Reversed String is: "+revStr1);
		
		//Approach2
		System.out.println("Enter your String for Approach2");
		String str2=sc.nextLine();
		String revStr2="";
		char[] chararr=str2.toCharArray();
		for(int i=chararr.length-1;i>=0;i--)
		{
			revStr2+=chararr[i];
		}
		System.out.println("Reversed String is "+revStr2);*/
		
		//Approach3
		/*System.out.println("Enter your String for Approach3");
		String str3=sc.nextLine();
		StringBuffer strob1=new StringBuffer(str3);
		StringBuffer revStr3=strob1.reverse();
		System.out.println("Reversed String is "+revStr3);*/
		
		//Approach4
		System.out.println("Enter your String for Approach4");
		String str4=sc.nextLine();
		StringBuilder strob2=new StringBuilder(str4);
		StringBuilder revStr4=strob2.reverse();
		System.out.println("Reversed String is "+revStr4);
		
		sc.close();
	}

}
