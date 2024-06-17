package java;

public class ReverseTheString 
{
	//How to reverse a string
    public static void main( String[] args )
    {
    	 String a = "Shanuja";
    	char c[]= a.toCharArray();  
    	int size = c.length;
    	char d[]= new char[size];
    	for(int i=size-1; i>=0;i--) {
    		d[size-1-i] = c[i];
    	}
    	 System.out.println(d);
    	 
    }
}
