package Lec4_19_Aug;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Child extends Parent{
	
	@Override
	public LinkedList<Integer> m1()
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(2);
		return l1;
//		return "hello";
	}

}
