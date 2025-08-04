package sDETBasics;

public class EqualsAndComparisionOperator 
{

	public static void main(String[] args) 
	{
		//case1
		String str1="Padma";
		String str2="Padma";
		System.out.println("Case 1");
		
		System.out.println("Using == operator:"+(str1==str2));
		System.out.println("Using .equals() method:"+str1.equals(str2));
		
		//case2
		String str3=new String("Goutam");
		String str4=new String("Goutam");
		System.out.println("Case 2 Both New Keyword");
		boolean case2=str3==str4;
		System.out.println("Using == operator:"+case2);
		System.out.println("Using .equals() method:"+str3.equals(str4));
		
		//case3
		System.out.println("Case Three: Mixed creation (Direct vs `new`)");
		String str5="Raam";
		String str6=new String("Raam");
		boolean case3=str5==str6;
		System.out.println("Using == operator:"+case3);
		System.out.println("Using .equals() method:"+str5.equals(str6));
		
		//case4
		System.out.println("***Case Four: Assigning `new` declared string**");
		String str7="Aadhini";
		String str8=new String("Aadhini");
		String str9=str8;
		
		System.out.println("S7==str8 :"+(str7==str8));
		System.out.println("S7.equalss8 :"+str7.equals(str8));

		System.out.println("S8==S9 :"+(str8==str9));
		System.out.println("s8.equalss9 :"+str8.equals(str9));
	}

}
