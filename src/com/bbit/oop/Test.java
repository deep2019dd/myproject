package com.bbit.oop;

public class Test implements TestInterface{

	public void print(){
		System.out.println("testing interface");
	}
	
	//int a = 20;
	
	public void sum(){
		int j=8;
		int k=4;
		System.out.println("sum-->"+(j+k));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test objTest = new Test();
		double akash = 15;
		System.out.println("value of akash--"+akash);
		objTest.sum();
		objTest.print();
	}

}
