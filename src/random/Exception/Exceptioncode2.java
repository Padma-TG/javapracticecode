package random.Exception;

import java.io.IOException;

class Demo
{
	void readFile() throws IOException
	{
		 throw new IOException("File Not Found");
	}
}

public class Exceptioncode2
{

	public static void main(String[] args) 
	{
		Demo ob=new Demo();
		try
		{
		ob.readFile();
		}
		catch(IOException e)
		{
			System.out.println("Found "+e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
