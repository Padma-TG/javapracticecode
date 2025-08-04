package sDETBasics;

public class StringCountOccurance
{

	public static void main(String[] args) 
	{
		String str="welcome";
		char[] arr=str.toCharArray();
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(visited[i])
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
				
			}
			System.out.println(arr[i]+" occurred"+count+"times");
		}
	}

}
