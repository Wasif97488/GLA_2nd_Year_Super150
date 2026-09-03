package Lec7_27_Aug;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {
	
	public static void main(String[] args) {
//		
//		Interf i =()-> System.out.println("Vansh");
//		i.name();
		
//		Interf i = (n)-> System.out.println(n*n);
//		i.square(10);
		
//		Interf i = (a,b)-> System.out.println(a+b);
//		i.add(2, 3);
		
//		Interf i = (n)-> System.out.println(n%2==0);
//		i.evenOrOdd(20);
		
//		Predicate<Integer> p = (n)->  n%2==0;
//		System.out.println(p.test(26));
		
		
//		Predicate<String> s = (p)-> p.length()>5;
//		System.out.println(s.test("Wasif"));
		
//		Function<String, Integer> f = (s1)-> s1.length();
//		System.out.println(f.apply("Harshita"));
		
		BiFunction<Integer, String, String> bf = (a,b)-> a+b;
		System.out.println(bf.apply(10, "Wasif"));
		
		Consumer<Integer> c = (n)-> System.out.println(n);
		c.accept(50);
		
		Supplier<Integer> sup = ()-> 100;
		System.out.println(sup.get());
		
		
		
		
		
		
	}

}
