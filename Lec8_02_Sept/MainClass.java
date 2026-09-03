package Lec8_02_Sept;

import java.util.function.Consumer;
import java.util.function.Function;

public class MainClass {
	
	public static void main(String[] args) {
		
		Interf i = ()-> System.out.println("Wasif");
		i.name();
		
		MainClass m = new MainClass();
//		Function<Integer, Integer> f = (n)-> m.square(2);
		
		Function<Integer, Integer> f = m::square;
		System.out.println(f.apply(10));
		
		Function<Integer, Double> f1 = Math::sqrt;
		System.out.println(f1.apply(25));
		
//		Consumer<String> c = (s)-> System.out.println(s);
//		Consumer<String> c = System.out::println;

//		c.accept("Harshita");
	}
	
	public int square(int n)
	{
		return n*n;
	}

}
