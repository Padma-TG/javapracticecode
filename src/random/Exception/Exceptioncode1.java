package random.Exception;

public class Exceptioncode1 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by 0:"+e.getMessage());
		}
		finally
		{
			System.out.println("Whatever i will occur finally");
		}
	}

}
