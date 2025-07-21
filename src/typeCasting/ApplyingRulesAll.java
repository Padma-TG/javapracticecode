package typeCasting;

class A
{
	void methodA()
	{
		System.out.println("A");
	}
}

class B extends A
{
	void methodB()
	{
		System.out.println("B");
	}
}

class C extends A
{
	void methodC()
	{
		System.out.println("C");
	}
}

class D
{
	void methodD()
	{
		System.out.println("D");
	}
}
public class ApplyingRulesAll
{

	public static void main(String[] args) 
	{
		// Upcasting: child to parent
		B b = new B();    
		A a = b;          
		
		// Downcasting: parent ref → child
		A a1 = new B();    
		B b1 = (B) a1; 
		
		//Compiles, but runtime ClassCastException
		A a2 = new A();    
		//B b2= (B) a2;  
		
		// ❌ No relationship between D and B
		D d3 = new D();    
		//B b3 = (B) d3;
		
		//// ❌ D is not parent of B or related at all
		A a4 = new B();    
		//D d4 = (D) a4;
		
		// Downcasting to grandchild
		A a5 = new C();    
		//C c5 = (C) a5;  
		
		 // Compiles but throws ClassCastException
		A a6 = new B();    
		//C c6 = (C) a6; 
		
		//instanceof
		A a7 = new A();

		if (a7 instanceof B) 
		{
		    B b7 = (B) a7;     // Won't execute
		} else 
		{
		    System.out.println("Not an instance of B — Safe check");
		}
		
		A a8=new B();
		if(a8 instanceof B)
		{
			B b8=(B)a8;
			System.out.println("done");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

/*/*
=====================================
🌟 Object Type Casting - 3 Golden Rules
=====================================

🔹 Rule 1: Casting Type and Variable Type MUST Be Related (Compile-Time Check)
    → The type you're casting to and the reference variable you're casting FROM must have
      a parent-child or same class relationship.
    → If not, compiler error.

    ✅ Example: 
        Animal a = new Dog();         // Valid
        Dog d = (Dog) a;              // Valid - Dog and Animal are related

    ❌ Invalid:
        String s = (String) new Integer(10);   // ❌ Compile-time error

🔹 Rule 2: Left-Side Assignment Type MUST Be Same as or Parent of Casting Type (Compile-Time Check)
    → The variable you're assigning to must be the same type as the cast OR a parent of the cast type.

    ✅ Example:
        Animal a = (Animal) new Dog();   // Valid, Animal is parent of Dog

    ❌ Invalid:
        Dog d = (Dog) new Animal();      // ❌ Animal cannot be assigned to Dog without cast

🔹 Rule 3: Actual Object Type MUST Match or Be Child of Cast Type (Runtime Check)
    → The object in memory (new object) must match or be a child of the cast type.
    → If not, you'll get a `ClassCastException` at runtime.

    ✅ Example:
        Animal a = new Dog();
        Dog d = (Dog) a;     // ✔️ Works at runtime, object is actually Dog

    ❌ Example:
        Animal a = new Animal();
        Dog d = (Dog) a;     // ❌ Compiles, but fails at runtime (ClassCastException)

*/

