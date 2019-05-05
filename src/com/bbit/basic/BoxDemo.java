package com.bbit.basic;

public class BoxDemo {

	public static void main(String[] args) {

		//create an object
		Box objBox = new Box();
		
		double volume = 0;
		objBox.depth = 10;
		objBox.height = 5;
		objBox.width = 5;
		
		volume = objBox.depth * objBox.height * objBox.width;
		System.out.println("box volume is -->"+volume);
		
	}

}
