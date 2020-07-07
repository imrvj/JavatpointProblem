package JavaBasic;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 6;
		int m = 0, flag = 0;
		m = a / 2;
		if (a == 0 || a == 1) {
			System.out.println("Not Prime");

		} else {
			for (int i = 2; i <= m; i++) {
				if (a % 2 == 0) {
					System.out.println("Not Prime");
					flag = 1;
					break;
				}
				if (flag == 0) {
					System.out.println("Prime");
				}

			}
		}

	}
}
