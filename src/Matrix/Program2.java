package Matrix;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Addition two matrix

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] Mul = new int[3][3];
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
				Mul[i][j]=0;
				
			for(int k=0;k<a.length;k++)
			{
				Mul[i][j]=a[i][k]*b[k][j];
			}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(Mul[i][j] + "");
			}
			System.out.println(" ");
		}

	}
}
