package Lec11_17_Sept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayList_Implementation {
	public static void main(String[] args) {
		
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(-10);
//		System.out.println(c);
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(10);
		c1.add(50);
		c1.add(90);
		c1.add(60);
		
		c.addAll(c1);
//		System.out.println(c);
		
		c.remove(60);
//		System.out.println(c);
//		
//		System.out.println(c.contains(20));
//		
//		System.out.println(c.size());
//		
//		System.out.println(c.isEmpty());
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(20);
		ts.add(10);
		ts.add(90);
		ts.add(45);
		ts.add(78);
//		System.out.println(ts);
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(40);
		s.push(60);
		s.push(-10);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(0));
		
		
		
	}

}
