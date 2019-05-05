package com.bbit.basic;

public class Box2 {
	public double width;
	public double height;
	public double depth;
	
	public void getVolumeOfBox(){
		double volume = width*height*depth;
		System.out.println("volume is --->"+volume);
	}
	
	public double getVolume(){
		double vol = width*height*depth;
		return vol;
	}
	
}
