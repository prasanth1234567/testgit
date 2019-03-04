package com.app1;

public class Test {
	public static void main(String[] args) throws ToYoungExceptions, ToOldExceptions {
		int age=75;
		if(age<=12){
			throw new ToYoungExceptions("your not eligible to vote rights");
		}else if(age>=60){
		throw new ToOldExceptions("your to old so not eligible vote rights");
			
		}
		else{
			System.out.println("your eligible to vote rights");
		}
	}

}
