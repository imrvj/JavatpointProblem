package JavaBasic;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a1=0,a2=1,a3,n;
		System.out.println("Enter number of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		 System.out.print(a1+" "+a2);//printing 0 and 1
		for(int i=2;i<=n;i++)
		{
			a3=a1+a2;
			System.out.print(""+a3);
			a1=a2;
			a2=a3;
			
			
			
		}
		
	}
}
