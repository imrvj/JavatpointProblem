package Array;

import java.util.Scanner;

public class Program12 {
	// Sum of all element of array
	public static void main(String[] args) {
		int sum = 0;
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

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
}
