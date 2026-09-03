package Lec6_26_Aug;


public class throwKeyword {
	public static void main(String[] args) throws InsufficientBalance{
		
//		System.out.println(10/0);
		
//	throw new ArithmeticException("cannot divide by zero--> Wasif");
		
		throw new InsufficientBalance("Amount is not sufficent to withdraw");
	}

}


