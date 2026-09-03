package Lec4_19_Aug;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException{
		
		try
		{
			System.out.println("Bag pack");
			System.out.println("Train");
			System.exit(0);

//			int[] a = new int[3];
//			System.out.println(a[3]);
			String s = null;
			System.out.println(s.length());
//			System.out.println(10/0);
//			FileReader fr = new FileReader("abc.txt");
//			int count=0;
//	   	 ArrayList<Integer> a = new ArrayList<Integer>();
//		     while(true)
//		     {
//		    	 a.add(1000000);
//		     }
			
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Number cannot divide by zeros");
		}
		finally {
			System.out.println("wasif");
		}
		System.out.println("Mathura");
		System.out.println("GLA ");
		System.out.println("Class Attend");
	}
}
