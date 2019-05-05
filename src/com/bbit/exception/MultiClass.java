package com.bbit.exception;

public class MultiClass {

	public static void main(String[] akash) {
		// TODO Auto-generated method stub
		try{
			int a =akash.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArithmeticException e){
			System.out.println("divide by 0:"+e);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index oob:" +e);
		}
		System.out.println("after try catch blocks");

	}

}
