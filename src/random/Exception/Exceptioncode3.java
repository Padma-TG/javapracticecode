package random.Exception;

class AgeInvalidException extends Exception
{
	public AgeInvalidException(String message)
	{
		super(message);
	}
}

public class Exceptioncode3 
{

	public static void main(String[] args) 
	{
		int age=16;
		try
		{
			if(age<18)
			{
				throw new AgeInvalidException("Age must be above 18");
			}
			else
			{
				System.out.println("Eligible to vote");
				}
			}
		catch(AgeInvalidException e)
		{
			System.out.println("Exception caught "+e.getMessage());
		}
		finally
		{
			System.out.println("from finally");
		}
	}

}
