package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		//declaration to store hetrogenous data
		ArrayList<Object> mylist=new ArrayList<>();
		//List mylist=new ArrayList();
		
		//to store homo data-predefined objects
		//ArrayList <String>mylist=new ArrayList<String>();
		//to store home-userdefined object -but only objects
		//ArrayList<Employee> mylist=new ArrayList<Employee>();
		
		//ADDING Data
		
		mylist.add(100);
		mylist.add("Padma");
		mylist.add(10.25);//all type allowed
		mylist.add("Padma");//duplicates allowed
		mylist.add(null);//null allowed
		mylist.add(null);//multiplenull allowed
		
		//Size
		int sizeoflist=mylist.size();
		System.out.println(sizeoflist);//dynamic dont need to specify before
		
		
		//printing
		System.out.println("Actual datas are "+mylist);//insertion order
		
		//remove
		mylist.remove(0);//starts from 0, 0 is index
		System.out.println("After removal datas are "+mylist);//insertion order

		//inserting in middle
		//diff btw adding and insertion
		//add method adds in end of the list and insertion means adding in middle
		mylist.add(1, "Goutam");
		System.out.println("After insertion datas are "+mylist);//insertion order
		
		//modification or replacement
		mylist.set(3, "Risshan");
		System.out.println("After modification datas are "+mylist);//insertion order

		//extract specific element or access specific elemen
		mylist.get(3);
		System.out.println("3 is:"+mylist.get(3));
		
		//Reading all the elements from arraylist,there are three approaches
		//1.using normal for loop
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//2.using enhanced forloop
		System.out.println();
		System.out.println("Printing from enhanced for loop");
		for(Object i:mylist)
		{
			System.out.println(i);
		}
		
		//3.using iterator=hetro data
		Iterator<Object> it=mylist.iterator();//we are storing the o/p in a variable,that variable type is iterator
		
		System.out.println(it.next());//returns only first
		System.out.println("printing from iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		//suppose my list is homo
		/*Iterator<String> it=mylist.iterator();//we are storing the o/p in a variable,that variable type is iterator
		Iterator<Integer> it=mylist.iterator();//we are storing the o/p in a variable,that variable type is iterator
		Iterator<Employee> it=mylist.iterator();//we are storing the o/p in a variable,that variable type is iterator*/

		//checking arraylist is empty or not
		System.out.println("Is arraylist empty:"+mylist.isEmpty());
		
		//remove all from arraylist
		mylist.remove(0);
		mylist.clear();
		System.out.println("cleared:"+mylist);
		
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		mylist.add("d");
		mylist.add("e");
		mylist.add("f");

		System.out.println("Mylist before remove multiple:"+mylist);
		
		//remove multiple elements
		ArrayList<Object> mylist2=new ArrayList<>();
		mylist2.add("a");
		mylist2.add("b");
		mylist2.add("c");
		mylist.removeAll(mylist2);
		System.out.println("after mylist2 removal:"+mylist);
		
		//removing single element using index
		mylist.remove(1);
		System.out.println("after remove:"+mylist);

	}

}
