package java;

public class FindLengthOfString 
{
	//How to find the length of a string without length() method?.
    public static void main( String[] args )
    {
    	 String input = "Shanuja";
    	 input = input.concat("0");
    	 char[] c = input.toCharArray();
		  System.out.println(c); 
		  int count =0;int i=0;
		  while(c[i]!='0') { 
			  ++count; 
			  ++i; 
			  }
		 
    	 System.out.println(count);
    	 
    	 
    }
}
