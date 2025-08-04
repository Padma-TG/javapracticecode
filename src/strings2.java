import java.util.Scanner;

public class strings2 
{
	boolean methodm1(String str)
	{
		
		return str.trim().equalsIgnoreCase("OpenAI");
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		strings2 s=new strings2();
		
		boolean result=s.methodm1(str);
		System.out.println(result);
	}

}
