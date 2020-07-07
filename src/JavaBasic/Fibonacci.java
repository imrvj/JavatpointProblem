package JavaBasic;

public class Fibonacci {

	public static void main(String[] args) {

		int a1 = 0, a2 = 1, a3=0;

		for (int i = 0; i <= 10; i++) {
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
			System.out.println(a3);
		}

	}
}
