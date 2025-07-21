package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		//declaration
		HashMap<Integer,String> hm=new HashMap<>();
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		hm.put(101, "Padma");
		hm.put(102, "Risshan");
		hm.put(103, "Goutam");
		hm.put(104, "Pranav");
		hm.put(105, "Aadhini");
		hm.put(102, "Raam");//if we give duplicate it will be replaced 
		//hence o/p is Printing maps :{101=Padma, 102=Raam, 103=Goutam, 104=Pranav, 105=Aadhini}-printing as list

		//no insertion order
		//printing maps
		System.out.println("Printing maps :"+hm);
		System.out.println("Printing map size :"+hm.size());

		//remove pair
		hm.remove(101);
		System.out.println("After removing: "+hm);
		
		//access the value of the key
		System.out.println("102 is "+hm.get(105));
		
		//to retrieve all the keys
		System.out.println(hm.keySet());
		
		//to retrieve all the values
		System.out.println(hm.values());
		
		//to retrieve both
		System.out.println(hm.entrySet());//-[102=Raam, 103=Goutam, 104=Pranav, 105=Aadhini]-printing as set
		//{}-list
		//[]-set
		
		//reading two for each and iterator
		for(int k:hm.keySet())
		{
			System.out.println(k+" is "+hm.get(k));
		}
		
		for (Map.Entry<Integer, String> entry : hm.entrySet())
		{
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		//iterator
		
	}

}
