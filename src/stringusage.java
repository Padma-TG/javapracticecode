
public class stringusage 
{


	public static void main(String[] args) 
	{
		String str="Selenium WebDriver Tutorial";
		
		System.out.println("Removing white spaces:"+str.trim());
		
		System.out.println("Checking if it contains webdriver :"+str.contains("WebDriver"));
		
		System.out.println("changed to uppercase: "+str.toUpperCase());
		
		System.out.println("Changed to lowercase:"+str.toLowerCase());
		
		System.out.println("Extracting using substring:"+str.substring(10, 18));
		
		System.out.println("Extracting using substring 1 index only:"+str.substring(10));
		
		System.out.println("Checking if it starts with :"+str.startsWith("Sel"));
		
		//2. Data Parsing
		String strfruits="apple,banana,cherry,date";
		
		//Split it into an array using split(",").
		String[] strarr=strfruits.split(",");
		System.out.println(strarr.length);
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i].toUpperCase());
		}
		String joined=String.join(";", strarr);
		System.out.println(joined);
		
		String strreplace="The cat sat on the mat.";
		String newreplace=strreplace.replace("cat","dog" );
		System.out.println("New replace:"+newreplace);
		char[] newreplacearray=newreplace.toCharArray();
		System.out.println("Array is"+newreplacearray[1]);
		System.out.println("at 5th pos:"+newreplacearray[5]);
		System.out.println("String array:"+newreplace);
		System.out.println("at 5th pos:"+newreplace.charAt(5));

	}

}
