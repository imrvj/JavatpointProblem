package JavaBasic;

import java.util.Scanner;

public class Prime_number {
 
	public static void checkprime(int a)
	{
		int m=0,flag=0;
	
		
		m=a/2;
		if(a==0 || a==1)
		{
			System.out.println("Not prime");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(a%2==0)
				{
					System.out.println(a+ " Number is Not prime");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println(a+  " Number is prime");
		}
	}

	
	
	public static void main(String[] args) {
		
		checkprime(1);
		checkprime(3);
		checkprime(17);
		checkprime(20);
		
		}
}