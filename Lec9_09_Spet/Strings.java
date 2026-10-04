package Lec9_09_Spet;

import java.util.ArrayList;
public class Strings {
	
	public static void main(String[] args) {
		
		String s = "Wasif";
		String s1="Wasif";
//		System.out.println(s);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		Math.pow(2, 3)
		
		String s2 = new String("Wasif");
		String s3 = new String("Wasif");
		
//		System.out.println(s2.equals(s3));
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
//		System.out.println(s2.equals(s3));
//		System.out.println(s2==s3);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1==s3);
		StringBuffer sb1 = new StringBuffer("Wasif");
		StringBuffer sb2 = new StringBuffer("Wasif");
//		System.out.println(sb1.equals(sb2));
		
		
		
//		String s1 = new String("Wasif");
//		String s2 = new String("Wasif");
//		String s3 = new String("Wasif");
//		String s4 = new String("Wasif");
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
//		System.out.println(s.charAt(5));
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));
		
		
		String s5="Welcome to GLA University";
//	String[] array=	s5.split("o");
//	for(int i=0;i<array.length;i++)
//	{
//		System.out.println(array[i]);
//	}
		
		String s6="     Welcome to     GLA University    ";
		System.out.println(s6.trim());
		
		String s7="Wasifa";
		System.out.println(s7.indexOf("a"));
		System.out.println(s7.lastIndexOf('a'));
		System.out.println(s6.contains("Welcome"));
		System.out.println(s6.isEmpty());
		String s8="WASIF";
		System.out.println(s.equals(s8));
		System.out.println(s.equalsIgnoreCase(s8));
		
		
				
		





		
	}
	
	

}
