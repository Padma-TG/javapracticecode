package frequentyaskingproblems;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.next();
		String revStr1="";
		
		//Approach1
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr1+=str.charAt(i);
		}
		System.out.println(revStr1);
		
		//Approach2
		char[] arr=str.toCharArray();
		String revStr2="";
		for(int i=arr.length-1;i>=0;i--)
		{
			revStr2+=arr[i];
		}
		System.out.println(revStr2);

		//Approach3
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		sc.close();
	}

}
