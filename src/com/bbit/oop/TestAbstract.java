package com.bbit.oop;

public class TestAbstract extends AbstractDemo{

	public void sum(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum value --"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractDemo obj = new AbstractDemo();
		TestAbstract obj = new TestAbstract();
		obj.sum();
		obj.print();
		
	}

}
