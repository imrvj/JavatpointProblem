package String;

public class Program4 {

	public static void main(String[] args) {
		  String str = "This is a really simple sentence";    
		  int vcount=0;
		  int ccount=0;
		  int space=0;
		  for(int i=0;i<str.length();i++)
		  {
			  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				  vcount++;
				  
			  }
			 
			  else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
			  {
				  ccount++;
			  }
				  
		  }
		  
		  System.out.println(vcount);
		  System.out.println(ccount);
	}
}
