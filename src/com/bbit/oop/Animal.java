package com.bbit.oop;

public class Animal {

	Animal(){
		System.out.println("inside super class constructor(Animal)");
	}
	
	//can be overrriden
	public void sound(){
		System.out.println("any sound");
	}
	
	//can be overrriden
	public void eat(){
		System.out.println("eat food");
	}
	
	//cannot be overrriden
	final void run(){
		System.out.println("run fast");
	}
	
	
}
