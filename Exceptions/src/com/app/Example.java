package com.app;

public class Example {
//public void sortString(String str){
//	char[] array = str.toCharArray();
//	
//	Arrays.sort(array);
//	System.out.println(array);
//	
//}
//public static void main(String[] args) {
//	Example example = new Example();
//	example.sortString("prasanth");
//}
	
	public void swapping(String s,String b){
		System.out.println(s+""+b);
		String c=s;
		s=b;
		b=c;
	System.out.println(s+""+b);
		
		
	}
	public static void main(String[] args) {
		Example e = new Example();
		e.swapping("prasanth"," vijay");
	}
	
}
