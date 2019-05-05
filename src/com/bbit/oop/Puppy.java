package com.bbit.oop;

public class Puppy extends Dog{
	
	Puppy(){
		System.out.println("inside sub class constructor(Puppy)");
	}
	
	public void eat(){
		System.out.println("milk only");
	}
	
	public static void main(String args[]){
		
		Animal objDog = new Dog();
		objDog.eat();
		
		Animal objPuppy = new Puppy();
		objPuppy.eat();
		
		Dog objPuppy2 = new Puppy();
		objPuppy2.eat();
		
	}
	
}
