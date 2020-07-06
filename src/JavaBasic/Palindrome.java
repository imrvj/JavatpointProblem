package JavaBasic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 int number,remainder,temp,sum=0;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter number");
		 number=s.nextInt();
		 
		 temp=number;
		 while(number>0)
		 {
			 remainder=number%10;
			 sum=(sum*10)+remainder;
			 number=number/10;
		 }
		 if(temp==sum)
		 {
			 System.out.println("Number is palindrome");
		 }
		 else
		 {
			 System.out.println("NOt Palindrome");
		 }
			 
		 
		
	}
			}

