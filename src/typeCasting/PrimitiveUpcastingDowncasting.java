package typeCasting;

public class PrimitiveUpcastingDowncasting 
{

	public static void main(String[] args) 
	{
		//Declares variables of types: byte, short, int, long, float, double.

		// byte: 8-bit signed, Range: -128 to 127
		byte by=100; 
		
		// short: 16-bit signed, Range: -32,768 to 32,767
		short sh=20000;    
		
		// int: 32-bit signed, Range: -2,147,483,648 to 2,147,483,647
        int i = 100000;
        
        // long: 64-bit signed, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l=1000000000000000L;
        
        // float: 32-bit IEEE 754, Range: ~±3.4e−38 to ±3.4e+38
        float f = 3.14f;

        // double: 64-bit IEEE 754, Range: ~±1.7e−308 to ±1.7e+308
        double d = 3.1415926535;
        
        // char: 16-bit unsigned Unicode, Range: 0 to 65,535 (or '\u0000' to '\uffff')
        char c = 'A';
        
        // boolean: true or false
        boolean flag = true;
        
        //**************************************//
        //Demonstrates upcasting automatically (e.g., from int to long, float to double).
        
        int a=10;
        long li=a;
        System.out.println("Long to int is "+li);
        
        //float to double
         float fld=10.92f;
         double df=fld;
         System.out.println("float to Double "+df);
         
         //Demonstrates downcasting explicitly (e.g., from double to int, int to byte), and shows how data may be lost.
         double di=23456789;
         System.out.println("Before downcast 1 is"+di);
         int id=(int)di;
         System.out.println("downcasting double to int is "+id);
         
         int ib=320000;
         System.out.println("before downcaset2 "+ib);
         byte bi=(byte)ib;
         System.out.println("Downcasting int to byte is "+bi);

	}

}
