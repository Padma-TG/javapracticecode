package frequentyaskingproblems;

public class RemovingJunkORSplCharc 
{

	public static void main(String[] args) 
	{
		String str="@Padma *&Ram";
		System.out.println("Before "+str);
		String newstr=str.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println("After "+newstr);
		
	}

}
