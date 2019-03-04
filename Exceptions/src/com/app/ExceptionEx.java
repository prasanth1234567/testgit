package com.app;

public class ExceptionEx {
	public void mian(String s){
		String a="prasanth";
		System.out.println(a);
		String b=s.concat(a);
		System.out.println(b);
	}
public static void main(String[] args) {

   ExceptionEx a=null;
try{
	 a = new ExceptionEx();
	 a.mian(new String("hemanth"));
	System.out.println("object will be created");
}catch(Exception e){
	e.printStackTrace();

}


a.mian(new String("vijay"));
}
}









































































//public void sortString(String str){
//char[] array = str.toCharArray();
//Arrays.sort(array);
//System.out.println(array);
//}
//
//public static void main(String[] args) {
//Exception exception = new Exception();
//exception.sortString("prasanthaaaabbbcccddd");
//}