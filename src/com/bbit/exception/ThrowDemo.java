package com.bbit.exception;

public class ThrowDemo {

	public void getValue(int m){
		if(m>100){
			throw new ArithmeticException("invalid input !!");
			//System.out.println("invalid");
		}else{
			System.out.println("valid input");
		}
		
	}
	
	public static void main(String[] args) {
		
		try{
			ThrowDemo obj = new ThrowDemo();
			obj.getValue(200);
			
		}catch(Exception ex){
			System.out.println("exception type  --"+ex.getMessage());
		}
	}

}
