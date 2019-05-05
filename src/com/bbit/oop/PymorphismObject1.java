package com.bbit.oop;

public class PymorphismObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismTest1 objPolymorphismTest1 = new PolymorphismTest1();
		
		objPolymorphismTest1.getValue();
		int c = objPolymorphismTest1.getValue(2,3);
		System.out.println("c--"+c);
		objPolymorphismTest1.getValue(3, 2, 4);
		
		int b = objPolymorphismTest1.getSum(3, 1, 2);
		System.out.println("b --"+b);
	}

}
