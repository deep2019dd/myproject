package com.bbit.oop;

public class AbstractTestDemo extends AbstractTest{
	
	public void getSum(){
		int a=10;
		int b=15;
		int c = a+b;
		System.out.println("sum--"+c);			
	}
	
	public void getName(){
		System.out.println("i am anisha");
	}
	
	public static void main(String[] args) {

		//AbstractTestDemo obj = new AbstractTestDemo();
		AbstractTest obj = new AbstractTestDemo();
		obj.getSum();
		obj.getName();
	}

}
