package Arrays;
import java.util.Scanner;

public class FirstNegativeWindow
{
	//Print the first negative integer in that window.If all the numbers are positive print 0
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int w=sc.nextInt();
		        if (w <= 0 || w > n) {
            return;
        }

		for(int i=0;i<=n-w;i++)
		{
			boolean status = false;
			
			for(int j=i;j<i+w;j++)
			{
				if(arr[j]<0)
				{
					System.out.print(arr[j]);
					status=true;
					break;
					
				}
			}
			if(!status)
			{
				System.out.print("0");
			}
			if (i != n - w) {
        System.out.print(" ");
    }
		}
		
		
		sc.close();
	}

}
