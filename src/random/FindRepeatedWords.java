package random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Write a Java program that accepts a sentence from the user and prints 
 * all the words that appear more than once, along with their frequency.
*/

public class FindRepeatedWords
{

	public static void main(String[] args)
	{
		System.out.println("Enter your sentence");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		String[] arr=str.split("\\s");
		int count;
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					visited[j]=true;
					
				}
			}
			if(count>1)
			{
			System.out.println(arr[i]+"->"+count);
			}
		}
		
		sc.close();
	}

}
