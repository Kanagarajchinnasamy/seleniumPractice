package java;
import java.io.*;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(66);
		alist.add(67);
		System.out.println(alist.get(1));
		alist.set(1, 100);
		System.out.println(alist.get(1));
		//alist.remove(1);
		//System.out.println(alist.get(1));
		//alist.clear();
		//System.out.println(alist.get(0));
		System.out.println(alist.contains(5));
		
		Iterator<Integer> i = alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		alist.add(1, 105);
		System.out.println(alist);
		
		
		
		

	}

}
