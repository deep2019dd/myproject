package com.bbit.basic;

public class Box4Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box4 objBox4 = new Box4(10,2,4);
		
		Box4 objBox4_2 = new Box4(9,2,10);
		
		double volume2 = objBox4.getVolume2();
		System.out.println("volume1 ---"+volume2);
		
		objBox4_2.getVolume1();

	}

}
