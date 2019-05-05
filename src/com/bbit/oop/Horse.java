package com.bbit.oop;

public class Horse extends Animal{
	
	@Override
	public void sound(){
		System.out.println("Neigh !");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal objHorse = new Horse();
		objHorse.sound();
	}

}
