package random.wrapper;

public class ConversionIntString
{

	public static void main(String[] args) 
	{
		int num=5678;
		System.out.println("printing the int "+num);
		String str=String.valueOf(num);
		System.out.println("printing the string "+str);
		String str1 = Integer.toString(num);         // another way
		System.out.println(str1);

		
	}

}
