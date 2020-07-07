package JavaBasic;

public class Palindrome {

	public static void main(String[] args) {
		
		int a=121;
		int reverser=0,remainder;
		int temp;
		
		temp=a;
		while(a>0)
		{
			remainder=a%10;
			reverser=(reverser*10)+remainder;
			a=a/10;
		}
		System.out.println(reverser);
		if(reverser==temp)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
