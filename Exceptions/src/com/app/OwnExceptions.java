package com.app;

public class OwnExceptions {
public void add() throws Exception{
	
try{
System.out.println(10/0);
}catch(Exception e){
	throw new Exception("getting a exceptions" );
}
}
public static void main(String[] args) throws Exception {
	OwnExceptions a= new OwnExceptions();
	a.add();
	
}
}









































































































//public void vote(){
//int age=12;
//try{
//	if(age>18/0){
//	}
//}catch(Exception e){
//	try {
//		throw new Exception("your eligible vote rights");
//	} catch (Exception e1) {
//		
//		e1.printStackTrace();
//	}
//
//}
//
//}
//public static void main(String[] args) {
//OwnExceptions a = new OwnExceptions();
//a.vote();
//}