package com.bbit.oop;

public class Dog extends Animal{
	
	Dog(){
		System.out.println("inside sub class constructor(Dog)");
	}
	
	public void eat(){
		System.out.println("eats meat");
	}
	
	//final methid cannot be overrriden
	//void run(){
		//System.out.println("run very fast");
	//}
}
