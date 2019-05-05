package com.bbit.basic;

public class Example3 {

	public int a = 0;
	
	public Example3() {
		a = 10;
	}
	
	public Example3(int c){
		a = c+20;	
	}
	
	public static void main(String args[]){
		Example3 obj = new Example3();
		System.out.println(obj.a);
		System.out.println(obj.a);
	}
	
}
