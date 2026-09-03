package Lec6_26_Aug;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
	public static void CEO() 
	{
		System.out.println("CEO");
		manager();
	}
	public static void manager() 
	{
		try
		{
			teamLead();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("File is not available");
		}
		System.out.println("Manager");
	}
	public static void teamLead() throws FileNotFoundException
	{
		employee();
		System.out.println("Team Lead");
	}
	public static void employee() throws FileNotFoundException
	{
//		System.out.println(10/0);
		FileReader fr = new FileReader("abc.txt");
	} 
	public static void main(String[] args) {
		CEO();
	}
}
