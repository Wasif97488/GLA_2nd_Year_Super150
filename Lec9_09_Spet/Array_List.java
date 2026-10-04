package Lec9_09_Spet;
import java.util.ArrayList;
import java.util.LinkedList;
public class Array_List {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("wasif");
		al.add(10.5);
		al.add(true);
//		System.out.println(al);
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(1);
		al1.add("Wasif");
		al1.add(true);
//		System.out.println(al1);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		
	}

}
