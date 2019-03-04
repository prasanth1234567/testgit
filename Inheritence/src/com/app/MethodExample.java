package com.app;

public class MethodExample {
int height;
int weight;
int length;
int total;
public void volume(){
	total=height*weight+length;
}
public static void main(String[] args) {
	MethodExample example = new MethodExample();
	example.height=10;
	example.length=10;
	example.weight=10;
	example.volume();
	System.out.println(example.total);
}
}
