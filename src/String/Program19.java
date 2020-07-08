package String;

public class Program19 {

	public static void main(String[] args) {
		String a="Hii";
		String b="hello";
		
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		b=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
				
	}
}
