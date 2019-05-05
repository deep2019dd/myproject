package com.bbit.basic;

public class Box3 {
	
	public double width;
	public double height;
	public double depth;
	
	//constructor
	Box3(){
		width = 10;
		height = 2;
		depth = 3;
		
	}
	
	public void getVolume1(){
		double volume = width*height*depth;
		System.out.println("volume--->"+volume);
	}
	
	public double getVolume2(){
		double vol = width*height*depth;
		return vol;
	}
	
	
	
	
	
}