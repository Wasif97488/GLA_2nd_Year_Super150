package Lec6_26_Aug;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String[] args) throws IOException {
//		FileReader fr=null;
//		FileReader tmp;
//		try
//		{
//			 tmp=new FileReader("abc.txt");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			fr.close();
//		}
		
		try(FileReader fr = new FileReader("abc.txt");
				FileReader fr1 = new FileReader("wasif.txt");
				FileReader fr2 = new FileReader("hello.txt"))
		{
			System.out.println("Helloo");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hi");
		}
	}
	

}
