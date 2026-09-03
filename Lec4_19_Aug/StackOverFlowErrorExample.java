package Lec4_19_Aug;

public class StackOverFlowErrorExample {
	
	static int count=0;
	
	public static void main(String[] args) {
		System.out.println(count++);
		m1();
		
	}
	public static void m1()
	{
		System.out.println(count++);
		m2();
	}
	public static void m2()
	{
		System.out.println(count++);
		m1();
	}

}
