package com.bbit.basic;

public class Box4 {

	public double width =0;
	public double height =0;
	public double depth =0;
	
	//constructor
	Box4(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		
	}
	
	public void getVolume1(){
		double volume = width*height*depth;
		System.out.println("volume--->"+volume);
	}
	
	public double getVolume2(){
		//double vol = width*height*depth;
		System.out.println("method called");
		return width*height*depth;
	}
	
}
