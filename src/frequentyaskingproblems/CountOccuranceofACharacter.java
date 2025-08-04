package frequentyaskingproblems;

public class CountOccuranceofACharacter 
{
	public static void main(String[] args) 
	{
		String str="Padma";
		
		String newStr=str.replaceAll("a", "");
		int strlen=str.length();
		int newStrlen=newStr.length();
		int diff=strlen-newStrlen;
		System.out.println("Char a occurred "+diff+" times");

	}

}
