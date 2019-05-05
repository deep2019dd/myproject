package com.bbit.basic;

public class Box5 {
	public double width =0;
	public double height =0;
	public double depth =0;
	
	//constructor
	Box5(double w, double h, double d){
		this.width = w;
		this.height = h;
		this.depth = d;
		
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
