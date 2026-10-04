package Lec12_24_Sept;

public class Multithreading {
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		mt.run(2);
		
		MyThread1 mt1 = new MyThread1();
//		mt1.start();
		
//		mt.start();
		
//		System.out.println("Hello");
//		System.out.println("Wasif");
		
		for(int i=1;i<=1000;i++)
		{
			System.out.println("main Thread");
		}
		
		
		
	}

}
