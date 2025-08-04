package random.wrapper;
class Secret
{
	private void reveal()
	{
		System.out.println("Hi im from class secret");
	}
}
public class Private 
{

	public static void main(String[] args) 
	{
		Secret sc=new Secret();
		//sc.reveal();
	}

}
