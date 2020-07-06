package Array;

import java.util.Scanner;

public class Program8 {
//Java Program to print the elements of an array present on odd position
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
		//Print Element of array at even Position
		System.out.println("Print Element of arrays");
		for (int i = 0; i < array.length; i=i+2) {
			System.out.println(array[i]);

		}

	}
}
