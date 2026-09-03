package Lec3_12_AUg;

public class Main {
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.marry();
		
		Child c = new Child();
		c.marry();
		
		Parent p = new Child();
		p.marry();
		
		// we can also use co variant method
	}

}
