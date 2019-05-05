package com.bbit.basic;

public class Box5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 objBox5 = new Box5(10,2,4);
		
		Box5 objBox5_2 = new Box5(9,2,10);
		
		double volume2 = objBox5.getVolume2();
		System.out.println("volume1 ---"+volume2);
		
		objBox5_2.getVolume1();

		

	}

}
