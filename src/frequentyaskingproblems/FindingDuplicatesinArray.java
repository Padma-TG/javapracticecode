package frequentyaskingproblems;

import java.util.HashSet;

public class FindingDuplicatesinArray 
{
public static void main(String args[])
{
	//Approach1
	/*int[] arr= {1,2,3,4,5,1};
	boolean flag=false;
	int count=1;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				System.out.println("Element found "+arr[j]+"  found "+count);
				flag=true;
			}
		}
		
	}
	if(flag == false)
	{
		System.out.println("no duplicates");
	}

	*/
	
	//Approach2
	String [] arr= {"Apple","Banana","Cherry","Apple","Banana"};
	HashSet<String> arr1= new HashSet<>();
	boolean flag=false;
	for(String l:arr)
	{
		if(arr1.add(l)==false)
		{
			System.out.println("Element found "+l);
			flag=true;
		}
			
	}
	if(flag == false)
	{
		System.out.println("No duplicates");
	}
	
}

}