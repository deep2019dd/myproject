package com.bbit.oop;

public class Cat extends Animal{
	
	//overriding
	public void sound(){
		System.out.println("meaw !");
	}
	
	public static void main(String args[]){
		
		Animal objCat = new Cat();
		objCat.sound();
	}
	
}
