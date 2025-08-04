package sDETBasics;

public class RemoveJunkInString 
{

	public static void main(String[] args) 
	{
		String str="@padma";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Cleared junk is "+str);
	}

}
