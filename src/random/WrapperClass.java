package random;
class Demo
{
	private int x=10;
	public void syso() {
		// TODO Auto-generated method stub
System.out.println(x);
	}
}

public class WrapperClass {

	public static void main(String[] args)
	{
		int x=100;
		Integer y=x;
		System.out.println(y);
		Demo ob=new Demo();
		ob.syso();
	}

}
