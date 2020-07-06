package Array;

import java.util.Scanner;

public class Program22 {
	// Odd even Element in array
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int a1 = s.nextInt();
		int a[] = new int[a1];

		// enter element
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		// print array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i] % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

	}

}
