package com.bbit.oop;

public class InheritExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A objA = new A();
		B objB = new B();
		
		//objA.i = 5;
		//objA.j = 6;
		
		objA.sumA();
		
		objB.k = 3;
		//objB.i = 5;
		//objB.j = 4;
		
		
		objA.showij();
		objB.showk();
		
		objB.sum();
		
	}

}
