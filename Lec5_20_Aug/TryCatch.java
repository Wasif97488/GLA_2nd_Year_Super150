package Lec5_20_Aug;

public class TryCatch {
	public static void main(String[] args) {
		
		try
		{
			System.out.println("hello");
			System.out.println(10/0);
			String s= null;
//			System.out.println(s.length());
			int[] a = new int[2];
//			System.out.println(a[3]);
			
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Aritmetic exception");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Exception");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
	}

}
