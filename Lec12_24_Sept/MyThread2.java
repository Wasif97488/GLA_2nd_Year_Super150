package Lec12_24_Sept;

public class MyThread2 extends Wasif implements Runnable {
	
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("Child Thread");
		}
		m1();
		m2();
	}

}
