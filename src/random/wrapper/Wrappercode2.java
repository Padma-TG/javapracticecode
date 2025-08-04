package random.wrapper;
 class A
{
	protected void display()
	{
		System.out.println("Hi from class A protected Method");
	}
}
public class Wrappercode2 
{

	public static void main(String[] args) 
	{
		A a = new A();
		a.display();
	}

}
