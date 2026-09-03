package Lec2_6_Aug;


public class Main {
	
	public static void main(String[] args) {
		Parent p = new Parent();
//		p.m1();
//		p.m2();
//		p.m3();
//		p.m4();
		Child c = new Child();
//		c.m3();
//		c.m4();
		c.m1();
		c.m2();
		
		Parent p1 = new Child();
		p1.m1();
		p1.m2();
		
		
		//not possible
		Child c1 = new Parent();
		
		Object o= new Object();
		
		
		String s = new String();
		
	}

}