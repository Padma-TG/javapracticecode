package random;

class Employee
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;	
	}
	void display()
	{
		System.out.println("Name and salary is "+name+" "+salary);
	}
}
class Manager extends Employee
{
	String department;
	Manager(String name,double salary,String department)
	{
		super(name,salary);
		this.department=department;
	}
	void display()
	{
		super.display();
		System.out.println(department);
	}
}
public class SuperKeyword 
{

	public static void main(String[] args) 
	{
		Manager mg=new Manager("Padma",1200000.00,"Automation Tester");
		mg.display();
	}

}
