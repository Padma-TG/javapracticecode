package frequentyaskingproblems;

public class CountWordsInString
{

	public static void main(String[] args) 
	{
		//Approach 1
		String str="I love Java";
		String[] strarr=str.split("\\s");
		System.out.println(strarr.length);
		
		//Approach2
		String str2="I love Raam";
		int count=1;
		for(int i=0;i<str2.length();i++)
		{
			
			if(str2.charAt(i)==' ' && str2.charAt(i+1)!=' ')
			{
				count++;
				
			}
		}
		System.out.println("Number of words in a string :"+count);
	}

}
