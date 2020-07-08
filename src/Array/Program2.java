package Array;

public class Program2 {
//Java Program to find the frequency of each element in the array
	
	public static void main(String[] args) {
		int a[]={1,1,2,2,2,3,4,5,5,3};
		int fre[]=new int [a.length];
		
		for(int i=0;i<a.length;i++)
		{
		  fre[i]=0;
		}
		
		for(int i=0;i<a.length;i++)
		{
			fre[a[i]-1]++;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+1+""+fre[i]);
		}
	}
}
