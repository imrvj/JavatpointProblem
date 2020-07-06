package Array;

import java.util.Scanner;

public class Program11 {
//Java Program to print the number of elements present in an array
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number/Element of array");
		int a = s.nextInt();
		int array[] = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		// Print array elements
		System.out.println("Print Element of arrays");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		//Number of element in array is 
		System.out.println(array.length);
	} 
	
}
