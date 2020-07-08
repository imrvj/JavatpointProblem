package Matrix;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		//Subtract 2 matrix
		

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] sub = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements");

		// input
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(sub[i][j] + "");
			}
			System.out.println(" ");
		}


	}
}
