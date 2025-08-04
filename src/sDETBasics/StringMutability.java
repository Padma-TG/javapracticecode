package sDETBasics;

import java.util.Arrays;

public class StringMutability 
{

	public static void main(String[] args) 
	{
		// Demonstrate String Mutability with String, StringBuilder, and StringBuffer
		String str1="Hello";
		StringBuffer str2=new StringBuffer("Hello");
		StringBuilder str3=new StringBuilder("Hello");
		
		//
		str1.concat("World");
		System.out.println("Appended String is"+str1);
		
		str2.append("World");
		System.out.println("Using String Buffer is "+str2);
		
		str3.append("World");
		System.out.println("Using String Builder is "+str3);
		
		int arr[]= {70,20,10,40};
		System.out.println("Original Array:"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Arrays are mutable "+Arrays.toString(arr));
		
		
		
		
	}

}
