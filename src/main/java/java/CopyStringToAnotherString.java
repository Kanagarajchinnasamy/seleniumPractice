package java;

public class CopyStringToAnotherString 
{
	//How to copy one string to another
    public static void main( String[] args )
    {
    	 String a = "Shanuja";
    	char c[]= a.toCharArray();
    	int size = c.length;
    	char d[]= new char[size];
    	for(int i=0; i<size;i++) {
    		d[i] = c[i];
    	}
    	 System.out.println(d);
    	 
    }
}
