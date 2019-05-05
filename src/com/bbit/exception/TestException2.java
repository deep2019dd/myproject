package com.bbit.exception;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0; 
		try{
			int c = i/j;
		}catch(ArithmeticException aex){
			//System.out.println("error --"+aex.getMessage());
			aex.printStackTrace();
		}
	}

}
