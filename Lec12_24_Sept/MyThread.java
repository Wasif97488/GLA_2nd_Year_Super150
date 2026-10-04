package Lec12_24_Sept;

public class MyThread extends Thread{
	
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("Child Thread");
		}
//		m1();
//		m2();
//		m3();
		
	}
	
	public void run(int j)
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("hello Thread");
		}
		
	}
	public void hello()
	{
		System.out.println("Hello");
	}

}
