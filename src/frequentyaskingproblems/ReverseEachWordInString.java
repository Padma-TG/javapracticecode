package frequentyaskingproblems;

public class ReverseEachWordInString 
{

	public static void main(String[] args) 
	{
		//Approach1
		String str="Welcome to the world of Java";
		String[] arr=str.split("\\s");
		String reversedStr="";
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i];
			String reversedWords="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversedWords=reversedWords+word.charAt(j);
			}
			reversedStr+=reversedWords+" ";
			
		}
		System.out.println(reversedStr);
		
		//Approach2
		String str2="Hi! i'm from Java!";
		String[] words2=str2.split("\\s");
		String reversedWords2="";
		for(String w:words2)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reversedWords2=reversedWords2+sb.toString()+" ";
			
		}
		System.out.println(reversedWords2);

	}

}
