package frequentyaskingproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList 
{

	public static void main(String[] args)
	{
		String[] usernames = {"admin", "tester1", "user123", "admin", "guest", "user123", "tester2"};
		
		Set<String> newSet=new HashSet<>();
		for(String each:usernames)
		{
			newSet.add(each);
		}
		System.out.println(newSet);
		
		List<String> newList=new ArrayList<>(newSet);
		System.out.println(newList.size());
		for(int i=0;i<newList.size();i++)
		{

			System.out.println(newList.get(i));
		}
		
		
		


	}

}
