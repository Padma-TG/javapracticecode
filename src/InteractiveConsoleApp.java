import java.util.Scanner;

public class InteractiveConsoleApp 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		
		//Length of the input (length()).
		System.out.println("Length of i/p:"+str.length());
		
		//Characters at first and last index (charAt()).
		char first=str.charAt(0);
		char last=str.charAt(str.length()-1);
		System.out.println("First is "+first);
		System.out.println("Second is "+last);
		
		//Whether it contains the word "java" (case-insensitive).
		System.out.println(str.replace("J", "j").contains("java"));
		
		//The input reversed using split(), Arrays.reverse() (or list), and join()
		
		String[] splitted=str.split(" ");
		String[] reversedArray = new String[splitted.length];

		System.out.println("splitted is:"+splitted);
		
		for(int i=0;i<splitted.length;i++)
		{
		    reversedArray[splitted.length - 1 - i] = splitted[i];

		}
		String reversedSentence = String.join(" ", reversedArray);
		System.out.println(reversedSentence);
		
		
	}

}
