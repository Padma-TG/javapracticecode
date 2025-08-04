package frequentyaskingproblems;

public class CountOccuranceofEachCharacter
{

	public static void main(String[] args) 
	{
		String str="Padma";
		int len=str.length();
		
		boolean visited[]=new boolean[len];
		char[] a=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.println("string "+a[i]+" occurs "+count);
		}
		

	}

}
