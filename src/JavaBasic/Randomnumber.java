package JavaBasic;

public class Randomnumber {

	public static void main(String[] args) {
		int max = 400, min = 200;
		int b = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b);
	}
}
