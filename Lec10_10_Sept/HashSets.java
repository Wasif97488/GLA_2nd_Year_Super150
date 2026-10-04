package Lec10_10_Sept;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(10);
		al.add(15);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(11);
		al.add(20);
//		System.out.println(al);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<al.size();i++)
		{
			hs.add(al.get(i));
		}
		
//		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(15);
		hs1.add(32);
		hs1.add(13);
		hs1.add(49);
		hs1.add(34);
		hs1.add(36);
      System.out.println(hs1);		
		

	}
    
}
