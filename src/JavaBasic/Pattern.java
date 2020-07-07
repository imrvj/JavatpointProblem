package JavaBasic;

import java.awt.AlphaComposite;

public class Pattern {
	
	public static void main(String[] args) {
		//Star Pattern
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
	
		for(char i=0;i<5;i++)
		{
			for(char j=0;j<=i;j++)
			{
				System.out.print("A");
			}
			System.out.println("");
			
		}
		
		for(char i=0;i<5;i++)
		{
			for(char j=i;j<5;j++)
			{
				System.out.print("A");
			}
			System.out.println("");
			
		}

		
		
	}
	

}
