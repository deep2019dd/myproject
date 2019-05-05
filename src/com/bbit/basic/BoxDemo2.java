package com.bbit.basic;

public class BoxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 objBox2 = new Box2();
		//double volume = 0;
		objBox2.depth = 2;
		objBox2.height = 4;
		objBox2.width = 10;
		
		//objBox2.getVolumeOfBox();
		
		double volume = objBox2.getVolume();
		System.out.println("new volume ---"+volume);
	}

}
