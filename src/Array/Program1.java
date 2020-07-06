package Array;

import java.util.Scanner;

public class Program1 {
	// Java Program to copy all elements of one array into another array

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

		// Copy Element of array into another
		int array1[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			array1[i] = array[i];
		}
		System.out.println("Elements of new array are");
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);
		}
	}
}
