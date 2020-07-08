package Array;

public class Program3 {

	public static void main(String[] args) {
		int []a={1,3,7,4,3,7};
		int n=1;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			int first,j;
			first=a[0];
			
			for( j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		
		
		System.out.println("Array after left rotation: ");  
        for(int i = 0; i< a.length; i++){  
            System.out.print(a[i] + " ");  
        }  
		
	}
}
