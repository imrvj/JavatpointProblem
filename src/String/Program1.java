package String;

public class Program1 {

	public static void main(String[] args) {
		//Java Program to count the total number of characters in a string
		int count=0;
		String a="The best of both worlds";
		System.out.println(a.length());
		
		for(int i=0;i<a.length();i++)
		
			if(a.charAt(i) != ' ')
			{
				count++;
			}
			
			System.out.println(count);
		
	}
}
