package com.bbit.oop;

public class DogTest extends AnimalTest{
	
	String color = "Black";
	static String color2 = "Black";
	
	public void bark(){
		System.out.println("subclass method bark called");
	}  
  
	
	public void getColor(){
		System.out.println("dog color(using this) --"+this.color);
		System.out.println("Animal Color(using super) ---"+super.colour);
	}
	
	public void testSuper(){
		System.out.println("testSUper method called");
		this.bark();
		super.eat();
	}
	
	public static void main(String args[]){
		DogTest objDogTest = new DogTest();
		System.out.println("dog color2(static) ---"+color2);
		System.out.println("dog color(non-static) ---"+objDogTest.color);
		objDogTest.getColor();
		
		objDogTest.testSuper();
	}
	
}
