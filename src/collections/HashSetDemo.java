package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		//declaration
		HashSet<Object> myset=new HashSet<>();
		//Set<Object> myset=new HashSet<>();
		//HashSet<String> myset=new HashSet<>();
		
		myset.add("Padma");
		myset.add("Padma");//checking with duplicates
		myset.add(null);
		myset.add(null);//checking if multiple null 
		myset.add("Risshan");
		myset.add(100);
		myset.add(10.09);
		//it wont give error but in runtime it neglects
		
		System.out.println("Checking set order :"+myset);//o/pChecking set order :[null, Padma, 100, Risshan, 10.09]

		//hence no duplicate printed and no multiple null printed
		
		//Here we dont have indexing order
		//remove
		myset.remove(100);//so direct value
		System.out.println("After removal Set is:"+myset);
		
		//insertion not possible ,because no order
		//access specific element not possible
		
		//CONVERT SET TO LIST
		ArrayList<Object> al=new ArrayList<>(myset);
		System.out.println("converted to list :"+al);
		System.out.println(al.get(2));
		
		//reading with two approaches,classic for loop is not allowed,since no indexing
		//for each
		System.out.println("Print from for each");

		for(Object x:myset)
		{
			System.out.println(x);
		}
		//using iterator
		Iterator<Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//removing one
		myset.remove("Padma");
		System.out.println("after removing padma :"+myset);

		
		//clearing all values
		myset.clear();
		System.out.println(myset.isEmpty());
		
			}

}
