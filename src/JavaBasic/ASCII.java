package JavaBasic;

public class ASCII {

	public static void main(String[] args) {
		char a='A';
		char b='Z';
		
		int asciivalue1 = a;  
		int asciivalue2 = b;
		
		System.out.println(asciivalue1);
		System.out.println(asciivalue2);
		
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
		
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)i);
		}
		
	}
}


