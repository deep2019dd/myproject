package com.bbit.oop;

public class TestInterface2 implements TestInterface{

	public void print(){
		System.out.println("trying to implement interface");
	}
	
	public void sum(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum value --"+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface2 obj = new TestInterface2();
		obj.print();
		obj.sum();
	}

}
