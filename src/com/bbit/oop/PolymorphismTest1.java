package com.bbit.oop;

public class PolymorphismTest1 {

	int abc = 0;
	
	public void getValue(){
		System.out.println("no value");
	}
	
	//valid overloading
	public void getValue(int a, int b, int c){
		System.out.println("value--"+(a+b+c));
	}
	
	//valid overloading
	public void getValue(int a, String c, int b){
		System.out.println("value--"+(a+b));
	}
	
	//invalid overloading
	//public int getValue(int a, int b, int c){
		//System.out.println("value--"+(a+b+c));
		//return (a+b+c);
	//}
	
	//valid overloading
	public int getValue(int a, int b){
		//System.out.println("value--"+(a+b+c));
		return (a+b);
	}
	
	public int getSum(int x, int y, int z){
		
		int a =0;
		if(x>y){
			a = x+z;
		}
		else{
			a = y+z;
		}
		return a;
	}
	
	public void getSumOfAll(){
		
	}
	
}
