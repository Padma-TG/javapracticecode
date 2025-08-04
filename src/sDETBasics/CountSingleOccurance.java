package sDETBasics;

public class CountSingleOccurance 
{

	public static void main(String[] args) 
	{
		String str="Padma";
		int count=str.length();
		String newStr=str.replaceAll("a", "");
		int aftcount=newStr.length();
		int diff=count-aftcount;
		System.out.println("occurance of a "+diff);
		

	}

}
