package Lec12_24_Sept;

public class Multithreading1 {
	
	public static void main(String[] args) {
		
//		MyThread2 mt2 = new MyThread2();
//		Thread t = new Thread(mt2);
//		t.start();
//		
//		for(int i=1;i<=1000;i++)
//		{
//			System.out.println("Main Thread");
//		}
//		
		Thread t = new Thread(()->
		{
			for(int i=1;i<=1000;i++)
			{
				System.out.println("Child Thread");
			}
		});
         t.start();
		
	
	}

}
