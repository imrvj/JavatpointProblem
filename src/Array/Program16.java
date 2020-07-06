package Array;

import java.util.Scanner;

public class Program16 {

	// Java Program to Find 3rd Largest Number in an array
	public static void main(String[] args) {
		int temp = 0;
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

		// Sort in Ascending
		// Ascending order
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}

		System.out.println("Third largest is " + array[array.length - 3]);

	}

}
