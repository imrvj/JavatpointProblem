package Array;

import java.util.Scanner;

public class Program6 {
	// Java Program to print the elements of an array in reverse order
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

		// Element in reverse Order
		System.out.println("Element in Reverse Order");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}
}
