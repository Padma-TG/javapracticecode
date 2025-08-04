package Arrays;

import java.util.Scanner;

public class RemovingDuplicates
{
	//Print the list of passport numbers without duplicates.
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<size;i++)
		{
			boolean status=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i].equals(arr[j]))
				{					
					status=true;
					break;
				}
				
			}
			if(!status)
			{
				System.out.print((arr[i]+" "));
			}
		}
		
		
		
		sc.close();
	}

}
