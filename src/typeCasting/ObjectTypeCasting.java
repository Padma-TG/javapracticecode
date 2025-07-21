package typeCasting;

class Animal
{
	void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
	void sound()
	{
		System.out.println("Dog from ANimal");
	}
}
public class ObjectTypeCasting
{

	public static void main(String[] args) 
	{
		//Animal an=new Animal();
//		an.sound();
//		
//		Dog dg=new Dog();
//		dg.sound();
		
		//Animal ad=new Dog();
		//ad.sound();
		//ad.bark();
		
		//🔹 Part 3: Object Downcasting (Safe & Unsafe)
		
//		Animal ad=new Dog();
//		Dog dg=(Dog)ad;
//		dg.bark();//safe
		
		Animal an=new Animal();
//		Dog dg1=(Dog)an;
//		dg1.bark();		
		
		if(an instanceof Dog)
		{
			Dog dg2=(Dog)an;
			dg2.bark();
			
		}
		else
		{
			System.out.println("Downcasting not safe");
		}
	}

}

//What is accessible? Why?

/* if i create object for dog and assign to animal only methods in animal can be accessible,if that method overriden in dog 
 * that can be accessible,but we couldnt access specific methods in dog,by creating object for child class and assign to
 * parent we do have access to parent and only overriden methods not for full child class
 * 
 * */
