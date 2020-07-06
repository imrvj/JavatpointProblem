package Array;

import java.util.Scanner;

public class Program9 {
	// Largest element in array
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

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];

		}
		System.out.println("Maximum is " + max);

	}

}
