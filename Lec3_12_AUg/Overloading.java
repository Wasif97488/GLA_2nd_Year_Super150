package Lec3_12_AUg;

public class Overloading {
	
	 public void show(String value) {
	        System.out.println("String method");
	    }

	    public void show(StringBuffer value) {
	        System.out.println("StringBuffer method");
	    }

    // 1. int parameter
    public void show(int value) {
        System.out.println("int method: " + value);
    }

    // 2. double parameter
    public void show(double value) {
        System.out.println("double method: " + value);
    }

    public static void main(String[] args) {

    	Overloading obj = new Overloading();

        // Test 1: int
        obj.show(10);

        // Test 2: double
        obj.show(10.5);

        // Test 3: char
        obj.show('A');

        // Test 4: short
        short s = 20;
        obj.show(s);

        // Test 5: byte
        byte b = 30;
        obj.show(b);

        // Test 6: long
        long l = 40L;
        obj.show(l);

        // Test 7: float
        float f = 50.5f;
        obj.show(f);
        
        obj.show(null);  
    }
}


