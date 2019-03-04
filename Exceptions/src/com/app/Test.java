package com.app;

public class Test {
public static void main(String[] args) {
Test test = new Test();
test.dostuff();
}
public void dostuff(){
	domorestuff();
	System.out.println("this is dostuff method");
}
public void domorestuff(){

	try{
	System.out.println(10/0);
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println(e);
		e.toString();
		System.out.println(e);
		e.getMessage();
		System.out.println(e);
		
	}
}
}
