package Lec5_20_Aug;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finally {
	
	public static void main(String[] args) throws IOException {
//		FileReader fr =null;
		try {
//			fr = new FileReader("abc.txt");
			System.out.println("hello");
			System.exit(0);
			System.out.println(10/0);
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("handled");
		try
		{
			System.out.println(10/0);
		}
		catch (Exception f) {
			// TODO: handle exception
			System.out.println("nested handled");
		}
		}
		finally {
//			fr.close();
			System.out.println("finally block");
		}
	}

}
