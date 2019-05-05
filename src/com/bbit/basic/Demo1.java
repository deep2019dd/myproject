package com.bbit.basic;

public class Demo1 {
	
	int m = 10;
	double n = 1000;
	public int getSum(int a, int b){
		//return (a+b);
		int c = a+b;
		return c;
	}
	
	public static void main(String args[]){
		Demo1 objDemo1 = new Demo1();
		int c = objDemo1.getSum(2,3);	
		System.out.println(objDemo1.n);
		System.out.println("value sum --"+c);
	}

}
